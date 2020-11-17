/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan54.oo.koordinat;

import model.WarnaKoordinat;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program koordinat
 */
public class PBOIF210119053Latihan54OOKoordinat {

    public static void main(String[] args) {           
        WarnaKoordinat warnaKoordinat;
            
        warnaKoordinat = new WarnaKoordinat("Jingga",10,4);
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat.getX() + ", y : " + warnaKoordinat.getY());
    }
    
}
