a=int(input("Enter first number: "))
b=int(input("Enter second number: "))
if a>b:
    i=b
else:
    i=a
while i>=1:
    if a%i==0 and b%i==0:
        break
    i-=1
print("The GCD: ",i)
    
    
