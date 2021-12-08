//Histogram equalization
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im=imread(path+'pollen1.tif');
[histo, cells]=imhist(im);
//disp(hist);
//disp(cells);
[m n]=size(im);
hist = histo/(m*n);

for i=2:256
    hist(i)=hist(i)+hist(i-1);
end
im = uint8(im);
hist = hist*255;
for i=1:m
    for j=1:n
        nim(i,j)=round(hist(im(i,j)+1));
    end
end
//[histi, cells2]=imhist(uint8(nim));
fig = [uint8(im) uint8(nim)];
imshow(fig);

subplot(1,2,1);imhist(uint8(im), 255, 0);
//plot(0:255, histo);

subplot(1,2,2);imhist(uint8(nim), 255, 0);
//plot(0:255, histi);



