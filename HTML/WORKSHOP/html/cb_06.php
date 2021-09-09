<?php
    require_once "../inc.head.html";
?>

<div id="d"></div>
<div id="c"></div>
<div id="a"></div>
<div id="b"></div>

<style>
  div {
    position: absolute;
    left: 0px;
    top: 75px;
    width: 400px;
    height: 150px;
    background: #4CAAB3;
  }
    #c {
  position: absolute; 
  top: 25px;
  left: 75px; 
  height: 250px;
  width: 250px;
  background-color: #222730;
  transform: rotate(0.125turn);
}
  #b {
  position: absolute;
  top: 125px;
  left: 175px;
  
  
  height: 50px;
  width: 50px;
  background-color: #393E46;
  border-radius: 50%;
  display: inline-block;
}
  #a {
  position: absolute;
  top: 75px;
  left: 125px;
  
  
  height: 150px;
  width: 150px;
  background-color: #4CAAB3;
  transform: rotate(.125turn);
}
  
  body {
    background: #222730;
  }
</style>
<?php
    require_once "../inc.foot.html";
?>