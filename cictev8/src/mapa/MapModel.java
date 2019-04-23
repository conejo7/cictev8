package mapa;

import java.util.List;

import org.primefaces.model.map.Circle;
import org.primefaces.model.map.Marker;
import org.primefaces.model.map.Overlay;
import org.primefaces.model.map.Polygon;
import org.primefaces.model.map.Polyline;
import org.primefaces.model.map.Rectangle;


public interface MapModel {

	 public void addOverlay(Overlay overlay);

	    public List<Marker> getMarkers();

	    public List<Polyline> getPolylines();

	    public List<Polygon> getPolygons();

	    public List<Circle> getCircles();

	    public List<Rectangle> getRectangles();

	public Overlay findOverlay(String id);
	
}
