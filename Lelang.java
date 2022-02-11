/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

import java.util.Scanner;
/**
 *
 * @author Zila
 */
public class Lelang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // prepare untuk menangani input dari user */
        Scanner input = new Scanner(System.in);
        
        // membuat variable utk mengondisikan program masih berjalan atau berhenti */
        boolean stay = true;
        
        // prepare variabel utk menyimpan input user  */
        String key;
        
        // prepare object yg berisi daftar buku */
        ListBarang listBarang = new ListBarang();
        
        // prepare object yg berisi daftar siswa */
        ListMasyarakat listMasyarakat = new ListMasyarakat();
        
        while (stay) { // selama nilai "stay" = true maka program terus berjalan */
            // tampilan menu */
            System.out.println("-- Pelelangan Barang 2021 --");
            System.out.println("1. List Barang");
            System.out.println("2. List Pelelang");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            
            if (menu == 1) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                // menampilkan daftar buku */
                listBarang.viewData();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if(menu == 2){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                // menampilkan daftar siswa */
                listMasyarakat.viewData();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 3){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Pelelangan Barang ---");
                
                // prepare variabel "selectedIDSiswa" utk menyimpan data id siswa yg dipilih,
                // variabel "selectedIDBuku" utk menyimpan data id buku yg dipilih
                 
                int selectedIDMasyarakat, selectedIDBarang;
                
                System.out.print("Masukkan ID Pelelang : ");
                selectedIDMasyarakat = input.nextInt();
                
                // "foundIndex" menyimpan posisi index dari data siswa yg dipilih */
                int foundIndex = listMasyarakat.cariMasyarakat(selectedIDMasyarakat);
                
                // "selectedMasyarakat" menyimpan data client yg dipilih */
                Masyarakat selectedMasyarakat = listMasyarakat.listMasyarakat[foundIndex];
                
                // jika statusnya true, maka boleh lanjut */
                if (selectedMasyarakat.isStatus()) {
                    // proses perubahan status siswa */
                    listMasyarakat.listMasyarakat[foundIndex].changeStatus();
                            
                    // menampilkan data barang */
                    listBarang.viewData();

                    System.out.print("Pilih ID Barang yang di lelang : ");
                    selectedIDBarang = input.nextInt();
                    foundIndex = listBarang.cariBarang(selectedIDBarang);

                    // "selectedBarang" menyimpan data client yg dipilih */
                    Barang selectedBarang = listBarang.listBarang[foundIndex];

                    System.out.println("--- Barang Yang Di Lelang ---");
                    System.out.println("Nama Barang : " + selectedBarang.getNamaBarang());
                    System.out.println("Nama Pelelang : " + selectedMasyarakat.getNama());
                    System.out.println("Harga Awal : " + selectedBarang.getHargaAwal());

                    // proses pengurangan stok */
                    listBarang.listBarang[foundIndex].kurangiStok();
                    
                    
                } else {
                    System.out.println("Maaf anda masih punya tanggungan buku");
                }
                
                System.out.println("Press any key and enter...");
                key = input.next();
                
            } else if(menu == 4){
                /** variabel "stay" diset false menyebabkan program berhenti */
                stay = false;
            }
        }
    }
    }
    
}
