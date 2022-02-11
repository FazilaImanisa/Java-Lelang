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
public class ListMasyarakat extends List {
    Masyarakat[] listMasyarakat = {
        new Masyarakat(1, "Angga", "KedungKandang", "561"),
        new Masyarakat(2, "Rika", "BojongGede", "672"),
        new Masyarakat(3, "Ahmad", "Cikarang", "883"),
    };
    
    @Override
    public void viewData(){
        System.out.println("--- List Pelelang ---");
        System.out.println("ID \t Nama \t Alamat");
        for (int i = 0; i < listMasyarakat.length; i++){
            System.out.println(listMasyarakat[i].getIdMasyarakat()+" \t"
            +listMasyarakat[i].getNama()+ "\t"
            +listMasyarakat[i].getAlamat());
    }
        
}
    public int cariMasyarakat (int id){
        int foundIndex = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listMasyarakat.length; i++){
            
            //jika id yang dicari ketemu
            if(listMasyarakat[i].getIdMasyarakat()==id){
                foundIndex = i; //menyimpan nilai index yang ditemukan
            }
        }
        return foundIndex;
    }
}
