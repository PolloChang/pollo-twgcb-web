import work.pollochang.util.PAes

environments {
    development {
        dataSource {
            password = PAes.decrypt("NQKj0tgDCp6IPIXVeQegIA==","asdfk2")
        }
    }
    production {
        dataSource {
            password = PAes.decrypt("NQKj0tgDCp6IPIXVeQegIA==","asdfk2")
        }
    }
}