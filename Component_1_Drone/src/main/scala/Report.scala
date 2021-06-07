import org.joda.time.DateTime

class Report (val date : DateTime,
              val id : Int,
              val position: (Double, Double),
              val citizenInVicinity : List[String],
              val words : List[String]) {

  /**
   * Overrides the function toString in order to print the report
   * in a csv format (might later be a json format)
   * @return
   */
  override def toString: String = {
    id + ";" +
      date + ";" +
      position + ";" +
      citizenInVicinity.mkString + ";" //+
     // words.mkString
  }

}
