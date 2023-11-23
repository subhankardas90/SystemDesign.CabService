package com.subhankar.cabbooking.database;

import com.subhankar.cabbooking.exceptions.RiderAlreadyExistsException;
import com.subhankar.cabbooking.exceptions.RiderNotFoundException;
import com.subhankar.cabbooking.model.Rider;
import java.util.HashMap;
import java.util.Map;
import lombok.NonNull;

/** In memory database for storing jobs. */
public class RidersManager {
  Map<String, Rider> riders = new HashMap<>();

  public void createRider(@NonNull final Rider newRider) {
    if (riders.containsKey(newRider.getId())) {
      throw new RiderAlreadyExistsException();
    }

    riders.put(newRider.getId(), newRider);
  }

  public Rider getRider(@NonNull final String riderId) {
    if (!riders.containsKey(riderId)) {
      throw new RiderNotFoundException();
    }
    return riders.get(riderId);
  }
}
