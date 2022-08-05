# TODO failar på denna, varfööör? )))(((())(

# Om det är flera grupper av closing i ett sånt här fall: )()(  failar det alltid då??



def check_brackets(string):
    unmatched_opening = [0] #0 is opening 1 is closing
    unmatched_closing = [1]
    num_of_unmatched = 0

    index = 0
    for i in string:
        if i == '(':
            unmatched_opening.append(index)
        elif (len(unmatched_opening) > 1):
            unmatched_opening.pop()
        else:
            # maybe remember position of the unmatched
            unmatched_closing.append(index)
        index += 1

    if len(unmatched_opening) > 1 and len(unmatched_closing) == 1:
        return unmatched_opening
    elif len(unmatched_closing) > 1 and len(unmatched_opening) == 1:
        return unmatched_closing
    elif len(unmatched_closing) > 1 and len(unmatched_opening) > 1:
        print(unmatched_opening)
        print(unmatched_closing)
        if(len(unmatched_closing) != len(unmatched_opening)):
            print("impossible")
        else:
            check_edgecase(unmatched_opening, unmatched_closing, string)
        return 0
    else:
        return 1
    
def check_groups(arr):
    groups = []
    groups.append(0)
    group_index = 0
    for i in range(1, len(arr)):
        groups[group_index] += 1
        if(i != len(arr) -1):
            if(arr[i] - arr[i + 1] != -1):
                group_index += 1
                groups.append(0)

    if arr[0] == 0:
        # Check that the last group is bigger than or equal to all the other groups combined
        sum_of_open_groups = 0
        for i in range(0, group_index):
            sum_of_open_groups += groups[i]
        
        if(groups[group_index] >= sum_of_open_groups):
            print("possible")
            return 1
            
    else:
        # Check that the first group is bigger than or equal to all the other groups combined
        sum_of_closed_groups = 0
        for i in range(1, len(groups)):
            sum_of_closed_groups += groups[i]
        
        if(groups[0] >= sum_of_closed_groups):
            print("possible")
            return 1

    return 0
        

def check_edgecase(opening, closing, string):
    # djupet på den giltiga strängen emellan får inte övergå antalet omatchade ) som föregår den
    # börja från indexet som finns på position 1 i closingoch räkna till det sista indexet i opening
    
    stack = []
    depth = 0
    max_depth = 0
    for i in range(closing[1], opening[len(opening) - 1]):
        if(string[i] == "(" and i not in opening):
            stack.append("(")
            depth += 1
        elif(len(stack) > 0):
            stack.pop
            if(depth > max_depth):
                max_depth = depth
            depth -= 1

    if(max_depth <= len(closing) -1):
        print("possible")
    else:
        print("impossible")
            
    return 0

def main():
    str1 = input()
    if len(str1) % 2 == 1:
        # uneven amount of brackets, impossible
        print("impossible")
        return

    res = check_brackets(str1)
    if(res == 1):
        print("possible")
    elif(res == 0):
        return
    else:
        if(check_groups(res) == 0):
            print("impossible")
        



if __name__ == "__main__":
    main()