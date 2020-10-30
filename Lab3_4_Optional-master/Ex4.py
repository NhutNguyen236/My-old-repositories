def printHidKey(fn,e):
    mount =[]
    return [d for d in range(2,fn) if d*e%fn==1]
print(printHidKey(15,10))
def encode_RSA(n,e,mess):
    en=[ord(m) for m in mess]
    en=[m**e%n for m in en]
    en=[chr(a) for a in en]
    return ''.join(en)
print(encode_RSA(5,10,'TOn Duc Thang'))
def decode_RSA(n,d,mess):
    de = encode_RSA(n,d,mess)
    return d
print(decode_RSA(5,4,'TOn Duc Thang'))
