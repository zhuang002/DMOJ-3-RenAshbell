/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renashbell;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class RenAshbell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] powers = new int[n - 1];
        int renPower = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                renPower = sc.nextInt();
            } else {
                powers[i - 1] = sc.nextInt();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (powers[i] >= renPower) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
