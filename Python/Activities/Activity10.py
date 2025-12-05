
#tuple_num = (17, 20, 35, 65, 11)
 
tuple_num = input("Please enter comma separated values: ").split(", ")

print("Given numbers are:", tuple_num)

print("Numbers divisible by 5 are:")
for num in tuple_num:
    if int(num) % 5 == 0:
        print(num)