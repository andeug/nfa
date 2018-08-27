/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//andrew simiyu
package nfa;


import java.util.Scanner;
public class Nfa {
    
  public static int state=0;
  public static int amount=0;
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       
               
               
       while(state!=3&&amount!=60&&amount<=60) {
           
           System.out.println("current amount:" +amount);
           System.out.println("Enter amount:" );  
            
          int rollno=sc.nextInt();
          int value=inputRead(rollno);
          if(value==5){
              break;
          }
          
          
           
       } 
       
       if(state==3){
          System.out.println("Accepting"); 
       }
       else{
          System.out.println("Non-Accepting"); 
       }
     
        
   
   
  
    }
    
    
    
    public static int inputRead(int rollno){
        
      switch (rollno) {
          case 20:
              amount=amount+rollno;
              return state++;
          case 40:
              //go to state 2
              amount=amount+rollno;
              return state+=2;
          default:
              return 5;
      }
        
         }
     
  }
        
