<?php 
if (! empty($_COOKIE["usuario"])) 
?>
<?php require_once('Connections/conecta.php'); ?>
<?php 
if (!function_exists("GetSQLValueString")) {
function GetSQLValueString($theValue, $theType, $theDefinedValue = "", $theNotDefinedValue = "") 
{
  if (PHP_VERSION < 6) {
    $theValue = get_magic_quotes_gpc() ? stripslashes($theValue) : $theValue;
  }

  $theValue = function_exists("mysql_real_escape_string") ? mysql_real_escape_string($theValue) : mysql_escape_string($theValue);

  switch ($theType) {
    case "text":
      $theValue = ($theValue != "") ? "'" . $theValue . "'" : "NULL";
      break;    
    case "long":
    case "int":
      $theValue = ($theValue != "") ? intval($theValue) : "NULL";
      break;
    case "double":
      $theValue = ($theValue != "") ? doubleval($theValue) : "NULL";
      break;
    case "date":
      $theValue = ($theValue != "") ? "'" . $theValue . "'" : "NULL";
      break;
    case "defined":
      $theValue = ($theValue != "") ? $theDefinedValue : $theNotDefinedValue;
      break;
  }
  return $theValue;
}
}

$colname_Recordset1 = "-1";
if (isset($_GET['Busqueda'])) {
  $colname_Recordset1 = $_GET['Busqueda'];
}
mysql_select_db($database_conecta, $conecta);
$query_Recordset1 = sprintf("SELECT * FROM cliente WHERE CONCAT_WS(' ',Cliente,NIFCIF,NombreComercial,Direccion,Poblacion,CP,Contacto,Movil,Telefono) LIKE %s ORDER BY NombreComercial ASC", GetSQLValueString("%" . $colname_Recordset1 . "%", "text"));
$Recordset1 = mysql_query($query_Recordset1, $conecta) or die(mysql_error());
$row_Recordset1 = mysql_fetch_assoc($Recordset1);
$totalRows_Recordset1 = mysql_num_rows($Recordset1);
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Resultados de <?php echo $_GET['Busqueda']; ?></title>
<?php 
 include 'encabezado.php';
?>
<div id="cuerpo"><br>
      <table width="800" border="0" align="center">
        <tbody>
          <tr>
            <td align="center"><hr></td>
          </tr>
          <tr>
            <td width="35" align="center" bgcolor="#FFFED3">Resultados de <strong><?php echo $_GET['Busqueda']; ?></strong></td>
          </tr>
          </tbody>
      </table>
<table width="800" border="0" align="center">
      <tbody>
        <tr>
          <th colspan="3" align="left" scope="col"><hr></th>
        </tr>
        <tr>
        <th width="35" align="left" scope="col"></th>
          <th width="235" align="left" scope="col">Cliente</th>
          <th width="535" align="left" scope="col">Nota</th>
        </tr>
  </tbody>
</table>
    <?php do { ?>
      <table width="800" border="0" align="center">
        <tbody>
          <tr>
            <td colspan="3" align="left"><hr></td>
          </tr>
          <tr>
            <td width="35" rowspan="2" align="left" bgcolor="#FFFED3"><a href="https://www.google.com/maps/dir/?api=1&destination=<?php echo $row_Recordset1['Direccion']; ?>,+<?php echo $row_Recordset1['CP']; ?>" target="_blank"><img src="imagenes/gpsoficina.png" width="32" height="32" alt="Desde Oficina"></a></td>
            <td width="235" align="left" bgcolor="#FFFED3"><a href="cliente.php?ID_Cliente=<?php echo $row_Recordset1['ID_Cliente']; ?>"><strong><?php echo $row_Recordset1['NombreComercial']; ?></strong></a></td>
            <td width="530" rowspan="2" align="center">
  <textarea name="Nota" disabled cols="70" rows="5" maxlength="252" id="Nota"><?php echo $row_Recordset1['Nota']; ?></textarea></td>
          </tr>
          <tr>
            <td align="left" bgcolor="#FFFED3"><?php echo $row_Recordset1['Cliente']; ?></td>
          </tr>
          </tbody>
      </table>
      <?php } while ($row_Recordset1 = mysql_fetch_assoc($Recordset1)); ?>
      <table width="800" border="0" align="center">
        <tbody>
          <tr>
            <td align="center"><hr></td>
          </tr>
          <tr>
            <td width="35" align="center" bgcolor="#FFFED3">Resultados de <strong><?php echo $_GET['Busqueda']; ?></strong></td>
          </tr>
          </tbody>
      </table>
</div>
</body>
</html>
<?php 
mysql_free_result($Recordset1);
?>
<?php 
}
header("Location: index.php");
exit();
?>