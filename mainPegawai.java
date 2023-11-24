
package Bab6;

import java.util.Scanner;
import java.util.ArrayList;

public class mainPegawai {
    
    static Scanner in = new Scanner(System.in);
    static PegawaiController pegawaiController = new PegawaiController();
    
    public static void main(String[] args) {
        int pil;
        do{
            pegawaiController.viewMenu();
            System.out.print(" Choose : "); pil = in.nextInt();
            switch(pil){
                case 1 :
                    pegawaiController.addPegawai();
                    break;
                    
                case 2 :
                    pegawaiController.viewPegawai();
                    break;
                    
                case 3 :
                    pegawaiController.updatePegawai();
                    break;
                
                case 4 :
                    pegawaiController.deletePegawai();
                    break;
                
                case 0 :
                    System.out.println(" EXIT ");
            }
        
        }while(pil != 4);
        
    }
    
}
