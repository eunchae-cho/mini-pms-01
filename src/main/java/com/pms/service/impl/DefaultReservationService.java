package com.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pms.dao.ReservationDao;
import com.pms.domain.Reservation;
import com.pms.service.ReservationService;

@Service
public class DefaultReservationService implements ReservationService {

   ReservationDao reservationDao;

  public DefaultReservationService(ReservationDao reservationDao) {
    this.reservationDao = reservationDao;
  }


  @Override
  public List<Reservation> list() throws Exception {
    return reservationDao.findAll();
  }


}
