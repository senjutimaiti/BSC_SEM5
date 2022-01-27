//Histogram
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'Lena.tif');
im2=imread(path+'re1.png');
//im=double(im1);
imhist(im1, 255, 0);
//plot(0:255,hist);
//disp(hist);



