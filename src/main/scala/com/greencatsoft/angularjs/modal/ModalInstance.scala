package com.greencatsoft.angularjs.modal

import com.greencatsoft.angularjs.q.Promise

import scala.scalajs.js

trait ModalInstance extends js.Object {

  def close(result: js.Any): Unit = ???

  def close(): Unit = ???

  def dismiss(reason: js.Any): Unit = ???

  def result: Promise = ???

  def opened: Promise = ???
}

object ModalInstance {

  val Name = "$modalInstance"
}