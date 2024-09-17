# WAP to find the greatest of 3 numbers entered by the user.

a = int(input("Enter first no : "))
b = int(input("Enter second no : "))
c = int(input("Enter third no : "))

if(a >= b and a >= c):
    print("First no is largest", a)
elif(b >= c):
    print("Second no is largest", b)
else:
    print("Third no is largest", c)        
