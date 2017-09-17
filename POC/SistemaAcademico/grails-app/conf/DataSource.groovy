dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://104.197.31.149/SistemaAcademico?useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true"
            username = "root"
            password = "camposdosaber"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://104.197.31.149/SistemaAcademico?useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true"
            username = "root"
            password = "camposdosaber"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://104.197.31.149/SistemaAcademico?useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true"
            username = "root"
            password = "camposdosaber"
        }
    }
}