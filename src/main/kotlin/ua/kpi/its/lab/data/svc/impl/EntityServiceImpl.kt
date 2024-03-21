package ua.kpi.its.lab.data.svc.impl


import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.SoftwareProduct
import ua.kpi.its.lab.data.entity.SoftwareModule
import ua.kpi.its.lab.data.repo.SoftwareProductRepository
import ua.kpi.its.lab.data.repo.SoftwareModuleRepository
import ua.kpi.its.lab.data.svc.SoftwareProductService
import ua.kpi.its.lab.data.svc.SoftwareModuleService

@Service
class SoftwareProductServiceImpl(private val repo: SoftwareProductRepository) : SoftwareProductService {
    override fun create(softwareProduct: SoftwareProduct) = repo.save(softwareProduct)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(softwareProduct: SoftwareProduct) = repo.save(softwareProduct)
    override fun delete(id: Long) = repo.deleteById(id)
}

@Service
class SoftwareModuleServiceImpl(private val repo: SoftwareModuleRepository) : SoftwareModuleService {
    override fun create(softwareModule: SoftwareModule) = repo.save(softwareModule)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(softwareModule: SoftwareModule) = repo.save(softwareModule)
    override fun delete(id: Long) = repo.deleteById(id)
}