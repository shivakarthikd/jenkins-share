
import org.share.bar
def l= library('jenkins-share@jenkins').org.share.Bar;




def info(message='default') {
    
        echo "INFO: ${message}"
       
        echo l.Local()
       
    
}

def warn(message='default') {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

