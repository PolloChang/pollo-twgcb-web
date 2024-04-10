package work.pollochang.util

import org.grails.datastore.gorm.GormEntity

/**
 * GormEntity.createCriteria().list 查詢結果
 */
class PFilterResult {

    List<GormEntity> domainList

    long totalCount
}
