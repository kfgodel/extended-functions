package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToCharFunction extends Function<Long, Character> {

  char apply(long input);

  @Override
  default Character apply(Long input){
    return apply(input.longValue());
  }
}
