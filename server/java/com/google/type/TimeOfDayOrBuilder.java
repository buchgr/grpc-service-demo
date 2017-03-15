// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/timeofday.proto

package com.google.type;

public interface TimeOfDayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.TimeOfDay)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>int32 hours = 1;</code>
   */
  int getHours();

  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 minutes = 2;</code>
   */
  int getMinutes();

  /**
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>int32 seconds = 3;</code>
   */
  int getSeconds();

  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>int32 nanos = 4;</code>
   */
  int getNanos();
}
