from itertools import product
def Implies(a,b):
    if a:
        return b
    else:
        return True
def Double_Implies(a,b):
    if a:
        return b
    if a==False and b==True:
        return False
    else:
        return True
print("  p\tq    pVq->pAq->~pv~q")
def function1(p,q):
    return Implies(Implies((p or q),(p and q)),((not p) or (not q)))
input1 = product([True,False],repeat = 2)
for i in input1:
    print(i,function1(*i))

print("\n")
print("  p\tq     r    ~pv(qAr)->r")
def function2(p,q,r):
    return Implies((not p) or (q and r),r)
input2 = product([True,False],repeat = 3)
for i in input2:
    print(i,function2(*i))

print("\n")
print("  p\tq     r    (p->q)A(q->r)")
def function3(p,q,r):
    return Implies(p,q) and Implies(q,r)
input3 = product([True,False],repeat = 3)
for i in input3:
    print(i,function3(*i))

print("\n")
print("  p\tq     r    (p->q)A(q->r)")
def function3(p,q,r):
    return Implies(p,q) and Implies(q,r)
input3 = product([True,False],repeat = 3)
for i in input3:
    print(i,function3(*i))

print("\n")
print("  p\tq     r    (pV(pAr))<->((pvq)A(pvr))")
def function4(p,q,r):
    return Double_Implies((p or (q and r)),((p or q) and (p or r)))
input4 = product([True,False],repeat = 3)
for i in input4:
    print(i,function4(*i))

print("\n")
print("  p\tq     r     t     pvq->~rvt")
def function5(p,q,r,t):
    return Implies((p or q),((not r) or t))
input5 = product([True,False],repeat = 4)
for i in input5:
    print(i,function5(*i))

print("\n")
print("  p\tq     r     t     pVt->q->(r->t)")
def function6(p,q,r,t):
    return Implies(Implies((p or t),q),(Implies(r,t)))
input6 = product([True,False],repeat = 4)
for i in input6:
    print(i,function6(*i))

print("\n")
print("  p\tq     r     t    pV(qAr))<->(((pVq)A(pVr))A(tV~t))")
def function7(p,q,r,t):
    return Double_Implies((p or (q and r)),((p or q) and (p or r)) and (t or (not t)))
input7 = product([True,False],repeat = 4)
for i in input7:
    print(i,function7(*i))
    
    
