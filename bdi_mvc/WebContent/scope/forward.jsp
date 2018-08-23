<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<style>
tr>th {
	text-align: center;
}

tr>td {
	text-align: center;
	cursor: pointer;
}
</style>
<body>
	메이커리스트
	<br>
	<div class="container">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>메이커명</th>
					<th>가격</th>
					<th>수량</th>
					<th>총액</th>
					<th>상품설명</th>
				</tr>
			</thead>
			<tbody>
<c:forEach items="${list}" var ="m"> 
				<tr>
					<td>${m.mnum}</td>
					<td>${m.mname}</td>
					<td>${m.mprice}</td>
					<td>${m.mcnt}</td>
					<td>${m.mtotal}</td>
					<td>${m.mdesc}</td>
				</tr>
</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>