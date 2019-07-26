
import org.share.bar





def info(message='default') {
        
        echo "INFO: ${message}"
       
        echo bar.Local()
       
    
}

def warn(message='default') {
    b= bar.newInstance()
    if(message=="FALSE") {
        echo "WARNING: ${message}"
        echo "${b.nonstatic()}"
    }
}

