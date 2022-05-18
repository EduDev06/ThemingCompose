package com.example.theming.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

/**
 * Small Components.- The following components can use unique corner shapes:
 * Button, Chip, Expanding bottom sheet (collapsed) *
 * Extended floating action button, Floating action button, Outlined text field
 * Snackbar, Tooltip
 */

/**
 * Medium Components.- The following components can use this shape:
 * Card, Dialog, Image list item, Menu
 */

/**
 * Large Components.- The following components can use this shape:
 * Backdrop *, Data table, Expanding bottom sheet (expanded / full-screen) *
 * Modal bottom sheet (collapsed), Modal bottom sheet (expanded / full-screen) *,
 * Nav drawer (bottom - collapsed), av drawer (bottom - expanded / full-screen) *,
 * Nav drawer (side), Side sheet, Standard bottom sheet (collapsed)
 * Standard bottom sheet (expanded / full-screen) *
 */

/**
 * *Indicates components with certain corners that cannot be customized.
 */

/**
 * Components that can't have customized shape.-
 * App Bar: Bottom, App Bar: Top, Banner, Checkbox, Divider
 * Expanding bottom sheet (when full screen)
 * Modal bottom sheet (when full screen), Radio button
 * Standard bottom sheet (when full screen), Tabs
 */

val Shapes = Shapes(
    // Default small = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)