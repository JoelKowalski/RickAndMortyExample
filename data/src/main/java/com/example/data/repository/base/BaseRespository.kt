package com.example.data.repository.base

abstract class BaseRepository {
    abstract val local: LocalRepository
    abstract val remote: RemoteRepository
}

abstract class LocalRepository
abstract class RemoteRepository