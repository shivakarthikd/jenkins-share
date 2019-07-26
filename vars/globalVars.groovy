import org.share.bar
def call(Map args){
    
}
def info(message=args.v1) {
    if(message=='TRUE') {
        echo "INFO: ${message}"
    }
}

def warn(message=args.v2) {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

def importclass(){
    echo bar.Local()
}
