package com.knoldus.list.detail.assignment
/*
 *created by ANUJ_SAXENA and RAMANDEEP KAUR
 */


  class ListMethods {

    def length[A](l: List[A]): Int = {

      val k = l.foldRight(0)((_, s) => s + 1)
      k

    }

  }

  object ListMethods {

    def main(args: Array[String]): Unit = {
      
      val list = List(1,2,3,4,5)
      val listMethods = new ListMethods()
      
      val listLength = listMethods.length(list)
      println("Length: "+listLength)
      
    }

  }
