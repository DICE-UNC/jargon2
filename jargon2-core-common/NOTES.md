# Issues

### checked versus unchecked exceptions

New hierarchy, break into unchecked (program errors) and checked (environment/usage errors)

#### internationalization of logging and exceptions, etc

http://www.javaworld.com/article/2075897/testing-debugging/exceptional-practices--part-3.html

http://www.javaworld.com/article/2075476/core-java/exceptional-practices--part-1.html

www.javaworld.com/article/2075601/testing-debugging/exceptional-practices--part-2.html (chained exception?  now in throwable)

#### jmx


#### instrumentation 

How can we relate to jmx?

#### cache 

Internal? Distributed?



# conventions

#### Logging

* WARN for eaten exceptions and soft errors
* INFO is for method names and params and responses
* DEBUG for internal logging of checkpoints within methods
* TRACE dumps protocol messages
