package util

import com.czjk.api.db.JedisUtils
import org.apache.spark.streaming.kafka010.OffsetRange

object KafkaManager {
  def storeOffsets(offsetRanges:Array[OffsetRange],group: String)={
    val jedis = JedisUtils.getJedis()
    for(offsetRange<-offsetRanges){
      val topisc = offsetRanges

    }
  }
}
