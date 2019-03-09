//Variables
const $form = document.getElementById('js-form');
const $password = document.getElementById('password');
const $c_password = document.getElementById('c_password');
//Funciones

//Evento
$form.addEventListener('submit', function(e){
    e.defaultPrevented;
    console.log(e)
    if($password.value != $c_password.value){
        alert('La contraseña no es correcta.');
    };
});