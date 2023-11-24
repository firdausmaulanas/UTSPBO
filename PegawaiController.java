/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6;

import java.util.Scanner;
import java.util.ArrayList;

public class PegawaiController {
    
    static Scanner in = new Scanner(System.in);
    
    static ArrayList<PegawaiEntity> listPegawai = new ArrayList<>();
    static PegawaiEntity pgw = new PegawaiEntity();
    
    static void viewMenu(){
        System.out.println("");
            System.out.println("=============== M E N U ===============");
            System.out.println("=======================================");
            System.out.println(" 1. Add Pegawai ");
            System.out.println(" 2. View Pegawai ");
            System.out.println(" 3. Update Pegawai ");
            System.out.println(" 4. Delete Pegawai ");
            System.out.println(" 0. Exit (0)");
    }
    
    static void addPegawai(){
        System.out.println("");
        System.out.println("======== A D D   P E G A W A I ========");
        System.out.println("=======================================");
        
        System.out.print("Nip Pegawai         : ");String nip = in.nextLine();
        System.out.print("Nama Pegawai        : "); String nama = in.nextLine();
        System.out.print("Gender Pegawai      : "); char gender = in.next().charAt(0); in.nextLine();
        System.out.print("Alamat Pegawai      : "); String alamat = in.nextLine();
        System.out.print("No Telp Pegawai     : "); String noTelp = in.nextLine();
        
        PegawaiEntity listPeg = new PegawaiEntity(
                nip, 
                nama, 
                gender, 
                alamat, 
                noTelp);
        
        listPegawai.add(listPeg);
        
        System.out.println("");
        System.out.println("      [v] Data SUKSES ditambah !");
    }
    
    static void viewPegawai(){
        System.out.println("");
        System.out.println("======= L I S T   P E G A W A I =======");
        System.out.println("=======================================");
        
        for(int i = 0; i < listPegawai.size(); i++){
            
            System.out.println("=======================================");
            System.out.println(" [Mahasiswa Ke " + (i+1) + "]");
            System.out.println("=======================================");
            System.out.println(" Nip Pegawai         : " + listPegawai.get(i).getNip());
            System.out.println(" Nama Pegawai        : " + listPegawai.get(i).getNama());
            System.out.println(" Gender Pegawai      : " + listPegawai.get(i).getJenis_kelamin());
            System.out.println(" Alamat Pegawai      : " + listPegawai.get(i).getAlamat());
            System.out.println(" No Telp Pegawai     : " + listPegawai.get(i).getNoTelp());
        }
        
    }
    
    static void updatePegawai(){
        
        viewPegawai();
        
        System.out.println("");
        System.out.println("============= U P D A T E =============");
        System.out.println("=======================================");
        
        System.out.print(" Masukkan nomor data yang ingin diupdate : "); 
        int no = in.nextInt();
        
        if ((no >= 1) && (no <= listPegawai.size())){
            in.nextLine();
            System.out.print(" Nip Pegawai         : "); String nip = in.nextLine();
            System.out.print(" Nama Pegawai        : "); String nama = in.nextLine();
            System.out.print(" Gender Pegawai      : "); char gender = in.next().charAt(0); in.nextLine();
            System.out.print(" Alamat Pegawai      : "); String alamat = in.nextLine();
            System.out.print(" No Telp Pegawai     : "); String noTelp = in.nextLine();
            
            PegawaiEntity pegawai = listPegawai.get(no - 1);
            pegawai.setNip(nip);
            pegawai.setNama(nama);
            pegawai.setJenis_kelamin(gender);
            pegawai.setAlamat(alamat);
            pegawai.setNoTelp(noTelp);
            
            System.out.println("");
            System.out.println("      [v] Data SUKSES diperbarui !");
        } else {
            System.out.println("");
            System.out.println("      [!] Data GAGAL diperbarui !");
        }
    }
    
    static void deletePegawai(){
        
        viewPegawai();
        
        System.out.println("");
        System.out.println("============= D E L E T E =============");
        System.out.println("=======================================");
        
        System.out.print(" Masukkan nomor data yang ingin dihapus : "); int no = in.nextInt(); in.nextLine();
        
        if (no >= 1 && no <= listPegawai.size()){
            listPegawai.remove(no-1);
            System.out.println("");
            System.out.println("      [v] Data SUKSES diperbarui !");
        } else {
            System.out.println("");
            System.out.println("      [!] Data SUKSES diperbarui !");
        }
    }
}
