package com.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pms.dao.BoardDao;
import com.pms.domain.Board;
import com.pms.domain.User;
import com.pms.service.BoardService;

@Service
public class DefaultBoardService implements BoardService {

  BoardDao boardDao;

  public DefaultBoardService(BoardDao boardDao) {
    this.boardDao = boardDao;
  }


  @Override
  public List<Board> list() throws Exception {
    return boardDao.findAll(null);
  }

 
}
