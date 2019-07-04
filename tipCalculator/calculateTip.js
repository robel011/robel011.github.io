function calculateTotal() {

    var subtotalElem = document.getElementById('subtotal').value;
    var tipElem = document.getElementById('tip').value;
    var totalElem = document.getElementById('total');

    if (!isNaN(subtotalElem)) {
        var subtotal = parseFloat(subtotalElem);
        if (subtotal <= 0) {
            alert("Enter a number greater than zero");
            return;
        }
    } else {
        alert("Enter a number not a words");
        return;
    }

    if (!isNaN(tipElem)) {
        var tip = parseFloat(tipElem);
        if (tip < 0) {
            alert("Enter a number greater than zero");
            return;
        }
    } else {
        alert("Enter a number not a word");
        return;
    }

    var total = (subtotal) + ((tip * subtotal) / 100);

    totalElem.innerHTML = '$' + total;
}
//     var subtotalElem = document.getElementById('subtotal');
//     var tipElem = document.getElementById('tip');
//     var totalElem = document.getElementById('total');
//     var subtotal = parseFloat(subtotalElem.value);
//     var tip = parseFloat(tipElem.value);
//     var total = (subtotal) + ((tip * subtotal) / 100);
//     totalElem.innerHTML = '$' + total;