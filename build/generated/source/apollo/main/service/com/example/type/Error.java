// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.type;

import java.lang.String;

/**
 * Чтобы понять какая придёт, смотри описание метода API
 */
public enum Error {
  NOT_FOUND("NOT_FOUND"),

  VALIDATION("VALIDATION"),

  INVALID_CREDENTIALS("INVALID_CREDENTIALS"),

  ALREADY_EXIST("ALREADY_EXIST"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  Error(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static Error safeValueOf(String rawValue) {
    for (Error enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return Error.$UNKNOWN;
  }
}
