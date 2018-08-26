/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Biote Ngovene
 * @since 27-08-2018
 * @version v_01
 */
public class Alunos {
    /**
     * Metodo main
     * @param args 
     */ 
  public static void main(String[] args) {
 
double[][] x = {
 {10, 20, 15},
 {14, 14, 14},
 {7, 8, 10}
 };
int b=0,soma=0;
for(int i = 0; i < x.length; ++i){
 for(int j = 0; j < x[i].length; ++j){
    soma= (int) (x[i][j]+soma);
 }
 }double media=soma/x.length;
 int maior=0;        
 for(int i = 0; i < x.length; ++i){
 for(int j = 0; j < x[i].length; ++j){
   if(x[i][j]>x[i+1][j+1]){
       maior=(int) x[i][j];
   } else {
       maior=(int) x[i+1][j+1];
   }
 }
 }
 for(int i = 0; i < x.length; ++i){
 for(int j = 0; j < x[i].length; ++j){
 System.out.print(i + "|" + j + " = " + x[i][j] + "\t");
 }
 System.out.println("A media eh: "+media);
 }
 
 }
}

