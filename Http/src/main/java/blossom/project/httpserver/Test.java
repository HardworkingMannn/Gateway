package blossom.project.httpserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Test {
    @Autowired
    private ConfigurableEnvironment environment;
    @PostConstruct
    public void init() {
        environment.resolvePlaceholders("srm:\n" +
                "  vmcm:\n" +
                "    fdms:\n" +
                "      appSecret: KLt6jCerWQaZDmPEkQrVmp54gdyEn7DQ\n" +
                "      url: http://10.30.9.14:21000/fdms/fdms-job-api\n" +
                "    wsdlUrl: \"xxxxxxxxxxxxxxxxxxxxxxxxx\"\n" +
                "    systemCode: \"vmcm\"\n" +
                "    userName: \"gzinterface\"\n" +
                "    password: \"yLILlAY7\"\n" +
                "    gpmPriceUrl: \"xxxxxxxxxxxxxxxxx\" #查询广乘采购价格数据\n" +
                "    gpmWorkWearPriceUrl: \"xxxxxxxxxxxxxxxxx\" #查询广乘工装价格数据\n" +
                "    queryTicketUrl: https://pdm-test.gacrnd.com/internal/resources/ticketService/queryTicket #下发票据单号查询\n" +
                "    queryTicketDataUrl: https://pdm-test.gacrnd.com/internal/resources/DataQueryService/DataQuery #下发票据的内容查询\n" +
                "    updateTicketUrl: https://pdm-test.gacrnd.com/internal/resources/ticketService/updateTicket #更新票据状态\n" +
                "  iam:\n" +
                "    prefix: http://10.30.9.14:21000/bpi-test\n" +
                "    client-id: ddzCyWRkaHEh\n" +
                "    client-secret: gnfLnVn9TzLbWWIrUbe9IzYOU5lekbALcg5ZnBWTe2rdoxQg\n" +
                "    appCode: mcdvms\n" +
                "cxf:\n" +
                "  path: /wbs");
        System.out.println(environment.getProperty("srm.vmcm.fdms.appSecret"));
    }
}
