//Merging
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'Lena.tif');
imk2=imread(path+'Liza.tif');
im2 = imresize(imk2, [512 512]);
//imk1=imfinfo(path+'Lena.tif');
//imk2=imfinfo(path+'Liza.tif');

[m k]=size(im2);
disp(m);
disp(k);
n=k/2;
for i=1:m
    for j=1:n
        imc(i,j)=im1(i,j);
    end
    for l=n+1:k
        imc(i,l)=im2(i,l);
    end
end

op1=[im1 im2 imc];
//imshow(im);
imshow(op1);
