package controllers

import conf.{AllGoodCachedHealthCheck, NeverExpiresSingleHealthCheck}
import play.api.libs.ws.WSClient

class HealthCheck(override val wsClient: WSClient) extends AllGoodCachedHealthCheck(
  wsClient,
  9007,
  NeverExpiresSingleHealthCheck("/discussion/p/37v3a"))
