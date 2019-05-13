package edu.bethlehem.runners.jtools;

import org.geotools.referencing.GeodeticCalculator;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.CoordinateSequence;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LinearRing;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.impl.CoordinateArraySequence;

public class PolygonArea {

	public static void main(String[] args) {
		
		GeodeticCalculator c = new GeodeticCalculator();
		c.setStartingGeographicPoint(48.764148, 9.168008);
		c.setDestinationGeographicPoint(48.690815, 9.194553);
		System.out.println(c.getOrthodromicDistance());

		Coordinate[] coords = { new Coordinate(0, 0), new Coordinate(40, 0), new Coordinate(30, -10),
				new Coordinate(40, 2), new Coordinate(0, 2), new Coordinate(0, 0) };

		CoordinateSequence points = new CoordinateArraySequence(coords);
		GeometryFactory gf = new GeometryFactory();

		LinearRing shell = new LinearRing(points, gf);

		Coordinate[] coordinates = { new Coordinate(1, 1), new Coordinate(2, 1), new Coordinate(2, 1),
				new Coordinate(2, 2), new Coordinate(1, 2), new Coordinate(1, 1) };
		CoordinateSequence points2 = new CoordinateArraySequence(coordinates);
		LinearRing h1 = new LinearRing(points2, gf);
		LinearRing[] holes = { h1 };
		Polygon p = new Polygon(shell, holes, gf);

		System.out.println(p.getArea());
	}

}
