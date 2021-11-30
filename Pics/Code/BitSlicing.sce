//Bit-Slicing
clear;
clc;
close;

img=[15 9 11 12; 13 11 10 1; 0 12 9 4; 5 15 13 12]
disp(img);
imshow(img);

imb=dec2bin(img);
disp(imb);

for i=1:4
    for j=1:4
        m4=modulo(imb(i,j),1000)
    end
end

