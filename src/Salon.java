public class Salon {
    String namaaa;
    String id;
    String nama;
    String nomor;
    String nohp;
    String member;
    double total;
    double cash;
    double kembalian;
    double disk;
    double kembali;

    double gunting(){
        total=20000;
        return total;
    }
    double smoothing(){
        total=125000;
        return total;
    }
    double rebonding(){
        total=105000;
        return total;
    }
    double creambath(){
        total=50000;
        return total;
    }
    double cat(){
        total=165000;
        return total;
    }
    double facial(){
        total=85000;
        return total;
    }
    double diskon(){
        disk=total-(total*0.2);
        return disk;
    }
    double changemember(){
        kembalian=cash-disk;
        return kembalian;
    }
    double change(){
        kembali=cash-total;
        return kembali;
    }
}

