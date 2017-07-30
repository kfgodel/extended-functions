package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToFloatFunction extends Function<Character, Float> {

  float apply(char input);

  @Override
  default Float apply(Character input){
    return apply(input.charValue());
  }
}
