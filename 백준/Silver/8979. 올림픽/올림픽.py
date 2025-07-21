import sys
'''
각 국가의 메달 정보 저장
비교 기준이 되는 K번 국가의 메달 정보 찾기
다른 국가들과 비교하며 등수 계산 
k의 등수 출력하기
'''

N, K = map(int, sys.stdin.readline().split())
medals = []

for _ in range(N):
  country = list(map(int, sys.stdin.readline().split()))
  medals.append(country)

target = [m for m in medals if m[0] == K][0]

rank = 1

# 타겟보다 더 잘한 국가가 있을 땐 rank +1 하여 뒤로 땡김 
for m in medals:
  if m[0] == K:
    continue
  if m[1] > target[1]:
    rank += 1
  elif m[1] == target[1] and m[2] > target[2]:
    rank += 1
  elif m[1] == target[1] and m[2] == target[2] and m[3] > target[3]:
    rank += 1

print(rank)
