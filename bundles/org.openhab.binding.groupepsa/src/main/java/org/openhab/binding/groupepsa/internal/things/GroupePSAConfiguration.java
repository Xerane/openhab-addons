/**
 * Copyright (c) 2010-2024 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.groupepsa.internal.things;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * The {@link GroupePSAConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Arjan Mels - Initial contribution
 */
@NonNullByDefault
public class GroupePSAConfiguration {

    private @Nullable String id;
    private @Nullable Integer pollingInterval;
    private @Nullable Integer onlineInterval;

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @Nullable Integer getPollingInterval() {
        return pollingInterval;
    }

    public void setPollingInterval(Integer pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    public @Nullable Integer getOnlineInterval() {
        return onlineInterval;
    }

    public void setOnlineInterval(Integer onlineInterval) {
        this.onlineInterval = onlineInterval;
    }
}