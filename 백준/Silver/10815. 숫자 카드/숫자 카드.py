import sys
'''
시간 초과 - 리스트 탐색 O(N), 해시 탐색 O(1)
'''

N = int(input())
cards = set(sys.stdin.readline().split())

M = int(input())
check = sys.stdin.readline().split()

result = []
for i in check:
  if i in cards:
    result.append('1')
  else:
    result.append('0')

print(" ".join(result))