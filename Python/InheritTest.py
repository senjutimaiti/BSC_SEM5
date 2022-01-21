class Animal:
    def __init__(self,name):
        self.name=name

    def _display(self):
        print(self.name," Animal")

class Dog(Animal):
    def __init__(self,name):
        super().__init__('name')
        

    def _display(self):
        super()._display()
        print("Dog barks")

d=Dog("Dog")
d._display()


