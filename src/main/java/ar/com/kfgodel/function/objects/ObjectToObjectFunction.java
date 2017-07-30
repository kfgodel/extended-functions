package ar.com.kfgodel.function.objects;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ObjectToObjectFunction<I, O> extends Function<I, O> {

  O apply(I input);

}
