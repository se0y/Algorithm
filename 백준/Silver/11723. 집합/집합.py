import sys

M = int(input())
S = []

def isExit(x):
  for i in range(len(S)):
    if x == S[i]:
      return True
  else:
    return False
  
def add(x):
  if not isExit(x):
    S.append(x)

def remove(x):
  if isExit(x):
    S.remove(x)

def check(x):
  if isExit(x):
    print('1')
  else:
    print('0')

def toggle(x):
  if isExit(x):
    remove(x)
  else:
    add(x)

def empty():
  S.clear()

def all():
  empty()
  for i in range(1,21):
    S.append(i)

for _ in range(M):
  a = sys.stdin.readline().split()
  cmd = a[0]

  if cmd == 'add':
    add(int(a[1]))
  elif cmd == 'remove':
    remove(int(a[1]))
  elif cmd == 'check':
    check(int(a[1]))
  elif cmd == 'toggle':
    toggle(int(a[1]))
  elif cmd == 'all':
    all()
  elif cmd == 'empty':
    empty()
  else:
    pass

