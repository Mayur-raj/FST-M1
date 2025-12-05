def fibonaci(num):
    if num <= 1:
        return num
    else:
        return(fibonaci(num-1) + fibonaci(num-2))
 
nterms = int(input("Pleease Enter a Number: "))
 
if nterms <= 0:
    print("Please Enter Positive Number Only...")
else:
    print("And the Fibonaci Sequence is...: ")
    for i in range(nterms):
        print(fibonaci(i))