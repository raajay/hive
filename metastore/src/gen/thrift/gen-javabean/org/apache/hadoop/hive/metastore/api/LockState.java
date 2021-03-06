/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum LockState implements org.apache.thrift.TEnum {
  ACQUIRED(1),
  WAITING(2),
  ABORT(3),
  NOT_ACQUIRED(4);

  private final int value;

  private LockState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static LockState findByValue(int value) { 
    switch (value) {
      case 1:
        return ACQUIRED;
      case 2:
        return WAITING;
      case 3:
        return ABORT;
      case 4:
        return NOT_ACQUIRED;
      default:
        return null;
    }
  }
}
