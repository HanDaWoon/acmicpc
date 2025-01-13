def solution(n):
    result = 0
    if n % 2 == 0:
        for i in range(0, n + 1, 2):
            result += i * i
    else:
        for i in range(1, n + 1, 2):
            result += i
    return result


if __name__ == "__main__":
    n = int(input())
    print(solution(n))
