package ar.com.kfgodel.function.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToFloatFunction extends Function<Long, Float> {

  float apply(long input);

  @Override
  default Float apply(Long input){
    return apply(input.longValue());
  }
}
