d = int(input())
def B(a):
  b=0
  n=0
  while a>0:
    r=a%2*10**n
    b+=r
    a=a//2
    n+=1
  return b 
print(B(d))
