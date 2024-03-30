class Vowels_1456:

    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}
        l,r=0,0
        res=0
        count=0
        for r in range(len(s)):
            count +=1 if s[r] in vowels else 0
            if r-l+1 > k :
                 count -= 1 if s[l] in vowels else 0
                 l += 1
            res = max(res, count)
        return res    

obj = Vowels_1456()
print(obj.maxVowels('leetcode',3))