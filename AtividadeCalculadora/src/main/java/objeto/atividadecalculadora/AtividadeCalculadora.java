/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.atividadecalculadora;

/**
 *
 * @author Matheus
 */
public class AtividadeCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado1 = calc.somar(2,3);
        double resultado2 = calc.somar(2.5 , 3.5);
        
        int[] inteiros = { 6, 7, 2, 4, 5};
        int somaArray = calc.somar(inteiros);
        
        System.out.println("Valor da primeira soma: " + resultado1 );
        System.out.println("Valor da segunda soma: " + resultado2 );
        System.out.println("Valor da terceira soma: " + somaArray);
    }
}
