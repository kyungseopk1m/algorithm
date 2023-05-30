arr = []
for _ in range(10):
    n = int(input())
    # 배열의 마지막에 추가
    arr.append(n % 42)
# 중복 제거하는 필터 역할 set
arr = set(arr)
print(len(arr))