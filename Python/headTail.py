import random
h,t=0,0
i=1
while i<=100:
    value=random.randrange (0,2)
    if value==0:
        h+=1
    else:
        t+=1
    i+=1    
print("Total no. of Head :", h)
print("Total no. of Tail :", t)
