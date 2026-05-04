package dsa.com.lecture9;

public class Conditionals {
    public static void main(String[] args) {

        //if
//        int num = 10;
//        if(num>8){
//            System.out.println("Number is greater than 8 ");
//        }

        //if-else.............
//        int num2 = 45;
//        if(num2>=18){
//            System.out.println("You are eligible for vote");
//        }
//
//        else {
//            System.out.println("not eligible for vote");
//        }


        //if-else-if

//        int marks = 32;
//        if(marks>=90){
//            System.out.println("Excellent");
//        } else if (marks>=70) {
//            System.out.println("Good");
//        } else if (marks>=60) {
//            System.out.println("Average");
//        } else if (marks>=33) {
//            System.out.println("Below Average");
//        }
//
//        else {
//            System.out.println("Not good");
//        }

        //Nested If-Else

//         boolean hasSubscription = false;
//         int solvedProblems = 180;
//
//         if(hasSubscription){
//             if (solvedProblems>=200){
//                 System.out.println("Unlock Advance sheet");
//             }
//             else {
//                 System.out.println("Practice more problems");
//             }
//         } else {
//             System.out.println("Upgrade to premium");
//         }

         //Ternary operator-------\

        int streakDays = 22;
         String status = (streakDays>=30)? "Consistent" : "Irregular";
        System.out.println(status);

    }
}
