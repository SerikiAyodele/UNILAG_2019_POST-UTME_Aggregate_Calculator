import java.util.Scanner;


public class AggregateCalculator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, food;
        
        System.out.print("Mia: Hi there. What's your name?");
        name = input.nextLine();
        
        System.out.print("Mia: Hello " + name + "! My name is Mian\n");
        
        System.out.print("Mia: What's your favourite meal?"); 
        food = input.nextLine();
        
        System.out.print("Mia: Mmmmm I love " + food + " as well :)\n");
    }
    
}
