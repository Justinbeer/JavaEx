package com.javaex.generic;

// Generic
// 설게시 - 내부 데이터 타입을 미정 상태로 남겨두고
// 실제 객체화시 - 외부에서 내부 데이터타입을 결정해 주는 방식(일반화)
public class GenericBox<T> {
	// 자주 사용하는 템플릿 문자
	// T : Type
	// K : Key
	// V : Value
	// R : Return Type
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
