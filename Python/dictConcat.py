d1 = {1: "abc"}
d2 = {2: "def"}
d3 = {3: "ghi"}

d = {}
for i in d1:
    d.update({i: d1[i]})

for i in d2:
    d.update({i: d2[i]})

for i in d3:
    d.update({i: d3[i]})

print(d)
