package ca.cutterslade.igbtm.util;

import com.google.common.collect.ImmutableList;

public class Util {
  public static <T> ImmutableList<T> list(final T... values) {
    return ImmutableList.copyOf(values);
  }
}
