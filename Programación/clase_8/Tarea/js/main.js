//Variables
const $form = document.getElementById('js-form');
const $password = document.getElementById('password');
const $c_password = document.getElementById('c_password');
//Funciones

//Evento
$form.addEventListener('submit', function(e){
    if($password.value != $c_password.value){
        alert('La contraseña con coincide.');
        e.preventDefault();
    };
});