/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dean
 */
public class Bola implements BangunRuang{
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }    

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(getR(), 3) * 4/3;        
    }
    
}
