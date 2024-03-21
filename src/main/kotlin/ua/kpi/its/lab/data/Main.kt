package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.entity.SoftwareProduct
import ua.kpi.its.lab.data.entity.SoftwareModule
import ua.kpi.its.lab.data.svc.impl.SoftwareModuleServiceImpl
import ua.kpi.its.lab.data.svc.impl.SoftwareProductServiceImpl
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext("ua.kpi.its.lab.data")
    //context.refresh()
    val productService = context.getBean(SoftwareProductServiceImpl::class.java)
    val moduleService = context.getBean(SoftwareModuleServiceImpl::class.java)

    // Створюємо 5 продуктів та додаткові модулі
    val product1 = SoftwareProduct(
        name = "Product 1",
        developer = "Developer 1",
        version = "1.0.1",
        releaseDate = Date(),
        distributionSize = 1000L,
        bitness = 64,
        crossPlatform = true
    )
    val product2 = SoftwareProduct(
        name = "Product 2",
        developer = "Developer 2",
        version = "1.0.2",
        releaseDate = Date(),
        distributionSize = 2000L,
        bitness = 64,
        crossPlatform = true
    )
    val product3 = SoftwareProduct(
        name = "Product 3",
        developer = "Developer 3",
        version = "1.0.3",
        releaseDate = Date(),
        distributionSize = 3000L,
        bitness = 64,
        crossPlatform = true
    )
    val product4 = SoftwareProduct(
        name = "Product 4",
        developer = "Developer 4",
        version = "1.0.4",
        releaseDate = Date(),
        distributionSize = 4000L,
        bitness = 64,
        crossPlatform = true
    )
    val product5 = SoftwareProduct(
        name = "Product 5",
        developer = "Developer 5",
        version = "1.0.5",
        releaseDate = Date(),
        distributionSize = 5000L,
        bitness = 64,
        crossPlatform = true
    )
    productService.create(product1)
    productService.create(product2)
    productService.create(product3)
    productService.create(product4)
    productService.create(product5)



    println("Retrieved product: $product3")

// Видаляємо продукт з індексом 4
    productService.delete(4)
}