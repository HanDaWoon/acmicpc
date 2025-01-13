def solution(my_string, overwrite_string, s):
    s = int(s)
    answer = ''
    for idx, c in enumerate(my_string):
        if idx < s:
            answer += c
    answer += overwrite_string
    answer += my_string[s+len(overwrite_string):]
    return answer


if __name__ == "__main__":
    my_string, overwrite_string, s = input().split()
    print(solution(my_string, overwrite_string, s))