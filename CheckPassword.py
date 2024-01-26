print("Please enter your password below:")
# input password from user
password = input()
 
# set up flags for each criteria
# of a valid password
has_valid_length = False
has_lower_case = False
has_upper_case = False
has_digits = False
has_special_characters = False
 
 
# first verify if the length of password is
# higher or equal to 8 and lower or equal to 16
if (len(password) >= 8) and (len(password)<=16):
 
    has_valid_length = True
 
    # iterate through each characters
    # of the password
    for char in password:
 
        # check if there are lowercase alphabets
        if (char.islower()):
                has_lower_case = True                   
 
        # check if there are uppercase alphabets
        if (char.isupper()):
                has_upper_case = True                   
 
        # check if the password has digits
        if (char.isdigit()):
                has_digits = True                       
 
        # check if the password has special characters
        if(char=="@" or char=="$" or char=="_"or char=="#" or char=="^" or char=="&" or char=="*"):
                has_special_characters = True           
 
 
if (has_valid_length==True and has_lower_case ==True and has_upper_case == True and has_digits == True and has_special_characters == True):
    print("Valid Password")
else:
        print("Invalid Password")
