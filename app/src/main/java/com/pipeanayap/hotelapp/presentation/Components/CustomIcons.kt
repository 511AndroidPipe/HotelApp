package com.pipeanayap.hotelapp.presentation.Components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Lock: ImageVector
    get() {
        if (_Lock != null) {
            return _Lock!!
        }
        _Lock = ImageVector.Builder(
            name = "Lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 40f)
                reflectiveQuadToRelative(141.5f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-400f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 600f)
                reflectiveQuadToRelative(-23.5f, -56.5f)
                reflectiveQuadTo(480f, 520f)
                reflectiveQuadToRelative(-56.5f, 23.5f)
                reflectiveQuadTo(400f, 600f)
                reflectiveQuadToRelative(23.5f, 56.5f)
                reflectiveQuadTo(480f, 680f)
                moveTo(360f, 320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                reflectiveQuadToRelative(-85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                close()
                moveTo(240f, 800f)
                verticalLineToRelative(-400f)
                close()
            }
        }.build()
        return _Lock!!
    }

private var _Lock: ImageVector? = null

public val Visibility: ImageVector
    get() {
        if (_Visibility != null) {
            return _Visibility!!
        }
        _Visibility = ImageVector.Builder(
            name = "Visibility",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 640f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 460f)
                reflectiveQuadToRelative(-52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                reflectiveQuadToRelative(-127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                reflectiveQuadToRelative(52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                moveToRelative(0f, -72f)
                quadToRelative(-45f, 0f, -76.5f, -31.5f)
                reflectiveQuadTo(372f, 460f)
                reflectiveQuadToRelative(31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                reflectiveQuadToRelative(76.5f, 31.5f)
                reflectiveQuadTo(588f, 460f)
                reflectiveQuadToRelative(-31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                moveToRelative(0f, 192f)
                quadToRelative(-146f, 0f, -266f, -81.5f)
                reflectiveQuadTo(40f, 460f)
                quadToRelative(54f, -137f, 174f, -218.5f)
                reflectiveQuadTo(480f, 160f)
                reflectiveQuadToRelative(266f, 81.5f)
                reflectiveQuadTo(920f, 460f)
                quadToRelative(-54f, 137f, -174f, 218.5f)
                reflectiveQuadTo(480f, 760f)
                moveToRelative(0f, -80f)
                quadToRelative(113f, 0f, 207.5f, -59.5f)
                reflectiveQuadTo(832f, 460f)
                quadToRelative(-50f, -101f, -144.5f, -160.5f)
                reflectiveQuadTo(480f, 240f)
                reflectiveQuadToRelative(-207.5f, 59.5f)
                reflectiveQuadTo(128f, 460f)
                quadToRelative(50f, 101f, 144.5f, 160.5f)
                reflectiveQuadTo(480f, 680f)
            }
        }.build()
        return _Visibility!!
    }

private var _Visibility: ImageVector? = null

public val Visibility_off: ImageVector
    get() {
        if (_Visibility_off != null) {
            return _Visibility_off!!
        }
        _Visibility_off = ImageVector.Builder(
            name = "Visibility_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(644f, 532f)
                lineToRelative(-58f, -58f)
                quadToRelative(9f, -47f, -27f, -88f)
                reflectiveQuadToRelative(-93f, -32f)
                lineToRelative(-58f, -58f)
                quadToRelative(17f, -8f, 34.5f, -12f)
                reflectiveQuadToRelative(37.5f, -4f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(660f, 460f)
                quadToRelative(0f, 20f, -4f, 37.5f)
                reflectiveQuadTo(644f, 532f)
                moveToRelative(128f, 126f)
                lineToRelative(-58f, -56f)
                quadToRelative(38f, -29f, 67.5f, -63.5f)
                reflectiveQuadTo(832f, 460f)
                quadToRelative(-50f, -101f, -143.5f, -160.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-29f, 0f, -57f, 4f)
                reflectiveQuadToRelative(-55f, 12f)
                lineToRelative(-62f, -62f)
                quadToRelative(41f, -17f, 84f, -25.5f)
                reflectiveQuadToRelative(90f, -8.5f)
                quadToRelative(151f, 0f, 269f, 83.5f)
                reflectiveQuadTo(920f, 460f)
                quadToRelative(-23f, 59f, -60.5f, 109.5f)
                reflectiveQuadTo(772f, 658f)
                moveToRelative(20f, 246f)
                lineTo(624f, 738f)
                quadToRelative(-35f, 11f, -70.5f, 16.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-151f, 0f, -269f, -83.5f)
                reflectiveQuadTo(40f, 460f)
                quadToRelative(21f, -53f, 53f, -98.5f)
                reflectiveQuadToRelative(73f, -81.5f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                close()
                moveTo(222f, 336f)
                quadToRelative(-29f, 26f, -53f, 57f)
                reflectiveQuadToRelative(-41f, 67f)
                quadToRelative(50f, 101f, 143.5f, 160.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(20f, 0f, 39f, -2.5f)
                reflectiveQuadToRelative(39f, -5.5f)
                lineToRelative(-36f, -38f)
                quadToRelative(-11f, 3f, -21f, 4.5f)
                reflectiveQuadToRelative(-21f, 1.5f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, -11f, 1.5f, -21f)
                reflectiveQuadToRelative(4.5f, -21f)
                close()
                moveToRelative(168f, 168f)
            }
        }.build()
        return _Visibility_off!!
    }

private var _Visibility_off: ImageVector? = null
public val Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(585f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                close()
            }
        }.build()
        return _Logout!!
    }

private var _Logout: ImageVector? = null

public val Title: ImageVector
    get() {
        if (_Title != null) {
            return _Title!!
        }
        _Title = ImageVector.Builder(
            name = "Title",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(420f, 800f)
                verticalLineToRelative(-520f)
                horizontalLineTo(200f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(120f)
                horizontalLineTo(540f)
                verticalLineToRelative(520f)
                close()
            }
        }.build()
        return _Title!!
    }

private var _Title: ImageVector? = null

public val Description: ImageVector
    get() {
        if (_Description != null) {
            return _Description!!
        }
        _Description = ImageVector.Builder(
            name = "Description",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(320f, 720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(280f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                close()
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        return _Description!!
    }

private var _Description: ImageVector? = null

public val Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = ImageVector.Builder(
            name = "Bar_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(640f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        return _chart!!
    }

private var _chart: ImageVector? = null


public val Bitcoin: ImageVector
    get() {
        if (_Bitcoin != null) {
            return _Bitcoin!!
        }
        _Bitcoin = ImageVector.Builder(
            name = "CurrencyBitcoin",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.5f, 13f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -0.25f)
                verticalLineTo(13f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -0.25f)
                verticalLineTo(13f)
                horizontalLineToRelative(0.084f)
                curveToRelative(1.992f, 0f, 3.416f, -1.033f, 3.416f, -2.82f)
                curveToRelative(0f, -1.502f, -1.007f, -2.323f, -2.186f, -2.44f)
                verticalLineToRelative(-0.088f)
                curveToRelative(0.97f, -0.242f, 1.683f, -0.974f, 1.683f, -2.19f)
                curveTo(11.997f, 3.93f, 10.847f, 3f, 9.092f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -0.25f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineTo(3f)
                horizontalLineToRelative(-0.573f)
                verticalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, -0.25f)
                horizontalLineTo(5.75f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineTo(3f)
                lineToRelative(-1.998f, 0.011f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineToRelative(0.989f)
                curveToRelative(0f, 0.137f, 0.11f, 0.25f, 0.248f, 0.25f)
                lineToRelative(0.755f, -0.005f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.745f, 0.75f)
                verticalLineToRelative(5.505f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                lineToRelative(-0.748f, 0.011f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 0.25f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
                moveToRelative(1.427f, -8.513f)
                horizontalLineToRelative(1.719f)
                curveToRelative(0.906f, 0f, 1.438f, 0.498f, 1.438f, 1.312f)
                curveToRelative(0f, 0.871f, -0.575f, 1.362f, -1.877f, 1.362f)
                horizontalLineToRelative(-1.28f)
                close()
                moveToRelative(0f, 4.051f)
                horizontalLineToRelative(1.84f)
                curveToRelative(1.137f, 0f, 1.756f, 0.58f, 1.756f, 1.524f)
                curveToRelative(0f, 0.953f, -0.626f, 1.45f, -2.158f, 1.45f)
                horizontalLineTo(6.927f)
                close()
            }
        }.build()
        return _Bitcoin!!
    }

private var _Bitcoin: ImageVector? = null


val Account_balance: ImageVector
    get() {
        if (_Account_balance != null) return _Account_balance!!

        _Account_balance = ImageVector.Builder(
            name = "Account_balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(600f, -160f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                close()
                moveTo(80f, 320f)
                verticalLineToRelative(-80f)
                lineToRelative(400f, -200f)
                lineToRelative(400f, 200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(178f, -80f)
                horizontalLineToRelative(444f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(444f)
                lineTo(480f, 130f)
                close()
            }
        }.build()

        return _Account_balance!!
    }

private var _Account_balance: ImageVector? = null



val EditCalendar: ImageVector
    get() {
        if (_editCalendar != null) return _editCalendar!!

        _editCalendar = ImageVector.Builder(
            name = "EditCalendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                close()
                moveTo(560f, 880f)
                verticalLineToRelative(-123f)
                lineToRelative(221f, -220f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                reflectiveQuadToRelative(-4f, 22.5f)
                reflectiveQuadToRelative(-13f, 20.5f)
                lineTo(683f, 880f)
                close()
                moveToRelative(300f, -263f)
                lineToRelative(-37f, -37f)
                close()
                moveTo(620f, 820f)
                horizontalLineToRelative(38f)
                lineToRelative(121f, -122f)
                lineToRelative(-18f, -19f)
                lineToRelative(-19f, -18f)
                lineToRelative(-122f, 121f)
                close()
                moveToRelative(141f, -141f)
                lineToRelative(-19f, -18f)
                lineToRelative(37f, 37f)
                close()
            }
        }.build()

        return _editCalendar!!
    }

private var _editCalendar: ImageVector? = null

val BedDouble: ImageVector
    get() {
        if (_BedDouble != null) return _BedDouble!!

        _BedDouble = ImageVector.Builder(
            name = "BedDouble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 20f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                moveTo(4f, 10f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                moveToRelative(-8f, -6f)
                verticalLineToRelative(6f)
                moveTo(2f, 18f)
                horizontalLineToRelative(20f)
            }
        }.build()

        return _BedDouble!!
    }

private var _BedDouble: ImageVector? = null


val HandPlatter: ImageVector
    get() {
        if (_HandPlatter != null) return _HandPlatter!!

        _HandPlatter = ImageVector.Builder(
            name = "HandPlatter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(2f)
                moveToRelative(-7f, 8f)
                arcToRelative(7.1f, 7.1f, 0f, false, true, 14f, 0f)
                moveTo(4f, 10f)
                horizontalLineToRelative(16f)
                moveTo(2f, 14f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(15.4f, 17.4f)
                lineToRelative(3.2f, -2.8f)
                arcToRelative(2f, 2f, 0f, false, true, 2.8f, 2.9f)
                lineToRelative(-3.6f, 3.3f)
                curveToRelative(-0.7f, 0.8f, -1.7f, 1.2f, -2.8f, 1.2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2.1f, -0.4f, -2.8f, -1.2f)
                lineTo(5f, 18f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(7f)
                horizontalLineTo(2f)
            }
        }.build()

        return _HandPlatter!!
    }

private var _HandPlatter: ImageVector? = null


val People: ImageVector
    get() {
        if (_People != null) return _People!!

        _People = ImageVector.Builder(
            name = "People",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(15f, 14f)
                reflectiveCurveToRelative(1f, 0f, 1f, -1f)
                reflectiveCurveToRelative(-1f, -4f, -5f, -4f)
                reflectiveCurveToRelative(-5f, 3f, -5f, 4f)
                reflectiveCurveToRelative(1f, 1f, 1f, 1f)
                close()
                moveToRelative(-7.978f, -1f)
                lineTo(7f, 12.996f)
                curveToRelative(0.001f, -0.264f, 0.167f, -1.03f, 0.76f, -1.72f)
                curveTo(8.312f, 10.629f, 9.282f, 10f, 11f, 10f)
                curveToRelative(1.717f, 0f, 2.687f, 0.63f, 3.24f, 1.276f)
                curveToRelative(0.593f, 0.69f, 0.758f, 1.457f, 0.76f, 1.72f)
                lineToRelative(-0.008f, 0.002f)
                lineToRelative(-0.014f, 0.002f)
                close()
                moveTo(11f, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                moveToRelative(3f, -2f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveTo(6.936f, 9.28f)
                arcToRelative(6f, 6f, 0f, false, false, -1.23f, -0.247f)
                arcTo(7f, 7f, 0f, false, false, 5f, 9f)
                curveToRelative(-4f, 0f, -5f, 3f, -5f, 4f)
                quadToRelative(0f, 1f, 1f, 1f)
                horizontalLineToRelative(4.216f)
                arcTo(2.24f, 2.24f, 0f, false, true, 5f, 13f)
                curveToRelative(0f, -1.01f, 0.377f, -2.042f, 1.09f, -2.904f)
                curveToRelative(0.243f, -0.294f, 0.526f, -0.569f, 0.846f, -0.816f)
                moveTo(4.92f, 10f)
                arcTo(5.5f, 5.5f, 0f, false, false, 4f, 13f)
                horizontalLineTo(1f)
                curveToRelative(0f, -0.26f, 0.164f, -1.03f, 0.76f, -1.724f)
                curveToRelative(0.545f, -0.636f, 1.492f, -1.256f, 3.16f, -1.275f)
                close()
                moveTo(1.5f, 5.5f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                moveToRelative(3f, -2f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
            }
        }.build()

        return _People!!
    }

private var _People: ImageVector? = null



val Banknote: ImageVector
    get() {
        if (_Banknote != null) return _Banknote!!

        _Banknote = ImageVector.Builder(
            name = "Banknote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, false, true, 20f, 18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 2f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, false, true, 4f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(0.01f)
                moveTo(18f, 12f)
                horizontalLineToRelative(0.01f)
            }
        }.build()

        return _Banknote!!
    }

private var _Banknote: ImageVector? = null