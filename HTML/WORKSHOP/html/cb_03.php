<?php
    require_once "../inc.head.html";
?>

<div id="d"></div><div id="c"></div><div id="a"></div>
<div id="b"></div>
<style>
  div {
    position: absolute;
    left: 50px;
    top: 75px;
    width: 300px;
    height: 150px;
    background: #243D83;
  }
    #c {
  position: absolute;
  top: 25px;
  left: 75px;
  height: 250px;
  width: 250px;
  background-color: #6592CF;
  border-radius: 50%;
  display: inline-block;
}
  #b {
  position: absolute;
  top: 125px;
  left: 175px;
  height: 50px;
  width: 50px;
  background-color: #EEB850;
  border-radius: 50%;
  display: inline-block;
}
  #a {
  position: absolute;
  top: 75px;
  left: 125px;
  height: 150px;
  width: 150px;
  background-color: #243D83;
  border-radius: 50%;
  display: inline-block;
}
  body {
    background: #6592CF;
  }
</style>


<?php
    require_once "../inc.foot.html";
?>