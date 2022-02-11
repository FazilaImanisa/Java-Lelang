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
public class Petugas extends Person{
    private int idPetugas;
    
    public Petugas(int idPetugas, String nama, String alamat, String telepon){
        super(nama, alamat, telepon);
        this.idPetugas = idPetugas;
    }
    
    public int getIdPetugas(){
        return idPetugas;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
}
