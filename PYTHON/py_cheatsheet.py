"""This is about to become my ultimate python cheat sheet """

# To display sth. in the console
print ("Hello World")

# to get input over the system standart input and store it in a variable
user_input = input("Please give me some input: ")

# define a Value and store it in a variable
y = 56
x = 65

# to display the stuff within a string we use a Formatstring or f-string
print (f"The value of x is {x} and the value of y is {y}! and ur input was: {user_input}")

# A function that does nothing
def nothing():
    pass

# a function that does return x
def ret_x():
    x = 5
    return x

# a function that gets 2 parameters and returns the product of the two
def prod_x(a, b):
    return a*b

# the same function as a lambda function whith no name
z = lambda a,b: a*b

# a normal if statement with an elif and an else:
if x > y:
    print("Stuff")
elif x == y:
    print("Different Stuff")
else:
    print("All the rest Stuff")

# and the same statement in short hand
print("Stuff") if x  >y else print("Different Stuff") if x ==y else print("all the rest Stuff")

# Here a single statement in short hand
if x > y: print("Yes a is bigger")

# recursion, iteration over range() and over the elements of a list 

# recursive solution for the nth fibunacci number (because it calls itself to find the solution) 
def fib(n):
    """This function takes a natural number n as input and returns the Nth fibunacci number """
    if n == 1:
        return 1
    elif n == 2:
        return 1
    else:
        return fib(n-1) + fib(n-2)

# Objects
class Bagger:
    pass

# Objects with fields aka Variables of Objects
class Bagger:
    name = "Bagger_Name"
    color = "yellow"

#to access an objets fields you have to type the Object first and the field after a point
cat = Bagger()
print(cat.color)


# Objects with funktions 
