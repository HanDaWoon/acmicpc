def solution(str1, str2):
    answer = ''
    for i in range(len(str1)):
        answer += str1[i] + str2[i]
    return answer

if __name__ == "__main__":
    str1, str2 = input().split()
    print(solution(str1, str2))