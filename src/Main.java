import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Salon pelanggan = new Salon();

        Scanner salon = new Scanner(System.in);

        System.out.print("Nama : ");
        pelanggan.nama = salon.next();
        System.out.print("No.Antri : ");
        pelanggan.nomor = salon.next();
        System.out.println(" ");

        int sistem;
        System.out.println("---------------------");
        System.out.println("       WELCOME       ");
        System.out.println("---------------------");
        System.out.println(" 1.   LOGIN MEMBER   "); /*khusus member akan mendapatkan diskon 20%*/
        System.out.println(" 2. LOGIN NON-MEMBER ");
        System.out.println(" 3.  DAFTAR MEMBER   ");
        System.out.println("---------------------");
        System.out.println(" ");
        System.out.print("Sistem : ");
        sistem = salon.nextInt();
        System.out.println(" ");

        int pelayanan;
        if (sistem == 1) {

            System.out.print("ID Member    : ");
            pelanggan.member=salon.next();
            System.out.println("___________________");
            System.out.println("     PELAYANAN     ");
            System.out.println("-------------------");
            System.out.println(" 1. GUNTING RAMBUT ");
            System.out.println(" 2.   SMOOTHING    ");
            System.out.println(" 3.   REBONDING    ");
            System.out.println(" 4.   CREAMBATH    ");
            System.out.println(" 5.  CAT RAMBUT    ");
            System.out.println(" 6.     FACIAL     ");
            System.out.println("===================");
            System.out.println(" ");
            System.out.print("Pilihan : ");
            pelayanan = salon.nextInt();
            System.out.println(" ");

            if (pelayanan == 1) {
                System.out.print("Amount       : Rp. ");
                System.out.println(pelanggan.gunting());
                System.out.print("Discount 20% : Rp. ");
                System.out.println(pelanggan.diskon());
                System.out.print("Cash         : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change       : Rp. ");
                System.out.println(pelanggan.changemember());
            } else if (pelayanan == 2) {
                System.out.print("Amount       : Rp. ");
                System.out.println(pelanggan.smoothing());
                System.out.print("Discount 20% : Rp. ");
                System.out.println(pelanggan.diskon());
                System.out.print("Cash         : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change       : Rp. ");
                System.out.println(pelanggan.changemember());
            } else if (pelayanan == 3) {
                System.out.print("Amount       : Rp. ");
                System.out.println(pelanggan.rebonding());
                System.out.print("Discount 20% : Rp. ");
                System.out.println(pelanggan.diskon());
                System.out.print("Cash         : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change       : Rp. ");
                System.out.println(pelanggan.changemember());
            } else if (pelayanan == 4) {
                System.out.print("Amount       : Rp. ");
                System.out.println(pelanggan.creambath());
                System.out.print("Discount 20% : Rp. ");
                System.out.println(pelanggan.diskon());
                System.out.print("Cash         : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change       : Rp. ");
                System.out.println(pelanggan.changemember());
            } else if (pelayanan == 5) {
                System.out.print("Amount       : Rp. ");
                System.out.println(pelanggan.cat());
                System.out.print("Discount 20% : Rp. ");
                System.out.println(pelanggan.diskon());
                System.out.print("Cash         : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change       : Rp. ");
                System.out.println(pelanggan.changemember());
            } else if (pelayanan == 6) {
                System.out.print("Amount       : Rp. ");
                System.out.println(pelanggan.facial());
                System.out.print("Discount 20% : Rp. ");
                System.out.println(pelanggan.diskon());
                System.out.print("Cash         : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change       : Rp. ");
                System.out.println(pelanggan.changemember());
            }
            System.out.println(" ");

                System.out.println("===============================");
                System.out.println("         FORTUNES SALON        ");
                System.out.println("           by yunita           ");
                System.out.println("===============================");
                System.out.println("  Nama         : " + pelanggan.nama);
                System.out.println("  ID Member    : " + pelanggan.member);
                System.out.println("  No.Antri     : " + pelanggan.nomor);
                System.out.println("  Pelayanan    : " + pelayanan);
                System.out.println("  Amount       : Rp. " + pelanggan.total);
                System.out.println("  Discount 20% : Rp. " + pelanggan.disk);
                System.out.println("  Cash         : Rp. " + pelanggan.cash);
                System.out.println("  Change       : Rp. " + pelanggan.kembalian);
                System.out.println("===============================");
                System.out.println("            THANK YOU          ");
                System.out.println("===============================");
        }
        else if(sistem==2){

            System.out.println("___________________");
            System.out.println("     PELAYANAN     ");
            System.out.println("-------------------");
            System.out.println(" 1. GUNTING RAMBUT ");
            System.out.println(" 2.   SMOOTHING    ");
            System.out.println(" 3.   REBONDING    ");
            System.out.println(" 4.   CREAMBATH    ");
            System.out.println(" 5.  CAT RAMBUT    ");
            System.out.println(" 6.     FACIAL     ");
            System.out.println("===================");
            System.out.println(" ");
            System.out.print("Pilihan : ");
            pelayanan = salon.nextInt();
            System.out.println(" ");

            if (pelayanan == 1) {
                System.out.print("Amount : Rp. ");
                System.out.println(pelanggan.gunting());
                System.out.print("Cash : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change : Rp. ");
                System.out.println(pelanggan.change());
            } else if (pelayanan == 2) {
                System.out.print("Amount : Rp. ");
                System.out.println(pelanggan.smoothing());
                System.out.print("Cash : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change : Rp. ");
                System.out.println(pelanggan.change());
            } else if (pelayanan == 3) {
                System.out.print("Amount : Rp. ");
                System.out.println(pelanggan.rebonding());
                System.out.print("Cash : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change : Rp. ");
                System.out.println(pelanggan.change());
            } else if (pelayanan == 4) {
                System.out.print("Amount : Rp. ");
                System.out.println(pelanggan.creambath());
                System.out.print("Cash : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change : Rp. ");
                System.out.println(pelanggan.change());
            } else if (pelayanan == 5) {
                System.out.print("Amount : Rp. ");
                System.out.println(pelanggan.cat());
                System.out.print("Cash : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change : Rp. ");
                System.out.println(pelanggan.change());
            } else if (pelayanan == 6) {
                System.out.print("Amount : Rp. ");
                System.out.println(pelanggan.facial());
                System.out.print("Cash : Rp. ");
                pelanggan.cash = salon.nextInt();
                System.out.print("Change : Rp. ");
                System.out.println(pelanggan.change());
            }
            System.out.println(" ");

            System.out.println("===========================");
            System.out.println("       FORTUNES SALON      ");
            System.out.println("         by yunita         ");
            System.out.println("===========================");
            System.out.println("  Name      : " + pelanggan.nama);
            System.out.println("  No.Antri  : " + pelanggan.nomor);
            System.out.println("  Pelayanan : " + pelayanan);
            System.out.println("  Amount    : Rp. " + pelanggan.total);
            System.out.println("  Cash      : Rp. " + pelanggan.cash);
            System.out.println("  Change    : Rp. " + pelanggan.kembali);
            System.out.println("===========================");
            System.out.println("         THANK YOU         ");
            System.out.println("===========================");
        }
        else if(sistem==3){
            System.out.print("Nama : ");
            pelanggan.namaaa=salon.next();
            System.out.print("No.Hp : ");
            pelanggan.nohp=salon.next();
            System.out.println("Check your mobile phone to see the ID number!!");
            System.out.print("ID : ");
            pelanggan.id=salon.next();
            System.out.println(" ");
            System.out.println("=================================================");
            System.out.println("                   MEMBER CARD                   ");
            System.out.println("=================================================");
            System.out.println("               WELCOME, "+pelanggan.namaaa);
            System.out.println("                ID : "+pelanggan.id);
            System.out.println(" Thank you for entrusting your hair beauty to us ");
            System.out.println("           Get 20% discount every day            ");
            System.out.println("================ FORTUNES SALON =================");
        }
    }
}
