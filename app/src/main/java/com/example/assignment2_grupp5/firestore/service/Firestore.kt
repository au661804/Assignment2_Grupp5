package com.example.assignment2_grupp5.firestore.service

class Firestore() {
    // Root collection name
    val COLLECTION_NAME = "contacts"

    // Document ID
    val DOCUMENT_ID = "document_id"

    // Document field names
    val FIELD_FIRST_NAME = "first_name"
    val FIELD_LAST_NAME = "last_name"
    val FIELD_EMAIL = "email"

    // To prevent someone from accidentally instantiating the contract 		class, make the constructor private
    private fun ContactsFirestoreDbContract() {}
}