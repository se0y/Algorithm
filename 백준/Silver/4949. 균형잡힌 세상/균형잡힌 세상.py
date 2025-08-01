import sys
'''
괄호 => 스택
짝맞추기, 괄호 스택에 넣고 짝 나오면 pop
검열되는 경우: 다른 괄호으로 닫거나, 스택에 괄호가 남아있거나, 스택이 비었는데 꺼내려고 하는 경우

- readline은 개행문자까지 입력으로 가져가기 때문에, 종료 조건 설정 잘 해야함 
rstrip('\n') 하거나, input()으로 자동으로 개행문자 제거하는 방식 사용할 것
'''
open = ['(', '[']
close = [')', ']']

while True:  
  cmd = input()
  if cmd == '.':
    break
    
  # 문장마다 초기화
  stack = []
  result = True
  
  for i in cmd:
    if i in open:
      stack.append(i)

    elif i in close:
      if stack:
        check = stack.pop()
        # 다른 괄호로 닫았을 때 검열
        if (i == ')' and check == '[') or (i == ']' and check == '('):
          result = False
          break
      else:
        result = False
        break
  
  if result and not stack:
    print('yes')
  else:
    print('no')