//Read an RGB image and seperate the colour image into red, green and blue planes
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
RGB=imread(path+'re1.png');

C=RGB;
M=RGB;
Y=RGB;
R=RGB;
G=RGB;
B=RGB;

C(:,:,1)=0;
M(:,:,2)=0;
Y(:,:,3)=0;

R(:,:,2:3)=0;
//R(:,:,3)=0;

G(:,:,1)=0;
G(:,:,3)=0;

B(:,:,1:2)=0;
//B(:,:,2)=0;

OP=[RGB C M Y R G B]
imshow(OP);
