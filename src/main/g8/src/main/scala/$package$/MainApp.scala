/**
  * main entry point for application
  */

package $package$
import $package$.config.ConfigUtils

object MainApp {

  def hello(name: String): String = s"Hello \${name}"

  def main(args: Array[String]): Unit = {
    val appVersion = ConfigUtils.config.version
    println(s"running application version: \${appVersion}")
    val message = args.length match {
      case 0 => hello("Anonymous")
      case _ => hello(args(0))
    }
    println(message)
  }
}
