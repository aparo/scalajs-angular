package com.greencatsoft.angularjs.http

import scala.scalajs.js

import com.greencatsoft.angularjs.InjectionTarget

trait HttpProviderAware extends InjectionTarget {

  implicit var httpProvider: HttpProvider = _

  override def dependencies = super.dependencies :+ HttpProvider.Name

  override def inject(args: Seq[js.Any]) {
    super.inject(args)

    val index = dependencies.indexOf(HttpProvider.Name) ensuring (_ >= 0)
    this.httpProvider = args(index).asInstanceOf[HttpProvider]
  }
}