package com.yuzhouwan.bigdata.spark.style

import org.scalatest._

/**
  * Copyright @ 2017 yuzhouwan.com
  * All right reserved.
  * Function：Unit Test Style
  *
  * @author Benedict Jin
  * @since 2015/9/7
  */
abstract class UnitTestStyle extends FlatSpec
  with Matchers with OptionValues with Inside with Inspectors