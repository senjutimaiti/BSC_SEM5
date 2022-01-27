
list1=list(range(1,5))
list2=list(range(3,6))
list4=["wow", "momo", "mom", (1,2,3), "momo"]
c="momo"
list5=[]
d="maggie"
for i in list4:
    if i == c:
        list5.append(d)
    else:
        list5.append(i)
print(list5)    

list3=list(filter(lambda x: x==x[::-1],list4))
print(list3)

a=int("111",2)
b=int("011",2)
c=a+b
print(bin(c))

s="hello bolo world python"
k=s.replace("bolo","yoohoo")
print(k)
