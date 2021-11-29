stack = []

while(True):
    print("Enter your choice")
    ch = int(input("1.  Push\n2.  Pop\n3.  Display\n4.  Exit\n"))
    if(ch==1):
        ele = int(input("Enter element "))
        stack.append(ele)
    elif(ch==2):
        if(len(stack)==0):
            print("The stack is empty")
        else:
            ele = stack.pop()
            print(ele, " is poped\n")
    elif(ch==3):
        print("current state of the stack")
        print(stack)
    else:
        break
