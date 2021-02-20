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

package de.topobyte.util.maps.scalebar;

public class MapScaleBar
{

	private final int pixels;
	private final int meters;

	public MapScaleBar(int pixels, int meters)
	{
		this.pixels = pixels;
		this.meters = meters;
	}

	public int getPixels()
	{
		return pixels;
	}

	public int getMeters()
	{
		return meters;
	}

}
