# 바구니 총 N개. M번 공을 바꾸는 것.
N, M = map(int, input().split())

# 바구니에 1번부터 N번까지 공 집어넣기
basket = [i for i in range(1, N+1)]

for i in range(M):
    # i번 바구니와 j번 바구니에 들어있는 공 서로 교환
    i, j = map(int, input().split())
    basket[i-1], basket[j-1] = basket[j-1], basket[i-1]

# 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 출력
for i in range(N):
    print(basket[i], end=' ')