package ar.com.kfgodel.function.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToCharFunction extends Function<Character, Character> {

  char apply(char input);

  @Override
  default Character apply(Character input){
    return apply(input.charValue());
  }
}
