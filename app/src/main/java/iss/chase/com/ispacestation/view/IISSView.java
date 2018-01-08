package iss.chase.com.ispacestation.view;

import java.util.Vector;

import iss.chase.com.ispacestation.model.SpaceStationData;


/**
 * Created by Bikash on 1/7/2018.
 */

public interface IISSView {
    public void notifyDataChange(Vector<SpaceStationData> spaceStationsData);
}
