fruit_shop = {
    "Apple": 35,
    "Kiwi": 20,
    "Papaya": 12,
    "Banana": 15,
    "Santra":30
}
 
check_fruit = input("What do you want? ")
 
if(check_fruit in fruit_shop):
    print("Yes, Available")
else:
    print("No, Not Available...Sorry")