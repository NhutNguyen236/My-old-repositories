def printHidKey(fn,e):
    mount =[]
    return [d for d in range(2,fn) if d*e%fn==1]
print(printHidKey(15,10))
