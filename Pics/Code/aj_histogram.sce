clear;
clc;
close;
path = ('D:\Sem 5\Pics\');
im = double(imread(path+"Liza.tif"));
//im = imread("D:\Sem 5\Pics\Liza.tif");
[m n] = size(im);
hist = [];
for i=1:256 
    hist(i) = 0;
end

for i=1:m
    for j=1:n
        hist(im(i,j)+1)=hist(im(i,j)+1)+1;
    end
end

plot(0:255, hist);
