    
n = int(input("Insert a random number: "))
def PrimeF(n):
  Prime = []
  i = 2
  while n>1:
    if n%i==0:
      Prime.append(i)
      n//=i
    else:
      i+=1

  return Prime
print(PrimeF(n))
