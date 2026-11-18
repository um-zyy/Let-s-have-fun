import java.util.Scanner;
public class TaskEight{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int counter = 1;
int number = 1;
int sum = 0;
for (;counter <= 10;) {
System.out.println("Enter the " + number + " number in the range 1-100");
int userInput = input.nextInt();
if (userInput <= 0 || userInput >= 100) {
System.out.println("Invalid input try again");
continue;
}
sum += userInput;
counter++;
number++;
}
System.out.println("The sum of the numbers inputed is " + sum);
}
}

