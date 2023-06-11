A = input().upper()
A_list = list(set(A)) # 중복값 제거

cnt = []
for i in A_list:
    count = A.count(i)
    cnt.append(count) # count 숫자 리스트에 append

if cnt.count(max(cnt)) > 1: # count 숫자 최대값 중복시
    print('?')
else:
    max_index = cnt.index(max(cnt)) # count 숫자 최대값 인덱스
    print(A_list[max_index])