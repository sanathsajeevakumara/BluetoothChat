package com.sanathcoding.bluetoothchat.domain.chat

import kotlinx.coroutines.flow.StateFlow

interface BluetoothController {

    val scannedDevice: StateFlow<List<BluetoothDeviceDomain>>
    val pairedDevice: StateFlow<List<BluetoothDeviceDomain>>

    fun startDiscovery()
    fun stopDiscovery()

    fun release()

}