//Bit-Plane-Slicing
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
img=double(imread(path+'Lena.tif'));

b1=bitget(img, 1);
b2=bitget(img, 2);
b3=bitget(img, 3);
b4=bitget(img, 4);
b5=bitget(img, 5);
b6=bitget(img, 6);
b7=bitget(img, 7);
b8=bitget(img, 8);

m1=b1*1;
m2=b2*2;
m3=b3*4;
m4=b4*8;
m5=b5*16;
m6=b6*32;
m7=b7*64;
m8=b8*128;

m=m1+m2+m3+m4+m5+m6+m7+m8;

//b1=b1*255;
//b2=b2*255;
//b3=b3*255;
//b4=b4*255;
//b5=b5*255;
//b6=b6*255;
//b7=b7*255;
//b8=b8*255;

fig = double([b1 b2 b7 b8]);
imshow(fig);

