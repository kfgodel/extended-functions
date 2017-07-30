package ar.com.kfgodel.function.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToObjectFunction<T> extends Function<Character, T> {

  T apply(char input);

  @Override
  default T apply(Character input){
    return apply(input.charValue());
  }
}
