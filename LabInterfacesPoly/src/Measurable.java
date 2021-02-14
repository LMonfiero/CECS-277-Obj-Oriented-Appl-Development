/**
   Describes any class whose objects can be measured.
*/
import java.util.Collection;

public interface Measurable// extends Comparable
{
   /**
      Computes the measure of the object.
      @return the measure
   */
   double getMeasure();
}
