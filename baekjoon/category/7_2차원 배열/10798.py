words = [input() for i in range(5)]

for j in range(15): # 최대 15개 글자
    for i in range(5): # 5줄
        if j < len(words[i]):
            print(words[i][j], end='')