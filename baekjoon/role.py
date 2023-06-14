# [BOJ] - 백준
# [PGS] - 프로그래머스
# [LTC] - 리트코드
# [CFS] - 코드포스
# [SEA] - 삼성SW Expert Academy
# [ETC] - 그외

n = int(input())

result = 1
if n > 0:
    for i in range(1, n+1):
        result *= i
print(result)