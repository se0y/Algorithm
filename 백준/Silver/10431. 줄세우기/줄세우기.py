import sys

P = int(input())

for _ in range(P):
  count = 0
  kids = list(map(int, sys.stdin.readline().split()))
  for i in range(1,21):
    for j in range(i+1, len(kids)):
      if kids[i] > kids[j]:
        kids[i], kids[j] = kids[j], kids[i]
        count += 1
  print(kids[0], count)