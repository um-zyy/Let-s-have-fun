import java.util.Scanner;
public class TaskSix{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int counter = 1;
int number = 1;
int sum = 0;
int averager = 0;
for (;counter <= 10;) {
System.out.println("Enter the " + number + " number");
int userInput = input.nextInt();
if ( userInput % 2 == 0 ) {
sum += userInput;
averager += 1;
}
counter++;
number++;
}
int average = sum/averager;
System.out.println("The Average of the even numbers inputed is " + average);


}
}

