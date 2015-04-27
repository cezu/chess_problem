import org.scalatest.FunSuite

class BTSuite extends FunSuite {
  test("8 queens puzzle") {
    assert(ChessProblem.backtrack(8, 8, 0, 8, 0, 0, 0).equals(92))
  }

  test("2 rooks on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 0, 0, 0, 2, 0).equals(2))
  }
  test("2 bishops on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 0, 0, 2, 0, 0).equals(4))
  }
  test("1 king on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 1, 0, 0, 0, 0).equals(4))
  }
  test("1 knight on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 0, 0, 0, 0, 1).equals(4))
  }
  test("1 queen on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 0, 1, 0, 0, 0).equals(4))
  }
  test("3 rooks on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 0, 0, 0, 3, 0).equals(0))
  }
  test("3 bishops on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 0, 0, 3, 0, 0).equals(0))
  }
  test("2 kings on 2x2") {
    assert(ChessProblem.backtrack(2, 2, 2, 0, 0, 0, 0).equals(0))
  }
}