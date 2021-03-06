/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
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
 * #L%
 */
package gwt.material.design.amcharts.client.tick;

import gwt.material.design.amcharts.client.axis.Axis;
import gwt.material.design.amcore.client.constants.RotationDirection;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.ui.Circle;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.base.Percent;
import gwt.material.design.amcore.client.ui.Trapezoid;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class ClockHand extends Container {

    @JsProperty
    public Axis axis;

    @JsProperty
    public double endWidth;

    @JsProperty
    public Trapezoid hand;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object innerRadius;

    @JsProperty
    public Circle pin;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object radius;

    /**
     * @see RotationDirection
     */
    @JsProperty
    public String rotationDirection;

    @JsProperty
    public double startWidth;

    @JsProperty
    public double value;

    @JsProperty
    public SpriteEventDispatcher<ClockHand> events;

    @JsMethod
    public native void showValue(double value);

    @JsMethod
    public native void showValue(double value, int duration);

    @JsMethod
    public native void showValue(double value, int duration, Object easing);
}
