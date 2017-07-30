package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface LongToBooleanFunction extends Function<Integer, Boolean> {

  boolean apply(long aBoolean);

  @Override
  default Boolean apply(Integer aBoolean){
    return this.apply(aBoolean.intValue());
  }

}
