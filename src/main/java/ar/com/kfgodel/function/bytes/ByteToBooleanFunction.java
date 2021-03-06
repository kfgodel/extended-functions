package ar.com.kfgodel.function.bytes;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface ByteToBooleanFunction extends Function<Byte, Boolean> {

  boolean apply(byte aBoolean);

  @Override
  default Boolean apply(Byte aBoolean){
    return this.apply(aBoolean.byteValue());
  }

}
