






def info(message='default') {
        def l= library('jenkins-share@jenkins').org.share.bar;
        echo "INFO: ${message}"
       
        echo l.Local()
       
    
}

def warn(message='default') {
    if(message=="FALSE") {
        echo "WARNING: ${message}"
    }
}

