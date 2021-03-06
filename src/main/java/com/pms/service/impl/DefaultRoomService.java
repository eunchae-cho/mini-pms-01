package com.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pms.dao.RoomDao;
import com.pms.domain.Room;
import com.pms.service.RoomService;

@Service
public class DefaultRoomService implements RoomService {

   RoomDao roomDao;

  public DefaultRoomService(RoomDao roomDao) {
    this.roomDao = roomDao;
  }


  @Override
  public List<Room> list() throws Exception {
    return roomDao.findAll();
  }


}
