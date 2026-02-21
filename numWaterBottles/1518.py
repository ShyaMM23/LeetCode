class Solution:
    def numWaterBottles(self, num: int, numExchange: int) -> int:
        s=0
        e=0
        while(num>0):
            s=num+s
            e=e+num
            num=e//numExchange
            e=e%numExchange
        return s
