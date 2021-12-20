x,y,z=1,2,3

myfile= open('D:\Sem 5\Python\myfile.txt', 'w')

myfile.write('%s %s %s'%(x,y,z))

s="\nhello\n"
myfile.write(s)

D= {'a': 1, 'b': 2}

L=[1,2,3]

myfile.write(str(L) + '$'+ str(D) + '\n')

myfile.close()
open('D:\Sem 5\Python\myfile.txt','r').read()


