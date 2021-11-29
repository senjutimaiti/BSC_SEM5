//Read an RGB image and flip left and right and up and down.
clear;
clc;
close;

path=('D:\Sem 5\Pics\');
RGB=imread(path+'re1.png');
LRRGB=RGB(:,$:-1:1,:);
UDRGB=RGB($:-1:1,:,:);
flip=[RGB LRRGB UDRGB];
imshow(flip);
