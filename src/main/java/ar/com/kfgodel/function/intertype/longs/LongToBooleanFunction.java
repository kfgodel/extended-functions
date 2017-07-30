package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface LongToBooleanFunction extends Function<Long, Boolean> {

  boolean apply(long aBoolean);

  @Override
  default Boolean apply(Long aBoolean){
    return this.apply(aBoolean.longValue());
  }

}
