public class konversiSuhuBeraksi {
    public static void main(String[] args) {
        konversiSuhu konv1 = new konversiSuhu();
        konversiSuhu2 konv2 = new konversiSuhu2();

        double c = 100;
        double f = 212;

        System.out.println("=========================================");
        System.out.println("     KONVERSI SUHU      ");
        System.out.println("=========================================");
        
        System.out.println("| Celcius (" + c + ") ke Fahrenheit  : " + konv1.celciusToFahrenheit(c) + "  |");
        System.out.println("| Celcius (" + c + ") ke Reamur      : " + konv1.celciusToReamur(c) + "   |");
        System.out.println("| Fahrenheit (" + f + ") ke Reamur   : " + konv2.fahrenheitToReamur(f) + "   |");
        
        System.out.println("=========================================");
    }
}