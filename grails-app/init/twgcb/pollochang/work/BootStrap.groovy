package twgcb.pollochang.work

/**
 * BootStrap 類用於在 Grails 應用啟動和關閉時執行特定的邏輯。
 */
class BootStrap {

    /**
     * 在 Grails 應用啟動時執行的初始化方法。
     *
     * @param servletContext servlet 上下文物件
     */
    def init = { servletContext ->
        // 在此處添加初始化邏輯，例如預加載數據等
    }

    /**
     * 在 Grails 應用關閉時執行的銷毀方法。
     */
    def destroy = {
        // 在此處添加銷毀邏輯，例如釋放資源等
    }

}
