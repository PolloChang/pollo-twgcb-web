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
        render view: '/twGcb/index', model: [twgcbL: pFilterResult.getDomainList() as List<Twgcb>, totalCount: pFilterResult.getTotalCount()], params:params
    }

    /**
     * 資料檢視頁面
     */
    def viewTwgcb(){
        PFilterResult pFilterResult = twGcbService.filter(params, PFilterType.VIEW)
        Twgcb twgcbI = pFilterResult.getDomainList().first() as Twgcb
        twgcbI?.instructions = twgcbI?.instructions?.replaceAll('\n', '<br/>')
        twgcbI?.explanation = twgcbI?.explanation?.replaceAll('\n', '<br/>')
        render view: '/twGcb/viewTwgcb', model: [twgcbI: twgcbI]
    }
}
