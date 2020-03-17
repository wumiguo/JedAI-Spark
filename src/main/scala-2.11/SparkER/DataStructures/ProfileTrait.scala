package SparkER.DataStructures

/**
  * Trait of a profile.
  *
  * @author Giovanni Simonini*
  * @since 2016/12/07
  */
trait ProfileTrait {
  /** Autogenerated identificator */
  val id: Int
  /** List of key-value attributes */
  val attributes: scala.collection.mutable.MutableList[KeyValue]
  /** Original ID */
  val originalID: String

  val sourceId: Int

  /**
    * Given a key return the value concatenated by the space of all attributes with that key
    *
    * @param key       key that values to retrieve have
    * @param separator if multiple values have this key the string to use to join them
    **/
  def getAttributeValues(key: String, separator: String = " "): String = {
    attributes.filter(_.key.equals(key)).map(_.value).mkString(separator)
  }
}