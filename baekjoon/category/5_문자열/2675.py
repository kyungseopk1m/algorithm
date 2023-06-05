T = int(input())
for i in range(T):
    num, S = input().split()
    text = ''
    for i in S:
        text += int(num) * i
    print(text)
