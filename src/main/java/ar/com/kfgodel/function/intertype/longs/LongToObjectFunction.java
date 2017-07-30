package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToObjectFunction<T> extends Function<Long, T> {

  T apply(long input);

  @Override
  default T apply(Long input){
    return apply(input.longValue());
  }
}
