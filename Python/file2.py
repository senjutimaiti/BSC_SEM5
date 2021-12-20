myfile=open('D:\Sem 5\Python\myfile.txt','r')

line=myfile.readline()

parts=line.split(' ')

num= [int(p) for p in parts]

print(num)

line=myfile.readline()

print(line)

line=myfile.readline()

parts=line.split('$')

eval(parts[0])

num= [eval(p) for p in parts]

print(num)


