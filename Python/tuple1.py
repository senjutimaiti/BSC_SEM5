a = [(),(1,2,3),(),(),('a','b','c')]
a1 = [tuples for tuples in a if tuples]
print(a1)

c=0
a2=[1,2,3,4,(1,2,3)]
for i in a2:
    if type(i)==tuple:
        break
    c+=1
print(c)

l1=[1,2,1,3,4,4,4,5]
l2=[]
for i in l1:
    if i not in l2:
        l2.append(i)
print(l2)

list = ['abc', 'def', 'def', ('abc', 'def'), 5]

str1 = input("\nEnter the string to be found: ")
str2 = input("\nEnter the string to be replaced with: ")

new_list = [str2 if element == str1 else element for element in list]

print("\n",new_list,"\n")