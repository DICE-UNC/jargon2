/**
 * 
 */
package org.irods.jargon2.provider.zeromq.sandbox.server;

import org.zeromq.ZMQ;

/**
 * Simple server side of straight-ahead zeromq point to point socket
 * @author mconway
 *
 */
public class ZeromqServer {
	
    public static void main(String[] args) throws Exception {
        ZMQ.Context context = ZMQ.context(1);

        //  Socket to talk to clients
        ZMQ.Socket responder = context.socket(ZMQ.REP);
        responder.bind("tcp://*:5555");

        while (!Thread.currentThread().isInterrupted()) {
            // Wait for next request from the client
            byte[] request = responder.recv(0);
            System.out.println("Received Hello");

            // Do some 'work'
            Thread.sleep(1000);

            // Send reply back to client
            String reply = "World";
            responder.send(reply.getBytes(), 0);
        }
        responder.close();
        context.term();
    }

}
