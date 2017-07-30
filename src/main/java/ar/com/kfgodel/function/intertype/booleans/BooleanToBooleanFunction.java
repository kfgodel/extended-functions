package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface BooleanToBooleanFunction extends Function<Boolean, Boolean> {

  boolean apply(boolean aBoolean);

  @Override
  default Boolean apply(Boolean aBoolean){
    return this.apply(aBoolean.booleanValue());
  }

}
