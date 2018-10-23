import java.util.Scanner;
public class Division
{
    public static void main(String[] args) 
    {
        int n;
        int f=303;        
        System.out.println(Division.DivCheck(f));
        System.out.println(Division.DivCheck(30));
        System.out.println(Division.DivCheck(1));
        System.out.println(Division.DivCheck(20));
    }


public static String DivCheck(int n)

{

String outputString = "";
String str1 = Integer.toString(n);
int i;
if(n < 1)
{
	throw new IllegalArgumentException("Number Cannot be less than 1");
}
if (n % 3==0)
{
	outputString = outputString+"Foo";
}

if (n%5==0)
{
	outputString = outputString+"Bar";
}

if (n % 7==0)
{
	outputString = outputString+"Qix";
}
for (i=0;i<str1.length();i++)
{
	if (str1.charAt(i)=='3'||str1.charAt(i)=='5'||str1.charAt(i)=='7')
	{
		if (str1.charAt(i)=='3')
		{
			outputString = outputString+"Foo";
			
		}
		if (str1.charAt(i)=='5')
		{
			outputString = outputString+"Bar";
			
		}
		if (str1.charAt(i)=='7')
		{
			outputString = outputString+"Qix";
			
		}
		
	}
}
if (outputString=="")
{
    System.out.println(n+" is not divisible by 3,5 or 7 and not contain the numbers 3,5,7");
}
return outputString;

}

}
