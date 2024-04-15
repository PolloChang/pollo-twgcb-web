package work.pollochang.bs

/**
 * 系統選單
 */
class BsSelect {

    String type
    int code
    String cdesc

    static mapping = {
        table   "bs_select"
        comment "選單代號對照表"
        version false
        id                  column: "id"
        type				column:"type",				comment:"類別"
        code				column:"code",				comment:"選單代號"
        cdesc				column:"cdesc",				comment:"代號敘述"
    }

    static constraints = {
        type                (nullable: false, blank: false, maxSize: 10, unique:['code'])
        code                (nullable: false)
        cdesc               (nullable: false, blank: false, maxSize: 100)
    }

    @Override
    boolean equals(Object o) {
        if (this == o) return true
        if (o == null || getClass() != o.getClass()) return false
    }

}
