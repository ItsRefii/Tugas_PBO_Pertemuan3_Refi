public class MatematikaInherit {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();
        
        System.out.println("=========================================");
        System.out.println("     PROGRAM MATEMATIKA INHERITANCE      ");
        System.out.println("=========================================");
        
        System.out.println("| Tambah  : " + mtk.tambah(72, 13) + "                   |");
        System.out.println("| Kurang  : " + mtk.kurang(19, 7) + "                   |");
        System.out.println("| Kali    : " + mtk.kali(7, 7) + "                   |");
        System.out.println("| Bagi    : " + mtk.bagi(45, 5) + "                  |");
        System.out.println("| Modulus : " + mtk.modulus(10, 5) + "                    |");
        
        System.out.println("=========================================");
    }

}   
