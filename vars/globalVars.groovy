
import org.share.bar


bar b=new bar()


def info(message='default',b) {
    
        echo "INFO: ${message}"
        echo b.Local()
       
    
}

def warn(message='default') {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

