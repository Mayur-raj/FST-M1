import pandas as pd

df = pd.read_excel("activity19_user_Details.xlsx")


print("Number of rows and columns:")
print(df.shape)   # (rows, columns)


print("\nEmails column:")
print(df["Email"])


print("\nData sorted by FirstName (ascending):")
print(df.sort_values("FirstName"))
