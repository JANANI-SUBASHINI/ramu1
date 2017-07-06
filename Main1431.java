# ramu1
import java.io.*;
import java.util.*;
public class Main1431
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a;
    int i=0;
    System.out.println("Enter an integer");
    a=Integer.parseInt(br.readLine());
    while(a>0)
    {
      a=a/10;
      i++;
      }
      System.out.println("The integer is an: " +i); 
    
    }
    }
  
