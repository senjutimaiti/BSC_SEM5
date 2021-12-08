//rotation
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'Lena.tif');

[m n]=size(im1);
imcl=imresize(im1,[n m]);
imacl=imresize(im1,[n m]);
imc=im1;
for i=1:m
    for j=1:n
        imcl(i,j)=im1(n+1-j,i);
        imacl(i,j)=im1(j,n+1-i);
        imc(i,j)=im1(n+1-i,n+1-j);
    end
end

op1=[im1 imcl imc imacl];
//imshow(im);
imshow(op1);
