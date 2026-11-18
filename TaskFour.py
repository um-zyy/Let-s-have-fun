## TaskFour
counter = 1
number = 1
sum = 0
while (counter <= 10) :
	user_input = int(input("Enter the number: "))
	if ( counter % 2 == 0 ):
		sum += user_input
	counter += 1
	number += 1
print("The sum of the numbers inputed is " , sum)

