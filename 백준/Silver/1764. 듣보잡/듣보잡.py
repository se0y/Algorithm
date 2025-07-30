import sys
'''
set은 자동으로 중복이 제거됨 
순서가 중요하지 않으며, 빠른 탐색 가능
'''

N, M = map(int, sys.stdin.readline().split())

n = set()
m = set()

for _ in range(N):
  n.add(input())
for _ in range(M):
  m.add(input())

arr = n & m # 교집합
arr = sorted(arr) # 사전순
print(len(arr))

for i in arr:
  print(i)