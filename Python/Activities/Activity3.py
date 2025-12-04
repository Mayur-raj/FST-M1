
Player1 = input("First Player's name? ")
Player2 = input("Second  Player's name? ")
 

Player1_answer = input(Player1 + ", choose rock, paper or scissors? ").lower()
Player2_answer = input(Player2 + ", rock, paper or scissors? ").lower()
 

if Player1_answer == Player2_answer:
    print("Ohhh..It's a tie!")
elif Player1_answer == 'rock':
    if Player2_answer == 'scissors':
        print("Yeh...Rock wins...!")
    else:
        print("Yeh...Paper wins...!")
elif Player1_answer == 'scissors':
    if Player2_answer == 'paper':
        print("Yeh...Scissors win...!")
    else:
        print("Yeh..Rock wins...!")
elif Player1_answer == 'paper':
    if Player2_answer == 'rock':
        print("Yeh...Paper wins...!")
    else:
        print("Yeh..Scissors win....!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")