import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class expenditure {
    public static void main(String[] args){
        HashMap<String,Double> map =new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total Income");
        double income=sc.nextDouble();
        while(true){
            System.out.println("Enter the Catogory of Expenditure");
            String catogory=sc.next();
            if(catogory.equalsIgnoreCase("done")){
                break;
            }
            System.out.println("Enter the amount to be add in the catogory");
            double amount=sc.nextDouble();
            map.put(catogory,amount);


        }
        double expenditure=0;
        for(Map.Entry<String,Double> entry:map.entrySet()){
            expenditure+=entry.getValue();

        }
        double saved=income-expenditure;
        if(income-expenditure<0){
            saved=0;
        }
        System.out.println("Income Amount:"+ income);
        System.out.println("Expenditure Amount:"+expenditure);
        System.out.println("Breakdown expenditure" +  map);
        System.out.println("Saved Amount:"+saved);
    }
}

//You said:
//give me On selling 17 balls at Rs. 720, there is a loss equal to the cost price of 5 balls. The cost price of a ball is:
//
//Rs. 45
//
//Rs. 50
//
//Rs. 55
//
//Rs. 60
//Answer: Option
//
//Explanation:
//(C.P. of 17 balls) - (S.P. of 17 balls) = (C.P. of 5 balls)
//
// C.P. of 12 balls = S.P. of 17 balls = Rs.720.
//
// C.P. of 1 ball = Rs.		720		= Rs. 60.
//12in thios qns sp of 1 ball is 720 /17 then subtach with the prioce which is x and then x minus 720/17 = 5 x why its wronmg
//
//ChatGPT said:
//Good question 👍 — your thinking is logical but algebra setup is slightly wrong. Let’s fix it step-by-step.
//
//✅ Given
//Selling price of 17 balls = 720
//
//Loss = cost price of 5 balls
//
//We don’t know cost price of 1 ball → assume
//
//👉 Cost price of 1 ball = x
//
//✅ Step 1 — Write CP and SP
//CP of 17 balls = 17x
//
//SP of 17 balls = 720
//
//Loss = CP − SP
//
//So,
//
//Loss
//=
//17
//x
//−
//720
//Loss=17x−720
//But question says:
//
//Loss
//=
//CP of 5 balls
//=
//5
//x
//Loss=CP of 5 balls=5x
//Therefore,
//
//17
//x
//−
//720
//=
//5
//x
//17x−720=5x
//✅ Step 2 — Solve
//17
//x
//−
//5
//x
//=
//720
//17x−5x=720
//12
//x
//=
//720
//12x=720
//x
//=
//60
//x=60
//👉 Cost price of 1 ball = ₹60
//
//❌ Why your method is wrong
//You wrote:
//
//x
//−
//720
//17
//=
//5
//x
//x−
//17
//720
//​
// =5x
//This means:
//
//👉 loss per ball = CP per ball − SP per ball
//👉 and you equated that to CP of 5 balls
//
//But question says:
//
//🚫 NOT loss per ball
//✅ loss on 17 balls
//
//So comparison must be:
//
//Loss on 17 balls
//=
//CP of 5 balls
//Loss on 17 balls=CP of 5 balls
//NOT per ball comparison.
//
//⭐ Shortcut thinking (best for exams like TCS NQT)
//Loss = CP of 5 balls
//
//So,
//
//CP of 17 − SP of 17 = CP of 5
//
//Move terms:
//
//CP of 17 − CP of 5 = SP of 17
//
//👉 CP of 12 = 720
//
//👉 CP of 1 = 720/12 = 60
//
//🔥 This is the fastest method.
//
//If you want, I can also give:
//
//✅ Similar TCS pattern questions (very high probability)
//✅ Profit/Loss shortcut tricks sheet
//✅ 5 practice questions of same type
//
//Just tell 👍
//
//
//You said:
//what if we take for tyhe 1 ball
//
//ChatGPT said:
//Good 👍 this is exactly the doubt most students get.
//
//You are asking:
//
//👉 Can we solve by taking 1 ball instead of 17 balls?
//
//Yes — but you must do it correctly.
//
//✅ Let cost price of 1 ball = x
//Then:
//
//CP of 17 balls = 17x
//
//SP of 17 balls = 720
//
//Loss = CP − SP = 17x − 720
//
//But question says:
//
//👉 Loss = CP of 5 balls
//👉 Loss = 5x
//
//So,
//
//17
//x
//−
//720
//=
//5
//x
//17x−720=5x
//12
//x
//=
//720
//12x=720
//x
//=
//60
//x=60
//✔ Same answer.
//
//❌ Where students go wrong (your confusion)
//You tried something like:
//
//x
//−
//720
//17
//=
//5
//x
//x−
//17
//720
//​
// =5x
//This means:
//
//👉 (CP per ball − SP per ball) = CP of 5 balls
//
//But logically this is wrong because:
//
//LHS → loss per ball
//
//RHS → cost of 5 balls
//
//👉 Units don’t match.
//
//It should be:
//
//Loss per ball = x − 720/17
//
//Loss of 17 balls = 17(x − 720/17)
//
//But that simplifies to:
//
//17
//x
//−
//720
//17x−720
//So again:
//
//17
//x
//−
//720
//=
//5
//x
//17x−720=5x
//Same equation.
//
//⭐ Key concept (VERY important for aptitude)
//Whenever question says:
//
//👉 “Loss equals cost of some items”
//
//Always compare:
//
//✅ Total loss
//with
//✅ Total cost
//
//Never mix per-item and total values.
//
//If you want, I can give you:
//
//🔥 3 more questions where loss = cost of items (TCS favourite)
//🔥 Trick to instantly convert these without algebra
//🔥 Profit/Loss mini revision sheet
//
//Tell me 👍
//
//
//You said:
//
//It takes eight hours for a 600 km journey, if 120 km is done by train and the rest by car. It takes 20 minutes more, if 200 km is done by train and the rest by car. The ratio of the speed of the train to that of the cars is:
//
//2 : 3
//
//3 : 2
//
//3 : 4
//
//4 : 3
//Answer: Option      expalin the NSWER corectly
//
//Explanation:
//Let the speed of the train be x km/hr and that of the car be y km/hr.
//
//Then,	120	+	480	= 8       	1	+	4	=	1	....(i)
//x	y	x	y	15
//And,	200	+	400	=	25	    	1	+	2	=	1	....(ii)
//x	y	3	x	y	24
//Solving (i) and (ii), we get: x = 60 and y = 80.
//
// Ratio of speeds = 60 : 80 = 3 : 4.
//
//ChatGPT said:
//This is a time–speed–distance simultaneous equation question.
//Let’s go slowly so you understand the logic (not just formula).
//
//✅ Step 1 — Assume speeds
//Let
//
//Speed of train = x km/hr
//
//Speed of car = y km/hr
//
//Total journey = 600 km
//
//✅ Step 2 — First condition
//👉 120 km by train
//👉 Remaining = 600 − 120 = 480 km by car
//
//Total time = 8 hours
//
//So,
//
//120
//x
//+
//480
//y
//=
//8
//x
//120
//​
// +
//y
//480
//​
// =8
//✅ Step 3 — Simplify equation (important step)
//Divide whole equation by 120 (to reduce numbers)
//
//1
//x
//+
//4
//y
//=
//8
//120
//x
//1
//​
// +
//y
//4
//​
// =
//120
//8
//​
//
//1
//x
//+
//4
//y
//=
//1
//15
//.
//.
//.
//(
//1
//)
//x
//1
//​
// +
//y
//4
//​
// =
//15
//1
//​
// ...(1)
//✅ Step 4 — Second condition
//👉 200 km by train
//👉 Remaining = 600 − 200 = 400 km by car
//
//Time = 8 hr + 20 min
//
//20 min = 1/3 hr
//
//So total time =
//
//8
//+
//1
//3
//=
//25
//3
//8+
//3
//1
//​
// =
//3
//25
//​
//
//Equation:
//
//200
//x
//+
//400
//y
//=
//25
//3
//x
//200
//​
// +
//y
//400
//​
// =
//3
//25
//​
//
//✅ Step 5 — Simplify second equation
//Divide by 200
//
//1
//x
//+
//2
//y
//=
//25
//600
//x
//1
//​
// +
//y
//2
//​
// =
//600
//25
//​
//
//1
//x
//+
//2
//y
//=
//1
//24
//.
//.
//.
//(
//2
//)
//x
//1
//​
// +
//y
//2
//​
// =
//24
//1
//​
// ...(2)
//✅ Step 6 — Solve equations
//We have
//
//(1)
//1
//x
//+
//4
//y
//=
//1
//15
//x
//1
//​
// +
//y
//4
//​
// =
//15
//1
//​
//
//
//(2)
//1
//x
//+
//2
//y
//=
//1
//24
//x
//1
//​
// +
//y
//2
//​
// =
//24
//1
//​
//
//
//Subtract (2) from (1):
//
//2
//y
//=
//1
//15
//−
//1
//24
//y
//2
//​
// =
//15
//1
//​
// −
//24
//1
//​
//
//LCM = 120
//
//2
//y
//=
//8
//−
//5
//120
//=
//3
//120
//=
//1
//40
//y
//2
//​
// =
//120
//8−5
//​
// =
//120
//3
//​
// =
//40
//1
//​
//
//y
//=
//80
//y=80
//✅ Step 7 — Find x
//Put
//y
//=
//80
//y=80 in equation (2)
//
//1
//x
//+
//2
//80
//=
//1
//24
//x
//1
//​
// +
//80
//2
//​
// =
//24
//1
//​
//
//1
//x
//+
//1
//40
//=
//1
//24
//x
//1
//​
// +
//40
//1
//​
// =
//24
//1
//​
//
//1
//x
//=
//1
//24
//−
//1
//40
//x
//1
//​
// =
//24
//1
//​
// −
//40
//1
//​
//
//LCM = 120
//
//1
//x
//=
//5
//−
//3
//120
//=
//2
//120
//=
//1
//60
//x
//1
//​
// =
//120
//5−3
//​
// =
//120
//2
//​
// =
//60
//1
//​
//
//x
//=
//60
//x=60
//✅ Final ratio
//Train : Car
//
//60
//:
//80
//=
//3
//:
//4
//60:80=3:4
//👉 Answer = 3 : 4
//
//⭐ Exam shortcut insight (very useful for TCS)
//Notice:
//
//Only distances change
//
//Total journey same
//
//So we convert into equations in 1/x and 1/y
//
//Then subtract → removes 1/x → gives speed quickly
//
//👉 This pattern appears a lot in TCS NQT.
//
//If you want, I can give:
//
//✅ 2 shortcut methods without algebra
//✅ 5 similar TCS questions (high probability)
//✅ Trick to instantly form 1/x equations
//
//Tell me 👍
//
//
//You said:
//i wan yo enter some values until i write done hin the form of strihn how i will do it
//
//ChatGPT said:
//Ahh 👍 you mean:
//
//👉 User keeps entering values
//👉 Until user types some string like "done"
//👉 Then input should stop
//
//This is a very common pattern.
//
//Let me show you clearly.
//
//✅ Java solution (MOST common for you)
//Since you are preparing Java for placements.
//
//⭐ Using while loop
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter value (type done to stop): ");
//            String input = sc.nextLine();
//
//            if (input.equalsIgnoreCase("done")) {
//                break;
//            }
//
//            System.out.println("You entered: " + input);
//        }
//
//        System.out.println("Input finished");
//    }
//}
//✅ How it works
//Infinite loop runs
//
//User enters input
//
//If input = "done" → break
//
//Otherwise process value
//
//⭐ If you want numbers only (TCS pattern)
//Sometimes user enters numbers and then "done".
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//
//        while (true) {
//            String input = sc.next();
//
//            if (input.equalsIgnoreCase("done"))
//                break;
//
//            int num = Integer.parseInt(input);
//            sum += num;
//        }
//
//        System.out.println("Sum = " + sum);
//    }
//}
//👉 This is very common interview question.
//
//⭐ Pro tip (IMPORTANT)
//Why we take String first?
//
//Because if user types "done" and you read nextInt() → program crashes.
//
//So always:
//
//👉 Read as String
//👉 Then convert
//
//If you want, I can next give:
//
//🔥 Pattern where user enters numbers in single line until done
//🔥 Pattern where user enters until -1 (sentinel value)
//🔥 5 Scanner interview traps (VERY important for Java interviews)
//
//Tell me 👍
//
//
//You said:
//   while(true){
//            System.out.println("Enter the Catogory of Expenditure");
//            String catogory=sc.next();
//            System.out.println("Enter the amount to be add in the catogory");
//            double amount=sc.nextDouble();
//            map.put(catogory,amount);
//            if(catogory.equalsIgnoreCase("done")){
//                break;
//            }
//
//        }
//
//ChatGPT said:
//You are very close, but there is one logical mistake 👇
//
//👉 You are checking "done" after taking amount
//👉 But when user types "done" → program will still ask for amount → error
//
//❌ Problem in your code
//String catogory=sc.next();   // user types done
//double amount=sc.nextDouble(); // program still asks amount → wrong
//So if user enters "done" → you should stop immediately before asking amount.
//
//✅ Correct code
//while (true) {
//    System.out.println("Enter the Category of Expenditure (type done to stop)");
//    String category = sc.next();
//
//    if (category.equalsIgnoreCase("done")) {
//        break;
//    }
//
//    System.out.println("Enter the amount to be added in the category");
//    double amount = sc.nextDouble();
//
//    map.put(category, amount);
//}
//⭐ Why this works
//Flow becomes:
//
//Take category
//
//If category = done → stop
//
//Otherwise take amount
//
//Store in map
//
//👉 Clean input flow
//
//⭐ Extra improvement (VERY useful for your projects)
//Right now if same category comes again → amount gets replaced.
//
//If you want sum per category (expense tracker behaviour):
//
//map.put(category, map.getOrDefault(category, 0.0) + amount);
//🔥 This is a very strong Java interview line.
//
//⭐ Small spelling tip
//You wrote:
//
//👉 catogory ❌
//👉 category ✅
//
//Better to fix now 🙂
//
//If you want, I can also give:
//
//✅ Full expense tracker mini program (Map based)
//✅ How to print category-wise totals
//✅ How to sort expenses using Comparator (very interview useful)
//
//Tell me 👍
//
//
//You said:
//how ro do coding encodign tyupe coding qns
//
//ChatGPT said:
//OK 👍 I understand — you are asking:
//
//👉 How to solve encoding / decoding type coding questions
//(Common in TCS, Infosys, Wipro, etc.)
//
//These questions usually follow patterns. If you know patterns → very easy.
//
//Let me teach you properly.
//
//⭐ 4 MOST COMMON encoding–decoding patterns
//✅ 1. Character shifting (Caesar type)
//Example
//A → C
//B → D
//C → E
//
//👉 Shift +2
//
//✔ Approach
//Convert char → ASCII
//
//Add shift
//
//Convert back
//
//✔ Code
//String s = "ABC";
//String res = "";
//
//for(char c : s.toCharArray()){
//    res += (char)(c + 2);
//}
//
//System.out.println(res);
//👉 Output → CDE
//
//✅ 2. Position-based encoding
//Example
//A → 1
//B → 2
//C → 3
//
//✔ Approach
//ASCII trick
//
//👉 A = 65
//👉 So A − 'A' + 1
//
//✔ Code
//String s = "ABC";
//
//for(char c : s.toCharArray()){
//    System.out.print((c - 'A' + 1) + " ");
//}
//👉 Output → 1 2 3
//
//✅ 3. Reverse + shift pattern
//Example
//HELLO → OLLEH → shift +1 → PMMFI
//
//✔ Approach
//Reverse string
//
//Shift characters
//
//✅ 4. Alternate shift pattern (VERY TCS favourite)
//Example
//ABCDEF → +1 −1 +1 −1
//
//✔ Code
//String s="ABCDEF";
//String res="";
//
//for(int i=0;i<s.length();i++){
//    if(i%2==0)
//        res += (char)(s.charAt(i)+1);
//    else
//        res += (char)(s.charAt(i)-1);
//}
//
//System.out.println(res);
//⭐ UNIVERSAL STEP-BY-STEP METHOD (memorize this)
//Whenever encoding question comes:
//
//🔥 Step 1 — Check pattern
//Shift?
//
//Reverse?
//
//Position?
//
//Alternate?
//
//Digit manipulation?
//
//🔥 Step 2 — Take small example
//Test on 2–3 letters
//
//🔥 Step 3 — Convert char → ASCII
//Most problems solved here
//
//🔥 Step 4 — Implement loop
//⭐ Interview secret (VERY IMPORTANT)
//Most students panic because they try to guess rule mentally.
//
//Instead:
//
//👉 Write A B C
//👉 Write encoded values
//👉 Compare differences
//
//Pattern becomes obvious.
//
//⭐ Since you are preparing TCS coding round
//These are high probability:
//
//✅ Caesar shift
//✅ Alternate shift
//✅ Reverse encoding
//✅ Digit–char mix encoding
//✅ Frequency-based encoding
//
//If you want, I can give:
//
//🔥 10 TCS encoding questions with answers
//🔥 Decoding trick (reverse logic)
//🔥 Most asked coding patterns list for TCS (gold list)
//
//Just tell 👍   //