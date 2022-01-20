def pattern(n):
    k = 2*n - 2
    for i in range(0, n):
     
        # inner loop to handle number spaces
        for j in range(0, k):
            print(end=" ")
     
        k = k - 2
     
        # inner loop to handle number of columns
        for j in range(i, -1,-1):
            if j % 2 == 0:
                # printing 1s
                print("1 ", end="")
            else:
                # printing 0s
                print("0 ", end="")
     
        # ending line after each row
        print("\r")
 
# Driver Code
n = int(input("Enter no. of lines "))
pattern(n)
