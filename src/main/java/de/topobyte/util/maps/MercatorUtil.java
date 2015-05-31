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

/*
 * Source: mapsforge (available under LPGL3)
 *
 * Original statement:
 *
 * Copyright 2010, 2011, 2012 mapsforge.org
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 */
public class MercatorUtil
{
	/**
	 * The circumference of the earth at the equator in meter.
	 */
	private static final double EARTH_CIRCUMFERENCE = 40075016.686;

	/**
	 * Calculates the distance on the ground that is represented by a single
	 * pixel on the map.
	 * 
	 * @param lat
	 *            the latitude coordinate at which the resolution should be
	 *            calculated.
	 * @param zoom
	 *            the zoom level at which the resolution should be calculated.
	 * @return the ground resolution at the given latitude and zoom level.
	 */
	public static double calculateGroundResolution(double lat, int zoom,
			int tileSize)
	{
		long worldsize = (long) tileSize << zoom;
		return Math.cos(lat * (Math.PI / 180)) * EARTH_CIRCUMFERENCE
				/ worldsize;
	}

	public static double calculateGroundResolution(double lat, double zoom,
			int tileSize)
	{
		double worldsize = tileSize * Math.pow(2, zoom);
		return Math.cos(lat * (Math.PI / 180)) * EARTH_CIRCUMFERENCE
				/ worldsize;
	}

	public static double calculateGroundResolution(double lat, double worldsize)
	{
		return Math.cos(lat * (Math.PI / 180)) * EARTH_CIRCUMFERENCE
				/ worldsize;
	}

}
