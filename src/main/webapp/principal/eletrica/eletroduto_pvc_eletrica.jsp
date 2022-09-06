<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>  

<table border=0 cellpadding=0 cellspacing=0 width=812 style='border-collapse:
 collapse;table-layout:fixed;width:610pt' class="table table-bordered tabelas-eletricas">
 <col width=164 style='mso-width-source:userset;mso-width-alt:5997;width:123pt'>
 <col width=163 style='mso-width-source:userset;mso-width-alt:5961;width:122pt'>
 <col width=170 style='mso-width-source:userset;mso-width-alt:6217;width:160pt'>
 <col width=213 style='mso-width-source:userset;mso-width-alt:7789;width:128pt'>
 <col width=102 style='mso-width-source:userset;mso-width-alt:3730;width:77pt'>
 <tr height=20 style='height:15.0pt'>
  <td colspan=5 height=20 class=xl70 width=812 style='height:15.0pt;width:610pt'>ELETRODUTOS
  DE PVC</td>
 </tr>
 <tr height=60 style='height:45.0pt'>
  <td height=60 class=xl66 width=164 style='height:45.0pt;border-top:none;
  width:123pt'>TAMANHO NOMINAL (pol./mm.)</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>RAIO
  NOMINAL (mm)</td>
  <td class=xl66 width=170 style='border-top:none;border-left:none;width:128pt'>OCUPAÇÃO
  MÁXIMA<br>
    (mm²)</td>
  <td colspan=2 class=xl66 width=315 style='border-left:none;width:237pt'>OCUPAÇÃO<br>
    (%)</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1/2&quot; / 20mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>10</td>
  <td class=xl68 width=170 style='border-top:none;border-left:none;width:128pt'>126</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc20mm"
				aria-describedby="pvc20mm" name="pvc20mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc20mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>3/4&quot; / 25mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>12,5</td>
  <td class=xl69 width=170 style='border-top:none;border-left:none;width:128pt'>196</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc25mm"
				aria-describedby="pvc25mm" name="pvc25mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc25mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1&quot; / 32mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>16</td>
  <td class=xl68 width=170 style='border-top:none;border-left:none;width:128pt'>322</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc32mm"
				aria-describedby="pvc32mm" name="pvc32mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc32mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1.1/4&quot; / 40mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>20</td>
  <td class=xl69 width=170 style='border-top:none;border-left:none;width:128pt'>503</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc40mm"
				aria-describedby="pvc40mm" name="pvc40mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc40mm}" />"
				readonly="readonly"></td>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1.1/2&quot; / 50mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>25</td>
  <td class=xl68 width=170 style='border-top:none;border-left:none;width:128pt'>785</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc50mm"
				aria-describedby="pvc50mm" name="pvc50mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc50mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>2&quot; / 60mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>30</td>
  <td class=xl69 width=170 style='border-top:none;border-left:none;width:128pt'>1131</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc60mm"
				aria-describedby="pvc60mm" name="pvc60mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc60mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>2.1/2&quot; / 75mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>37,5</td>
  <td class=xl68 width=170 style='border-top:none;border-left:none;width:128pt'>1767</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc75mm"
				aria-describedby="pvc75mm" name="pvc75mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc75mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>3&quot; / 85mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>42,5</td>
  <td class=xl69 width=170 style='border-top:none;border-left:none;width:128pt'>2270</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc85mm"
				aria-describedby="pvc85mm" name="pvc85mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc85mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>4&quot; / 100mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>50</td>
  <td class=xl68 width=170 style='border-top:none;border-left:none;width:128pt'>3142</td>
  <td colspan=2 class=xl71 width=315 style='border-left:none;width:237pt'><input
				type="text" class="form-control" id="pvc100mm"
				aria-describedby="pvc100mm" name="pvc100mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.pvc100mm}" />"
				readonly="readonly"></td>
 </tr>
</table>