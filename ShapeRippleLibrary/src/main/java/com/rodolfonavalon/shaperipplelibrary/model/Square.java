/*
 * Copyright 2016 Rodolfo Navalon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rodolfonavalon.shaperipplelibrary.model;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Square extends BaseShapeRipple {

    private Rect rect;

    public Square() {
        rect = new Rect();
    }
    @Override
    public void draw(Canvas canvas, int x, int y, float currentRadiusSize, int currentColor, int rippleIndex) {
        rect.left = (int)(x - currentRadiusSize);
        rect.right = (int)(x + currentRadiusSize);
        rect.top = (int)(y - currentRadiusSize);
        rect.bottom = (int)(y + currentRadiusSize);

        shapePaint.setColor(currentColor);
        canvas.drawRect(rect , shapePaint);
    }
}
