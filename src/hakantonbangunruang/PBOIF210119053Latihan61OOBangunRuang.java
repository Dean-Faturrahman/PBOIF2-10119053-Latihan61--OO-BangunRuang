/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hakantonbangunruang;

import model.Bola;
import model.Kerucut;
import model.Tabung;
/**
 *
  * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program bangun ruang
 */
public class PBOIF210119053Latihan61OOBangunRuang {
    
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setR(7);
        System.out.printf("Volume bola = %.1f cm^3 \n",bola.hitungVolume());
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.printf("Volume Tabung = %.1f cm^3 \n",tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.printf("Volume Kerucut = %.1f cm^3 \n",kerucut.hitungVolume());
    }
    
}
