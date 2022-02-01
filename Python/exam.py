str="Hello World! This is Python This is Python This is Python"
s1=input("Enter String to be found: ")
s2=input("Enter String to be replaced: ")

if s1 in str.split():
    str=str.replace(s1,s2)
    print(str)
else:
    print("String not found")


