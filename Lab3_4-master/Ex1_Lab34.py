n = int(input("Insert a random number: "))
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
print(print_Prime(n))

          
