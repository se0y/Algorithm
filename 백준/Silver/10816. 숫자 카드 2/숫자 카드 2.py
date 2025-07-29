import sys
from collections import Counter

N = int(sys.stdin.readline())
n_cards = list(map(int, sys.stdin.readline().split()))
counter = Counter(n_cards)

M = int(sys.stdin.readline())
m_cards = list(map(int, sys.stdin.readline().split()))

result = []  

for num in m_cards:
    if num in counter:
        result.append(str(counter[num]))
    else:
        result.append('0')

print(' '.join(result))

