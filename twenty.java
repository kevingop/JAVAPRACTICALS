public class twenty {
    public static void main(String[] args) {
        System.out.println("23DIT017 - DARSHAN HOTCHANDANI");
        degree d1 = new degree();
        d1.getdegree();

        undergraduate u1= new undergraduate();
        u1.getdegree();

        postgraduate p1 = new postgraduate();
        p1.getdegree();
    }
}

class degree{
    void getdegree(){
        System.out.println("I got a degree.");
    }
}

class undergraduate extends degree{
    void getdegree(){
        System.out.println("I am undergraduate.");
    } 
}

class postgraduate extends degree{
    void getdegree(){
        System.out.println("I am postgraduate.");
    } 
}