package util

object PersonasUtils {
def getRoeKeyByUid(uid:Long):Array[Byte]={
  uid.toString.reverse.getBytes()
}
}
