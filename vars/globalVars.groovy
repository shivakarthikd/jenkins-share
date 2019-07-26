
import org.share.bar
def l= library('jenkins-share@jenkins').org.share.bar.Local;




def info(message='default') {
    
        echo "INFO: ${message}"
        bar b=new bar()
        echo l.Local()
       
    
}

def warn(message='default') {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

