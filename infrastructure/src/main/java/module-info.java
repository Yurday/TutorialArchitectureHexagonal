module example.org.hexagonal.infrastructure{
    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires example.org.hexagonal.application;
    requires example.org.hexagonal.domain;

    exports example.org.hexagonal.infrastructure;
}
