import java.util.Scanner;
class Quiz_game{
    Scanner sc=new Scanner(System.in);
    public void info(){
        System.out.println("     ***** WELL COME *****");
        System.out.println("-->IF YOU WANT TO PARTICIPATE IN QUIZ\n-->ENTER THE DETAILS IN THE BELOW SECTIONS");
        System.out.println("---------------------------------------------------");
        System.out.print("ENTER YOUR NAME: ");
        String name=sc.nextLine();
        System.out.print("ENTER YOUR AGE: ");
        int age=sc.nextInt();
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }
    public void quiz(){
        System.out.println("--->YOU WILL GET A CODE THAT WOULD BE YOUR ENTRY KEY FOR QUIZ");
        System.out.print("ENTER $ TO GET THE CODE: ");
        String symbol=sc.nextLine();
        if(symbol.equals("$")){
            int code=(int)(Math.random()*900000)+100000;
            System.out.println("YOUR CODE: "+code);
            System.out.println("---------------------------------------------------");
            System.out.println("--->BEFORE STARTING QUIZ READ THE INSTRUCTION GIVEN BELOW CAREFULLY \n    1)THERE WILL BE 6 QUESTIONS \n    2)EACH QUESTIONS CONTAIN 4 OPTIONS \n    3)CHOOSE ANY ONE OF THE FOLLOWING OPTIONS");
            System.out.println("---------------------------------------------------");
            while(true){
                System.out.print("PLEASE ENTER THE ENTRY KEY: ");
                int entrykey=sc.nextInt();
                sc.nextLine();
                int total=0;
                if(entrykey==code){
                    System.out.println("--------------------------------");
                    System.out.println("LETS START THE QUIZ----");
                    System.out.println("q1) WHAT IS THE CAPITAL OF INDIA?\na)MUMBIA\nb)NEW DELHI\nc)KOLKATA\nd)BENGALURU ");
                    String ans1=sc.nextLine();
                    System.out.println("you entered: "+ans1);
                    if(ans1.equalsIgnoreCase("b")){
                        total++;
                    }
                    System.out.println("q2) WHICH PLANET IS KNOWN AS THE RED PLANET?\na)EARTH\nb)VENUS\nc)MARS\nd)JUPITER ");
                    String ans2=sc.nextLine();
                    System.out.println("you entered: "+ans2);
                    if(ans2.equalsIgnoreCase("c")){
                        total++;
                    }
                    System.out.println("q3) HOW MANY CONTINETS ARE THERE ON EARTH?\na)5\nb)6\nc)7\nd)8 ");
                    String ans3=sc.nextLine();
                    System.out.println("you entered: "+ans3);
                    if(ans3.equalsIgnoreCase("c")){
                        total++;
                    }
                    System.out.println("q4) WHICH IS SMALLEST STATE IN INDIA?\na)SIKKIM\nb)GOA\nc)TRIPURA\nd)MANIPUR ");
                    String ans4=sc.nextLine();
                    System.out.println("you entered: "+ans4);
                    if(ans4.equalsIgnoreCase("b")){
                        total++;
                    }
                    System.out.println("q5) WHICH SHAPE HAS 4 EQUAL SIDES?\na)RECTANGLE\nb)TRIANGLE\nc)CIRCLE\nd)SQUARE ");
                    String ans5=sc.nextLine();
                    System.out.println("you entered: "+ans5);
                    if(ans5.equalsIgnoreCase("d")){
                        total++;
                    } System.out.println("q6) WHAT IS H2O IS COMMONLY KNOWN AS?\na)SALT\nb)WATER\nc)AIR\nd)ICE ");
                    String ans6=sc.nextLine();
                    System.out.println("you entered: "+ans6);
                    if(ans6.equalsIgnoreCase("b")){
                        total++;
                    }
                    if (total > 4) {
                        System.out.println("---------CONGRATULATION----------- :)");
                        System.out.println("YOU SCORED " + total + " OUT OF 6");
                    } else if (total == 3) {
                        System.out.println("-------TRY HARD NEXT TIME---------  :|");
                        System.out.println("YOU SCORED " + total + " OUT OF 6");
                    } else {
                        System.out.println("-------BETTER LUCK NEXT TIME-------- :(");
                        System.out.println("YOU SCORED " + total + " OUT OF 6");
                    }
                    break;
                }else {
                    System.out.println("ENTER VALID ENTRY KET TO START QUIZ");
                }
            }

        }else{
            System.out.println("ENTER VALID CHARCTER");

        }
    }

}
public class Quiz {
    public static void main(String[] args) {
    Quiz_game participant1=new Quiz_game();
    participant1.info();
    participant1.quiz();
    }
}
