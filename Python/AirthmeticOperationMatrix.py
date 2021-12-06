def validateInput(matrix):

    #to check if the list is empty
    if(not matrix):
        return False

    column = len(matrix[0])

    #to check if all the rows have the same number of elements
    for i in range(len(matrix)):
        if len(matrix[i]) != column:
            return False

    return True


def addMatrix(matrix1, matrix2):

    if(not(validateInput(matrix1)) or not(validateInput(matrix2))):
        print("\nInvalid input\n")
        return None

    #to check if the two matrices are compatible for addition
    if((len(matrix1) != len(matrix2)) or (len(matrix1[0]) != len(matrix2[0]))):
        print("\nDimensions of the matrices does not match\n")
        return None

    result = []
    tempResult = []

    for i in range(len(matrix1)):
        for j in range(len(matrix1[0])):

            #to check if the elements of the matrix are integers and not nested lists
            if(not(isinstance(matrix1[i][j], int)) or not(isinstance(matrix2[i][j], int))):
                print("\nElements of the matrix should be an integer\n")
                return None

            tempResult.append(matrix1[i][j]+matrix2[i][j])

        result.append(tempResult)
        tempResult = []

    del tempResult

    print("\n")
    for i in range(len(result)):
        print(*result[i], sep = "\t") 



def subtractMatrix(matrix1, matrix2):

    if(not(validateInput(matrix1)) or not(validateInput(matrix2))):
        print("\nInvalid input\n")
        return None

    #to check if the two matrices are compatible for subtraction
    if((len(matrix1) != len(matrix2)) or (len(matrix1[0]) != len(matrix2[0]))):
        print("\nDimensions of the matrices does not match\n")
        return None

    result = []
    tempResult = []

    for i in range(len(matrix1)):
        for j in range(len(matrix1[0])):

            #to check if the elements of the matrix are integers and not nested lists
            if(not(isinstance(matrix1[i][j], int)) or not(isinstance(matrix2[i][j], int))):
                print("\nElements of the matrix should be an integer\n")
                return None

            tempResult.append(matrix1[i][j]-matrix2[i][j])

        result.append(tempResult)
        tempResult = []

    del tempResult

    print("\n")
    for i in range(len(result)):
        print(*result[i], sep = "\t") 



def multiplyMatrix(matrix1, matrix2):

    if(not(validateInput(matrix1)) or not(validateInput(matrix2))):
        print("\nInvalid input\n")
        return None

    if(len(matrix1[0]) != len(matrix2)):
        print("\nDimensions of the matrices does not match\n")
        return None

    result = [] 
    tempResult = []

    for i in range(len(matrix1)):
        for j in range(len(matrix2[0])):

            #to check if the elements of the matrix are integers and not nested lists
            if(not(isinstance(matrix1[i][j], int)) or not(isinstance(matrix2[i][j], int))):
                print("\nElements of the matrix should be an integer\n")
                return None

            sum = 0
            for k in range(len(matrix1[0])):
                sum += matrix1[i][k]* matrix2[k][j]

            tempResult.append(sum)

        result.append(tempResult)
        tempResult = []


    del tempResult   

    print("\n")
    for i in range(len(result)):
        print(*result[i], sep = "\t")    


def transposeMatrix(matrix1):

    if(not(validateInput(matrix1))):
        print("\nInvalid input\n")
        return None

    result = [] 
    tempResult = []

    for i in range(len(matrix1[0])):
        for j in range(len(matrix1)):

            #to check if the elements of the matrix are integers and not nested lists
            if(not(isinstance(matrix1[j][i], int))):
                print("\nElements of the matrix should be an integer\n")
                return None

            tempResult.append(matrix1[j][i])

        result.append(tempResult)
        tempResult = []

    del tempResult

    print("\n")
    for i in range(len(result)):
        print(*result[i], sep = "\t")    


def operation(matrix1, matrix2):

    while(True):

        choice = int(input("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Transpose\n5. Quit\n\nEnter your choice: "))

        if choice == 1:
            addMatrix(matrix1, matrix2)
        elif choice == 2:
            subtractMatrix(matrix1, matrix2)
        elif choice == 3:
            multiplyMatrix(matrix1, matrix2)
        elif choice == 4:
            transposeMatrix(matrix1)
        elif choice == 5:
            return None
        else:
            print("\nWrong choice")



matrix1 = [
    [1, 2, 3],
    [4, 5, 6]
]

matrix2 = [
    [2, 4, 3],
    [8, 10, 4]
]

operation(matrix1, matrix2)
