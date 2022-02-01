# with open("d:\Sem 5\Python\myfile.txt", 'r') as myfile:
#     max=""
#     for word in myfile.read().split():
#         if len(word)>len(max):
#             max=word

#     print(max)
    
with open("d:\Sem 5\Python\myfile.txt", 'r') as myfile:
    str=""
    for line in myfile.readlines():
        #print(line)
        for word in line.split():
            #print(word)
            if word == "hello":
                str += "Python "
            else:
                str += word+" "
        str+="\n"


with open("d:\Sem 5\Python\myfile.txt", 'w') as myfile:
    myfile.write(str)
        