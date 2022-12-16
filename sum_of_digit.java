import java.util.*;
public class sum_of_digit
{
public ststic void main(String[]args)
{
Scanner s=new Scanner(System.in);
int number, digit, sum = 0;   
System.out.print("Enter the number: ");  
number = s.nextInt();  
while(number > 0)  
{    
digit = number % 10;    
sum = sum + digit;  
number = number / 10;  
}
if(number>=0&&number<10)  
System.out.println("Sum of Digits: "+sum);
else
System.out.println("sum of digit is not a sinlge digit");  
}  
}  