import sys
'''
처음 숫자 나올 때까지 push 연산 -> pop -> 이미 담긴 것 중에 있는지 확인하고 pop/push
'''
n = int(input())
arr = [] # 만들어야 하는 수열

for i in range(1, n+1): 
  cmd = int(sys.stdin.readline())
  arr.append(cmd)
# print(arr)

num = 1
stack = [] # 사용할 스택
cmd = []
for i in range(n):
  # 현재 들어간 숫자보다 큰 숫자가 필요하면, 목표 숫자까지 push 
  while num <= arr[i]:
    stack.append(num)
    cmd.append('+')
    num += 1

  # 스택 맨 위가 목표 숫자인지 확인 
  if stack[-1] == arr[i]:
    stack.pop()
    cmd.append('-')
  else:
    print('NO')
    exit()

print('\n'.join(cmd))
  