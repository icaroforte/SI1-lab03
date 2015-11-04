
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/icaro/activator-dist-1.3.6/app1/conf/routes
// @DATE:Tue Nov 03 22:14:59 BRT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
