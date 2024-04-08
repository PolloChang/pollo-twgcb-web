package work.pollochang.twgcb

import grails.gorm.transactions.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class TwGcbService {

    List<Twgcb> filter(GrailsParameterMap params) {
        params.max = (params.limit ?: "10").toInteger()
        params.offset = (params?.offset ?: "0").toInteger()

        return Twgcb.createCriteria().list(params) {
            if(params?.twgcbId){
                eq('twgcbId',params?.twgcbId)
            }

            order("twgcbId", "asc")
        } as List<Twgcb>


    }
}
