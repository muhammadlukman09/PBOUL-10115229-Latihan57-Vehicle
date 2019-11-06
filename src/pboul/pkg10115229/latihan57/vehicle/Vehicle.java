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
public class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
    
    public void Vehicle(){
        System.out.println("Brand :"+getMyBrand());
        System.out.println("Model :"+getMyModel());
 
    }
    
    public void inputData(String b, String m){
        setMyBrand(b);
        setMyModel(m);
        
    }

    void inputData(String trek_Bike) {
       
    }

    void Skateboard() {
       
    }

    void Bicycle() {
        
    }
    
}
