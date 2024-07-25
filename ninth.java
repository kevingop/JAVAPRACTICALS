import java.util.Arrays;
import java.util.Scanner;
public class ninth {

    public static void main(String[] args) {
        
            System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
            Scanner sc = new Scanner(System.in);
            String s;

            System.out.println("Enter string");
            s = sc.nextLine();
            int size=s.length();

            //lowercase with built in method
            System.out.println("Lower case with built in: ");
            System.out.println(s.toLowerCase());
            
            //lowercase without built in method

            // Lower case without built-in method
            System.out.println("Lower case without built-in method: ");
            String lowerCase = "";
            for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            lowerCase += ch;
            }
            System.out.println(lowerCase);

            //uppercase with built in method
            System.out.println("upper case with built in method: ");
            System.out.println(s.toUpperCase());

            System.out.println("Upper case without built-in method: ");
            String upperCase = "";
            for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            upperCase += ch;
            }
            System.out.println(upperCase);

            //length with built in method
            System.out.println("length with built in method: ");
            System.out.println(s.length());

            //length without built in method
            System.out.println("Length without built-in method");
            int a = 0;
            try {
            while (s.charAt(a) != '\0') {
                a++;
            }
            } catch (StringIndexOutOfBoundsException e) {
            }
            System.out.println(a);

            //reverse with built in method
            String reversedStr = new StringBuilder(s).reverse().toString();
            System.out.println("Reversed string with built-in method: " + reversedStr);

            //reverse without built in method
            String str="";
            for(int i=size-1;i>=0;i--)
            {
           
            str=str+s.charAt(i);
        
            }
            System.out.println("Reversed string without built in method :"+str);

          //converting to character array
           char ch[]=new char[size];
           for(int i=0;i<size;i++)
           {
            ch[i]=s.charAt(i);
           }
          
          // with out using inbuilt sorting function.....
           for(int i=0;i<size;i++)
           {
               for(int j=i+1;j<size;j++)
               {
                   if(ch[i]>ch[j])
                   {
                       char temp=ch[i];
                       ch[i]=ch[j];
                       ch[j]=temp;
                   }
               }
           } 
           System.out.println("Sorted string without built in method: "+ch);

           //using inbuilt sorting function
           Arrays.sort(ch);
           String sort=new String(ch);
           System.out.println("Sorted string with built in method: "+sort);
        }
    }
