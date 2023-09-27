import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

val conf = new SparkConf().setAppName("Pi Estimation").setMaster("")
val count = sc.parallelize(1 to 200).filter { _ =>
  val x = math.random
  val y = math.random
  x*x + y*y < 1
}.count()

println(s"Pi is roughly ${4.0 * count / 200}")