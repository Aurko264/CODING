# Using conditional statements.

light = input("Enter the signal : ")

if( light == "red"):
    print("STOP")
elif(light == "green"):
    print("GO")   # INDENTATION [ proper spacing ]
elif(light == "yellow"): # [INDENTATION IS VERY IMPORTANT IN PYTHON]
    print("LOOK") # [UNLIKE JAVA IN PYTHON INDENTATION IS USED INSTEAD OF {} BRACES TO CONNECT BLOCK OF CODE ]
else: 
    print("DON'T YOU KNOW THE TRAFFIC SIGNALS")   

print("End of the code")    