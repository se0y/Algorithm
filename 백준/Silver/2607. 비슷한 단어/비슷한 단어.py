import sys
from collections import Counter
'''
Counter로 종류와 개수 파악 가능 
종류가 같은 경우 체크
종류가 같지 않지만 하나만 다르고, 하나만 추가/제거/치환했을 때 같아지면 체크
'''

T = int(input())
words = []
count = 0

for i in range(T):
  word = sys.stdin.readline().strip()
  words.append(word)

first = Counter(words[0])
for i in range(1,T):
  current = Counter(words[i])
  if first == current:
    count += 1
    continue
  
  diff1 = first - current # first에만 있는 알파벳
  diff2 = current - first # current에만 있는 알파벳
  total_diff = sum(diff1.values()) + sum(diff2.values())

  if total_diff == 1:
    count += 1
  elif sum(diff1.values()) == 1 and sum(diff2.values()) == 1 and total_diff == 2:
    count += 1
  
print(count)