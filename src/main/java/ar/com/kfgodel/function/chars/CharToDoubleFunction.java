package ar.com.kfgodel.function.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToDoubleFunction extends Function<Character, Double> {

  double apply(char input);

  @Override
  default Double apply(Character input){
    return apply(input.charValue());
  }
}
