a=[1 2 3 4; 5 6 7 8]
disp(a)
[m n]=size(a)
for i=1:m
    for j=1:n
        b(i,j)=a(j,i)
    end
end
disp(b)
