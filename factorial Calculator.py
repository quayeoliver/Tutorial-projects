def factorial(number):
    unit = 1
    product = []
    for i in range(number):
        unit = unit * (i + 1)
        product.append(unit)

    ans = product[-1]
    print(ans)


factorial(8)