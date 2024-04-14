package work.pollochang.twgcb

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap
import org.hibernate.criterion.CriteriaSpecification
import org.hibernate.type.StandardBasicTypes
import work.pollochang.util.PFilterResult
import work.pollochang.util.PFilterType


@Transactional
class TwGcbService {

    PFilterResult filter(
            GrailsParameterMap params,
            PFilterType filterType = PFilterType.DEFAULT
    ) {
        PFilterResult pFilterResult = new PFilterResult()

        params.max = (params.max ?: "10").toInteger()
        params.offset = (params?.offset ?: "0").toInteger()

        List<Twgcb> twgcbList =  Twgcb.createCriteria().list(params) {
            resultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP)

            switch (filterType) {
                case PFilterType.QUICK:
                    projections {
                        property("id", "id")
                        property("twgcbId", "twgcbId")
                        property("cname", "cname")
                        property("typeDesc", "typeDesc")
//                        sqlProjection("(select t.cdesc from bs_select t where t.type = 'twgcb_type' and t.code = this_.type ) typeDesc", ['typeDesc'], [StandardBasicTypes.STRING])
                    }
                    break
                case PFilterType.FULL:
                    projections {
                        property("id", "id")
                        property("twgcbId", "twgcbId")
                        property("cname", "cname")
                        property("type", "type")
                        property("explanation", "explanation")
                        property("instructions", "instructions")
                        property("defaultValue", "defaultValue")
                        property("remark", "remark")
                        property("typeDesc", "typeDesc")
//                        sqlProjection("(select t.cdesc from bs_select t where t.type = 'twgcb_type' and t.code = this_.type ) typeDesc", ['typeDesc'], [StandardBasicTypes.STRING])
                    }
                    break
                case PFilterType.VIEW:
                    projections {
                        property("id", "id")
                        property("twgcbId", "twgcbId")
                        property("cname", "cname")
                        property("explanation", "explanation")
                        property("instructions", "instructions")
                        property("defaultValue", "defaultValue")
                        property("remark", "remark")
                        property("typeDesc", "typeDesc")
//                        sqlProjection("(select t.cdesc from bs_select t where t.type = 'twgcb_type' and t.code = this_.type ) typeDesc", ['typeDesc'], [StandardBasicTypes.STRING])
                    }
                    break
                default:
                    projections {
                        property("twgcbId", "twgcbId")
                        property("cname", "cname")
                        sqlProjection("(select t.cdesc from bs_select t where t.type = 'twgcb_type' and t.code = this_.type ) typeDesc", ['typeDesc'], [StandardBasicTypes.STRING])
                    }
            }

            if(params?.twgcbId){
                eq('twgcbId',params?.twgcbId)
            }

            if(params?.type){
                int type = params?.type as int
                eq('type',type)
            }

            if(params?.cname){
                ilike('cname', "%${params?.cname}%")
            }

            order("twgcbId", "asc")
        } as List<Twgcb>

        pFilterResult.domainList = twgcbList
        pFilterResult.totalCount = twgcbList.totalCount

        return pFilterResult

    }
}
