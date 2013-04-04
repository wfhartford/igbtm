package ca.cutterslade.igbtm.user;

import ca.cutterslade.igbtm.util.Util;

import com.google.common.collect.ImmutableList;

public class ListNames {
  public static void main(final String[] args) {
    System.out.println(list(args));
  }

  static ImmutableList<String> list(final String... args) {
    return Util.list(args);
  }
}
