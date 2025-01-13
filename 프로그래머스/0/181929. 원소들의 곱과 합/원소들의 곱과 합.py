from functools import reduce

multiply = lambda arr: reduce(lambda x, y: x * y, arr)
add = lambda arr: reduce(lambda x, y: x + y, arr)

def solution(num_list):
    if multiply(num_list) < add(num_list)**2:
        return 1
    return 0