package com.example.gemmelmetalle;

import java.io.Serializable;

public class ValeibleForObject implements Serializable {

    // Valiable Declaration
    private String shapName;
    private int shapImage;

    public ValeibleForObject(String shapName, int shapImage){
        this.shapImage=shapImage;
        this.shapName=shapName;
    }
     //shapName getter und setter
    public void setShapName(String shapName) { this.shapName = shapName; }
    public String getShapName () { return shapName; }

    // shapImage getter und setter
    public void setShapImage (int shapImage) { this.shapImage = shapImage; }
    public int getShapImage () { return shapImage; }




} // end of class 
