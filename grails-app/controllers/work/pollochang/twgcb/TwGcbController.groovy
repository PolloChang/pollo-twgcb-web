package work.pollochang.twgcb

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
        List<Twgcb> twgcbL = twGcbService.filter(params, PFilterType.FULL)

        render view: "/twGcb/index", model: [twgcbL: twgcbL], params:params
    }
}
