module org.slf4j.platform {
  requires org.slf4j;
  provides java.lang.System.LoggerFinder
          with org.slf4j.platform.SLF4JSystemLoggerFinder;
}
