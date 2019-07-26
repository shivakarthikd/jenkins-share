import org.share.bar
def call(message){
    b=bar.newInstance()
    if(message == "TRUE"){
        echo "This is class hello ${b.Local()} , ${message}"
    }

}
