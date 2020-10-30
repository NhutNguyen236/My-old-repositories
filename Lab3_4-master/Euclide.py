def gcd(a,b):
  while b%a!=0:
    r=b%a
    b=a
    a=r
  return a
print(gcd(1212))
