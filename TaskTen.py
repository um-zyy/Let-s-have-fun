
## TaskTen
counter = 1
number = 1
sum = 0
averager = 0;
while (counter <= 10) :
	user_input = int(input("Enter the  number: "))

	if ( user_input >= 0 and user_input <= 100 ) :
		sum += user_input
		averager += 1
	counter += 1
	number += 1
average = sum/averager
print("The Average of the Valid numbers inputed is " , average)

