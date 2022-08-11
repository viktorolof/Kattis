def main():
    inp = input()
    arr = [int(c) for c in inp.split()]
    arr.sort()
    abc_string = input()
    res = ""
    for i in range(3):
        if(abc_string[i] == "A"):
            res += str(arr[0])
        elif(abc_string[i] == "B"):
            res += str(arr[1])
        elif(abc_string[i] == "C"):
            res += str(arr[2])
        res += " "
    print(res)
    
if __name__ == "__main__":
    main()