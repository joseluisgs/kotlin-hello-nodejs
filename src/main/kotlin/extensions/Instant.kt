package extensions

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun Instant.toLocalDateTime(): String = this.toLocalDateTime(TimeZone.currentSystemDefault()).toString()