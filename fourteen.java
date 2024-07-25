import java.util.*;

public class fourteen {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        int l ,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length: ");
        l = obj.nextInt();
        System.out.println("Enter the Breadth: ");
        b = obj.nextInt();

        Area a1 = new Area(l, b);
        a1.returnarea();
    }
    
}

class Area{
    int l , b;

    Area(int l1, int b1){
        l=l1;
        b=b1;
    }

    void returnarea(){
        System.out.println("Area is: " + (l*b));
    }
    
}