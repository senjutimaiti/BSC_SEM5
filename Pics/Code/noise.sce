//noise
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im=imread(path+'Lena.tif');
i=imnoise(im,'salt and pepper',0.1);
op=[im i]
imshow(op);
