/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author 201863308
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int num2,ans;
        char sign;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter num 1");
        num1 = input.nextInt();
        
        System.out.println("Enter num 2");
        num2 = input.nextInt();
      System.out.print("Enter the mathematical operator to be used: ");
      sign=input.next().charAt(0);

       if (sign == '+' )/*making use of if statement to determine the addition sign*/{
			ans=num1 + num2;
			System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
		}
		else if(sign == '-')/* else if statement for minus sign*/
		{
			ans=num1-num2;
			System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
		}
		else if(sign == '/'){
				ans=num1/num2;
				System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
	    }
		else if(sign == '*'){
					ans=num1*num2;
					System.out.println(num1 +" "+sign +" "+num2 +"= "+" "+ ans );
		}
		else
			
		System.out.println("Your Input is not correct,please check it for any error(s).");
		
		
			
	
    }
    
}
