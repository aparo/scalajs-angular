package com.greencatsoft.angularjs.scope

import scala.scalajs.js

import com.greencatsoft.angularjs.InjectionTarget

trait ScopeAware extends InjectionTarget with Scoped {

  var currentScope: Option[ScopeType] = None

  override def dependencies = super.dependencies :+ Scope.Name

  override def inject(args: Seq[js.Any]) {
    super.inject(args)

    val index = dependencies.indexOf(Scope.Name) ensuring (_ >= 0)

    val scope = args(index).asInstanceOf[ScopeType]
    scope.dynamic.controller = this.asInstanceOf[js.Object]

    this.currentScope = Some(scope)
  }

  override def initialize(): Unit = currentScope.foreach(initialize(_))

  def initialize(scope: ScopeType): Unit = Unit
}