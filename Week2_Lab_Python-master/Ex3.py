from itertools import product
def implies(a,b):
    if a:
        return b
    else:
        return True
    
#Take1#
print('1/')
table=list(product([False,True],repeat=4)) #create table for p q r
#pIq=[implies(a[0],a[1]) for a in table]#calculating p-->q 
p=[a[0] for a in table]
q=[a[1] for a in table]
s=[a[2] for a in table]
r=[a[3] for a in table]
Valid=True
for i in range(len(p)):
    if(implies(p[i],r[i])==implies(not p[i],q[i])==implies(q[i],s[i])==True and implies(not r[i],s[i])==False):
        Valid=False
        break
print("p->r\n~q->q\nq->s\n∴~r->s")
if(Valid):
    print('Valid')
else:
    print('Invalid')
    
#Take2#
print('\n')
print('2/')
table=list(product([False,True],repeat=5))
p=[a[0] for a in table]
q=[a[1] for a in table]
s=[a[2] for a in table]
r=[a[3] for a in table]
t=[a[4] for a in table]
pIqIr=[implies(a[0],implies(a[1],a[3])) for a in table]
pVs=[a[0] or a[2] for a in table]
tiq=[implies(a[4],a[1])for a in table]
nots=[not a[2] for a in table]
notrinott=[implies(not a[3],not a[4]) for a in table]
flag = True
for i in range(len(q)):
    if(pIqIr[i]==pVs==tiq==nots==True and notrinott==False):
        flag=False
        break
print("p->(q->r)\npVs\nt->q\n~s\n∴~r->~t")
if(flag):
    print('Valid')
else:
    print('Invalid')

#Take3#
print('\n')
print('3/')
table=list(product([False,True],repeat=4))
p=[a[0] for a in table]
q=[a[1] for a in table]
s=[a[2] for a in table]
r=[a[3] for a in table]
piq=[implies(a[0],a[1]) for a in table]
notrors=[(not a[3] or a[2])for a in table]
porr=[a[0] or a[3] for a in table]
notqis=[implies(not a[1],a[2])for a in table]
flag=True
for i in range(len(p)):
    if(piq[i]==notrors[i]==porr[i]==True and notqis[i]==False):
        flag=False
        break
print("p->q\n~rVs\npVr\n∴~q->s")
if(flag):
    print('Valid')
else:
    print('Invalid')

#FinalTake#
print('\n')
print('4/')
table=list(product([False,True],repeat=4))
p=[a[0] for a in table]
q=[a[1] for a in table]
s=[a[2] for a in table]
r=[a[3] for a in table]
pir=[implies(a[0],a[3])for a in table]
piqvnotr=[implies(a[0],(a[1] or not a[3]))for a in table]
notqornots=[not a[1] or not a[2]for a in table]
flag=True
for i in range(len(p)):
    if(p[i]==pir[i]==piqvnotr[i]==notqornots[i]==True and s[i]==False):
        flag=False
        break
print("p\np->r\np->(qV~r)\n~qV~s\n∴s")
if(flag):
    print('Valid')
else:
    print('Invalid')
    
