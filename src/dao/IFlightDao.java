package dao;

import bean.Flight;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

   IflightDao iflightDao;

   public FlightServiceImpl(IflightDao iflightDao) {
      this.iflightDao = iflightDao;
   }
}
