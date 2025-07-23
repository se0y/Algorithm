import sys
from collections import deque
'''
제일 앞에 있는 카드 버림 => 제일 앞에 있는 카드 뒤로 넣음 
  - pop(0) => 제일 앞에 있는 인덱스 버림, FIFO 효과. but 시간복잡도 급상승 O(n)
  - deque => popleft, pop, appendleft, append 사용가능. O(1)
list는 연속된 메모리 공간에 저장하기 때문에 무작위 접근 빠르지만, 앞 삽입/삭제 느림
deque는 포인터로 연결되어 있기 때문에 앞/뒤 삽입 삭제 빠르지만, 무작위 접근 느림
'''

N = int(sys.stdin.readline().strip())
cards = deque(range(1, N+1))

while len(cards) > 1:
  cards.popleft()
  cards.append(cards.popleft())

print(cards[0])