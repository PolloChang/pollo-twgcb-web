package work.pollochang.twgcb

/**
 * UrlMappings 類定義了 Grails 應用的 URL 對應配置。
 */
class UrlMappings {
    static mappings = {
        // 預設的 URL 對應規則，匹配控制器、動作和參數
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // 在這裡應用約束條件
            }
        }

        // 根路徑的對應，將請求重定向到 twGcb 控制器的 index 動作
        '/'(controller: 'twGcb', action: 'index')

        // 500 錯誤頁面的對應
        '500'(view:'/error')

        // 404 頁面未找到的對應
        '404'(view:'/notFound')
    }
}
