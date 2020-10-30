from itertools import product
def Implies(a,b):
    if a:
        return b
    else:
        return True
def Check(a,b):
    if a==True and b==True:
        return '✓'
    if a==False and b==False:
        return '✓'
    else:
        return '✘'
#Take1#
print("1/")
table=list(product([False,True],repeat=1)) 
p=[a[0] for a in table] 
NOTNOTp=[not(not p[i]) for i in range(len(p))]
check=[Check(p[i],NOTNOTp[i]) for i in range(len(p))]
print('p\t\t~(~p)\t\tCheck')
for i in range(len(p)):
    print(p[i],NOTNOTp[i],check[i],sep='\t\t')

left=p
right=NOTNOTp

Equalcheck=[left==right for left, right in zip(left,right)]
if False in Equalcheck:	
	print('~(~p) and p are Inequivalent')
else:
	print('~(~p) and p are  Equivalent')
	
#Take2#
print("\n")
print("2/")
table=list(product([False,True],repeat=2)) 
p=[a[0] for a in table] 
q=[a[1] for a in table] 
NOTqAp=[(not q[i]) and p[i] for i in range(len(p))]
qVp=[q[i] or p[i] for i in range(len(p))]#two
NOToneAtwo=[not (NOTqAp[i]) and qVp[i] for i in range(len(p))]
check=[Check(q[i],NOToneAtwo[i]) for i in range(len(p))]
print('q\t\t~(~qAp)A(qVp)\tCheck')
for i in range(len(p)):
    print(q[i],NOToneAtwo[i],check[i],sep='\t\t')

left=NOToneAtwo
right=q

Equalcheck=[left==right for left, right in zip(left,right)]
if False in Equalcheck:	
	print('~(~qAp)A(qVp) and p are Inequivalent')
else:
	print('~(~qAp)A(qVp) and p are Equivalent')

#Take 3#
print("\n")
print("3/")
table=list(product([False,True],repeat=2))
p=[a[0] for a in table]
q=[a[1] for a in table]
notporq = [not(p[i] or q[i]) for i in range(len(p))]
notpornotq = [not p[i] or not q[i] for i in range(len(p))]
check = [Check(notporq[i],notpornotq[i])for i in range(len(p))]
print('~(pVq)\t\t(~pV~q)\t\tCheck')
for i in range(len(p)):
    print(notporq[i],notpornotq[i],check[i],sep='\t\t')

left=notporq
right=notpornotq

Equalcheck=[left==right for left, right in zip(left,right)]
if False in Equalcheck:	
	print('~(pVq) and (~pV~q) are Inequivalent')
else:
	print('~(pVq) and (~pV~q) are Equivalent')

#Take 4#
print("\n")
print('4/')
table=list(product([False,True],repeat=3))
p=[a[0] for a in table]
q=[a[1] for a in table]
r=[a[2] for a in table]
porqimpr = [Implies(p[i] or q[i],r[i]) for i in range(len(p))]
pimplrandqimplr = [Implies(p[i],r[i]) and Implies(q[i],r[i]) for i in range(len(p))]
check = [Check(porqimpr[i],pimplrandqimplr[i])for i in range(len(p))]
print('(pVq)->r\t(p->r)A(q->r)\tCheck')
for i in range(len(p)):
    print(porqimpr[i],pimplrandqimplr[i],check[i],sep='\t\t')

left=porqimpr
right=pimplrandqimplr

Equalcheck=[left==right for left, right in zip(left,right)]
if False in Equalcheck:	
	print('(pVq)->r and (p->r)A(q->r) are Inequivalent')
else:
	print('(pVq)->r and (p->r)A(q->r) are Equivalent')


#Take 5#
print("\n")
print("5/")
table=list(product([False,True],repeat=2))
p=[a[0] for a in table]
q=[a[1] for a in table]
notpandq = [not(p[i] and q[i]) for i in range(len(p))]
notpandnotq = [not p[i] and not q[i] for i in range(len(p))]
check = [Check(notpandq[i],notpandnotq[i])for i in range(len(p))]
print('~(pAq)\t\t(~pA~q)\t\tCheck')
for i in range(len(p)):
    print(notpandq[i],notpandnotq[i],check[i],sep='\t\t')

left=notpandq
right=notpandnotq

Equalcheck=[left==right for left, right in zip(left,right)]
if False in Equalcheck:	
	print('~(pAq) and (~pA~q) are Inequivalent')
else:
	print('~(pAq) and (~pA~q) are Equivalent')

#Take 6#
print("\n")
print("6/")
table=list(product([False,True],repeat=2))
p=[a[0] for a in table]
q=[a[1] for a in table]
pornotqinotp = [Implies((p[i] or not q[i]),not p[i])for i in range(len(p))]
pornotqinotp2 = [Implies(p[i] or (not q[i]),not p[i]) for i in range(len(p))]
check = [Check(pornotqinotp[i],pornotqinotp2[i])for i in range(len(p))]
print('(pV~q)->~p\t(pV(~q))->~p\tCheck')
for i in range(len(p)):
    print(pornotqinotp[i],pornotqinotp2[i],check[i],sep='\t\t')

left=pornotqinotp
right=pornotqinotp2

Equalcheck=[left==right for left, right in zip(left,right)]
if False in Equalcheck:	
	print('(pV~q)->~p and (pV(~q))->~p are Inequivalent')
else:
	print('(pV~q)->~p and (pV(~q))->~p are Equivalent')

#Take 7#
print("\n")
print("7/")
table=list(product([False,True],repeat=2))
p=[a[0] for a in table]
q=[a[1] for a in table]
notporq1 = [not(p[i] or q[i]) for i in range(len(p))]
notpandnotq1 = [not p[i] and not q[i] for i in range(len(p))]
check = [Check(notporq1[i],notpandnotq1[i])for i in range(len(p))]
print('~(pVq)\t\t(~pA~q)\t\tCheck')
for i in range(len(p)):
    print(notporq1[i],notpandnotq1[i],check[i],sep='\t\t')

left=notporq1
right=notpandnotq1

Equalcheck=[left==right for left, right in zip(left,right)]
if False in Equalcheck:	
	print('~(pVq) and (~pA~q) are Inequivalent')
else:
	print('~(pVq) and (~pA~q) are Equivalent')  
