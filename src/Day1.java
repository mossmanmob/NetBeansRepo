import hsa.*;

public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console c = new Console();
        int age;
        c.println("How old are you? ");
        age = c.readInt();
        age++;
        c.println("Next year you will be " + age + " years old!");
    }
    
}
