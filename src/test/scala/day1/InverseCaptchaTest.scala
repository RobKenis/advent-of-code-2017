package day1

import org.junit.Test
import org.junit.Assert._
import org.scalatest.junit.AssertionsForJUnit

class InverseCaptchaTest extends AssertionsForJUnit {


  @Test
  def solveA(): Unit = {
    val result = InverseCaptcha.solveA(InverseCaptcha.ints)
    assertEquals(997, result)
  }

  @Test
  def solveB(): Unit = {
    val result = InverseCaptcha.solveB(InverseCaptcha.ints)
    assertEquals(1358, result)
  }

}
