import Foundation

func readInput() -> Int {
    guard let input = readLine(), let n = Int(input) else {
        fatalError("Invalid input")
    }
    return n
}

let n = readInput()
let result = Int(pow(pow(2.0, Double(n)) + 1.0, 2.0))
print(result)