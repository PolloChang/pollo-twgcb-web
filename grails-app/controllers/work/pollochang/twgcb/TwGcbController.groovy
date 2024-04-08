package work.pollochang.twgcb

/**
 * TWGCB 功能
 */
class TwGcbController {

    def twGcbService

    /**
     * 查尋功能
     */
    def index() {
        List<Twgcb> twgcbL = twGcbService.filter(params)

        render view: "/twGcb/index", model: [twgcbL: twgcbL], params:params
    }
}
