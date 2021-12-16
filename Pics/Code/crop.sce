//Crop
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'Lena.tif');
[m n]=size(im1);
disp(m);
disp(n);
row1=input('strating row : ');
row2=input('ending row : ');
col1=input('strating column : ');
col2=input('ending column : ');
t=1;
g=1;
for i=row1:row2
    for j=col1:col2
        new_img(t,g)=im1(i,j);
        g=g+1;
    end
    t=t+1;
    g=1;
end
//new_img=im1(row1:row2,col1:col2);
imshow(uint8(new_img));

