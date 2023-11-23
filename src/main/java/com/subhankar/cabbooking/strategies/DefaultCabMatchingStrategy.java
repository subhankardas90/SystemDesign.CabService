package com.subhankar.cabbooking.strategies;

import com.subhankar.cabbooking.model.Cab;
import com.subhankar.cabbooking.model.Location;
import com.subhankar.cabbooking.model.Rider;
import java.util.List;
import lombok.NonNull;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {

  @Override
  public Cab matchCabToRider(
      @NonNull final Rider rider,
      @NonNull final List<Cab> candidateCabs,
      @NonNull final Location fromPoint,
      @NonNull final Location toPoint) {
    if (candidateCabs.isEmpty()) {
      return null;
    }
    return candidateCabs.get(0);
  }
}
