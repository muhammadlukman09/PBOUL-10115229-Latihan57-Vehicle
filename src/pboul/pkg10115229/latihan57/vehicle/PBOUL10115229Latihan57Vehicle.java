/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan57.vehicle;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bicycle");
        
        Bicycle s = new Bicycle();
        s.setMyBrand("Trike Bike");
        s.setMyModel("7.4FX");
        s.Vehicle();
        s.Bicycle();
        
        System.out.println("\n Skateboard");
        
        Skateboard p = new Skateboard();
        p.setMyBrand("Ally Skate");
        p.setMyModel("Rocket");
        p.Vehicle();
        p.Skateboard();
    }
    
}
