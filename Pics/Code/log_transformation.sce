clear;
clc;
close;
path = ("C:\Users\Arka\Desktop\5th sem\DIP\ch3\");
im = double(rgb2gray(imread(path+"no_log.jpg")));
disp(imfinfo(path+"geeks.jpg"));
[m n] = size(im);
//c = 255/(log(1 + max(im)));
c=25;
for i=1:m
    for j=1:n
        new_im(i, j) = c*log(1+im(i,j));
    end
end

fig = [uint8(im) uint8(new_im)];
imshow(fig);

