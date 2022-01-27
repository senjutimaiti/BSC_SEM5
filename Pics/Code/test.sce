//Crop
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'Lena.tif');
[m n]=size(im1);
disp(m);
disp(n);
row1=input('strating row : ');
row2=input('ending row : ');
col1=input('strating column : ');
col2=input('ending column : ');
rect=[row1, col1, row2-row1, col2-col1]
new_img=imcrop(im1, rect);
//new_img=im1(row1:row2,col1:col2);
imshow(uint8(new_img));

