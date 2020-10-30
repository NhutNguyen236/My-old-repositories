A = []
n = int(input('Size = '))
for i in range(0,n):
    x = int(input())
    A.append(x)

def findMax(A, n): 
	# if n = 0 means whole array 
	# has been traversed 
	if (n == 1): 
		return A[0] 
	return max(A[n - 1], findMax(A, n - 1)) 
def findMin(A, n): 
	# if n = 0 means whole array 
	# has been traversed 
	if (n == 1): 
		return A[0] 
	return min(A[n - 1], findMin(A, n - 1)) 
print('Max =',findMax(A, n)) 
print('Min =',findMin(A, n))

