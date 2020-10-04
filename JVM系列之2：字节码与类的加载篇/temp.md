* |   标志名称    | 标志值 |            含义            |
  | :-----------: | :----: | :------------------------: |
  |  ACC_PUBLIC   | 0x0001 |      字段是否为public      |
  |  ACC_PRIVATE  | 0x0002 |     字段是否为private      |
  | ACC_PROTECTED | 0x0004 |    字段是否为protected     |
  |  ACC_STATIC   | 0x0008 |      字段是否为static      |
  |   ACC_FINAL   | 0x0010 |      字段是否为final       |
  | ACC_VOLATILE  | 0x0040 |     字段是否为volatile     |
  | ACC_TRANSIENT | 0x0080 |    字段是否为transient     |
  | ACC_SYNCHETIC | 0x1000 | 字段是否为由编译器自动生成 |
  |   ACC_ENUM    | 0x4000 |       字段是否为enum       |

* fields_info 字段名索引

  根据字段名索引的值，查询常量池中