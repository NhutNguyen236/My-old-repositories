    
n = int(input("Insert a random number: "))
def print_Prime(n):
  Prime = []
  for i in range(2,n+1):
    if 0 not in [i%a for a in Prime]:
      Prime.append(i)
  return Prime
print(print_Prime(n))
