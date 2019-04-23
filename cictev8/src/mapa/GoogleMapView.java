package mapa;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.Marker;

@ManagedBean
@SessionScoped
public class GoogleMapView implements Serializable {

	private MapModel mapModel;

	private Marker marker;

	@PostConstruct
	public void init() {
		this.updateMapModel();
	}

	public MapModel getMapModel() {
		return mapModel;
	}

	public Marker getMarker() {
		return marker;
	}

	private void updateMapModel() {
		this.mapModel = new DefaultMapModel();
		final LatLng originLatLng = new LatLng(32.064019, 34.76977199999999);
		this.mapModel.addOverlay(new Marker(originLatLng, "Origin"));
	}
}
