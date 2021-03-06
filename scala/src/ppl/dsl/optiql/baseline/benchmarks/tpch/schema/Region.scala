package ppl.dsl.optiql.baseline.benchmarks.tpch.schema

import collection.mutable.ArrayBuffer
import ppl.dsl.optiql.baseline.containers.DataTable


class Region (
  val r_regionkey: Int,
  val r_name: String,
  val r_comment: String
)

class RegionTable extends DataTable[Region] {



  def addRecord(fs: Array[String]) {
    assert(fs.size == 3, "Expecting 3 fields, got: " + fs)
    val record = new Region(fs(0),fs(1),fs(2))
    data.append(record)
  }

  def instantiateTable() = new RegionTable


}