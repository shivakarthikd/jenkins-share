
import org.share.bar

def call(message){
    bar b=new org.share.bar()
    echo b.Local()
}

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

