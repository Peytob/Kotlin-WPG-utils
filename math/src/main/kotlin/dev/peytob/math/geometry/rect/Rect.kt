package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.Vec2

interface Rect<T : Number> {

    val topLeft: Vec2<T>

    val topRight: Vec2<T>

    val bottomRight: Vec2<T>

    val bottomLeft: Vec2<T>

    val size: Vec2<T>
}
