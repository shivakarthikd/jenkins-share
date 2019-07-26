
import org.share.bar
import java.lang.String
final script
def call(message){
    script.bar b=new bar()
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

