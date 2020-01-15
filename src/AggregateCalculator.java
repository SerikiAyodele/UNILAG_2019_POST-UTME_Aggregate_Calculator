import java.util.Scanner;


public class AggregateCalculator {
    
    private static float getAggregate(int jambScore, int postUTMEScore, String[] gradeL){
        float aggregate = 0;
        
        float [] gradeN = new float[5];
        
        float oLevels = 0;
        
        for (int i = 0; i < gradeL.length; i++){
            switch (gradeL[i]){
                case "A1":
                    gradeN[i] = (float)4.0;
                    break;
                case "B2":
                    gradeN[i] = (float)3.6;
                    break;
                case "B3":
                    gradeN[i] = (float)3.2;
                    break;
                case "C4":
                    gradeN[i] = (float)2.8;
                    break;
                case "C5":
                    gradeN[i] = (float)2.4;
                    break;
                case "C6":
                    gradeN[i] = (float)2.0;
                default:
                    gradeN[i] = (float)0.0;
                    break;
            }
            
            oLevels += gradeN[i];
        }
        
        return aggregate;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, food;
        
        String[] subjects = {"Engish Language", "Mathematics", "Physics", "Chemistry", "Further Mathematics"};
        
        int jambScore;
        int postUTMEScore;
        String [] gradeL = new String[5];
        
        
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
            gradeL[i] = input.nextLine().toUpperCase();
        }
        
        aggregate = getAggregate(jambScore, postUTMEScore, gradeL);

    }
    
}
