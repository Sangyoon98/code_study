# 슬라이싱(Slicing)

# 리스트나 문자열아세 일부분을 잘라내는 것
# Index의 시작점은 0부터 시작
# 끝점의 Index는 자를 때 포함되지 않음

# ex) [0:5] -> 0, 1, 2, 3, 4

# 처음부터 자르고 싶은 경우 -> [:5]
# 끝까지 자르고 싶은 경우 -> [8:]


# 문자열 슬라이싱
message = "Hello, World!"
print(message[0:5])
print(message[:5])
print(message[7:])
print(message[7:12])
print(message[::2]) # 홀수번째 문자열 추출

# 리스트 슬라이싱
numbers = ["a", "b", "c", "d", "e"]
print(numbers[1:4])
print(numbers[:3])
print(numbers[3:])
print(numbers[::2]) # 홀수번쨰 문자열 추출