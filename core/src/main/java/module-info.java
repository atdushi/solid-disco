module core.module {
    requires org.slf4j;
    requires lombok;
    requires java.sdk.core; //tinkoff
    requires java.sdk.grpc.contract;

    exports org.example.model;
    exports org.example.services;
}