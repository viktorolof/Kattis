x = int(input())
if(x < 100):
    print(99)
else:
    x += 1.1
    x = round(x, -2) -1 #round to the nearest 100, take minus one
    print(int(x))
        