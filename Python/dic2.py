a=int(input("Enter upper limit: "))

d={}
for i in range(a):
    d.update({i: i*i})

print(d)
