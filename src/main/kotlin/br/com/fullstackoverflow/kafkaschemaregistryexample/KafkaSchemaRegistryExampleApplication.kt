package br.com.fullstackoverflow.kafkaschemaregistryexample

import br.com.fullstackoverflow.kafkaschemaregistryexample.entity.Pessoa
import br.com.fullstackoverflow.kafkaschemaregistryexample.producer.PessoaProducerImp
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaSchemaRegistryExampleApplication(
	val pessoaProducerImp: PessoaProducerImp
): ApplicationRunner{
	override fun run(args: ApplicationArguments?) {
		val pessoa = Pessoa("João Caboclo ", "Silva Filho")
		//Thread.sleep(5000)
		pessoaProducerImp.persist("654321", pessoa)
	}

}

fun main(args: Array<String>) {
	runApplication<KafkaSchemaRegistryExampleApplication>(*args)
}
