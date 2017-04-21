package org.slf4j.platform;

import org.slf4j.LoggerFactory;

import java.lang.System.Logger;
import java.lang.System.LoggerFinder;

public class SLF4JSystemLoggerFinder extends LoggerFinder {

  @Override
  public Logger getLogger(String name, Module module) {
    return new SLF4JSystemLogger(LoggerFactory.getLogger(name));
  }

}
