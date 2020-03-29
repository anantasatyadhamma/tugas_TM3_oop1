/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author Anan
 */
public class Ikan extends Hewan{
    boolean statusGantiAir = false;

    public Ikan(String id, String pemilik, boolean statusPenitipan) {
        super(id, pemilik, statusPenitipan);
    }
    
    @Override
    public boolean status(){
        return statusGantiAir;
    }
    
    public static void main (String [] args){
        Hewan hwn3 = new Hewan("5603", "Susanti", true);
        Hewan hwn4 = new Ikan("3271", "Zoey", true);
        
        System.out.println("Ikan sapu-sapu dengan nomor ID : " + hwn3.info() + ", status penitipan = " + hwn3.status());
        System.out.println("Ikan sapu-sapu dengan nomor ID : " + hwn4.info() + ", status ganti air = "  + hwn4.status());
    }
}
