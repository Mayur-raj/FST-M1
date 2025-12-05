num = input("Please Enter comma seprated values: ").split(", ")
 
sum = 0
for number in num:
  sum += int(number)
 
print(sum)