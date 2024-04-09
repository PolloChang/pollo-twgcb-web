package work.pollochang.twgcb

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap
import org.hibernate.criterion.CriteriaSpecification
import org.hibernate.type.StandardBasicTypes
import work.pollochang.util.PFilterType


@Transactional
class TwGcbService {

    List<Twgcb> filter(
            GrailsParameterMap params,
            PFilterType filterType = PFilterType.DEFAULT
    ) {
        params.max = (params.limit ?: "10").toInteger()
        params.offset = (params?.offset ?: "0").toInteger()
        return Twgcb.createCriteria().list(params) {
            resultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP)

            switch (filterType) {
                case PFilterType.QUICK:
                    projections {
                        property("twgcbId", "twgcbId")
                        property("cname", "cname")
                        sqlProjection("(select t.cdesc from bs_select t where t.type = 'twgcb_type' and t.code = this_.type ) typeDesc", ['typeDesc'], [StandardBasicTypes.STRING])
                    }
                    break
                case PFilterType.FULL:
                    projections {
                        property("twgcbId", "twgcbId")
                        property("cname", "cname")
                        property("type", "type")
                        property("explanation", "explanation")
                        property("instructions", "instructions")
                        property("defaultValue", "defaultValue")
                        property("remark", "remark")
                        sqlProjection("(select t.cdesc from bs_select t where t.type = 'twgcb_type' and t.code = this_.type ) typeDesc", ['typeDesc'], [StandardBasicTypes.STRING])
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

            order("twgcbId", "asc")
        } as List<Twgcb>


    }
}
