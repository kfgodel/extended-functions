package ar.com.kfgodel.function.chars;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface CharToBooleanFunction extends Function<Character, Boolean> {

  boolean apply(char aBoolean);

  @Override
  default Boolean apply(Character aBoolean){
    return this.apply(aBoolean.charValue());
  }

}
