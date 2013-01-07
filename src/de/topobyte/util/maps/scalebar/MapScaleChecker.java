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

import java.util.ArrayList;
import java.util.List;

public class MapScaleChecker
{

	// possible values in meters
	private List<Integer> values = new ArrayList<Integer>();

	private final int maxPixels;

	public MapScaleChecker(int maxPixels)
	{
		this.maxPixels = maxPixels;
		for (int i = 1; i < 10000000; i *= 10) {
			for (int k : new int[] { 1, 2, 5 }) {
				values.add(i * k);
			}
		}
	}

	public MapScaleBar getAppropriate(double metersPerPixel)
	{
		int i, meters = 0, pixels = 0;
		for (i = 0; i < values.size(); i++) {
			int imeters = values.get(i);
			int ipixels = (int) Math.round(imeters / metersPerPixel);
			if (ipixels > maxPixels) {
				break;
			}
			meters = imeters;
			pixels = ipixels;
		}
		return new MapScaleBar(pixels, meters);
	}
}
