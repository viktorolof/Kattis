def no_dupes(string):
    for i in range(len(string) - 1):
        for j in range(1, len(string)):
            if(string[i] == string[j] and i != j):
                return False
    return True

x = int(input())
names = []
index = 0
shortest = 21
for i in range(x):
    str = input()
    if(len(str) > 4 and no_dupes(str)):
        names.append(str)
        if len(str) < shortest:
            shortest = len(str)
if len(names) == 0:
    print('neibb!')
else:
    result = []
    for name in names:
        if(len(name) == shortest):
            result.append(name)
    result.sort(reverse=True)
    print(result[0])

