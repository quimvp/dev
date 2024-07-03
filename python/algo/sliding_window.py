def calculateMaxVowelsInSubstring(a,k):
    vowel = ['a', 'e', 'i', 'o', 'u']
    total = 0
    string = a[:k]
    for i in range(k):
        if a[i] in vowel:
            total += 1
            
    maxTotal = total
    for i in range(len(a)-k):
        if a[i] in vowel:
            total -= 1
        if a[i+k] in vowel:
            total += 1
        
        if maxTotal < total:
            string = a[i+1:i+k+1]
            maxTotal = total
    return maxTotal, string
    
print(calculateMaxVowelsInSubstring('aebyxregsvyeeeeytf',3))


print('1234567'[1:5])
