
import src.org.share.bar.*

def call(message){
    echo Local()
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

