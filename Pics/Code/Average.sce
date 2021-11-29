//Average
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'rr.png');
im2=imread(path+'rb.png');
im=im1;

//imshow(im);
[m n]=size(im1);
disp(m);
disp(n);

for i=1:m
    for j=1:n
        im(i,j)=(1/2)*(im1(i,j)+im2(i,j));
    end
end

op=[im1 im2 im]
disp(im1);
disp(im2);
disp(im);
//imshow(im);
imshow(op);
