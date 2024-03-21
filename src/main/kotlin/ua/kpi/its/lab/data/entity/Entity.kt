package ua.kpi.its.lab.data.entity

import jakarta.persistence.*
import java.util.*


@Entity
data class SoftwareProduct(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    val name: String,
    val developer: String,
    val version: String,
    val releaseDate: Date,
    val distributionSize: Long,
    val bitness: Int,
    val crossPlatform: Boolean,

    @OneToMany(mappedBy = "softwareProduct")
    val modules: List<SoftwareModule> = emptyList()
) : Comparable<SoftwareProduct> {
    override fun compareTo(other: SoftwareProduct): Int {
        val nameComparison = name.compareTo(other.name)
        return if (nameComparison != 0) nameComparison else id.compareTo(other.id)
    }
}

@Entity
data class SoftwareModule(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    val description: String,
    val author: String,
    val language: String,
    val lastEditDate: Date,
    val size: Long,
    val linesOfCode: Int,
    val crossPlatform: Boolean,

    @ManyToOne
    @JoinColumn(name = "software_product_id")
    val softwareProduct: SoftwareProduct
)