def solution(a, b):
    answer = 0
    str_a, str_b = str(a), str(b)
    ab = str_a + str_b
    dab = 2 * a * b
    if int(ab) >= dab:
        answer = int(ab)
    else:
        answer = dab
    return answer

if __name__ == "__main__":
    a, b = input().split()
    print(solution(int(a), int(b)))