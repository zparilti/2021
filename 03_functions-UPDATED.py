# functions

"""
# no argument taken no return given
def fn():
    pass

fn()
print(fn())

# take argument no return
def pn(name, lastname):
    pass

pn("John", "Adams")
print(pn("John", "Adams"))


# no argument but return
def gn():
    return 5 > 6

#return 6 == 5
#SyntaxError: 'return' outside function

gn()
print(gn())


# take argument and return something

def tn(name, lastname):
    return "Hi", name, lastname

tn("John", "Adams")
print(tn("John", "Adams"))

sample_greeting = tn("John", "Adams") # the return assigned to variable 

"""
"""
# calculate area&circumference of circle
# define value of pi
pi = 3.14159
# import math; math.pi
# from math import pi
# area calculation
def calculate_circle_area(radius):
    # pi multiplied by r squared
    return pi*radius**2 # pi*pow(radius,2)

radius = int(input("Enter the radius "))
area = calculate_circle_area(radius)
print("area of the circle: ",area)

# circumference calculation

def calculate_circle_circumference(radius):
    # 2 multiplied by r and pi
    return 2*pi*radius 

circumference = calculate_circle_circumference(radius)
print("circumference of the circle: ",circumference)
"""

# Summarize
def my_function():
    pi = float(input("Enter pi value "))
    radius = int(input("Enter radius "))
    #print("Area: ", pi*radius**2, "\n", "Circumference: ", 2*pi*radius)
    return "Area: ", pi*radius**2, "\n", "Circumference: ", 2*pi*radius






"""
def demo(x):
    y = x + 3
    return y
    
demo(5)
print(demo(7))
"""
"""
a = 3
b = 2
c = 1

def demo2():
    y = (a+b+c)

demo2()

"""












"""

age = input("Enter your age please")

# ask age 

def printCategory(age):
    if age < 18:
        print('Child')
    elif age < 65:   
        print('Adult')
    else:
        print('Senior Citizen')


while True:
    printCategory("You are ",age, " old")
"""






"""

#cover exceptions in python

def printCategory(age):
    if age < 18:
        print('Child')
    elif age < 65:   
        print('Adult')
    else:
        print('Senior Citizen')

printCategory(70)


def printCategory(age):
    if age > 18:
        print('Adult')
    elif age > 65:
        print('Senior Citizen')
    else:
        print('Child')

"""
