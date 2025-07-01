import sys

T = int(input())

def size():
  return len(stack);

def isEmpty():
  if size() == 0:
    return True
  else:
    return False

def push(data):
  stack.append(data)

def pop():
  if isEmpty():
    return None
  return stack.pop()

def top():
  return stack[-1]


for _ in range(T):
  stack = []
  cmd = sys.stdin.readline().strip()
  for i in range(len(cmd)):
    if cmd[i] == '(':
      push(cmd[i])
    elif cmd[i] == ')':
      item = pop()
      if item == None:
        print('NO')
        break
    else:
      pass
  else:
    if isEmpty():
      print('YES')
    else:
      print('NO')
  