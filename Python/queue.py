queue = []

while(True):
    print("Enter your choice")
    ch = int(input("1.  Enqueue\n2.  Dequeue\n3.  Display\n4.  Exit\n"))
    if(ch==1):
        ele = int(input("Enter element "))
        queue.append(ele)
    elif(ch==2):
        if(len(queue)==0):
            print("The queue is empty")
        else:
            ele = queue.pop(0)
            print(ele, " is dequeued\n")
    elif(ch==3):
        print("current state of the queue")
        print(queue)
    else:
        break
