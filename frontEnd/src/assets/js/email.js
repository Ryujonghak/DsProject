/*eslint-disable*/
export default function email(){
function email_check( email ) {    
    var regex=/([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
    return (email != '' && email != 'undefined' && regex.test(email)); 
}

$("input[type=email]").blur(function(){
  var email = $(this).val();
  if( email == '' || email == 'undefined') return;
  if(! email_check(email) ) {
  	$(".result-email").text('알맞은 이메일 형식(@ 포함)으로 적어주세요.');
    $(this).focus();
    return false;
  }else {
	$(".result-email").text('');
  }
});
}