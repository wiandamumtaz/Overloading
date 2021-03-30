/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author HP
 */
public class OutputNilai {
    public static void main(String[] args, int nilai) {
        System.out.println("Nilai Rapot : ");
        Nilai Anda = new Nilai();
         
        Anda.nilai(60, 80);
        Anda.nilai(75, 80, 85);
         
        if (nilai<=70)
            System.out.println("Nilai Dibawah KKM");
        else if (nilai>=70)
            System.out.println("Nilai diatas KKM");
    }
}