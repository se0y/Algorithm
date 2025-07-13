import sys
'''
상담을 하면 Ti일 만큼 건너뜀, 상담을 안 하면 다음으로 넘어감
상담을 할지 말지 결정하는 것은 더 많은 금액을 받을 수 있는 방향으로 선택됨
1. 최적화, 최대 수익 => DP 
2. 다음을 가정할 수가 없음. 미래 값을 알고 있어야 지금의 최선 판단(이후 최대 이익)이 가능
3. dp[i]을 i일부터 마지막까지 일했을 때 얻을 수 있는 최대 이익으로 둠, N-i>=0이어야 함
4. dp[7] = 0, dp[6] = 0, dp[5] = 15, dp[4] = dp[5] + 20 = 35
dp[3] = dp[4] + 10 = 45, dp[2] = dp[3]
오늘 상담하고 오늘 수입 받은 후, T[i]이후의 최대수익을 받는 경우
vs 스킵하고 다음수입(다음 날의 최대 수익)
5. dp[i] = max(P[i]+dp[i+T[i]], dp[i+1])
'''
T = []
P = []
N = int(input())
for _ in range(N):
  t, p = map(int, sys.stdin.readline().split())
  T.append(t)
  P.append(p)

dp = [0] * (N+1)
for i in range(N-1,-1,-1):
  if i + T[i] <= N:
    dp[i] = max(P[i] + dp[i + T[i]], dp[i + 1]) # 오늘 상담 하기 vs 안 하기
  else:
    dp[i] = dp[i + 1]
  
print(dp[0])