#Garbage Collector Benchmark
Autor: Jakub Karolczak

Wszystkie testy wykonano przy użyciu Java 8, rozmiar sterty = 1024mb.

##Pomiary czasów dla konkretnej ilości powtórzeń

###Test1 - 1 wątek, 100 powtórzen, przekazywana wartość: 64 
|Garbage Collector|1 wątek|
|:-----:|:---:|
|SerialGC|542ms|
|ParallelOldGC|553ms|
|ConcMarkSweepGC|557ms|
|G1GC|711ms|

###4 wątki, 100 powtórzen, przekazywana wartość: 64
|Garbage Collector|1 wątek|2 wątek|3 wątek|4 wątek|średnio|
|:-----:|:---:|:-----:|:---:|:-----:|:---:|
|SerialGC|4597ms|4630ms|4660ms|4665ms|4638ms|
|ParallelOldGC|4187ms|4406ms|4590ms|4627ms|4452,5ms|
|ConcMarkSweepGC|3448ms|3477ms|3458ms|3485ms|3460,25ms|
|G1GC|1572ms|1674ms|1674ms|1707ms|1656,75ms|

###1 wątek, 100 powtórzen, przekazywana wartość: od 0 do 99
|Garbage Collector|1 wątek|
|:-----:|:---:|
|SerialGC|425ms|
|ParallelOldGC|427ms|
|ConcMarkSweepGC|430ms|
|G1GC|605ms|

###4 wątki, 100 powtórzen, przekazywana wartość: od 0 do 99
|Garbage Collector|1 wątek|2 wątek|3 wątek|4 wątek|średnio|
|:-----:|:---:|:-----:|:---:|:-----:|:---:|
|SerialGC|3120ms|3251ms|3577ms|3577ms|3381,25ms|
|ParallelOldGC|2794ms|3136ms|3280ms|3288ms|3124,5ms|
|ConcMarkSweepGC|2720ms|2685ms|2861ms|2880ms|2786,5ms|
|G1GC|1304ms|1372ms|1373ms|1384ms|1358,25ms|

##Pomiary liczby alokacji w określonym czasie

###1 wątek, czas: 1 minuta
|Garbage Collector|1 wątek|
|:-----:|:---:|
|SerialGC|13109 alokacji|
|ParallelOldGC|12975 alokacji|
|ConcMarkSweepGC|12481 alokacji|
|G1GC|8537 alokacji|

###4 wątki, czas: 1 minuta
|Garbage Collector|1 wątek|2 wątek|3 wątek|4 wątek|średnio|
|:-----:|:---:|:-----:|:---:|:-----:|:---:|
|SerialGC|1412 alokacji|1412 alokacji|1412 alokacji|1412 alokacji|1412 alokacji|
|ParallelOldGC|1078 alokacji|1148 alokacji|1192 alokacji|1341 alokacji|1189,75 alokacji|
|ConcMarkSweepGC|1717 alokacji|1721 alokacji|1717 alokacji|1724 alokacji|1719,25 alokacji|
|G1GC|2118 alokacji|2117 alokacji|2161 alokacji|2092 alokacji|2122 alokacji|
