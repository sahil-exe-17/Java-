class Mobile {
    int size;
    String c_name;
    
    Mobile(){
        size = 110;
        c_name = "Samsung";
    }

    public Mobile(int s, String n) {
        size = s;
        c_name = n;
    }
    
    void display(){
        System.out.println("Company name = " + c_name);
        System.out.println("Screen size = " + size);
    }
}

public class Main {
    public static void main(String[] args){
        Mobile m = new Mobile();
        m.display();
        
        Mobile m1 = new Mobile(90,"OPPO");
        m1.display();
    }
}
