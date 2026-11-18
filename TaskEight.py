##TaskEight
counter = 1
number = 1
sum = 0
while (counter <= 10) :
    user_input = int(input("Enter the number in the range 1-100: "))
    if (user_input <= 0 or user_input >= 100):
        print("Invalid input try again")
        continue
    sum += user_input
    counter += 1
    number += 1
print("The sum of the numbers inputed is " , sum)

