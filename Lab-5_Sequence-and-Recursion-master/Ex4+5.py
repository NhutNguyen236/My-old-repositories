A=[2,4,5]
n=len(A)
def findmax(A,n):
    if n==1:
        return A[0]
    return max(A[n - 1], findmax(A, n - 1)) 

def findMin(A,n):
    if n==1:
        return A[0]
    return min(A[n-1],findMin(A,n-1))
print(findmax(A,n))
print(findMin(A,n))
