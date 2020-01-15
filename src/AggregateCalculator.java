import java.util.Scanner;


public class AggregateCalculator {
    
    private static float getAggregate(){
        float aggregate = 0;
        
        return aggregate;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, food;
        
        String[] subjects = {"Engish Language", "Mathematics", "Physics", "Chemistry", "Further Mathematics"};
        
        int jambScore;
        int postUTMEScore;
        char [] gradeL = new char[5];
        char [] gradeN = new char[5];
        
        float aggregate;
        
        System.out.print("Mia: Hi there. What's your name?");
        name = input.nextLine();
        
        System.out.print("Mia: Hello " + name + "! My name is Mian\n");
        
        System.out.print("Mia: What's your favourite meal?"); 
        food = input.nextLine();
        
        System.out.print("Mia: Mmmmm I love " + food + " as well :)\n");
        
        System.out.println("Mia: Enter your JAMB score below");
        System.out.println("\n\nJAMB score: ");
        jambScore = input.nextInt();
        
        System.out.println("Mia: Enter your postUTME test score below");
        System.out.println("\n\nPost-UTME test score: ");
        postUTMEScore = input.nextInt();
        
        for (int i = 0; i < subjects.length; i++){
            System.out.print(subjects[i] + ": ");
            gradeL[i] = input.nextLine().charAt(0);
        }
        
        aggregate = getAggregate();

    }
    
}
