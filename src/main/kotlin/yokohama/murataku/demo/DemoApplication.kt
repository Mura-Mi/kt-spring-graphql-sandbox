package yokohama.murataku.demo

import graphql.Scalars
import graphql.schema.GraphQLObjectType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import graphql.schema.GraphQLSchema

@SpringBootApplication
class DemoApplication {
    @Bean
    fun schema(): GraphQLSchema {
        return GraphQLSchema.newSchema().query(GraphQLObjectType.newObject()
                .name("query")
                .field { field ->
                    field
                            .name("test")
                            .type(Scalars.GraphQLString)
                }
                .build()).build()
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
