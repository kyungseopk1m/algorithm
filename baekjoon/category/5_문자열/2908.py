A, B = input().split()
A = int(A[::-1]) # [::-1] 역순
B = int(B[::-1])

if A > B:
    print(A)
else:
    print(B)
