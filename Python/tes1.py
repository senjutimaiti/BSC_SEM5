x="1 2"
y=tuple(x.split(" "))
print(y)

x=['3', '2', '1', '4', '5']
y=['A', 'B', 'C', 'D']
#list_result = list(zipped)
tuple_result = [(a,b) for a,b in sorted(zip(x, y))]
#print(list_result)
print(tuple_result)

iterable="hello"
print(type(enumerate(iterable, start=0)))
y=list(enumerate(iterable, start=0))
print(y)

def func(x,items=[]):
    items.append(x)
    print(items)
func(6)
func(7)

def func(x, items=None):
    if items is None:
        items = []
    items.append(x)
    return(items)

list=func(7)
list=func(9,list)
print(list)
