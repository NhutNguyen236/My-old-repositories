number1 = int(input('Input number1: '))
number2 = int(input('Input number2: '))
def gcd(number1,number2):
  return number1 if number2==0 else gcd(number2,number1%number2)
def lcm(a,b):
  return (a*b)/gcd(a,b)
print('GCD =',gcd(number1,number2))
print('LCM =',lcm(number1,number2))
