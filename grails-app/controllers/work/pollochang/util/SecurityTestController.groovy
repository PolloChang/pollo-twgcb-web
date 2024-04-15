package work.pollochang.util

/**
 * 安全元件測試
 */
class SecurityTestController {

    def index() {
        String actionType = params?.actionType
        String strToEncrypt = params?.strToEncrypt
        String strToDecrypt = params?.strToDecrypt
        String secret = params?.secret

        log.debug('actionType = ' + actionType)
        log.debug('strToEncrypt = ' + strToEncrypt)
        log.debug('strToDecrypt = ' + strToDecrypt)
        log.debug('secret = ' + secret)

        String returnVal

        switch (actionType){
            case '0': //加密
                log.debug('加密')
                returnVal = PAes.encrypt(strToEncrypt, secret)
                break
            case '1': //解密
                log.debug('解密')
                returnVal = PAes.decrypt(strToDecrypt, secret)
                break
            default:
                returnVal = ''
        }
        params.returnVal = returnVal

        log.debug('處理結果 = ' + returnVal)

        render view: '/securityTest/index', model: [returnVal:returnVal], params:params
    }

}
