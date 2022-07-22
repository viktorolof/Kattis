def check_brackets(string):
    num_of_unmatched = 0
    stack = []
    for i in string:
        if i == '(':
            stack.append(i)
        elif (len(stack) > 0):
            stack.pop()
        else:
            # maybe remember position of the unmatched
            num_of_unmatched += 1
    if len(stack) > 0:
        return str(len(stack)) + " omatchad ("
    elif num_of_unmatched > 0:
        return str(num_of_unmatched) + " omatchad )"  
    return "PERFEKT"
    
            


def main():
    print(check_brackets("((((()(((("))

if __name__ == "__main__":
    main()