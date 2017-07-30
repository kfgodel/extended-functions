package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToFloatFunction extends Function<Boolean, Float> {

  float apply(boolean input);

  @Override
  default Float apply(Boolean input){
    return apply(input.booleanValue());
  }
}
