#calculating number of digits of a number
number = int(input('Input a number: '))
def Digit(number):
  if number<10: #if a number is less than 10, return 1 cuz a number which is les than 10 contains 1 digit
    return 1
  else:
    return Digit(number/10)+1 # Recursively devide that number with 10 to get remainder and add 1 because remainder always has less then 1 digit
print(int(Digit(number)))

