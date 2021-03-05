<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container my-3">
    <table class="table">
        <thead class="table-dark">
        <tr>
            <th>제목</th>
            <th>글쓴이</th>
            <th>작성일시</th>
            <th>조회</th>
            <th>추천</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>{{ loop.index }}</td>
            <td>
                <a href="{{ url_for('question.detail', question_id=question.id) }}">{{ question.subject }}</a>
            </td>
            <td>{{ question.create_date }}</td>
        </tr>
        </tbody>
    </table>
</div>