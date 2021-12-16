d = {1: "abc", 2: "abc", 3: "def", 4: "def", 5: "ghi"}

ans = {}
for i in d:
    if not d[i] in ans.values():
        ans.update({i: d[i]})

print(ans)
