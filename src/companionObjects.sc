/**
 * Created with IntelliJ IDEA.
 * User: Babalu
 * Date: 8/14/13
 * Time: 10:19 PM
 * To change this template use File | Settings | File Templates.
 */

// A singleton object that shares the same name with a class defined in the same source file.
// Companion objects and classes have access to each other’s private members. In addition, any implicit conversions defined in the companion object will be in scope anywhere the class is used.
// One common use of companion objects is to implement factory methods.

// customary to make constructor private since we only want Factory to create it
class Play private
(
  player: String,
  description: List[String]) {
  println("description:", description)
}


// Factory method for Play
object Play {
  //contains all static members, implement factory method
  def callPlay(playerName: String, playOptions: List[String]): Play =
    new Play(playerName, playOptions)
}

// In this class you can both instantiate Play and call Play() or call the
// Play() constructor on the companion object directly, like this:

var aPlay : Play = new Play("MJ", List("Triangle Offense", "Post Up"));

Play.callPlay("MJ", List("Triangle Offense", "Post Up"));