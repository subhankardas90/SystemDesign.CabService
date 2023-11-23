package com.subhankar.cabbooking.strategies;

import com.subhankar.cabbooking.model.Cab;
import com.subhankar.cabbooking.model.Location;
import com.subhankar.cabbooking.model.Rider;
import java.util.List;

public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
