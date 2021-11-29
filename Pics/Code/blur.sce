//BLURRING
clear;
clc;
close;
path = ('D:\Sem 5\Pics\');
im=double(imread(path+"Lena.tif"));
[m n]=size(im);
imt=im;
for i=2:m-1
   for j=2:n-1
       s=im(i-1,j-1)+im(i-1,j)+im(i-1,j+1)+im(i,j-1)+im(i,j)+im(i,j+1)+im(i+1,j-1)+im(i+1,j)+im(i+1,j+1);
       s=s/9;
       imt(i,j)=s;
   end
end
op=[im imt]
//disp(im);
//disp(imt);
imshow(uint8(op));
