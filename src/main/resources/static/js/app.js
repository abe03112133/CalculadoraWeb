/**
 * JavaScript para la Calculadora Web
 * Maneja las peticiones AJAX a la API REST
 * Historia de Usuario H6: Interfaz web con consumo de API
 * Desarrollado por: Luis Ramírez
 */

/**
 * Realiza una operación matemática llamando a la API
 * @param {string} operacion - Tipo de operación (sumar, restar, multiplicar, dividir)
 */
async function calcular(operacion) {
    // Obtener los valores de los inputs
    const numero1 = parseFloat(document.getElementById('numero1').value);
    const numero2 = parseFloat(document.getElementById('numero2').value);

    // Validar que los campos no estén vacíos
    if (isNaN(numero1) || isNaN(numero2)) {
        mostrarAlerta('Por favor ingrese ambos números', 'warning');
        return;
    }

    // Crear el objeto de petición
    const request = {
        numero1: numero1,
        numero2: numero2
    };

    try {
        // Realizar la petición a la API
        const response = await fetch(`/api/${operacion}`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(request)
        });

        const data = await response.json();

        // Verificar si la operación fue exitosa
        if (data.exito) {
            // Mostrar el resultado
            document.getElementById('resultado').textContent =
                data.resultado.toFixed(2);
            mostrarAlerta(
                `${capitalize(data.operacion)} realizada exitosamente`,
                'success'
            );
        } else {
            // Mostrar mensaje de error
            document.getElementById('resultado').textContent = 'ERROR';
            mostrarAlerta(data.mensaje, 'danger');
        }
    } catch (error) {
        // Error en la petición
        console.error('Error:', error);
        document.getElementById('resultado').textContent = 'ERROR';
        mostrarAlerta('Error al conectar con el servidor', 'danger');
    }
}

/**
 * Muestra una alerta en la interfaz
 * @param {string} mensaje - Mensaje a mostrar
 * @param {string} tipo - Tipo de alerta (success, danger, warning, info)
 */
function mostrarAlerta(mensaje, tipo) {
    const alertContainer = document.getElementById('alertContainer');

    // Crear el elemento de alerta
    const alert = document.createElement('div');
    alert.className = `alert alert-${tipo} alert-dismissible fade show`;
    alert.role = 'alert';
    alert.innerHTML = `
        <strong>${tipo === 'success' ? '¡Éxito!' : 'Atención:'}</strong> ${mensaje}
        <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
    `;

    // Limpiar alertas anteriores
    alertContainer.innerHTML = '';

    // Agregar la nueva alerta
    alertContainer.appendChild(alert);

    // Eliminar la alerta después de 5 segundos
    setTimeout(() => {
        alert.remove();
    }, 5000);
}

/**
 * Capitaliza la primera letra de una cadena
 * @param {string} str - Cadena a capitalizar
 * @returns {string} Cadena capitalizada
 */
function capitalize(str) {
    return str.charAt(0).toUpperCase() + str.slice(1);
}

/**
 * Limpia todos los campos del formulario
 */
function limpiar() {
    document.getElementById('numero1').value = '';
    document.getElementById('numero2').value = '';
    document.getElementById('resultado').textContent = '0.00';
    document.getElementById('alertContainer').innerHTML = '';
    document.getElementById('numero1').focus();
}

// Event listeners para Enter key
document.getElementById('numero1').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        e.preventDefault();
        document.getElementById('numero2').focus();
    }
});

document.getElementById('numero2').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        e.preventDefault();
        calcular('sumar');
    }
});

// Mensaje de bienvenida cuando carga la página
window.addEventListener('load', function() {
    console.log('Calculadora Web Spring Boot cargada correctamente');
    console.log('Equipo: Abel Méndez, Ana Torres, Luis Ramírez');
});