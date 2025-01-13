def solution(a, b, flag):
    if flag == "true":
        return a + b
    return a - b


if __name__ == "__main__":
    a, b, flag = input().split()
    print(solution(int(a), int(b), flag))
