package kafka_streams;

import java.io.IOException;
import java.util.Arrays;

public class DriverClass{
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Provide an argument: producer, consumer or kafkastreamsjoin");
        }
        switch (args[0]) {
            case "producer":
                Producer.main(args);
                break;
            case "consumer":
                String[] newargs=Arrays.copyOfRange(args,1,3);
                Consumer.main(newargs);
                break;
            case "join":
                Join.main(args);
                break;
            case "windowedjoin":
                WindowedJoin.main(args);
                break;
  
            default:
                throw new IllegalArgumentException("Check the argument provided: " + args[0]);
        }
    }
}
