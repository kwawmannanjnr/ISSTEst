package iss.chase.com.ispacestation.presenter;

import android.location.Location;

import iss.chase.com.ispacestation.presenter.api.IHttpConnection;

/**
 * Created by Bikash on 1/7/2018.
 */

public interface IISSPresenter {

    void getPassTime(Location location) ;

    void responseReceived(int status, String body, IHttpConnection.IResponseObserver.RequestTypeEnum aRespType, Object requestParams) ;

}
