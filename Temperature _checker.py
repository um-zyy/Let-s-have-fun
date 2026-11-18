##Temperature converter 
def Temperature_checker(temperature , unit):
    if unit == "C" or unit == "c" :
        converted = (temperature - 32) * (5/9)
        print("New temperature in fahrenheit is " , converted)
    elif unit == "F" or unit == "f" :
        converted = 32 + (temperature* 5/9)
        print("New temperature in celsius is " , converted)
    else :
        return ("Invalid input")
    if unit == "C" or unit == "c" :
        if converted >= 70:
            return ("Heat alert")
        else :
            return ("cold advisory")
            
    if unit == "F" or unit == "f" :
        if converted >= 90:
            return ("Heat alert")
        else :
            return ("cold advisory")
            
test = 123
test2 = "f"
result = Temperature_checker(test,test2)
print(result)

