string = input("Enter a string\n")

f_ch = string[0]
new_str = ""+f_ch
i=0
for ch in string:
    if i!=0:
        if ch==f_ch:
            new_str += '$'
        else:
            new_str += ch
    i+=1
print(new_str)
        
