#Garbage Collector Benchmark
Autor: Jakub Karolczak

#Wyniki poszczególnych testów

###1 watek, 100 powtórzen, n=64, heap=1024 
SerialGC: 542ms

ParallelOldGC: 553ms

ConcMarkSweepGC: 557ms

G1GC: 711ms

###4 watki, 100 powtórzen, n=64, heap=1024 
SerialGC: 4597ms, 4630ms, 4660ms, 4665ms

ParallelOldGC: 4187ms, 4406ms, 4590ms, 4627ms

ConcMarkSweepGC: 3448ms, 3477ms, 3458ms, 3485ms

G1GC: 1572ms, 1674ms, 1674ms, 1707ms

###1 watek, 100 powtórzen, n=0-99, heap=1024 
SerialGC: 425ms

ParallelOldGC: 427ms

ConcMarkSweepGC: 430ms

G1GC: 605ms

###4 watki, 100 powtórzen, n=0-99, heap=1024 
SerialGC: 3120ms, 3251ms, 3577ms, 3577ms

ParallelOldGC: 2794ms, 3136ms, 3280ms, 3288ms

ConcMarkSweepGC: 2720ms, 2685ms, 2861ms, 2880ms

G1GC: 1304ms, 1372ms, 1373ms, 1384ms

###1 watek, czas: 1 minuta, heap=1024
SerialGC: 13109 alokacji

ParallelOldGC: 12975 alokacji

ConcMarkSweepGC: 12481 alokacji

G1GC: 8537 alokacji

###4 watki, czas: 1 minuta, heap=1024
SerialGC: 1412, 1412, 1412, 1412 alokacji

ParallelOldGC: 1078, 1148, 1192, 1341 alokacji

ConcMarkSweepGC: 1717, 1721, 1717, 1724 alokacji

G1GC:  2118, 2117, 2161, 2092 alokacji