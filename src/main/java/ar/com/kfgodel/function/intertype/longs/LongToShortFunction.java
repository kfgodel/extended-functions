package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToShortFunction extends Function<Long, Short> {

  short apply(long input);

  @Override
  default Short apply(Long input){
    return apply(input.longValue());
  }
}
