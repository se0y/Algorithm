import sys
sys.setrecursionlimit(10000) # 런타임 오류 해결, Python 기본 재귀 제한 = 1000

T = int(input())
dp = [[-1]*4 for _ in range(10001)] # 테이블 초기화, dp[n][last] n을 나타내는 경우의 수

def calc(n,last):
  if n==0: # (base case) 합이 n이 되었을 때
    return 1

  if dp[n][last] != -1:
    return dp[n][last]

  count = 0 

  for i in range(last,4): # last 이상 4 미만 (last~3), 중복 체크않기 위해 last 사용
    if n-i >= 0 :
      count += calc(n-i,i) # i를 선택했으니 n에서 빼고 그 숫자에 대한 경우의수 

  dp[n][last] = count
  return count


for _ in range(T):
  n = int(input())
  print(calc(n,1))