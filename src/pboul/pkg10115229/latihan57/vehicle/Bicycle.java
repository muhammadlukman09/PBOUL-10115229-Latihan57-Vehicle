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
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        String jumlahgear = "23";
        
        Vehicle v = new Vehicle();
        
        v.inputData("Trek Bike");
        v.Bicycle();     
        
        System.out.println("Jumlah Gear :"+jumlahgear);
        
        
    }
    
    

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }

    void setMyBrand() {
      
    }

    void setMyModel() {
 
    }
    
}
