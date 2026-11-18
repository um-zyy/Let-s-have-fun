import java.util.Scanner;
public class TaskOne{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int counter = 1;
int number = 1;
int sum = 0;
for (;counter <= 10;) {
System.out.println("Enter the " + number + " number");
int userInput = input.nextInt();
sum += userInput;
counter++;
number++;
}
System.out.println("The sum of the numbers inputed is " + sum);
}
}

