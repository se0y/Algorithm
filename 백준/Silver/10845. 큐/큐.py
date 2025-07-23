import sys
from collections import deque

N = int(input())
q = deque()

for _ in range(N):
  cmd = sys.stdin.readline().split()
  if cmd[0] == 'push':
    q.append(cmd[1])
  elif cmd[0] == 'pop':
    print(q.popleft() if q else -1)
    # if len(q) == 0:
    #   print(-1)
    # else:
    #   print(q.popleft())
  elif cmd[0] == 'size':
    print(len(q))
  elif cmd[0] == 'empty':
    print(1 if not q else 0)
    # if len(q) == 0:
    #   print('1')
    # else:
    #   print('0')
  elif cmd[0] == 'front':
    print(q[0] if q else -1)
    # if len(q) == 0:
    #   print('1')
    # else:
    #   print(q[0])
  else:
    print(q[len(q)-1] if q else -1)
    # if len(q) == 0:
    #   print('1')
    # else:
    #   print(q[len(q)-1])
