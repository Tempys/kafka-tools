package com.dubovskyi.kafka.tools.kafkatools;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Arrays;


public class KafkaConnectTest {

    String[] connectors = new String[]{"ConferenceSessionDetails_Joined_to_postgres3", "LcsCDR_voipDetails_to_postgres1", "SessionDetails_to_postgres22s", "elasticsearch-sink-session-details",

            "sessionsdetails-jdbc-source-source3",
            "sessionsdetails-jdbc-source-source8",
            "sessionsdetails-jdbc-source-source7",
            "sessionsdetails-jdbc-source-source9",
            "McuJoinsAndLeaves_to_postgres1",
            "sessionsdetails-jdbc-source-source2",
            "ErrorReport_Joined-sink-session-details",
            "quickstart-jdbc-source-source",
            "users-avro-test-sink-connectors",
            "errorDef_to_postgres",
            "Conferences-sink-elastic1",
            "es-sink-sessionDetailsJoined",
            "ErrorReport_Joined_to_postgres",
            "es-sink-conferencesJoined",
            "elasticsearch-sink-VoipDetails1",
            "focusjoinandleaves_to_postgres",
            "LcsCDR_conferenceDetails_to_postgres",
            "sessionsdetails-jdbc-source-source10",
            "sessionsdetails-jdbc-source-source11",
            "ErrorDef_Joined-sink-session-details"


    };

    String url = "http://94.130.90.122:8083/connectors/elasticsearch-sink-VoipDetails1/pause";

    @Test
    public void stoppingListConnectors() throws IOException {

        KafkaConnectorCommand kafkaConnectorCommand = new KafkaConnectorCommand();

        for(String item : connectors){
            String url = String.format("http://94.130.90.122:8083/connectors/%s/pause",item);
            System.out.println(url);
            System.out.println(kafkaConnectorCommand.sendKafkaConnectorCommand(url,"pause"));
        }
    }
}


