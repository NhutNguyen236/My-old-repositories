def P(n,r):
    if n>=r>0:
        return P(n-1,r-1)*n
    return 1
print(P(7,5))
