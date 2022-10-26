//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.6.2'.
//
package com.example.type;

import com.apollographql.apollo3.api.EnumType;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;

/**
 * Чтобы понять какая придёт, смотри описание метода API
 */
public class Error {
  public static EnumType type = new EnumType("Error", Arrays.asList("NOT_FOUND", "VALIDATION", "INVALID_CREDENTIALS", "ALREADY_EXIST"));

  public static Error NOT_FOUND = new Error("NOT_FOUND");

  public static Error VALIDATION = new Error("VALIDATION");

  public static Error INVALID_CREDENTIALS = new Error("INVALID_CREDENTIALS");

  public static Error ALREADY_EXIST = new Error("ALREADY_EXIST");

  public String rawValue;

  public Error(String rawValue) {
    this.rawValue = rawValue;
  }

  public static Error safeValueOf(String rawValue) {
    switch(rawValue) {
      case "NOT_FOUND": return Error.NOT_FOUND;
      case "VALIDATION": return Error.VALIDATION;
      case "INVALID_CREDENTIALS": return Error.INVALID_CREDENTIALS;
      case "ALREADY_EXIST": return Error.ALREADY_EXIST;
      default: return new Error.UNKNOWN__(rawValue);
    }
  }

  /**
   * An enum value that wasn't known at compile time.
   */
  public static class UNKNOWN__ extends Error {
    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    private transient volatile String $toString;

    public UNKNOWN__(String rawValue) {
      super(rawValue);
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof UNKNOWN__) {
        return true;
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "UNKNOWN__{"
          + "}";
      }
      return $toString;
    }
  }
}