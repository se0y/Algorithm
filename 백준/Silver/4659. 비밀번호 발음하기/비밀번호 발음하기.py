import sys

while True:
  pw = sys.stdin.readline().strip()
  if pw == "end":
    break

  vowel = ['a', 'e', 'i', 'o', 'u']
  vowel_check = False
  vowel_cnt = 0
  consonant_cnt = 0
  prev = None
  result = True
  
  for s in str(pw):
    if s in vowel:
      vowel_check = True
      vowel_cnt += 1
      consonant_cnt = 0
    else:
      consonant_cnt += 1
      vowel_cnt = 0

    if vowel_cnt == 3 or consonant_cnt == 3:
      result = False
      break

    if s == prev and s not in ['e', 'o']:
      result = False
      break

    prev = s

  print(f"<{pw}> is acceptable.") if result == True and vowel_check == True else print(f"<{pw}> is not acceptable.")