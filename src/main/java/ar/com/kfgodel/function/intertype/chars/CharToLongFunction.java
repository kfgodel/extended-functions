package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToLongFunction extends Function<Character, Long> {

  long apply(char input);

  @Override
  default Long apply(Character input){
    return apply(input.charValue());
  }
}
