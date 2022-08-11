def main():
    testcases = int(input())
    for i in range(testcases):
        persons = int(input())
        names = [''] * persons
        score_arr = [''] * persons
        longest = 0
        for j in range(persons):
            person = input()
            person_classes = [str(c) for c in person.split('-')]
            name = person_classes[0].split()
            names[j] = name[0]
            person_classes[0] = name[1]
            person_classes[len(person_classes) - 1] = person_classes[len(person_classes) - 1].split()[0]
            if(len(person_classes) > longest):
                longest = len(person_classes)
            # Räkna bakifrån och lägg in score
            first = 0
            for k in reversed(person_classes):
                if(k == 'upper'):
                    score_arr[j] += '3'
                elif(k == 'middle'):
                    score_arr[j] += '2'
                elif(k == 'lower'):
                    score_arr[j] += '1'
                if(first == 0):
                    score_arr[j] += '.'
                    first += 1
            #print('Score is: ' + score_arr[j])

        #fyll på med 2or
        for j in range(persons):
            if(len(score_arr[j]) < longest + 1):
                for k in range(len(score_arr[j]), longest + 1):
                    score_arr[j] += '2'
        
        float_arr = [0.0] * persons
        for j in range(len(score_arr)):
            float_arr[j] = float(score_arr[j])

        res = [x for _,x in sorted(zip(float_arr,names))]
        float_arr.sort()

        # arrange names that have equal values in alphabetical order
        m = 0
        while m < (len(res) - 1):
            if(float_arr[m] == float_arr[m + 1]):
                start_index = m
                end_index = m + 1
                while float_arr[start_index] == float_arr[end_index]:
                    if(end_index == len(res) - 1):
                        break
                    end_index += 1
                # sort the list of names between the indexes
                m = end_index
                if(end_index != len(res) -1):
                    res[start_index:end_index]= sorted(res[start_index:end_index], reverse=True)
                else:
                    res[start_index:]= sorted(res[start_index:], reverse=True)
            m += 1
        
        for n in reversed(res):
            print(n[:-1])
        print('==============================')
        

if __name__ == '__main__':
    main()