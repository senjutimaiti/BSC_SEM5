clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im = double(rgb2gray(imread(path+'re1.png')));
disp(imfinfo(path+"re1.png"));
[m n] = size(im);
c = 255/(log(1 + max(im)));

for i=1:m
    for j=1:n
        new_im(i, j) = c*log(1+im(i,j));
    end
end

fig = [uint8(im) uint8(new_im)];
imshow(fig);

