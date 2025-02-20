def list = [1, 2, 3, 4, 5]

// Solution 1: Check the index before accessing
int index = 10
if (index >= 0 && index < list.size()) {
    println list.get(index)
} else {
    println "Index out of bounds"
}

//Solution 2: Use the elvis operator for a default value
println list.get(10) ?: "Index out of bounds"

// Solution 3: Use the safe navigation operator
println list[10]?.toString() ?: "Index out of bounds"