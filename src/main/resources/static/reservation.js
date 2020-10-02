$(document).ready(() => {
    $('#modal-save-button').click(() => {
        const nume = $('#modal-rez-nume').val();
        const numartelefon = $('#modal-rez-nr').val();
        const body = {
            nume: nume,
            numarTelefon: numartelefon
        };

        fetch('/api/rezervari', {
            method: 'post',
            body: JSON.stringify(body),
            headers:{
                'Content-Type':('application/json')
            }
        }).then(response => {
            location.reload();
        });
    });

    $('.fa fa-trash').click(()=>{
        console.log('Delete selected');
        })
})
