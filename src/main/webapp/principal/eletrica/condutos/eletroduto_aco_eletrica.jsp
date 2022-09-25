<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>  

<table border=0 cellpadding=0 cellspacing=0 width=812 style='border-collapse:
 collapse;table-layout:fixed;width:610pt' class="table table-bordered tabelas-eletricas">
 <col width=164 style='mso-width-source:userset;mso-width-alt:5997;width:123pt'>
 <col width=163 style='mso-width-source:userset;mso-width-alt:5961;width:122pt'>
 <col width=170 style='mso-width-source:userset;mso-width-alt:6217;width:128pt'>
 <col width=213 style='mso-width-source:userset;mso-width-alt:7789;width:160pt'>
 <col width=102 style='mso-width-source:userset;mso-width-alt:3730;width:77pt'>
 <tr height=20 style='height:15.0pt'>
  <td colspan=5 height=20 class=xl72 width=812 style='height:15.0pt;width:610pt'>ELETRODUTOS
  DE AÇO-CARBONO (AG)</td>
 </tr>
 <tr height=60 style='height:45.0pt'>
  <td height=60 class=xl66 width=164 style='height:45.0pt;border-top:none;
  width:123pt'>TAMANHO NOMINAL (pol./mm.)</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>RAIO
  NOMINAL (mm)</td>
  <td class=xl66 width=170 style='border-top:none;border-left:none;width:128pt'>TIPO
  DE DUTO</td>
  <td class=xl66 width=213 style='border-top:none;border-left:none;width:160pt'>OCUPAÇÃO
  MÁXIMA<br>
    (mm²)</td>
  <td class=xl66 width=102 style='border-top:none;border-left:none;width:77pt'>OCUPAÇÃO<br>
    (%)</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1/2&quot; / 15mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>7,5</td>
  <td class=xl67 width=170 style='border-top:none;border-left:none;width:128pt'>L
  / M / SP / P</td>
  <td class=xl68 width=213 style='border-top:none;border-left:none;width:160pt'>71</td>
		<td class=xl69 width=102
			style='border-top: none; border-left: none; width: 77pt'><input
				type="text" class="form-control" id="aco15mm" style="text-align:center;"
				aria-describedby="aco15mm" name="aco15mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco15mm}" />"
				readonly="readonly"></td>
	</tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>3/4&quot; / 20mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>10</td>
  <td class=xl66 width=170 style='border-top:none;border-left:none;width:128pt'>L
  / M / SP / P</td>
  <td class=xl70 width=213 style='border-top:none;border-left:none;width:160pt'>126</td>
		<td class=xl71 width=102
			style='border-top: none; border-left: none; width: 77pt'><input
				type="text" class="form-control" id="aco20mm" style="text-align:center;"
				aria-describedby="aco20mm" name="aco20mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco20mm}" />"
				readonly="readonly"></td>
	</tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1&quot; / 25mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>12,5</td>
  <td class=xl67 width=170 style='border-top:none;border-left:none;width:128pt'>L
  / M / SP / P</td>
  <td class=xl68 width=213 style='border-top:none;border-left:none;width:160pt'>196</td>
  <td class=xl69 width=102 style='border-top:none;border-left:none;width:77pt'><input
				type="text" class="form-control" id="aco25mm" style="text-align:center;"
				aria-describedby="aco25mm" name="aco25mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco25mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1.1/4&quot; / 32mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>16</td>
  <td class=xl66 width=170 style='border-top:none;border-left:none;width:128pt'>L
  / M / SP / P</td>
  <td class=xl70 width=213 style='border-top:none;border-left:none;width:160pt'>322</td>
  <td class=xl71 width=102 style='border-top:none;border-left:none;width:77pt'><input
				type="text" class="form-control" id="aco32mm" style="text-align:center;"
				aria-describedby="aco32mm" name="aco32mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco32mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>1.1/2&quot; / 40mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>20</td>
  <td class=xl67 width=170 style='border-top:none;border-left:none;width:128pt'>L
  / M / SP / P</td>
  <td class=xl68 width=213 style='border-top:none;border-left:none;width:160pt'>503</td>
  <td class=xl69 width=102 style='border-top:none;border-left:none;width:77pt'><input
				type="text" class="form-control" id="aco40mm" style="text-align:center;"
				aria-describedby="aco40mm" name="aco40mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco40mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>2&quot; / 50mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>25</td>
  <td class=xl66 width=170 style='border-top:none;border-left:none;width:128pt'>L
  / M / SP / P</td>
  <td class=xl70 width=213 style='border-top:none;border-left:none;width:160pt'>785</td>
  <td class=xl71 width=102 style='border-top:none;border-left:none;width:77pt'><input
				type="text" class="form-control" id="aco50mm" style="text-align:center;"
				aria-describedby="aco50mm" name="aco50mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco50mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>2.1/2&quot; / 65mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>32,5</td>
  <td class=xl67 width=170 style='border-top:none;border-left:none;width:128pt'>L
  / M / SP / P</td>
  <td class=xl68 width=213 style='border-top:none;border-left:none;width:160pt'>1327</td>
  <td class=xl69 width=102 style='border-top:none;border-left:none;width:77pt'><input
				type="text" class="form-control" id="aco65mm" style="text-align:center;"
				aria-describedby="aco65mm" name="aco65mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco65mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl66 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>3&quot; / 80mm.</td>
  <td class=xl66 width=163 style='border-top:none;border-left:none;width:122pt'>40</td>
  <td class=xl66 width=170 style='border-top:none;border-left:none;width:128pt'>M
  / SP / P</td>
  <td class=xl70 width=213 style='border-top:none;border-left:none;width:160pt'>2011</td>
  <td class=xl71 width=102 style='border-top:none;border-left:none;width:77pt'><input
				type="text" class="form-control" id="aco80mm" style="text-align:center;"
				aria-describedby="aco80mm" name="aco80mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco80mm}" />"
				readonly="readonly"></td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl67 width=164 style='height:15.0pt;border-top:none;
  width:123pt'>4&quot; / 100mm.</td>
  <td class=xl67 width=163 style='border-top:none;border-left:none;width:122pt'>50</td>
  <td class=xl67 width=170 style='border-top:none;border-left:none;width:128pt'>M
  / SP / P</td>
  <td class=xl68 width=213 style='border-top:none;border-left:none;width:160pt'>3142</td>
  <td class=xl69 width=102 style='border-top:none;border-left:none;width:77pt'><input
				type="text" class="form-control" id="aco100mm" style="text-align:center;"
				aria-describedby="aco100mm" name="aco100mm"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelInfraEletrica.aco100mm}" />"
				readonly="readonly"></td>
 </tr>
</table>