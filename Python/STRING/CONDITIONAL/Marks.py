# Grade students based on marks
"""

marks >= 90, grade = "A"
90 > marks >= 80, grade = "B"
80 > marks >= 70, grade = "c"
70 > marks, grade = "D"

                         """


marks = int(input("Enter the marks : "))


if(marks >= 90):
    Grade = "A"
elif(marks >= 80 and marks < 90):
    Grade = "B"
elif(marks >= 70 and marks < 80):
    Grade = "C"
else:
    Grade = "D"

print("Grade of the student -> ", Grade )                