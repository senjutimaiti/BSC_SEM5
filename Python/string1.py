string = input("Enter the string: ")
step = int(input("Enter a step length: "))
i=0
while i<len(string):
    print(string[i], end="")
    i += step
    
print("")
i=len(string)-1

while i>=0:
    print(string[i], end="")
    i -= step


