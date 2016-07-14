# Jargon2

Ok, Jargon has been in release now in its current incarnation for five years.  That's good, it's really stable.  Jargon was based on the original Jargon API from before iRODS3.3.1 and was refactored extensively, but retained a good deal of legacy code, especially in the protocol and packing instruction handling.

This marks the beginning of a new 'clean room' Jargon that will track new developments in the iRODS protocol, such as switching to Avro, considering the use of 0mq, adding JMX extensions.

We'll also look at segmenting the API to allow a cleaner separation between the service layer and the protocol layer, so that a compatability API can be provided to bridge to the old Jargon.  

Goals

* heavily instrumented and tunable with hooks for performance benchmarking at all layers
* abstracted to allow simulated low level prototol responses for mock based testing of fine grain behaviors
* focused at i/o performance and lean memory footprint at the lowest levels
* built with support for object caching and connection caching/agent handling at the core
* logging and error handling improvements to speed problem resolution
* extensibility, including pre/post PEPs on the client side to ease site-specific customization
