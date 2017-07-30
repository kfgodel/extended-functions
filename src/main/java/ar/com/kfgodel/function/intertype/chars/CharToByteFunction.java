package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToByteFunction extends Function<Character, Byte> {

  byte apply(char input);

  @Override
  default Byte apply(Character input){
    return apply(input.charValue());
  }
}
