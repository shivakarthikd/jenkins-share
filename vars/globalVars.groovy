
import org.share.bar


bar b=new bar()


def info(message='default') {
    if(message=='TRUE') {
        echo "INFO: ${message}"
       
    }
}

def warn(message='default') {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

