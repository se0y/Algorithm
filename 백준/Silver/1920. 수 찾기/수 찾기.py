import sys
'''
선형탐색 -> 시간 초과
이진탐색으로 시간복잡도 감소 (O(n) -> O(logn))
'''

N = int(input())

A = list(map(int,sys.stdin.readline().split()))
A.sort() # 오름 차순

M = int(input())
m = list(map(int, sys.stdin.readline().split()))

def binary_search(arr, target):
  start = 0
  end = len(arr) - 1
  while start <= end:
    mid = (end + start) // 2
    if arr[mid] == target:
      return 1
    elif arr[mid] < target:
      start = mid + 1
    else:
      end = mid - 1
  return 0

for i in range(M):
  print(binary_search(A, m[i]))
  