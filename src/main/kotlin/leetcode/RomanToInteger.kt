package leetcode

class RomanToInteger {
  private val map = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
  )

   private val map2 = mapOf(
    "MMM" to 3000,
    "MM" to 2000,
    "M" to 1000,
    "CM" to 900,
    "DCCC" to 800,
    "DCC" to 700,
    "DC" to 600,
    "D" to 500,
    "CD" to 400,
    "CCC" to 300,
    "CC" to 200,
    "C" to 100,
    "XC" to 90,
    "LXXX" to 80,
    "LXX" to 70,
    "LX" to 60,
    "L" to 50,
    "XL" to 40,
    "XXX" to 30,
    "XX" to 20,
    "X" to 10,
    "IX" to 9,
    "VIII" to 8,
    "VII" to 7,
    "VI" to 6,
    "V" to 5,
    "IV" to 4,
    "III" to 3,
    "II" to 2,
    "I" to 1,
  )



  fun romanToInt(s: String): Int {
    var result = 0
    for (i in s.indices) {
      val current = map[s[i]]!!
      val next = if (i + 1 < s.length) map[s[i + 1]]!! else 0
      if (current < next) {
        result -= current
      } else {
        result += current
      }
    }
    return result
  }

  fun romanToInt2(s: String): Int {
    var result = 0
    var i = 0

    while(i < s.length) {
      for (entry in map2) {
        val key = entry.key
        val value = entry.value
        if (s.startsWith(key, i)) {
          result += value
          i += key.length
          break
        }
      }
    }

    return result
  }

  fun romanToInt3(s: String): Int {
    var result = 0
    for(i in s.indices) {
      var x = map2[s[i].toString()]!!
      var y = if (i + 1 < s.length) map2[s[i + 1].toString()]!! else 0
      if (x < y) {
        result -= x
      } else {
        result += x
      }
    }
    return result
  }
}