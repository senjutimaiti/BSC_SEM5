d1={1: "abc"}
d2={2: "def"}

d={}
for i in d1:
    d.update({i: d1[i]})
for i in d2:
    d.update({i: d2[i]})

print(d)
