function validate() {

    if( document.myForm.firstname.value == "" ) {
        alert( "Please provide your firstname!" );
        document.myForm.firstname.focus() ;
        return false;
    }
    if( document.myForm.lastname.value == "" ) {
        alert( "Please provide your lastnmae" );
        document.myForm.lastnamestname.focus() ;
        return false;
    }
    if( document.myForm.phone.value == "" ) {
        alert( "Please provide your phone!" );
        document.myForm.phone.focus() ;
        return false;
    }
    // Email validation
    var emailID = document.myForm.email.value;
    atpos = emailID.indexOf("@");
    dotpos = emailID.lastIndexOf(".");
    end = emailID.endsWith("com") || emailID.endsWith("in");

    if (atpos < 1 || ( dotpos - atpos < 2 ) || !end) {
        alert("Please enter correct email ID")
        document.myForm.email.focus() ;
        return false;
    }

    if( document.myForm.psw.value == "" ) {
        alert( "Please provide your password!" );
        document.myForm.psw.focus() ;
        return false;
    }
}
