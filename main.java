import java.util.*;
//main method 
public class wordcounter{
public static void main(String[] args) {
Scanner sc =new Scanner (System.in);
//Taking a input from the user
System.out.println ("Enter the string:");
String str =sc.nextLine();
int count = 1;//initialize count variable 
for (int i = 0; i < str.length() - 1; i++)
{//check whether space is encountered
if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
{
count++;
}
}
System.out.println("Number of words in a string : " + count);
}
}
