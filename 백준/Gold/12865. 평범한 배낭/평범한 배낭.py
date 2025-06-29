import sys

weight = [0]
value = [0]

n, k = map(int, input().split()) # 개수, 최대 무게
for i in range(n):
  w, v = map(int, input().split()) # 각 물품의 무게, 가치
  weight.append(w)
  value.append(v)

# 다이나믹 프로그래밍 -> 메모이제이션, 중복 계산 방지
dp = [[-1] * (k + 1) for _ in range(n+1)] # 2차원 테이블 초기화

def bag(i, w):
  # 물건 0개이거나 현재 무게 한도가 0이면 0
  if i==0 or w==0:
    return 0

  # 이전에 계산한 경우는 바로 반환
  if dp[i][w]!=-1:
    return dp[i][w]

  # 점화식 => 물건 넣는 경우, 안 넣는 경우로 나누기
  if w < weight[i]: # 넣을 수 있는 남은 무게보다 크므로 넣을 수 없음
    dp[i][w] = bag(i-1, w) # 안 넣음, 이 물건 말고 앞의 물건들로 가치 판단 
  else:
    dp[i][w] = max( bag(i-1, w), bag(i-1, w-weight[i])+value[i] )

  return dp[i][w]


print(bag(n,k))