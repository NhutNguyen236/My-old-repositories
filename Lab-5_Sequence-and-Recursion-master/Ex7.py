def hnt(n,start,goal,middle):
    if n==1:
        start[1]-=1
        goal[1]+=1
        print(start,goal,middle)
        return
    hnt(n-1,start,goal,middle)
    start[1]-=1
    goal[1]+=1
    print(start,goal,middle)
    hnt(n-1,middle,goal,start)
hnt(4,['start',4],['goal',0],['middle',0])
    
