import sys

number = sys.stdin.readline().strip()
N = 0
idx = 0
while True:
  N += 1
  for s in str(N):
    if number[idx] == s:
      idx += 1
      if idx >= len(number):
        print(N)
        exit()