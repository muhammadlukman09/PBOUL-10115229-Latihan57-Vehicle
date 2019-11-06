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
public class Skateboard extends Vehicle {
    private double myBoardLength;
    
    public Skateboard(){
       String panjangboard;
       
       panjangboard="54.5";
       
       Vehicle v = new Vehicle();
       
       v.inputData("All Skate");
       v.Skateboard();
       
        System.out.println("Panjangnya Board : "+panjangboard);
        
        
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
}
