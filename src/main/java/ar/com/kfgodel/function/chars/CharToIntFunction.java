package ar.com.kfgodel.function.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToIntFunction extends Function<Character, Integer> {

  int apply(char input);

  @Override
  default Integer apply(Character input){
    return apply(input.charValue());
  }
}
