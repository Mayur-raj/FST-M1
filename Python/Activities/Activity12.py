def calculateSum(number):
  if number:
   
    return number + calculateSum(number-1)
  else:
    return 0
 
res = calculateSum(10)
 
print(res)