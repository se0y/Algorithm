import sys
'''
그리디 알고리즘
빨리 끝나는 회의를 넣어야 더 많은 회의를 진행할 수 있음
'''
N = int(input())
timeline = []
for _ in range(N):
  time = list(map(int, sys.stdin.readline().split()))
  timeline.append(time)

# 끝나는 시간이 작은 것부터 오름차순 정렬
# 같은 경우에는 시작시간이 빠른 것 => 틀렸던 이유.
timeline.sort(key=lambda x: (x[1], x[0]))
# print(timeline)

cnt = 1
end = timeline[0][1]
for i in range(1,N):
  if timeline[i][0] >= end:
    cnt += 1
    end = timeline[i][1]

print(cnt)