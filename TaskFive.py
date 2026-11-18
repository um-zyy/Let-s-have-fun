## TaskFive
counter = 1
number = 1
sum = 0
averager = 0
while (counter <= 10) :
	user_input = int(input("Enter the number: "))
	if ( user_input % 2 == 0 ):
		sum += user_input

	counter += 1
	number += 1

print("The sum of the even numbers inputed is: " , sum)

