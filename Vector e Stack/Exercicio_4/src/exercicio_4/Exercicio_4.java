/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

import java.util.Vector;

/**
 *
 * @author Biote Ngovene
 * @version v_01
 */
public class Exercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Criação e leitura do vector
         * */
        Vector <Integer> vector = new Vector<Integer>();
        
        vector.insertElementAt(2, 0);
        vector.insertElementAt(4, 1);
        vector.insertElementAt(1, 2);
        vector.insertElementAt(6, 3);
        vector.insertElementAt(0, 4);
         vector.insertElementAt(0, 5);
        int aux=0;
        /**
         * Ordenação do vector
         */
       for(int i: vector){
            for(int j=0;j<vector.size();j++){
          if((vector.elementAt(j))<(vector.elementAt(j+1))){
              aux=(vector.elementAt(j));
             int a= (vector.elementAt(j));
            vector.insertElementAt(vector.elementAt(j+1),j);
             vector.insertElementAt(aux, j);
          }}
            /**
             * Eliminação do último elemento
             */
          vector.remove(vector.size()-1);
       }
        
       /**
        * Impressão dos elementos restantes
        */
        System.out.println("O vector resultante eh:");
        
        for(int j=0;j<vector.size();j++){
            System.out.println(vector.get(j));
        }
        
    }
    
}
