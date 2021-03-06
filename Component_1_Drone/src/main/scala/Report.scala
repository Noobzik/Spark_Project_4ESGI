import net.liftweb.json._
import net.liftweb.json.Serialization.write

/**
 * A report
 * @constructor Create a report with the given parameters
 * @param date A date in String format
 * @param drone_id A drone ID
 * @param position A geographic position in (double, double)
 * @param citizenInVicinity A list of citizen in the vicinity of the drone
 * @param words A list of word heard by the drone
 */
class Report (val date : String,
              val drone_id : Int,
              val position: (Double, Double),
              val citizenInVicinity : List[(String, Int)],
              val words : List[String]) {

  /**
   * Overrides the function toString in order to print the report
   * in a csv format (might later be a json format)
   * @return
   */
  override def toString: String = {
    drone_id + ";" +
      date + ";" +
      position._1 + "," + position._2 + ";" +
      citizenInVicinity.mkString(",") + ";" +
      words.mkString(",")
  }

  /**
   * Convert the class Report into a JSON formatted String
   * @return JSon String
   */
  def toJson: String = {
    implicit val formats = DefaultFormats
    write(this)
  }

}