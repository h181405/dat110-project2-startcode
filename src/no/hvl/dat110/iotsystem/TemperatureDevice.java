package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker

		// TODO - end
		
		Client client = new Client("sensor",Common.BROKERHOST,Common.BROKERPORT);
		client.connect();
		client.publish(Common.TEMPTOPIC, "" + sn.read());
		client.disconnect();
		

		System.out.println("Temperature device stopping ... ");

	}
}
