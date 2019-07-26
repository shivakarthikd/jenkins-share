
import org.share.bar





def info(message='default') {
        bar b=new org.share.bar()
        echo "INFO: ${message}"
       
        echo b.Local()
       
    
}

def warn(message='default') {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

