from typing import List
import functools


class Solution:
    def minNumber(self, nums: List[int]) -> str:
        def compare(x: str, y: str) -> int:
            if int(x + y) > int(y + x):
                return 1
            else:
                return -1
        strNums = [str(n) for n in nums]
        # strNums.sort(key=functools.cmp_to_key(compare))
        strNums = sorted(strNums, key=functools.cmp_to_key(compare))
        return ''.join(strNums)