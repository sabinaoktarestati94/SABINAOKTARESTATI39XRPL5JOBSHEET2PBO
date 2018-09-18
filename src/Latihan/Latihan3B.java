/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Asus
 */
public class Latihan3B {
    
    public static void main(String args[]){
        Latihan3A siswa = new Latihan3A();
        siswa.getName("Sabina");
        siswa.getAbsen(39);
        siswa.getAddress("Malang");
        
        System.out.print("Name: "+ siswa.getName()+ " Absen: "+ siswa.getAbsen()+ " Address: "+ siswa.getAddress ());
    }
}
