import org.share.bar
def call(Map args){
    
}
def info(message=args.v1) {
    if(args.v1=='TRUE') {
        echo "INFO: ${message}"
    }
}

def warn(message=args.v2) {
    if(args.v2=="FALSE") {
        echo "WARNING: ${message}"
    }
}

def importclass(){
    echo bar.Local()
}
