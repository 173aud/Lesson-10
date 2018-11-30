/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author feli8871
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    void quickSort (int[] a, int left, int right){ 
   if (left >= right) return; 
   int i = left; 
   int j = right; 
   int pivotValue=a[(left+right)/2];
   while(i<=j){
       while(a[i]<pivotValue)i++;
       while(pivotValue<a[j])j--;
       if(i<=j){
           int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           i++;
           j--;
       }
       quickSort(a,left,j);
       quickSort(a,i,right);
   } 
    
    
    }
}
