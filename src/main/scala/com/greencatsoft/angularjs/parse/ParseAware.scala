package com.greencatsoft.angularjs.parse

import scala.scalajs.js

import com.greencatsoft.angularjs.InjectionTarget

trait ParseAware extends InjectionTarget {

  implicit var parse: Parse = _

  override def dependencies = super.dependencies :+ Parse.Name

  override def inject(args: Seq[js.Any]) {
    super.inject(args)

    val index = dependencies.indexOf(Parse.Name) ensuring (_ >= 0)
    this.parse = args(index).asInstanceOf[Parse]
  }
}
