package com.subhankar.cabbooking.strategies;

import com.subhankar.cabbooking.model.Location;

public interface PricingStrategy {
  Double findPrice(Location fromPoint, Location toPoint);
}
