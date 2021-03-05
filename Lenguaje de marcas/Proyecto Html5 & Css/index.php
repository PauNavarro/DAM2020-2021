<?php 
if ($_POST["baldei"] == "baldei") {
setcookie("usuario", "azucar", time()+ 60000,'/');
header("Location: clientes.php");
exit();}
?>
<html>
<head>
<meta charset="utf-8">
<title>SANFER</title>
<style type="text/css">
body {
	background-image: url(imagenes/fondo.png);
	background-repeat: repeat;
}
</style>
</head>

<body>
<table width="100" border="0" align="center">
  <tbody>
    <tr>
      <td height="600" align="center" valign="middle"><form action="index.php" method="post">
  <div align="center">
    <input name="azucar" type="password" autofocus required="required" size="15" maxlength="15">
    <input type="submit" value="Entrar">
  </div>
</form></td>
    </tr>
  </tbody>
</table>
</body>
</html>
<?php 
}
?>
