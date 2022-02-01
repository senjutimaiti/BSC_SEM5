d1 = {1: "abc"}
d2 = {2: "def"}
d3 = {3: "ghi"}

d = {}
d.update(d1)
d.update(d2)
d.update(d3)

print(d)
