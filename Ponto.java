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
public class Ponto {
    // atributos da classe
  private int x, y;
  
    
    // construtores A e B
    public Ponto(int x, int y) {
     this.x = x;
     this.y = y;
    }
    
    public Ponto () {
        this.x = 0;
        this.y = 0;
        
    }
    

    //Métodos
    
    public boolean VerificarPontos (Ponto pontoV) {
        if (this.x == pontoV.x && this.y == pontoV.y) {
            return true;
        } else {
            return false;
        }
    }
    public double CalcularDistancia (Ponto pontoD){
        double D = Math.sqrt(Math.pow((pontoD.x - this.x),2)
        + Math.pow((pontoD.y- this.y),2));
        return Math.round(D);
    }

  }



  
    



    
    
   
    

