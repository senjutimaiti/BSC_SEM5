def push(x,list1=None):
    if list1==None:
        list1=[]
    list1.append(x)
    return list1

def pop(list1):
    if len(list1)== 0:
        print("NOPE")
    else:
        x=list1.pop()
        return x

list1=[1,2,3,4]
list1=push(5,list1)
list1=push(6,list1)
print(list1)
d=pop(list1)
print(d)


