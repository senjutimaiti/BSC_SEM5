a=[1,2,3,4,5]
b=[2,3,4,5]

y=list(map(lambda x,y: x+y, a ,b))

print(y)

a=[-1,1,-2,2]

y=list((len(list(filter(lambda x: x<0, a))),len(list(filter(lambda x: x>0, a)))))
#y=list((1,2))
print(y)

a=list((range(2,18)))
print(a)
y = list(filter(lambda x: all(x%i!=0 for i in range(2,x)),a))

print(y)