package com.clouway.common.logging

/**
 * LoggingResponse is a response object which contains the basic information that could be used for logging of
 * response requests.
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
interface LoggingResponse {

  /**
   * The status of the response. In most cases this will be the HTTP status of the HTTP request.
   */
  fun status(): Int

  /**
   * The length of the response in bytes.
   */
  fun length(): Long
}