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
public class Latihan3A {
    private String name;
    private String address;
    private int absen;
    
    public int getAbsen(){
        return absen;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void getAbsen(int newAbsen){
        absen = newAbsen;
    }
    public void getName(String newName){
        name = newName;
    }
    public void getAddress (String newAddress){
        address = newAddress;
    
    }
}
