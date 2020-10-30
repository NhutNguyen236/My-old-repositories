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
def print2Prime(a,b):
    Prime = print_Prime(b)
    Pair = []
    for i in Prime:
        for j in [k for k in Prime if k>i]:
            mul=i*j
            if mul>a and mul<b:
                Pair.append((i,j))
    return Pair
print(print_Prime(30))
print(print2Prime(2,30))

          
