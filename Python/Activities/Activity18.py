import pandas as pd

df = pd.read_csv("activity17.csv")


print("Usernames column:")
print(df["Usernames"])


print("\nSecond row username and password:")
print("Username:", df.loc[1, "Usernames"])
print("Password:", df.loc[1, "Passwords"])


print("\nUsernames sorted ascending:")
print(df.sort_values("Usernames"))


print("\nPasswords sorted descending:")
print(df.sort_values("Passwords", ascending=False))
