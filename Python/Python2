usernames = ['sherlock', 'mark', 'charles', 'leo']
passwords = ['holmes', 'twain', 'darwin', 'tolstoy']
attempts = 0
access = "denied"

while access == "denied":
    name = input("Enter your username: ")
    word = input("Enter your password: ")
    attempts += 1
    if name in usernames and word == passwords[usernames.index(name)]:
        print("Access Granted! Welcome back.")
        access = "Granted"
    elif attempts == 3:
        print("Access Denied. Maximum attempts exceeded. Computer locked.")
        break
    else:
        print("Access denied!")
