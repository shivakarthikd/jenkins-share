import org.share.bar
def call(Map args){
    
}
def info(message) {
    if(args.v1=='TRUE') {
        echo "INFO: ${message}"
    }
}

def warn(message) {
    if(args.v2=="FALSE") {
        echo "WARNING: ${message}"
    }
}

def importclass(){
    echo bar.Local()
}
