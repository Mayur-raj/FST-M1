
def calculate_sum(numb):
	add = 0
	for number in numb:
		add += number
	return add
 
numList = [15, 20, 35, 50, 75, 85, 20]
 

result = calculate_sum(numList)
 
print("The Addition of all Numbers is: " + str(result))
