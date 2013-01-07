// Copyright 2013 Sebastian Kuerten
//
// This file is part of general-map-utils.
//
// general-map-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// general-map-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with general-map-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.util.maps;

public class MapPosition
{

	private double lon, lat;
	private int zoom;

	public MapPosition(double lon, double lat, int zoom)
	{
		this.lon = lon;
		this.lat = lat;
		this.zoom = zoom;
	}

	public double getLon()
	{
		return lon;
	}

	public double getLat()
	{
		return lat;
	}

	public int getZoom()
	{
		return zoom;
	}

	public void setLon(double lon)
	{
		this.lon = lon;
	}

	public void setLat(double lat)
	{
		this.lat = lat;
	}

	public void setZoom(int zoom)
	{
		this.zoom = zoom;
	}

}
