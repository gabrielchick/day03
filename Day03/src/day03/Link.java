
public class Link {

   // Accept any object that implements the Damagable interface
   public void hit(Damagable d) {
      d.damage(5);
   }

}

// public void hit(Monster m) {
// m.damage(5);
// }
// public void hit(Box b) {
// b.setIntegrity(b.getIntegrity() - 5);
// }
// We want to identify by traits/attributes instead of type, when trying to
// allow Link to damage things. We use Interface to help us here.
// Interface is a trait we attach to a class, it can allow us to damage any
// object, without having to identify the object.
// For example, a start-stop-reverse interface allows us to interact with all
// cars regardless of their type.
// PROGRAMMING BY CONTRACT: which means all start, stop, reverse methods MUST be
// used when having the interface.
// INTERFACE IS DEFINITION OF METHODS. This is made in a separate file, that
// also needs its own packages etc

// CLASS: can instantiate (new), but interface
// CLASS: can text end one class, but multiple interfaces can be implemented to
// grant many attributes

// If too many objects, Link starts to get too overloaded, then need to keep
// changing the file when adding new things
// If we assign a narrow class to wider class, the narrow class loses its
// properties (e.g. toyota and car example)
// Java only allows inheritance from 1 class