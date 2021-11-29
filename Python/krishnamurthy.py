l=int(input("Enter lower limit: "))
u=int(input("Enter upper limit: "))
if(l>u):
    print("Wrong input range")
else:
    print("Krishnamurthy numbers: ")
    while(l<=u):
        num=l
        sum=0
        while num>0:
            r=num%10
            f=1
            while r>0:
                f*=r
                r-=1
            sum+=f
            num//=10
        if sum==l:
            print(l," ")
        l+=1
        
