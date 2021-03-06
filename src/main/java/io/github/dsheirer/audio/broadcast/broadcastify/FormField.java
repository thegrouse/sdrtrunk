/*
 * *****************************************************************************
 *  Copyright (C) 2014-2020 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

package io.github.dsheirer.audio.broadcast.broadcastify;

/**
 * HTTP headers used for posting to Broadcastify calls api
 */
public enum FormField
{
    API_KEY("apiKey"),
    SYSTEM_ID("systemId"),
    CALL_DURATION("callDuration"),
    TIMESTAMP("ts"),
    TALKGROUP_ID("tg"),
    RADIO_ID("src"),
    FREQUENCY("freq"),
    ENCODING("enc"),
    TEST("test");

    private String mHeader;

    FormField(String header)
    {
        mHeader = header;
    }

    public String getHeader()
    {
        return mHeader;
    }
}
