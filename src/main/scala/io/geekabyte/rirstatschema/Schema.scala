package io.geekabyte.rirstatschema

import scala.io.Source

object Schema {
  def schema = Source.fromResource("rir_statistic_exchange_schema.json")
  def extendedSchema = Source.fromResource("rir_statistic_extended_exchange_schema.json")
}
