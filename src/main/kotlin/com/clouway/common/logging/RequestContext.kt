package com.clouway.common.logging

/**
 * RequestContext is part of the Logging API which provides a mechanism of Per-Request logging.
 * 
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
object RequestContext {
  private val requests = ThreadLocal<LoggingRequest>()
  private val responses = ThreadLocal<LoggingResponse>()

  /**
   * Called when entering the request scope. This method should be called when requests start.
   */
  fun enterScope(request: LoggingRequest) {
    requests.set(request)
  }

  /**
   * Called when exiting the request scope. This method should be called when requests end.
   */
  fun exitScope(response: LoggingResponse) {
    responses.set(response)
  }

  /**
   * Gets the logging request associated with the current thread. Note that this method will mostly be used internally.
   */
  fun getRequest(): LoggingRequest? {
    return requests.get()
  }

  /**
   * Gets the logging response associated with the current thread. Note that this method will mostly be used internally.
   */
  fun getResponse(): LoggingResponse? {
    return responses.get()
  }

  /**
   * Releases state associated with the current thread.
   */
  fun release() {
    requests.remove()
    responses.remove()
  }
}