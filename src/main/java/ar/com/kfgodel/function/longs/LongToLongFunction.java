package ar.com.kfgodel.function.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToLongFunction extends Function<Long, Long> {

  long apply(long input);

  @Override
  default Long apply(Long input){
    return apply(input.longValue());
  }
}
