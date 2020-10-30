#n = int(input("Insert a random number: "))
#n = int(input("Insert a random number: "))
import random
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
#print(gcd(a,b))

p,q = random.sample(print2Prime(125,200),1)[0]
print(p,q)
def gcd(a,b):
    while a!=b:
        if a > b:
           a=a-b
        else:
           b=b-a
    return a
#print(gcd(a,b))
a = (p-1)*(q-1)
def printCoPrime1(a,n):
     return [i for i in range(2,n+1) if gcd(a,i)==1]

e=random.sample(printCoPrime1(a,100),1)[0]
print(e)
fn=(p-1)*(q-1)
def printHidKey(fn,e):
    return [d for d in range(2,fn) if d*e%fn==1]
d=random.sample(printHidKey(fn,e),1)[0]
print(d)
#print(printHidKey(45,14))
def encode_RSA(n,e,mess):
    en=[ord(m) for m in mess]
    en=[m**e%n for m in en]
    en=[chr(a) for a in en]
    return ''.join(en)
s = encode_RSA(p*q,e,'TON DUC THANG')
print(encode_RSA(p*q,e,'TON DUC THANG'))
def decode_RSA(n,d,mess):
    de = encode_RSA(n,d,mess)
    return d
#print(decode_RSA(5,4,'TOn Duc Thang'))
print(decode_RSA(p*q,d,s))

