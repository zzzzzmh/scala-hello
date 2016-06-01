
object charpter02 {
  /*
   * 2.1 
   * 一个数字如果为正数，则它的signum为1;
   * 如果是负数,则signum为-1;
   * 如果为0,则signum为0.编写一个函数来计算这个值
   * */
  def question1(x: Int) = if (x > 0) 1 else if (x == 0) 0 else -1

  /*
   * 2.2 
   * 一个空的快表达式{}的值是什么？类型是什么？
   * */
  def question2 {
    println({})
    println({}.getClass())
  }

  /*
   * 2.3 
   * 指出在Scala中何种情况下赋值语句x=y=1是合法的。
   * (提示：给x找个合适的类型定义)
   */
  def question3 {
    var x: Unit = ()
    println("x's type is: " + x.getClass)
    var y: Int = 1
    x = y = 1
  }

  /*
   * 2.4 
   * 针对下列Java循环编写一个Scala版本:
   * for(int i=10;i>=0;i–)System.out.println(i);
   */
  def question4 {
    (1 to 10 reverse) foreach { println(_) }
  }

  /*
   * 2.5 
   * 编写一个过程countdown(n:Int)，打印从n到0的数字
   */
  def question5(n: Int) {
    n match {
      case n if n >= 0 => {
        (0 to n reverse) foreach { println(_) }
      }
      case n if n < 0 => {
        n to 0 foreach { println(_) }
      }
    }
  }

  /*
   * 2.6 
   * 编写一个for循环,计算字符串中所有字母的Unicode代码的乘积。
   * 举例来说，"Hello"中所有字符串的乘积为9415087488L
   */
  def question6(s: String): Long = {
    var res: Long = 1
    for (c <- s) {
      res *= c.toLong
    }
    res
  }

  /*
   * 2.7 
   * 同样是解决前一个练习的问题，但这次不使用循环。
   * （提示：在Scaladoc中查看StringOps）
   */
  def question7(s: String): Long = {
    var res: Long = 1
    s foreach { x => res *= x.toLong }
    res
  }

  /*
   * 2.8 
   * 编写一个函数product(s:String)，
   * 计算前面练习中提到的乘积
   */
  def question8(s: String): Long = {
    if (s.length() == 1) {
      s(0) toLong
    }
    else {
      s(0).toLong * question8(s.tail)
    }
  }

  /*
   * 2.9 
   * 把前一个练习中的函数改成递归函数
   */
  def question9(s: String): Long = question8(s)

  /*
   * 2.10 
   * 编写函数计算xn,其中n是整数，使用如下的递归定义:
   */
  def question10(x: Int, n: Int): BigInt = {
    n match {
      case 0 => 1
      case n if n < 0 => 1 / question10(x, -n)
      case n if n % 2 == 0 => question10(x, n / 2) pow 2
      case n if n % 2 == 1 => x * question10(x, n - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(question10(2, 3))
  }
}