import org.share.bar
def call(message='default') {
    if(message=='TRUE') {
        echo "INFO: ${message}"
    }
}

def warn(message) {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

def importclass(){
    echo bar.Local()
}
