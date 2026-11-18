import java.util.Scanner;
public class TaskTen{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int counter = 1;
int number = 1;
int sum = 0;
int averager = 0;
for (;counter <= 10;) {
System.out.println("Enter the " + number + " number");
int userInput = input.nextInt();
if ( userInput >= 0 && userInput <= 100 ) {
sum += userInput;
averager++;
}
counter++;
number++;
}
int average = sum/averager;
System.out.println("The Average of the Valid numbers inputed is " + average);
}
}

