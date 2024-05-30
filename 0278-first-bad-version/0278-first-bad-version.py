# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        start = 0
        last = n
        solution = n
        while start < last:
            mid = (start + last)//2
            isBad = isBadVersion(mid)
            if isBad:
                last = mid
                solution = min(solution, mid)
            else:
                start = mid + 1
        return solution
        