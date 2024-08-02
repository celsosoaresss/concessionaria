<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Splash Screen</title>
    <style>
        body, html {
            height: 100%;
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #315c6d;
            color: white;
        }
        .splash-content {
            text-align: center;
        }
        .logo {
            max-width: 400px; /* Aumentado para 400px */
            margin-bottom: 20px;
        }
        .message {
            font-size: 24px;
        }
    </style>
</head>
<body>
    <div class="splash-content">
        <img src="images/EDS.png" alt="Logo" class="logo">
        <div class="message">Bem-vindo ao Sistema!</div>
    </div>

    <script>
        // Redireciona para login.jsp após 5 segundos
        setTimeout(function(){
            window.location.href = "template/login.jsp";
        }, 3000);
    </script>
</body>
</html>