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
public class ListPetugas extends List {
    Petugas[] list ={
        new Petugas(1, "Cika", "Medan", "0856"),
        new Petugas(2, "Tania", "Pakis", "0953"),
        new Petugas(3, "Yanto", "Milan", "0547"),
    };
    
    @Override
    public void viewData(){
        System.out.println("--- List Petugas ---");
        System.out.println("ID \t Nama \t Alamat ");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i].getIdPetugas()+" \t"
            +list[i].getNama()+ "\t"
            +list[i].getAlamat());
    }
        
}
    public int cariMasyarakat (int id){
        int foundIndex = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < list.length; i++){
            
            //jika id yang dicari ketemu
            if(list[i].getIdPetugas()==id){
                foundIndex = i; //menyimpan nilai index yang ditemukan
            }
        }
        return foundIndex;
    }
}
