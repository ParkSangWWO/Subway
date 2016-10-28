package com.industrial.subway.util;
import java.util.*;
import java.util.Scanner;

public class InitialSearch
{ 
	private static final char HANGUL_BEGIN_UNICODE = 44032;
	private static final char HANGUL_LAST_UNICODE = 55203;
	private static final char HANGUL_BASE_UNIT = 588;//���� �� �� ���ڼ�
 
	private static final char[] INITIAL_SOUND = { 'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };
	
	private static boolean isHangul(char c) { 
		  return HANGUL_BEGIN_UNICODE <= c && c <= HANGUL_LAST_UNICODE; 
	} 
 
	private static boolean isInitial(char param){ 
		for(char c : INITIAL_SOUND){ 
			if(c == param){ 
				return true; 
			} 
		} 
		return false; 
	} 
 

	private static char getInitial(char c) { 
		int hanBegin = (c - HANGUL_BEGIN_UNICODE); 
		int index = hanBegin / HANGUL_BASE_UNIT; 
		return INITIAL_SOUND[index]; 
	} 
 
  
	public static boolean matchString(String value, String search){ 
		int t = 0; 
		int len = value.length() - search.length();
		if(len < 0) 
			return false;
		
		for(int i = 0; i <= len; i++){ // �Է��� �� ���̸�ŭ �˻� 
			t = 0; 
			while(t < search.length()){ 
				if(isInitial(search.charAt(t)) == true && isHangul(value.charAt(i+t))){ 
					if(getInitial(value.charAt(i+t)) == search.charAt(t)) 
						t++; 
					else 
						break; 
				} 
				else { //�κ� �ʼ��� ���  ex)�ѱ��������̵��
					if(value.charAt(i+t) == search.charAt(t))
						t++; 
					else 
						break; 
				} 
			} 
			if(t == search.length()) 
				return true; //��� ��ġ�� ��� ã���� true�� �����Ѵ�. 
		} 
		return false; //��ġ�ϴ� ���� ã�� �������� false�� �����Ѵ�.
	}
}
