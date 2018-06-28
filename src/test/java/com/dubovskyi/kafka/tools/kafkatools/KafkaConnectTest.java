package com.dubovskyi.kafka.tools.kafkatools;


import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;


public class KafkaConnectTest {

    String[] connectors = new String[]{ "ConferenceSessionDetails_Joined_to_postgres3",
            "LcsCDR_voipDetails_to_postgres1",
            "SessionDetails_to_postgres22s",
            "elasticsearch-sink-session-details",
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
            "es-sink-ErrorReportJoined",
            "es-sink-conferencesJoined",
            "elasticsearch-sink-VoipDetails1",
            "focusjoinandleaves_to_postgres",
            "sessionsdetails-jdbc-source-source10",
            "LcsCDR_conferenceDetails_to_postgres",
            "sessionsdetails-jdbc-source-source11",
            "ErrorDef_Joined-sink-session-details"


    };


    @Test
    @Ignore
    public void stoppingListConnectors() throws IOException {

        KafkaConnectorCommand kafkaConnectorCommand = new KafkaConnectorCommand();

        for(String item : connectors){
            String url = String.format("http://94.130.90.122:8084/connectors/%s/pause",item);
            System.out.println(url);
            System.out.println(kafkaConnectorCommand.sendKafkaConnectorCommand(url,"pause"));
        }
    }


    @Test
    public void deleteListConnectors() throws IOException {

        KafkaConnectorCommand kafkaConnectorCommand = new KafkaConnectorCommand();

        for(String item : connectors){
            String url = String.format("http://94.130.90.122:8084/connectors/%s",item);
            System.out.println(url);
            System.out.println(kafkaConnectorCommand.deleteKafkaConnector(url));
        }
    }

    @Test
    public void getKafkaConnectorStatus() throws IOException {

        KafkaConnectorCommand kafkaConnectorCommand = new KafkaConnectorCommand();

        for(String item : connectors){
            String url = String.format("http://94.130.90.122:8084/connectors/%s/status",item);
            System.out.println(url);
            System.out.println(kafkaConnectorCommand.getKafkaConnectorStatus(url));
        }
    }


}


