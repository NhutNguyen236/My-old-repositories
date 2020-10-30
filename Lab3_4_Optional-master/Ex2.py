#n = int(input("Insert a random number: "))
def print_Prime(n):
  Prime = []
  for i in range(2,n+1):
    F = True
    for j in Prime:
      if i%j ==0:
        F = False
        break
    if F:
      Prime.append(i)
  return Prime
def gcd(a,b):
    while a!=b:
        if a > b:
           a=a-b
        else:
           b=b-a
    return a
#print(gcd(a,b))
def printCoPrime(a,n):
    pr = print_Prime(n)
    Co = []
    for i in range(2,n):
        if gcd(a,i)==1:
            Co.append(i)
    return Co
print('Co:',printCoPrime(5,40))

def printCoPrime1(a,n):
     return [i for i in range(2,n+1) if gcd(a,i)==1]
print('Co:',printCoPrime1(5,40))
          
