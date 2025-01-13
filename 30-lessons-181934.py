def solution(ineq, eq, n, m):
    if ineq == ">":
        if eq == "=":
            if n >= m:
                return 1
            return 0
        if n > m:
            return 1
        return 0
    if eq == "=":
        if n <= m:
            return 1
        return 0
    if n < m:
        return 1
    return 0


if __name__ == "__main__":
    ineq, eq, n, m = input().split()
    print(solution(ineq, eq, int(n), int(m)))
