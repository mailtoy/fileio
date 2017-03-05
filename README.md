#fileio
### By Kanchanok Kannee (5910545639)

|     Task     |   Elapsed time   | 
| ------------- |:-------------:| 
| Copy a file byte-by-byte | 4.876511 sec | 
| Copy a file byte array-1KB | 0.004765 sec |  
| Copy a file byte array-4KB | 0.001712 sec |  
| Copy a file byte array-64KB | 0.001164 sec |
| Copy a file by using BufferedReader and PrintWriter to copy line by line | 0.075842 sec |
| Copy a file by using BufferedReader and BufferedWriter to copy 1024 char at time | 0.010181 sec |

#### Copy methods at byte-by-byte.
- It's super slow because  of having to read each byte begin to the end.

#### Copy methods by byte of array size.
- It's the fastest Because it read as byte that we define as 1KB, 4KB, 64KB etc. Unlike the reading byte by byte at time.

#### Copy methods by using BufferedReader and PrintWriter to copy line by line.
- It's slower than the Copy methods by using copy byte array because of having to read  the line. After that must converted from byte to String. Already more than to be String It must be converted from byte> byte []> char> char []> String. It takes a long time

#### Copy methods by using BufferedReader and BufferedWriter to copy one char at time
- it’s faster than  copy line by line because It does not have to process change as the string.

