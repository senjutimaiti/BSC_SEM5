//Merging
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
imk1=imread(path+'Lena.tif');
imk2=imread(path+'Liza.tif');
im2 = imresize(imk2, [256 256]);
im1 = imresize(imk1, [256 256]);
//imk1=imfinfo(path+'Lena.tif');
//imk2=imfinfo(path+'Liza.tif');

for i=1:256
    for k=1:128
        j(i,k)=im1(i,k);
    end
    for l=129:256
        j(i,l)=im2(i,l);
    end
end

op1=[im1 im2 j];
//imshow(im);
imshow(op1);
