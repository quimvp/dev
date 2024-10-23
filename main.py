class Dog:

    def __init__(self,name,colour):
        self.name = name
        self.colour = colour

    def bark(times):
        for i in range(times):
            print("Woof")

class Puppy(Dog):

    def __init__(self,name,colour):
        super().__init__(name,colour)
    
dog1 = Dog("Elliot","White")
puppy1 = Puppy("Jake","Black")
print(dog1,puppy1)