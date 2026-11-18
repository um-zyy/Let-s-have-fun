import java.util.Scanner;
public class TaskTwo{
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
int average = sum/10;
System.out.println("The Average of the numbers inputed is " + average);
}
}

