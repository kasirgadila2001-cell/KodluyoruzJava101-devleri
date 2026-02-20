package maasHesaplama;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax(){
        if(this.salary > 1000){
            return this.salary * 0.03;
        }
        return 0;
    }


    public double bonus(){
        if(this.workHours > 40){
            return (this.workHours -40) * 30;
        }
        return 0;
    }


    public double raiseSalary(){
        int year = 2021 - this.hireYear;
        if(year < 10 ){
            return this.salary * 0.05;
        }
        else if(year < 20 ){
            return this.salary * 0.10;
        }
        else  {
            return this.salary * 0.15;
        }
    }

   @Override
    public String toString(){
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalary = this.salary - tax +bonus + raise;
        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaşArtışı: " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (salary- tax + bonus) +
                "\nToplam Maaş: " + totalSalary;
   }

}
