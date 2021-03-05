<?php 
if (! empty($_COOKIE["usuario"])) 
  {
?>
<?php require_once('Connections/conecta.php'); ?>
<?php 
if (!function_exists("GetSQLValueString")) {
function GetSQLValueString($theValue, $theType, $theDefinedValue = "", $theNotDefinedValue = "") 
{
  if (PHP_VERSION < 6) {
    $theValue = get_magic_quotes_gpc() ? stripslashes($theValue) : $theValue;
  }

  $theValue = function_exists("mysqli_real_escape_string") ? mysqli_real_escape_string($theValue) : mysqli_escape_string($theValue);

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

$currentPage = $_SERVER["PHP_SELF"];

$maxRows_Recordset1 = 10;
$pageNum_Recordset1 = 0;
if (isset($_GET['pageNum_Recordset1'])) {
  $pageNum_Recordset1 = $_GET['pageNum_Recordset1'];
}
$startRow_Recordset1 = $pageNum_Recordset1 * $maxRows_Recordset1;

mysqli_select_db($database_conecta, $conecta);
$query_Recordset1 = "SELECT * FROM cliente ORDER BY ID_Cliente DESC";
$query_limit_Recordset1 = sprintf("%s LIMIT %d, %d", $query_Recordset1, $startRow_Recordset1, $maxRows_Recordset1);
$Recordset1 = mysqli_query($query_limit_Recordset1, $conecta) or die(mysqli_error());
$row_Recordset1 = mysqli_fetch_assoc($Recordset1);

if (isset($_GET['totalRows_Recordset1'])) {
  $totalRows_Recordset1 = $_GET['totalRows_Recordset1'];
} else {
  $all_Recordset1 = mysqli_query($query_Recordset1);
  $totalRows_Recordset1 = mysqli_num_rows($all_Recordset1);
}
$totalPages_Recordset1 = ceil($totalRows_Recordset1/$maxRows_Recordset1)-1;$maxRows_Recordset1 = 10;
$pageNum_Recordset1 = 0;
if (isset($_GET['pageNum_Recordset1'])) {
  $pageNum_Recordset1 = $_GET['pageNum_Recordset1'];
}
$startRow_Recordset1 = $pageNum_Recordset1 * $maxRows_Recordset1;

mysqli_select_db($database_conecta, $conecta);
$query_Recordset1 = "SELECT * FROM cliente ORDER BY ID_Cliente DESC";
$query_limit_Recordset1 = sprintf("%s LIMIT %d, %d", $query_Recordset1, $startRow_Recordset1, $maxRows_Recordset1);
$Recordset1 = mysqli_query($query_limit_Recordset1, $conecta) or die(mysqli_error());
$row_Recordset1 = mysqli_fetch_assoc($Recordset1);

if (isset($_GET['totalRows_Recordset1'])) {
  $totalRows_Recordset1 = $_GET['totalRows_Recordset1'];
} else {
  $all_Recordset1 = mysqli_query($query_Recordset1);
  $totalRows_Recordset1 = mysqli_num_rows($all_Recordset1);
}
$totalPages_Recordset1 = ceil($totalRows_Recordset1/$maxRows_Recordset1)-1;

$queryString_Recordset1 = "";
if (!empty($_SERVER['QUERY_STRING'])) {
  $params = explode("&", $_SERVER['QUERY_STRING']);
  $newParams = array();
  foreach ($params as $param) {
    if (stristr($param, "pageNum_Recordset1") == false && 
        stristr($param, "totalRows_Recordset1") == false) {
      array_push($newParams, $param);
    }
  }
  if (count($newParams) != 0) {
    $queryString_Recordset1 = "&" . htmlentities(implode("&", $newParams));
  }
}
$queryString_Recordset1 = sprintf("&totalRows_Recordset1=%d%s", $totalRows_Recordset1, $queryString_Recordset1);
?>
<!doctype html>
<html>
<head>
<title>Clientes</title>
<meta charset="utf-8">
<?php 
 include 'encabezado.php';
?>
<?php if ($totalRows_Recordset1 > 0)  // Show if recordset not empty ?>
  <div id="cuerpo">
    <table width="800" border="0" align="center">
      <tbody>
        <tr>
          <td width="350" align="right" valign="middle"><?php if ($pageNum_Recordset1 > 0) { // Show if not first page ?>
            <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, 0, $queryString_Recordset1); ?>"><img src="imagenes/primero.png" width="32" height="32" alt=""/></a> <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, max(0, $pageNum_Recordset1 - 1), $queryString_Recordset1); ?>"><img src="imagenes/anterior.png" width="32" height="32" alt=""/></a>
            <?php } // Show if not first page ?></td>
          <td align="center" style="font-weight: bold">Mostrando del <?php echo ($startRow_Recordset1 + 1) ?> al <?php echo min($startRow_Recordset1 + $maxRows_Recordset1, $totalRows_Recordset1) ?> de <?php echo $totalRows_Recordset1 ?> clientes</td>
          <td width="170" align="left" valign="middle"><?php if ($pageNum_Recordset1 < $totalPages_Recordset1) { // Show if not last page ?>
            <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, min($totalPages_Recordset1, $pageNum_Recordset1 + 1), $queryString_Recordset1); ?>"><img src="imagenes/siguiente.png" width="32" height="32" alt=""/></a> <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, $totalPages_Recordset1, $queryString_Recordset1); ?>"><img src="imagenes/ultimo.png" width="32" height="32" alt=""/></a>
            <?php } // Show if not last page ?></td>
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
          <th width="530" align="left" scope="col">Nota</th>
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
            <td width="530" align="center">
  <textarea name="Nota" disabled cols="70" rows="5" maxlength="252" id="Nota"><?php echo $row_Recordset1['Nota']; ?></textarea></td>
          </tr>
          </tbody>
      </table>
      <?php } while ($row_Recordset1 = mysqli_fetch_assoc($Recordset1)); ?>
  </div>
  <?php  // Show if recordset not empty ?>
<div id="pie">
  <table width="800" border="0" align="center">
    <tbody>
      <tr>
        <td align="right" valign="middle"><?php if ($pageNum_Recordset1 > 0) { // Show if not first page ?>
          <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, 0, $queryString_Recordset1); ?>"><img src="imagenes/primero.png" width="32" height="32" alt=""/></a> <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, max(0, $pageNum_Recordset1 - 1), $queryString_Recordset1); ?>"><img src="imagenes/anterior.png" width="32" height="32" alt=""/></a> <?php } // Show if not first page ?></td>
        <td width="100" align="left" valign="middle"><?php if ($pageNum_Recordset1 < $totalPages_Recordset1) { // Show if not last page ?> <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, min($totalPages_Recordset1, $pageNum_Recordset1 + 1), $queryString_Recordset1); ?>"><img src="imagenes/siguiente.png" width="32" height="32" alt=""/></a> <a href="<?php printf("%s?pageNum_Recordset1=%d%s", $currentPage, $totalPages_Recordset1, $queryString_Recordset1); ?>"><img src="imagenes/ultimo.png" width="32" height="32" alt=""/></a>
          <?php } // Show if not last page ?></td>
      </tr>
    </tbody>
  </table>
</div>
</div>
</body>
</html>
<?php 
mysqli_free_result($Recordset1);
?>
<?php 

header("Location: index.php");
exit();
?>