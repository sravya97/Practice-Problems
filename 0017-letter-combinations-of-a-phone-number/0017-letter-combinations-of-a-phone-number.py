class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        maps = {
            '2' : 'abc',
            '3' : 'def',
            '4' : 'ghi',
            '5' : 'jkl',
            '6' : 'mno',
            '7' : 'pqrs',
            '8' : 'tuv',
            '9' : 'wxyz'
        }
        
        def getCombos(pos, current):
            if pos == len(digits):
                if current:
                    result.append(current)
                return 
            ch = digits[pos]
            value = maps[ch]
            for letter in maps[digits[pos]]:
                getCombos(pos+1, current + letter)
        
        result = []
        getCombos(0, '')
        return result
                
        