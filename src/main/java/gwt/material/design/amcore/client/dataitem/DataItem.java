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
package gwt.material.design.amcore.client.dataitem;

import com.google.gwt.core.client.JsDate;
import gwt.material.design.amcore.client.animation.Animation;
import gwt.material.design.amcore.client.animation.AnimationOptions;
import gwt.material.design.amcore.client.base.BaseObjectsEvents;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.constants.CalculatedValue;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = "am4charts")
public class DataItem extends BaseObjectsEvents {

    @JsProperty
    public Animation[] animations;

    @JsProperty
    public Object categories;

    @JsProperty
    public Object dataContext;

    @JsProperty
    public Object dates;

    @JsProperty
    public double depth;

    @JsProperty
    public boolean hasProperties;

    @JsProperty
    public boolean hidden;

    @JsProperty
    public boolean ignoreMinMax;

    @JsProperty
    public int index;

    @JsProperty
    public boolean isHiding;

    @JsProperty
    public boolean isTemplate;

    @JsProperty
    public Object locations;

    @JsProperty
    public double opacity;

    @JsProperty
    public DataItem parent;

    @JsProperty
    public Object properties;

    @JsProperty
    public Sprite[] sprites;

    @JsProperty
    public Object values;

    @JsProperty
    public boolean visible;

    @JsProperty
    public Object workingLocations;

    @JsProperty
    public Object value;

    @JsProperty
    public Object date;

    @JsProperty
    public int duration;

    @JsProperty
    public Object workingValue;

    @JsMethod
    public native Animation animate(AnimationOptions[] animationOptions, int duration);

    @JsMethod
    public native Animation animate(AnimationOptions[] animationOptions, int duration, Object easing);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native JsDate getDate(String name);

    @JsOverlay
    public final Date _getDate(String name) {
        return new Date((long) getDate(name).getTime());
    }

    @JsMethod
    public native int getDuration();

    @JsMethod
    public native int getDuration(int duration);

    @JsMethod
    public native double getValue(String name);

    /**
     * @param calculatedValue @see {@link CalculatedValue}
     */
    @JsMethod
    public native double getValue(String name, String calculatedValue);

    @JsMethod
    public native double getWorkingValue(String name);

    @JsMethod
    public native Animation hide();

    @JsMethod
    public native Animation hide(int duration, int delay, double toValue, String[] fields);

    @JsMethod
    public native void setCalculatedValue(String name, double value);

    /**
     * @param calculatedValue @see {@link CalculatedValue}
     */
    @JsMethod
    public native void setCalculatedValue(String name, double value, String calculatedValue);

    @JsMethod
    public native void setCategory(String name, String value);

    @JsMethod
    public native void setDate(String name, JsDate date);

    @JsOverlay
    public final void setDate(String name, Date date) {
        setDate(name, JsDate.create(date.getTime()));
    }

    @JsMethod
    public native void setDate(String name, JsDate date, int duration);

    @JsOverlay
    public final void setDate(String name, Date date, int duration) {
        setDate(name, JsDate.create(date.getTime()), duration);
    }

    @JsMethod
    public native void setLocation(String name, double value);

    @JsMethod
    public native void setLocation(String name, double value, int duration, int delay);

    @JsMethod
    public native void setProperty(String name, Object value);

    @JsMethod
    public native void setValue(String name, double value);

    @JsMethod
    public native void setValue(String name, double value, int duration, int delay);

    @JsMethod
    public native void setVisibility(boolean value);

    @JsMethod
    public native void setVisibility(boolean value, boolean noChangeValues);

    @JsMethod
    public native void setWorkingLocation(String name, double value);

    @JsMethod
    public native void setWorkingLocation(String name, double value, int duration, int delay);

    @JsMethod
    public native void setWorkingValue(String name, double value);

    @JsMethod
    public native void setWorkingValue(String name, double value, int duration, int delay);

    @JsMethod
    public native void show();

    @JsMethod
    public native void show(int duration, int delay, String[] fields);
}
