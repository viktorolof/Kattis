x = int(input())
animals = [] #[highest -> lowest]
lowest_o = -1
for i in range(x):
    str = input()
    animals.append(str)
    if(str == 'o'):
        lowest = i

iterations = 0
ocelots = True
if(lowest_o == -1):
    print(0)
else:
    while(ocelots):
        # kolla lowest ocelot, flippa till zebra, alla zebror under den, gör till ocelot, sätt nya lowest
        
        iterations += 1
