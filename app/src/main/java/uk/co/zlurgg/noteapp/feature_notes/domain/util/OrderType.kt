package uk.co.zlurgg.noteapp.feature_notes.domain.util

sealed class OrderType {
    data object Ascending: OrderType()
    data object Descending: OrderType()
}
