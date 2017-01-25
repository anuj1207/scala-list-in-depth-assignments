package com.knoldus.list.detail.assignment
/*
 *created by ANUJ_SAXENA and RAMANDEEP KAUR
 */


  class ListMethods {

    def length[A](l: List[A]): Int = {

      val k = l.foldRight(0)((_, s) => s + 1)
      k

    }

    def concateList[A](l1:List[A],l2:List[A]):List[A] = {
      
      l2 match {
        case x::xs => {
          val resultList = l1:+x
          concateList(resultList,xs)
        }
        case x::Nil  => l1:+x

        case _ => l1
      }
    }

    def splitList[A](l: List[A], f: A => Boolean): (List[A], List[A]) = {
    
    	val list1 = for(x<-l if(f(x)))yield x
    	val list2 = for(x<-l if(!f(x)))yield x
    	(list1,list2)
  	}

  }

  object ListMethods {

    def main(args: Array[String]): Unit = {
      
      val list = List(1,2,3,4,5)
      val listMethods = new ListMethods()
	
	  println("/n getting length method /n")	      
      val listLength = listMethods.length(list)
      println("Length: "+listLength)

      println("/n concateList method /n")
      println(listMethods.concateList(List(1, 2, 3), List(5, 6, 4)))
     
 	  println("/n splitList method /n")
 	  println(listMethods.splitList(List(1,2,3,4,5,6),(x:Int) => x>2)) 
    }

  }
