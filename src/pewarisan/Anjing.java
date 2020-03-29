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
public class Anjing extends Hewan {

    boolean statusSuntikRabies = true;

    public Anjing(String id, String pemilik, boolean statusPenitipan) {
        super(id, pemilik, statusPenitipan);
    }

    @Override
    public boolean status() {
        return statusSuntikRabies;
    }

    public static void main(String[] args) {
        Hewan hwn = new Hewan("0023", "Ananta", false);
        Hewan hwn2 = new Anjing("6783", "Jack", false);

        System.out.println("Anjing Labrador dengan nomor ID : " + hwn.info() + ", status penitipan = " + hwn.status());
        System.out.println("Anjing Labrador dengan nomor ID : " + hwn2.info() + ", status suntik rabies = "  + hwn2.status());
    }

}
