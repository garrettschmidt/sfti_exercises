package Chapter5

import scala.beans.BeanProperty

// Make a class Student with read-write JavaBeans properties name (of type String)
// and id (of type Long).  What methods are generated?
class ch_5_05_Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
}