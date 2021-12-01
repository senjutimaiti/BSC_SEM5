
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im = double(imread(path+"Lena.tif"));
[m n] = size(im);
hist(1:256) = 0;
for i=1:m
    for j=1:n
        hist(im(i,j)+1)=hist(im(i,j)+1)+1;
    end
end

for i=1:256
    hist(i) = hist(i)/(m*n);
end
plot(0:255, hist');
