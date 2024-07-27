# 집합(Set)
# 집합은 순서가 없고 중복을 허용하지 않는 자료형

# 집합 생성
fruit_basket = {"apple", "banana", "grape"}
print(fruit_basket)

# 집합에 요소 추가
fruit_basket.add("orange")
print(fruit_basket)

# 집합에서 요소 제거
fruit_basket.remove("banana")
print(fruit_basket)

# 집합 업데이트
more_fruits = ["kiwi", "pear", "apple"]
fruit_basket.update(more_fruits)
print(fruit_basket)