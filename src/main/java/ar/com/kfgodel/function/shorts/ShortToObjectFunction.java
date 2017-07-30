package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToObjectFunction<T> extends Function<Short, T> {

  T apply(short input);

  @Override
  default T apply(Short input){
    return apply(input.shortValue());
  }
}
