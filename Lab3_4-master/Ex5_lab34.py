#d = int(input())

def B(d):
  b=0
  n=0
  while d>0:
    r=d%2*10**n
    b+=r
    d=d//2
    n+=1
  return b 
print(B(11))

def B2B(d):
  b = B(d//1)
  d-=d//1
  n=-1
  limit=0
  while d!=0 and limit<=6:
    r=(d*2)//1*(10**n)
    b+=r
    d*=2
    d-=d//1
    n-=1
    limit+=1
  return b
print(B2B(11.3))
