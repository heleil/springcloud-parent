package entity

import java.util.Date

import com.czjk.api.Constants
import com.czjk.api.time.DateUtils


case class User(
                 userid: Long,
                 username: String,
                 password: String,
                 gender: Short,
                 telephone: String,
                 email: String,
                 birthday: String,
                 idcard: String,
                 registerTime: Date,
                 province: String,
                 city: String,
                 clientType: Int) extends Serializable

object User {
  def lineUser(line: String): User = {
    val fields = line.split(Constants.FILE_FILELD_SEPARATOR)
    if(fields == null || fields.length !=12) {
      User(-1, null, null, 0.toShort, null, null, null, null, null, null, null, 0)
    }else{
      val userid = fields(Constants.INDEX_USER_ID).toLong
      val username = fields(Constants.INDEX_USER_NAME)
      val password = fields(Constants.INDEX_USER_PASSWORD)
      val gender = if(fields(Constants.INDEX_USER_GENDER).toBoolean) 1.toShort else 0.toShort
      val telephone = fields(Constants.INDEX_USER_TELEPHONE)
      val email = fields(Constants.INDEX_USER_EMAIL)
      val birthday = fields(Constants.INDEX_USER_BIRTHDAY)
      val idcard = fields(Constants.INDEX_USER_ID_CARD)
      val registerTime = DateUtils.parseTime(fields(Constants.INDEX_USER_REGISTER_TIME))
      val province = fields(Constants.INDEX_USER_PROVINCE)
      val city = fields(Constants.INDEX_USER_CITY)
      val clientType = fields(Constants.INDEX_USER_CLIENT_TYPE).toInt
      User(userid, username, password, gender, telephone, email, birthday, idcard, registerTime, province, city, clientType)
    }
  }

}
