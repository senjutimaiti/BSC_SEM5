clear;
clc;
close;
path = ("C:\Users\Arka\Desktop\5th sem\DIP\ch3\");
im = im2double(imread(path+"fractured_spine.tif"));

[m n] = size(im);
c=1;
for i=1:m
    for j=1:n
        new_im(i, j) = c*(im(i, j)^0.6);
    end
end

for i=0:255
    p(i+1) = c*(i**25);
end
plot(0:255, p');
fig = [im2uint8(im) im2uint8(new_im)];
imshow(fig);

