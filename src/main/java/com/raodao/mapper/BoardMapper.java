package com.raodao.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.raodao.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getBoardList();
}
