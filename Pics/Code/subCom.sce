//Subtraction
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'rr.png');
im2=imread(path+'rb.png');
imk=imread(path+'rbw.png');

imk2=rgb2gray(imk);
imc=imk2;

im=im1;
//imshow(im);
[m n]=size(im1);
disp(m);
disp(n);

for i=1:m
    for j=1:n
        im(i,j)=abs(im1(i,j)-im2(i,j));
        imc(i,j)=(255-imk2(i,j));
    end
end

op1=[im1 im2 im];
op2=[imk2 imc];
//imshow(im);
imshow(op2);
