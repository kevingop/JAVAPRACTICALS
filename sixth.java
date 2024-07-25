import java.util.Scanner;

public class sixth {
    public static void main(String[] args){
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        System.out.println("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String n=obj.nextLine();

        System.out.println("Enter the number: ");
        Scanner obj2 = new Scanner(System.in);
        int x=obj2.nextInt(  );

        fun(x, n);
    }
    public static void fun(int x,String y){
        int a;
        String b;
        a=x;
        b=y;
        String c="",d="";
        if(y.length()<a){
            for(int i=0;i<a;i++){
                d=d+y;      
            }            
        }
        else{
        for(int i=0;i<a;i++){
            c=c+y.charAt(i);
        }
        for(int i=0;i<a;i++){
            d=d+c;
        }
    }
        System.out.println(d);
    }
}
