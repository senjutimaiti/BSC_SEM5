class Student:
    #private member
    __name=None
    #protected member
    _roll=None
    #public member
    branch=None

    #constructor
    def __init__(self,name,roll,branch):
        self.__name=name
        self._roll=roll
        self.branch=branch

    #private member function
    def __displayfrompriv(self):
        #accessing private data member
        print("Name priv: ",self.__name)
        #accessing protected data member
        print("Roll priv: ",self._roll)
        #accessing public data member
        print("Branch priv: ",self.branch)

    #protected member function
    def _displayfrompro(self):
        #accessing private data member
        print("Name pro: ",self.__name)
        #accessing protected data member
        print("Roll pro: ",self._roll)
        #accessing public data member
        print("Branch pro: ",self.branch)

    #public member function
    def displayfrompub(self):
        #accessing private data member
        print("Name pub: ",self.__name)
        #accessing protected data member
        print("Roll pub: ",self._roll)
        #accessing public data member
        print("Branch pub: ",self.branch)
        #accessing private member function
        self.__displayfrompriv()

#creating object
obj=Student("ABC",101,"InfoTech")
#accessing protected member function
obj._displayfrompro()
#accessing public member function
obj.displayfrompub()
#accessing private member function
#obj.__displayfrompriv()        

        
        
