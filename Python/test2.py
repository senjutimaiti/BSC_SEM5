dictonary = dict()
n=int(input("Enter the range"))
for i in range(n):
    key = input("Enter key") 
    value = input("Enter value") 
    dictonary[key] = value

tempList = []
uniqueDict = dict()
for key, val in dictonary.items():
    if val not in tempList:
        tempList.append(val)
        uniqueDict[key] = val

print(uniqueDict)
