def solution(a, b):
    answer = 0
    str_a, str_b = str(a), str(b)
    ab = str_a + str_b
    ba = str_b + str_a
    
    if int(ab) >= int(ba):
        answer = int(ab)
    else:
        answer = int(ba)
    return answer

if __name__ == "__main__":
    a, b = input().split()
    print(solution(a, b))