
package calculator;
import java.util.Scanner;

public class CALCULATOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        double num1 = scanner.nextDouble();
        
         System.out.print("Enter second number:");
         double num2 = scanner.nextDouble();
         
          System.out.print("Choose operation (+,_,*/):");
          char operation = scanner.next().charAt(0);
          
          double result = 0;
          
          switch (operation){
           case '+':
               result = num1 + num2;
               break;
             case '-':
result = num1 - num2;
                 break;
                 case'*':
                     result = num1 * num2;
                 case '/':
                     if (num2 != 0){
                     result = num1 / num2;
                 }else{
              System.out.println("Error Diviion by zero!");
              
                         
                 }
                 
        
    }
      
    }
    
}
