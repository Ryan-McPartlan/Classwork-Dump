check = "yes"
mathWords = ["sum","difference","product","quotient"]
while check == "yes":
    num1 = eval(input("Enter first number: "))
    num2 = eval(input("Enter second number: "))
    print ("What action would you like to perform?")
    print ("Input 1 to add, 2 to subtract, 3 to multiply, and 4 to divide.")
    choice = eval(input("Enter your choice: ")) 
    mathAns = [num1+num2, num1-num2, num1*num2, num1/num2]
    if choice not in range (1,5):
        print("Invalid choice!")
    else:
        print ("The %s is %d" %(mathWords[choice-1],mathAns[choice-1]))
    check = input("Would you like to try again? yes/no ")
    while check != "yes" and check != "no":
        check = input("Please say 'yes' or 'no'! ")
    
