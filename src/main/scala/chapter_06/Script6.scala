
// 6.6 Self references

class Rational(n: Int, d: Int) {

  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational = {
    new Rational((numer * that.denom) + (that.numer * denom),
      denom * that.denom)
  }

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

}

assert(new Rational(1,2).lessThan(new Rational(2,3)))