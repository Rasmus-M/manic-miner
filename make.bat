xas99.py src/main-memory.a99 -i -q -R -L manicminer.lst -E symbols.txt -o bin/main
xas99.py src/rom-banks.a99 -B -q -R -o bin/banks.bin

java -jar tools/ea5tocart.jar bin\main "MANIC MINER"

copy /b bin\main8.bin ^
    + bin\banks.bin ^
    manicminer8.bin

java -jar tools/CopyHeader.jar manicminer8.bin 60

jar -cvf manicminer.rpk manicminer8.bin layout.xml > make.log

