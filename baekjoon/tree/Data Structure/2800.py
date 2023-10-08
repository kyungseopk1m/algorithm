from itertools import combinations
s = list(input())
stack = []
brackt = []
result = []
for x in range(len(s)):
    if s[x] == '(':
        stack.append(x)
    elif s[x] == ')':
        start = stack.pop()
        brackt.append((start, x))
for x in range(1, len(brackt)+1):
    for i in list(combinations(brackt, x)):
        answer = s[:]
        for j in i:
            answer[j[0]] = ''
            answer[j[1]] = ''
        result.append(''.join(s for s in answer))
result = list(set(result))
result.sort()
for x in result:
    print(x)