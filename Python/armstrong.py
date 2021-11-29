l=int(input("Enter lower limit: "))
u=int(input("Enter upper limit: "))
if(l>u):
    print("Wrong input range")
else:
    print("Armstrong numbers: ")
    while(l<=u):
        num=l
        sum=0
        while num>0:
            r=num%10
            sum+=r**3
            num//=10
        if sum==l:
            print(l," ")
        l+=1
        
