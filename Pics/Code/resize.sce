//Resizing
clear;
clc;
close;
path=('D:\Sem 5\Pics\');
im1=imread(path+'Lena.tif');
a=imresize(im1, [200 200]);
b=imresize(im1, [200 400]);
// Resize 200x200 image to 200x400 image
for i=1:200
	for j=1:200
		b(i,2*j)=a(i,j)
		b(i,2*j+1)=a(i,j)
	end
end
 Resize 200x200 image to 400x200 image
for i=1:200
	for j=1:200
		b(2*i,j)=a(i,j)
		b(2*i+1,j)=a(i,j)
	end
end
//imshow(b);
// Resize 200x200 image to 400x400 image
for i=1:200
	for j=1:200
		b(2*i,2*j)=a(i,j)
		b(2*i+1,2*j)=a(i,j)
        b(2*i,2*j+1)=a(i,j)
        b(2*i+1,2*j+1)=a(i,j)
	end
end
imshow(b);

