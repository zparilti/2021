from time import *
to_do_list = []

# Adding tasks

to_do_list.append('Go for a run')
to_do_list.append('Buy groceries')
to_do_list.append('Finish work report')

# Removing tasks
to_do_list.remove('Buy groceries')

# Modifying tasks
to_do_list[0]=('Go for a walk')

# Printing the updated to-do list
print("My To-Do List:")
for task in to_do_list:
    print("- " + task)
