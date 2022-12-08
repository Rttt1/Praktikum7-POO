package praktikum7;


 class Mobil{
    String namaMobil;
    int idMobil;
    
 Mobil(String nama, int id){
        this.namaMobil = nama;
        this.idMobil = id;
    }
}
 class Pemilik extends Mobil{
    String namaPemilik;
    
 Pemilik(String nama, String namaM, int idM){
        super(namaM, idM);
        this.namaPemilik = nama;
    }
}
 class PerusahaanBus {
    public static void main (String args[])
    { 
        Pemilik obj = new Pemilik("Adidarma", "Toyota 86GT", 14045 );
        System.out.println(obj.namaPemilik+" adalah pemilik dari mobil "
         +obj.namaMobil+ " dan " + "dengan id: "+obj.idMobil);
    }
}