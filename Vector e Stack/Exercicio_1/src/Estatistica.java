
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javafx.beans.binding.MapBinding;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Biote Ngovene
 * @version v_01
 */
public  class Estatistica {
    /**
     * Metodo  estatico
     * @param vector
     * @param numero 
     */
    public  static void calcularModa(Vector vector, int numero){
         vector = new Vector<Integer>(numero);
         Map<Integer, Integer> frequencia = new HashMap<>();
         int maior=0;
         
    for(int i=0;i<vector.size();i++){
    
    Integer quantidade = frequencia.get(vector.elementAt(i));
    if(quantidade==null){
        quantidade=0;
    }else{
        quantidade+=1;
    }
    frequencia.put((Integer) vector.elementAt(i), quantidade+1);
    if (maior<quantidade+1){
        maior=quantidade;
    }
} 
    for(Integer num: frequencia.keySet()){
        int quantidade=frequencia.get(num);
    if (maior==quantidade){
        System.out.println("A moda eh: "+maior);
    }
}
    }
    /**
     * 
     * @param vector
     * @param numero 
     */
    public  static void calcularMediana(Vector vector, int numero){
                 Map<Integer, Integer> frequencia = new HashMap<>();

         vector = new Vector<Integer>();
        int aux=0;
        int mediana=0;
        boolean controlador;
        /**
         * Ordenação
         */
       for(int i=0;i<vector.size();i++){
          for(int j=0;j<vector.size();j++){
          if(frequencia.get(vector.elementAt(i))>frequencia.get(vector.elementAt(i+1))){
              aux=frequencia.get(vector.elementAt(i));
             int a= frequencia.get(vector.elementAt(i));
             frequencia.get(vector.elementAt(frequencia.get(vector.elementAt(i+1))));
             frequencia.get(vector.elementAt(aux));
          }
    } }
       /**
        *Achar o valor do meio
        * */
       int meio=0;
         /* for(int i=0;i<vector.size();i++){*/ meio=vector.size()/2;
          mediana= frequencia.get(vector.elementAt(meio));

         System.out.println("A media eh: "+mediana);

    }
    /**
     * 
     * @param vector
     * @param numero 
     */
    public  static void calcularMedia(Vector vector, int numero){
      double media;
      double v;
      double d;
      int soma=0;
      
      for(int i=0;i<vector.size();i++){
          soma=soma+i;
    }
      media=soma/vector.size();
    System.out.println("A media eh: "+media);
    }
    
}
