public class nineteen {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        square s1= new square();
        s1.print();
        s1.print1();
    }   
   }
   
   class shape{
       void print(){
           System.out.println("This is shape.");
       }
   }
   
   class rectangle extends shape{
       void print1(){
           System.out.println("This is rectangular shape.");
       }
   }
   
   
   class circle extends shape{
       void print2(){
           System.out.println("This is circular shape.");
       }
   }
   
   class square extends rectangle{
       void print3(){
           System.out.println("square is a rectangle.");
       }
   }