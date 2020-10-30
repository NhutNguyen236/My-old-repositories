import math
n=10
def ex(n):
    if n<10:
        return 1
    return 1+ex(n//10)
print(ex(n))

