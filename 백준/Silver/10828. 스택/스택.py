import sys

N = int(input())
stack = []

def isEmpty():
  if len(stack) == 0:
    return True
  else:
    return False

def push(x):
  stack.append(x)

def pop():
  if isEmpty():
    print('-1')
  else:
    print(stack.pop())

def size():
  print(len(stack))

def empty():
  if isEmpty():
    print('1')
  else:
    print('0')

def top():
  if isEmpty():
    print('-1')
  else:
    print(stack[-1])


for _ in range(N):
  cmd = sys.stdin.readline().strip().split()
  a = cmd[0]
  
  if a == 'push':
    b = cmd[1]
    push(b)
  elif a == 'pop':
    pop()
  elif a == 'size':
    size()
  elif a == 'empty':
    empty()
  elif a == 'top':
    top()
  else:
    pass
  