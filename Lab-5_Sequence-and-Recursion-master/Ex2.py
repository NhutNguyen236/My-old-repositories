number = int(input('Input a number: '))
def Fib(number):
  if number<2:
    return number
  else:
    return Fib(number-1)+Fib(number-2)
print(int(Fib(number)))
