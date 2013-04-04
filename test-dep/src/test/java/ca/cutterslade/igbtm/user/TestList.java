package ca.cutterslade.igbtm.user;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class TestList {

  @Test
  public void testList() {
    Assert.assertEquals(ImmutableList.of("bob", "doug"), ListNames.list("bob", "doug"));
  }
}
