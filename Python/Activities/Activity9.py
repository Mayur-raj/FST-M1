
firstList = [1, 4, 7, 2, 8]
secondList = [3, 5, 7, 9, 1]


print("First List ", firstList)
print("Second List ", secondList)


thirdList = []


for num in firstList:
    if (num % 2 != 0):
        thirdList.append(num)
        
for num in secondList:
    if (num % 2 == 0):
        thirdList.append(num)


print("Result List is:")
print(thirdList)