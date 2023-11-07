package com.example.demo.board;

import java.util.Date;

import com.example.demo.member.Member;
import com.example.demo.member.MemberDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDto {
	private int num;
	private Date wdate;
	private Date udate;
	private Member member;
	private String title;
	private String content;
}