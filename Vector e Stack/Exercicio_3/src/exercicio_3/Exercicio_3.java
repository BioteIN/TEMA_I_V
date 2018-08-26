/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

import java.util.Vector;

/**
 *
 * @author Biote Ngovene
 */
public class Exercicio_3 {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        Vector <Boolean> vector1 = new Vector<Boolean>();
        Vector <Boolean> vector2 = new Vector<Boolean>();
        
        String resp=" ";
        for(int i=0;i<vector1.size();i++){
            for(int j = 0;j<vector2.size();j++){
                
                if((vector1.elementAt(i)==vector2.elementAt(j))&&(vector1.size()==vector2.size())){
                resp="Iguais";
            }
                
            }
            if(resp.equals("Iguais")){
                System.out.println("Os vectores sao iguais");
            }
        }
    }
    
}
