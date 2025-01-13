def solution(number, n, m):
    if number % n == 0 and number % m == 0:
        return 1
    return 0


if __name__ == "__main__":
    number, n, m = input().split()
    print(solution(int(number), int(n), int(m)))
