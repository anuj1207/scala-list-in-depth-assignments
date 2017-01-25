package com.knoldus.list.detail.assignment
/*
 *created by ANUJ_SAXENA and RAMANDEEP KAUR
 */


  class ListMethods {

    def length[A](l: List[A]): Int = {

      val k = l.foldRight(0)((_, s) => s + 1)
      k

    }

    def hasSubsequence[A](list: List[A], sub: List[A]): Boolean = {

      val listLength = list.length
      val subLength = sub.length
      val upperLimit = listLength - subLength
      val resultList = for (i <- 0 to upperLimit) yield list.slice(i, subLength) == sub
      resultList.nonEmpty

    }
	  
    def concateList[A](l1:List[A],l2:List[A]):List[A] = {
      
      l2 match {
        
        case x::Nil  => l1:+x
	      
        case x::xs => {
          val resultList = l1:+x
          concateList(resultList,xs)
        }

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
	
      println("\n Getting Length Method \n")	      
      val listLength = listMethods.length(list)
      println("Length: "+listLength)

      println("\n Checking Subsequence: ")
      println(listMethods.hasSubsequence(List(1, 2, 3, 4, 5), List(4, 5)))
	    
      println("\n ConcateList Method \n")
      println(listMethods.concateList(List(1, 2, 3), List(5, 6, 4)))
     
      println("\n SplitList Method \n")
      println(listMethods.splitList(List(1,2,3,4,5,6),(x:Int) => x>2)) 
    }

  }
