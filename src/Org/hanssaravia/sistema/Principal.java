/*
Programador:
        Hans Mijail Saravia Salazar
Creacion:
  26/04/2019

*/

package Org.hanssaravia.sistema;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) 
   {
       sumar Suma = new sumar(0,0);
       Restar resta = new Restar (0,0);
       Multiplicacion Resultado = new Resultado (0,0);
       int op;
       JOptionPane.showMessageDialog(null, "operaciones aritmeticas");
       
       op = Integer.parseInt(JOptionPane.showInputDialog("eliga una opcion  \n"
               + "2. restar  \n"
               + "1. suma  \n"
               + "3. multiplicar  \n"
               + "4. dividir  \n"
               + "5. salida  \n"));
       
      switch (op) {
      
          case 1:{
       Suma.valor1 = Integer.parseInt (JOptionPane.showInputDialog("ingrese un numero"));
       Suma.valor2 = Integer.parseInt (JOptionPane.showInputDialog("ingrese un numero"));
       JOptionPane.showMessageDialog(null,"la sumatoria es: " + (Suma.sumatoria(Suma.valor1,Suma.valor2)));
       
          }
          
          case 2:{
        
        resta.valor1 = Integer.parseInt (JOptionPane.showInputDialog("ingrese un numero"));
        resta.valor2 = Integer.parseInt (JOptionPane.showInputDialog("ingrese un numero"));
        JOptionPane.showMessageDialog(null, "la Sustraccion es :" + (resta.Eliminacion(resta.valor1,resta.valor2)));
      } 
      
          
       
         
      }
   }
}  