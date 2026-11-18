## TaskSix
counter = 1
number = 1
sum = 0
averager = 0
while (counter <= 10) :
	user_input = int(input("Enter the number: "))
	if ( user_input % 2 == 0 ):
		sum += user_input
		averager += 1

	counter += 1
	number += 1
	
average = sum/averager
print("The Average of the even numbers inputed is " , average)


