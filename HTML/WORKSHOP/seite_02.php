<?php
    require_once "inc.head.html";
?>


<header>
    Inhalt Seite 02
    
</header>

<section class="section">
<dl>
       
        <?php
            for ($x = 1; $x <= 6; $x++) {
                print "<dt>#0".$x."</dt>
                <dd>
                <a href=\"html/cb_0".$x.".php\"><img src=\"img/0".$x."_img.png\" alt=\"Simply Square\" 
                onmouseover=\"nhpup.popup('DIES IST DER CODE DAZU: <br/><br/> <img src=&quot;img&#47;0".$x."_code.png&quot;/>', 
                {'width': 570});\"></a></dd>";
            }
        ?>


    </dl>
</section>

<footer>

</footer>

<?php
    require_once "inc.foot.html";
?>