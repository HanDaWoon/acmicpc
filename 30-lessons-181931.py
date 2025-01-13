def solution(code):
    mode = 0
    ret = ""
    for idx, c in enumerate(code):
        if mode == 0:
            if c == "1":
                mode = 1
            else:
                if idx % 2 == 0:
                    ret += c
        else:
            if c == "1":
                mode = 0
            else:
                if idx % 2 != 0:
                    ret += c
    return "EMPTY" if ret == "" else ret


if __name__ == "__main__":
    code = input()
    print(solution(code))
