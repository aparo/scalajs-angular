package com.greencatsoft.angularjs.dom

import com.greencatsoft.angularjs.Injectable

trait Document extends org.scalajs.dom.Document with Injectable

object Document extends Injectable {

  val Name = "$document"
}
