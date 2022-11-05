package Logger;

// Four ways to create a singleton:
// 1. Eager initialisation.
// 2. Static Block Initialisation.
// 3. Lazy Initialisation.
// 4. Thread-safe initialisation - either use synchronised
public class Logger{
    private static Logger logger;

    private Logger(){
        System.out.println("Logger created");
    }

    public static Logger getLogger(){
        if(logger == null){
            synchronized (Logger.class) {
                if(logger == null){
                    logger = new Logger();
                }
            }
        }

        return logger;
    }
}