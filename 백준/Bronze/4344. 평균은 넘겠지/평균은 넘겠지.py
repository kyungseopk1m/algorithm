A = int(input())

for i in range(A):
    nums = list(map(int, input().split()))
    avg = sum(nums[1:])/nums[0]
    cnt = 0
    for score in nums[1:]:
        if score > avg:
            cnt += 1
    rate = cnt/nums[0] * 100
    print('{0:0.3f}%'.format(rate))