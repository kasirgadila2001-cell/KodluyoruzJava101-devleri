package sonOdevler;

public class PalindromKelime {
    static boolean isPalindrom(String kelime){
        String tersi = "";
        for(int i = kelime.length()-1; i>=0 ; i--){
            tersi += kelime.charAt(i);
        }
        if(kelime.equals(tersi)){
            return true;
        }
        else
         return false;
    }

    static void main(String[] args) {
        System.out.println(isPalindrom("dila"));
    }
}
