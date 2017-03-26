# Issues

### checked versus unchecked exceptions

New hierarchy, break into unchecked (program errors) and checked (environment/usage errors)

#### internationalization of logging and exceptions, etc

http://www.javaworld.com/article/2075897/testing-debugging/exceptional-practices--part-3.html

MessageFormat and localization

Log messages will not be localized, too unweildy, and log messages are intended for developers.  

Consider use of notifications for exceptions (timeouts, slowdowns, finalizer connection leaks) via https://docs.oracle.com/javase/tutorial/jmx/notifs/index.html

#### jmx

test done.  Look at prop management first, mesh with idea of cache

#### instrumentation 

How can we relate to jmx?

#### cache 

Internal? Distributed?  Do we do properties, client hints, shared data as one cache and have a thread local cache hook?

#### nio/io 

Review this again, performance differences?  Bridging between? Possible abstractions

nio2 asych channels? http://www.ibm.com/developerworks/java/library/j-nio2-1/index.html

consider parallel txfr with asynch channel groups?

https://www.ibm.com/developerworks/java/tutorials/j-nio/j-nio.html

#### review PEPS in old iDROP	

Add microservice and flows, plugging PEPs in client?