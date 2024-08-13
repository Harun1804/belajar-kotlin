package org.example.Exercise

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true) {
}
data class Name(val name: String, val last: String) {}
data class Address(val street: String, val city: City) {
}
data class City(val city: String, val country: String) {}