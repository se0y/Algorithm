import sys

K = int(input())
cmd = []
cnt = 0
for _ in range(K):
  c = int(input())
  if c == 0:
    cmd.pop()
  else:
    cmd.append(c)

for i in range(len(cmd)):
  cnt += cmd[i]

print(cnt)