package work.pollochang.twgcb

import work.pollochang.util.PFilterResult
import work.pollochang.util.PFilterType

/**
 * TWGCB 功能
 */
class TwGcbController {

    def twGcbService

    /**
     * 查尋功能
     */
    def index() {

        PFilterResult pFilterResult = twGcbService.filter(params, PFilterType.QUICK)
        List<Twgcb> twgcbL = pFilterResult.getDomainList() as List<Twgcb>
        long totalCount = pFilterResult.getTotalCount()

        render view: "/twGcb/index", model: [twgcbL: twgcbL, totalCount: totalCount], params:params
    }

    /**
     *
     * @return
     */
    def viewTwgcb(){
        PFilterResult pFilterResult = twGcbService.filter(params, PFilterType.VIEW)
        List<Twgcb> twgcbL = pFilterResult.getDomainList() as List<Twgcb>
        Twgcb twgcbI = twgcbL[0]
        twgcbI?.instructions = twgcbI?.instructions?.replaceAll("\n", "<br/>")
        twgcbI?.explanation = twgcbI?.explanation?.replaceAll("\n", "<br/>")
        render view: "/twGcb/viewTwgcb", model: [twgcbI: twgcbI]
    }
}
