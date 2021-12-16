d1 = {"a": 45, "b": 23, "c": 90}
d2 = {"a": 34, "b": 34}

d = {}

for i in d1:
    d.update({i: d1[i]})

for i in d2:
    if not i in d.keys():
        d.update({i: d2[i]})
    else:
        d[i] += d2[i]

print(d)
