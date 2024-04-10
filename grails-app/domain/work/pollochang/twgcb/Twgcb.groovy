package work.pollochang.twgcb

/**
 * Twgcb 資料表
 */
class Twgcb {

    String		manCreated
    Date		dateCreated = new Date()
    String		manLastUpdated
    Date		lastUpdated
    String		note
    String      twgcbId
    int         type
    String      cname
    String      explanation
    String      instructions
    String      defaultValue
    String      remark

    static mapping = {
        table "twgcb"
        version true
        id					column:"id"
        manCreated			column:"man_created",		comment:"建檔人員"
        dateCreated			column:"date_created",		comment:"建檔時間"
        manLastUpdated		column:"man_last_updated",	comment:"最後異動人員"
        lastUpdated			column:"last_updated",		comment:"最後異動時間"
        note				column:"note",				comment:"資料註記"
        twgcbId				column:"twgcb_id",          comment:"TWGCB-ID"
        type				column:"type",				comment:"類別"
        cname				column:"cname",				comment:"原則設定名稱"
        explanation         column:"explanation",       comment:"說明"
        instructions        column:"instructions",      comment:"設定方法"
        defaultValue        column:"default_value",     comment:"GCB設定值"
        remark				column:"remark",            comment:"備註"


    }

    static constraints = {
        manCreated			(nullable: false, blank: false, maxSize: 20)
        dateCreated			(nullable: false)
        manLastUpdated		(nullable: true, maxSize: 50)
        lastUpdated			(nullable: true)
        note				(nullable: true, maxSize: 100)
        twgcbId             (nullable: false, blank: false, maxSize: 17, unique: true)
        type                (nullable: true)
        cname               (nullable: true, blank: true, maxSize: 50)
        explanation         (nullable: true, blank: true)
        instructions        (nullable: true, blank: true)
        defaultValue        (nullable: true, blank: true, maxSize: 100)
        remark              (nullable: true, blank: true, maxSize: 100)
    }
}