
clear;
clc;
close;
path = ("C:\Users\Arka\Desktop\5th sem\DIP\");
im = double(imread(path+"noisy_fingureprint.tif"));
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

for i=1:256
    hist(i) = hist(i)/(m*n);
end
plot(0:255, hist');
