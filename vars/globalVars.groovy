
import org.share.bar





def info(message='default') {
        bar b
        echo "INFO: ${message}"
       
        echo b.Local()
       
    
}

def warn(message='default') {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

