//Threshold Operation
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im=imread(path+'re1.png');

//cmap=jetcolormap(256);
//imrgb=ind2rgb(im, cmap);
img=rgb2gray(im);

//imshow(im);
[m n]=size(im);
disp(m);
disp(n);

th=input("Enter the threshold parameter: ");
for i=1:m
    for j=1:n
        if(im(i,j) < th)
            imt(i,j)=0;
        else
            imt(i,j)=255;
        end
    end
end

//imshow(im);
imshow(imt);
