package com.clouway.common.logging

import java.time.Instant

/**
 * LoggingRequest is an request that holds the needed logging information.
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
interface LoggingRequest {

  /**
   * Gets the start time of the request.
   */
  fun startTime(): Instant

  /**
   * Gets the traceId of the request.
   */
  fun traceId(): String?

  /**
   * Gets the spanId of the request.
   */
  fun spanId(): String?

  /**
   * Gets path information of the request
   */
  fun pathInfo(): String

  /**
   * Gets user agent information from the request.
   */
  fun userAgent(): String

  /**
   * Gets method from the request.
   */
  fun requestMethod(): String
}