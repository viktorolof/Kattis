x = int(input())
res = 0
for i in range(x -1, -1, -1):
    c = input()
    if(c == 'O'):
        res += pow(2, i)
print(res)