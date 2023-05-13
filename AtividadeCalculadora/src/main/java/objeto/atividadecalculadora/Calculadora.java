/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.atividadecalculadora;

import java.util.Arrays;

/**
 *
 * @author Matheus
 */
public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }
    public double somar (double a, double b) {
        return a + b;
    }
    
    public int somar(int[] numeros){
        return Arrays.stream(numeros).sum();
    }
}
