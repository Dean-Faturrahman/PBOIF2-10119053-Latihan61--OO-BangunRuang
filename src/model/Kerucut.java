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
public class Kerucut implements BangunRuang{
    private int t;
    private int r;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(getR(), 2) * getT() / 3;
    }
    
}
