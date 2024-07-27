# Map()

# 리스트나 튜플 등의 이터러블 객체의 각 요소에 함수를 적용하여 새로운 객체를 반환

# lamda 함수 사용
numbers = [1, 2, 3, 4, 5]
add_ten = map(lambda x: x + 10, numbers)
print(list(add_ten))