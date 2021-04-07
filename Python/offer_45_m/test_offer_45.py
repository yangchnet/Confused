from unittest import TestCase
from offer_45_m.offer_45 import Solution


class TestSolution(TestCase):
    def test_min_number(self):
        s = Solution()
        if "3033459" != s.minNumber([3, 30, 34, 5, 9]):
            self.fail()
