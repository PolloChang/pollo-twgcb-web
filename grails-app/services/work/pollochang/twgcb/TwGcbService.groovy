package work.pollochang.twgcb

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap
import org.hibernate.criterion.CriteriaSpecification
import org.hibernate.type.StandardBasicTypes
import work.pollochang.util.PFilterResult
import work.pollochang.util.PFilterType

/**
 * TWGCB 資料處理
 */
@Transactional
class TwGcbService {

    /**
     * 查詢
     * @param params
     * @param filterType
     * @return 查詢結果
     */
    PFilterResult filter(
            GrailsParameterMap params,
            PFilterType filterType = PFilterType.DEFAULT
    ) {
        PFilterResult pFilterResult = new PFilterResult()

        params.max = (params.max ?: '10').toInteger()
        params.offset = (params?.offset ?: '0').toInteger()

        List<Twgcb> twgcbList =  Twgcb.createCriteria().list(params) {
            resultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP)

            switch (filterType) {
                case PFilterType.QUICK:
                    Closure projection = (Closure) quickProjection.clone()
                    projection.delegate = delegate
                    projection()
                    break
                case PFilterType.FULL:
                    Closure projection = (Closure) fullProjection.clone()
                    projection.delegate = delegate
                    projection()
                    break
                case PFilterType.VIEW:
                    Closure projection = (Closure) viewProjection.clone()
                    projection.delegate = delegate
                    projection()
                    break
                default:
                    Closure projection = (Closure) defaultProjection.clone()
                    projection.delegate = delegate
                    projection()
            }

            params.each { key, value ->
                if(value){
                    switch (key) {
                        case 'twgcbId':
                            eq('twgcbId', value)
                            break
                        case 'type':
                            eq('type',value as int)
                            break
                        case 'id':
                            eq('id', value as long)
                            break
                        case 'cname':
                            ilike('cname', "%${value}%")
                            break
                    }
                }
            }

            order('twgcbId', 'asc')
        } as List<Twgcb>

        pFilterResult.domainList = twgcbList
        pFilterResult.totalCount = twgcbList.totalCount?:0

        return pFilterResult

    }

    /**
     * 快速顯示欄位
     */
    private Closure quickProjection =  {
        projections {
            property('id', 'id')
            property('twgcbId', 'twgcbId')
            property('cname', 'cname')
            property('typeDesc', 'typeDesc')
        }
    }

    /**
     * 完整顯示欄位
     */
    private Closure fullProjection =  {
        projections {
            property('id', 'id')
            property('twgcbId', 'twgcbId')
            property('cname', 'cname')
            property('type', 'type')
            property('explanation', 'explanation')
            property('instructions', 'instructions')
            property('defaultValue', 'defaultValue')
            property('remark', 'remark')
            property('typeDesc', 'typeDesc')
        }
    }

    /**
     * 檢視單筆資料欄位
     */
    private Closure viewProjection =  {
        projections {
            property('id', 'id')
            property('twgcbId', 'twgcbId')
            property('cname', 'cname')
            property('explanation', 'explanation')
            property('instructions', 'instructions')
            property('defaultValue', 'defaultValue')
            property('remark', 'remark')
            property('typeDesc', 'typeDesc')
        }
    }

    /**
     * 預設顯示欄位
     */
    private Closure defaultProjection =  {
        projections {
            property('twgcbId', 'twgcbId')
            property('cname', 'cname')
            sqlProjection("(select t.cdesc from bs_select t where t.type = 'twgcb_type' and t.code = this_.type ) typeDesc", ['typeDesc'], [StandardBasicTypes.STRING])
        }
    }
}
