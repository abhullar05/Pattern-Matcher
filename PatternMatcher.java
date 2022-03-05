import java.util.Scanner;
/**
 * HW-05 Challenge PatternMatcher
 *
 * According to the selected level, gives small mental ability questions and test the answers.
 *
 * @author Advit Bhullar, L-24
 *
 * @version September 25,2021
 *
 */
public class PatternMatcher {

    public static void main(String[] args) {

        String chooseLevel = "Choose Level Difficulty:" +
                "\n1. Easy\n2. Medium\n3. Hard";
        String startNumber = "Enter a number to start the pattern:";
        String nextThree = "Enter the next 3 numbers in the pattern:";
        String congratulations = "Congrats! Your answer was correct!";
        String sorry = "Sorry! Your answer was incorrect!";
        String again = "Play Game Again? (y/n)";
        String ending = "Ending Pattern Matcher...";
        Scanner scan = new Scanner(System.in);
        int level;
        int initialNumber;
        int nextNumber1;
        int nextNumber2;
        int nextNumber3;
        int nextNumber1Correct;
        int nextNumber2Correct;
        int nextNumber3Correct;
        String yes = "y";
        int nextNumber1Ques;
        int nextNumber2Ques;
        int nextNumber3Ques;
        double nextNumber1CorrectLevel1;




        do {
            do {
                System.out.println(chooseLevel);
                level = scan.nextInt();
            } while (!Integer.toString(level).equals("1") && !Integer.toString(level).equals("2") &&
                    !Integer.toString(level).equals("3"));

            if (level == 1) {
                System.out.println(startNumber);
                initialNumber = scan.nextInt();

                System.out.println(nextThree);
                nextNumber1Ques = initialNumber + 2;
                nextNumber2Ques = nextNumber1Ques + 2;
                nextNumber3Ques = nextNumber2Ques + 2;
                System.out.printf("%d %d %d %d\n" , initialNumber , nextNumber1Ques ,
                        nextNumber2Ques , nextNumber3Ques );
                nextNumber1 = Integer.parseInt(scan.next());
                nextNumber2 = Integer.parseInt(scan.next());
                nextNumber3 = Integer.parseInt(scan.next());
                nextNumber1Correct = nextNumber3Ques + 2;
                nextNumber2Correct = nextNumber1Correct + 2;
                nextNumber3Correct = nextNumber2Correct + 2;

                if (  Integer.toString(nextNumber1).equals(Integer.toString(nextNumber1Correct))
                        && Integer.toString(nextNumber2).equals(Integer.toString(nextNumber2Correct))
                        && Integer.toString(nextNumber3).equals(Integer.toString(nextNumber3Correct)) ) {
                    System.out.println(congratulations);
                } else {
                    System.out.println(sorry);
                }

                System.out.println(again);



            } else if (level == 2) {
                System.out.println(startNumber);
                initialNumber = scan.nextInt();
                System.out.println(nextThree);
                System.out.printf("%d %d %d %d\n", initialNumber , initialNumber * 4 ,
                        initialNumber * 4 * 4 , initialNumber * 4 * 4 * 4 );
                nextNumber1 = Integer.parseInt(scan.next());
                nextNumber2 = Integer.parseInt(scan.next());
                nextNumber3 = Integer.parseInt(scan.next());

                nextNumber1Correct = (int)(initialNumber * Math.pow(4 , 4));
                nextNumber2Correct = (int)(initialNumber * Math.pow(4 , 5));
                nextNumber3Correct = (int)(initialNumber * Math.pow(4 , 6));

                if (  Integer.toString(nextNumber1).equals(Integer.toString(nextNumber1Correct)) &&
                        (Integer.toString(nextNumber2)).equals((Integer.toString(nextNumber2Correct))) &&
                        (Integer.toString(nextNumber3)).equals((Integer.toString(nextNumber3Correct))) ) {
                    System.out.println(congratulations);
                } else {
                    System.out.println(sorry);
                }

                System.out.println(again);





            } else if (level == 3) {
                System.out.println(startNumber);
                initialNumber = scan.nextInt();
                System.out.println(nextThree);
                System.out.printf("%d %d %d %d\n", (initialNumber * initialNumber)  + 1 ,
                        ( ++initialNumber * initialNumber) + 1 ,
                        ( ++initialNumber * initialNumber) + 1 , ( ++initialNumber * initialNumber) + 1);
                nextNumber1 = Integer.parseInt(scan.next());
                nextNumber2 = Integer.parseInt(scan.next());
                nextNumber3 = Integer.parseInt(scan.next());
                nextNumber1Correct = ++initialNumber;
                nextNumber2Correct = ++initialNumber;
                nextNumber3Correct = ++initialNumber;

                if (  Double.toString(nextNumber1).equals(Double.toString(Math.pow( nextNumber1Correct  , 2) + 1))
                        && Double.toString(nextNumber2).equals(Double.toString(Math.pow( nextNumber2Correct , 2) + 1))
                        && Double.toString(nextNumber3)
                        .equals(Double.toString(1 + Math.pow( nextNumber3Correct , 2)))) {
                    System.out.println(congratulations);
                } else {
                    System.out.println(sorry);
                }

                System.out.println(again);




                

            }

        } while(scan.next().equalsIgnoreCase(yes));
        System.out.println(ending);
    }


}
//  if (level == 1) {
//                System.out.println(startNumber);
//                initialNumber = scan.nextInt();
//
//                System.out.println(nextThree);
//                System.out.printf("%d %d %d %d\n" , initialNumber , initialNumber+=2 ,
//               initialNumber+=2 , initialNumber+=2 );
//                nextNumber1 = scan.nextInt();
//                nextNumber2 = scan.nextInt();
//                nextNumber3 = scan.nextInt();
//                nextNumber1Correct = initialNumber+=2;
//                nextNumber2Correct = initialNumber+=2;
//                nextNumber3Correct = initialNumber+=2;
//
//                if ( nextNumber1 == nextNumber1Correct)
//                    if(nextNumber2 == nextNumber2Correct)
//                        if(nextNumber3 == nextNumber3Correct)
//                            System.out.println(congratulations);
//                else
//                    System.out.println(sorry);
//                System.out.println(again);