
#numList = [70, 60, 50, 40, 30, 20, 10, 70]
#print("And the list is as: ", numList)
numList = input("Please enter the number list: ").split(", ")

firstElement = numList[0]

lastElement = numList[-1]
 

if (firstElement == lastElement):
    print(True)
else:
    print(False)