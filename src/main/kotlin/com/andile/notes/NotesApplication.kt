package com.andile.notes

import com.andile.notes.model.Notes
import com.andile.notes.repository.NotesRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class NotesApplication

fun main(args: Array<String>) {
	runApplication<NotesApplication>(*args)

	@Component
	class DataInitializer(val repository: NotesRepository) : ApplicationRunner {

		@Throws(Exception::class)
		override fun run(args: ApplicationArguments) {
			listOf("Note 1", "Note 2", "Note 3").forEach {
				repository.save(Notes(text = it, user = "user"))
			}
			repository.findAll().forEach { println(it) }
		}
	}
}
