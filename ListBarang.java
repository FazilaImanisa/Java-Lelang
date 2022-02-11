/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

/**
 *
 * @author Zila
 */
public class ListBarang extends List {
    Barang[] listBarang = {
        new Barang(1,"Meja", 200000, true ),
        new Barang(2, "Kursi", 150000, true),
        new Barang(3, "Sofa", 300000, true),
    };
    @Override
    public void viewData(){
        System.out.println("--- List Barang ---");
        System.out.println("ID \t Jenis \t Harga Awal");
        for (int i = 0; i < listBarang.length; i++) {
            System.out.println(listBarang[i].getIdBarang() +" \t "
            + listBarang[i].getNamaBarang() + " \t "
            + listBarang[i].getHargaAwal() + " \t "
            + listBarang[i].getStatus());
    }
}
    public int cariBarang(int id){
        int foundIndex = 0;
        // pencarian data berdasarkan id */
        for (int i = 0; i < listBarang.length; i++) {
            
            // jika id yang dicari ditemukan */
            if(listBarang[i].getIdBarang()== id){
                foundIndex = i; // menyimpan nilai index dari data yg ditemukan */
            }
        }
        return foundIndex;
    }
}
