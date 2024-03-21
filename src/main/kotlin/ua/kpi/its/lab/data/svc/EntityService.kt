package ua.kpi.its.lab.data.svc



import ua.kpi.its.lab.data.entity.SoftwareProduct
import ua.kpi.its.lab.data.entity.SoftwareModule

interface SoftwareProductService {
    fun create(softwareProduct: SoftwareProduct): SoftwareProduct
    fun retrieve(id: Long): SoftwareProduct?
    fun update(softwareProduct: SoftwareProduct): SoftwareProduct
    fun delete(id: Long)
}

interface SoftwareModuleService {
    fun create(softwareModule: SoftwareModule): SoftwareModule
    fun retrieve(id: Long): SoftwareModule?
    fun update(softwareModule: SoftwareModule): SoftwareModule
    fun delete(id: Long)
}