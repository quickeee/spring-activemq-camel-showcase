package sample.activemq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by btrajkovski on 7/20/2016.
 */
@Component
public class Routes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//        Camel processing from jms in Bean
        from("jms:sample.queue").bean(ProcessingBean.class, "doSomething").to("jms:redirected");
    }
}