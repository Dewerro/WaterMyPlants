package com.dewerro.watermyplants.presentation.navigation

sealed class Screen(val route: String) {
    object PlantScreen : Screen("plant")
    object ListScreen : Screen("list")
    object SetPlantScreen : Screen("set_plant")
    object CameraScreen : Screen("camera_screen")
}