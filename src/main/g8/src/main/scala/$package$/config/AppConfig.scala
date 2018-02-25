/**
  * Configuration utils
  */

package $package$.config

import com.typesafe.config.{ConfigFactory, Config}

case class AppConfig(version: String)

object ConfigUtils {
  lazy val rootConf = ConfigFactory.load()
  lazy val config = AppConfig(rootConf.getConfig("$package$").getString("version"))
}
