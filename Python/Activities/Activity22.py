import pytest

# Additon test
def test_addition():
	
	num1 = 200
	num2 = 300
	sum = num1 + num2
	assert sum == 500

# Subtraction test
def test_subtraction():
    	
	num1 = 300
	num2 = 150
	diff = num1 - num2
	assert diff == 150

# Multiplication test
@pytest.mark.activity
def test_multiplication():

	num1 = 100
	num2 = 5
	prod = num1 * num2
	assert prod == 500

# Division test
@pytest.mark.activity
def test_division():
  
	num1 = 555
	num2 = 5
	quot = num1 / num2
	assert quot == 111