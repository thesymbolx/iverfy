package com.job.devices.findDevices

import com.job.network.endpoints.DevicesEndpoints
import com.job.network.getNetworkResource
import javax.inject.Inject

class DeviceRepo @Inject constructor(
    private val devicesEndpoints: DevicesEndpoints
) {
    suspend fun getDevices(
        page: Int,
        pageSize: Int,
    ) =
        devicesEndpoints.getDevices(
            page = page,
            pageSize = pageSize,
        ).getNetworkResource()
}