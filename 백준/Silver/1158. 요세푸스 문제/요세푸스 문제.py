import sys
'''
원형큐, k번째 구하고 pop
'''
N, K = map(int, sys.stdin.readline().split())
arr = []
idx = 0
for i in range(1,N+1):
  arr.append(i)

stack = []
while len(arr) > 0:
  idx = (idx + K -1) % len(arr)
  stack.append(str(arr.pop(idx)))

stack = ", ".join(stack)
print("<" + stack + ">")
