from functools import total_ordering
import sys
from xml.etree.ElementTree import tostring

def main():
    testcases = int(input())
    for i in range(testcases):
        total_score = 0
        percentage = 0
        string = input()
        arr = [int(c) for c in string.split()]
        for i in range(1, arr[0] + 1):
            total_score += arr[i]
        avg_score = total_score / arr[0]
        for i in range(1, arr[0] + 1):
            if arr[i] > avg_score:
                percentage += 1
        result = format(percentage / arr[0] * 100, ".3f")
        print(str(result) + "%")
 

if __name__ == "__main__":
    main()