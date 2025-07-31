import sys
'''
원형 큐
k번째 구하기
'''
N, K = map(int, sys.stdin.readline().split())

arr = list(range(1, N+1))
result = []
idx = 0 # 3

while len(arr) > 0:
  # k번째 구하기
  idx = (idx + K -1) % len(arr)
  result.append(str(arr.pop(idx)))


result = ", ".join(result)
print("<" + result + ">")
