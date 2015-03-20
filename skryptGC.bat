SET HEAP_SIZE=-Xms1024m -Xmx1024m
SET LOG_OPTIONS=-Xloggc:gc.log -XX:+PrintGCDateStamps -XX:+PrintGCApplicationStoppedTime
java -classpath bin %HEAP_SIZE% %LOG_OPTIONS% -XX:+UseSerialGC Main
java -classpath bin %HEAP_SIZE% %LOG_OPTIONS% -XX:+UseParallelOldGC Main
java -classpath bin %HEAP_SIZE% %LOG_OPTIONS% -XX:+UseConcMarkSweepGC Main
java -classpath bin %HEAP_SIZE% %LOG_OPTIONS% -XX:+UseG1GC Main 