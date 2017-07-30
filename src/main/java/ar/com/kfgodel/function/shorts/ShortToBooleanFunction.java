package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface ShortToBooleanFunction extends Function<Short, Boolean> {

  boolean apply(short aBoolean);

  @Override
  default Boolean apply(Short aBoolean){
    return this.apply(aBoolean.shortValue());
  }

}
