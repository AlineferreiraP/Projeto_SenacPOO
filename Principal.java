/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Aline Ferreira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ponto pontoV = new Ponto(12,9); 
        Ponto pontoD = new Ponto (12,8);
        
        if (pontoV.VerificarPontos(pontoD)) {
            System.out.println("Os pontos A(x,y) e B(x,y) são iguais ");
        } else {
            System.out.println("Os pontos A(x,y) e B(x,y) não são iguais");
        }
        
        pontoV.CalcularDistancia(pontoD);
        System.out.println("O calculo da distância entre os pontos A e B arredondado para inteiro é: " + pontoV.CalcularDistancia(pontoD));
        
        }
     
}
