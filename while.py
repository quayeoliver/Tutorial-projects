def program_1():
    prices = [10, 20, 30]
    total = 0
    for price in prices:
        total += price
    print(f"Total: {total}")
    list = [10, 20, 30, 40, 50, 60]
    max = list[0]
    for items in list:
        if items > list[0]:
            max = items
    print(max)


program_1()

#multi dimensional lists
def program_2():
    matrix = [
        [2, 3, 4],
        [8, 9, 10],
        [5, 6, 7]
    ]
    print(matrix[1][2])
    numbers = [1, 2, 2, 6, 8 ]
    unique = []
    for figures in numbers:
        if figures not in unique:
            unique.append(figures)
    print(unique)


program_2()

#for loop
def program_3():
    numbers = [7 , 4 , 2 , 3]
    for items in numbers:
        print("x" * items)


program_3()

#dictionaries

def program_4():
    phone = (input("phone: "))
    digits_mapping={
        "1":"one",
        "2":"two",
        "3":"three",
        "4":"four"

    }
    output=""
    for ch in phone:
        output+= digits_mapping.get(ch, "!") + " "
    print(output)


program_4()


# classes
def program_5():
    class Person:
        def __init__(self, name):
            self.name=name
        def talk(self):
         print(f"Hi I am  {self.name}")

    oliver = Person(input("name: "))
    print(oliver.name)
    oliver.talk()


program_5()


#calculates the factorial of a number
def program_Factorial():
    number=int(input("Enter a non-negative number: ")).8
    factorial=1
    for i in range(number):
        factorial=(i+1)* factorial
        print(factorial)


program_Factorial()
