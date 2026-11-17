package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f8110eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f8111gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f8112iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    boolean f8113lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f8114nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private EnumC0129iobyxmoadg f8115ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f8116wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    String f8117zoijcleaow;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC0129iobyxmoadg {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public iobyxmoadg(String str, EnumC0129iobyxmoadg enumC0129iobyxmoadg, Object obj, boolean z13) {
        this.f8117zoijcleaow = str;
        this.f8115ppxfxbqfkf = enumC0129iobyxmoadg;
        this.f8112iobyxmoadg = z13;
        gtknphoqwx(obj);
    }

    public static void btonecajqb(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) map.get(str);
            String str2 = iobyxmoadgVar.f8112iobyxmoadg ? str : "set" + str;
            try {
                switch (iobyxmoadgVar.f8115ppxfxbqfkf) {
                    case INT_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(iobyxmoadgVar.f8116wkgbmnqykc));
                        break;
                    case FLOAT_TYPE:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(iobyxmoadgVar.f8110eablkybsjg));
                        break;
                    case COLOR_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(iobyxmoadgVar.f8114nufgyqmvbu));
                        break;
                    case COLOR_DRAWABLE_TYPE:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(iobyxmoadgVar.f8114nufgyqmvbu);
                        method.invoke(view, colorDrawable);
                        break;
                    case STRING_TYPE:
                        cls.getMethod(str2, CharSequence.class).invoke(view, iobyxmoadgVar.f8111gxszxtbevo);
                        break;
                    case BOOLEAN_TYPE:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(iobyxmoadgVar.f8113lqeggnwhkg));
                        break;
                    case DIMENSION_TYPE:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(iobyxmoadgVar.f8110eablkybsjg));
                        break;
                    case REFERENCE_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(iobyxmoadgVar.f8116wkgbmnqykc));
                        break;
                }
            } catch (IllegalAccessException e13) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e13);
            } catch (NoSuchMethodException e14) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e14);
            } catch (InvocationTargetException e15) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e15);
            }
        }
    }

    public static void dxjokdxxww(Context context, XmlPullParser xmlPullParser, HashMap map) {
        EnumC0129iobyxmoadg enumC0129iobyxmoadg;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), nufgyqmvbu.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0129iobyxmoadg enumC0129iobyxmoadg2 = null;
        boolean z13 = false;
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == nufgyqmvbu.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == nufgyqmvbu.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z13 = true;
            } else if (index == nufgyqmvbu.CustomAttribute_customBoolean) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0129iobyxmoadg2 = EnumC0129iobyxmoadg.BOOLEAN_TYPE;
            } else {
                if (index == nufgyqmvbu.CustomAttribute_customColorValue) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == nufgyqmvbu.CustomAttribute_customColorDrawableValue) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == nufgyqmvbu.CustomAttribute_customPixelDimension) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == nufgyqmvbu.CustomAttribute_customDimension) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == nufgyqmvbu.CustomAttribute_customFloatValue) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == nufgyqmvbu.CustomAttribute_customIntegerValue) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == nufgyqmvbu.CustomAttribute_customStringValue) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == nufgyqmvbu.CustomAttribute_customReference) {
                    enumC0129iobyxmoadg = EnumC0129iobyxmoadg.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0129iobyxmoadg2 = enumC0129iobyxmoadg;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new iobyxmoadg(string, enumC0129iobyxmoadg2, objValueOf2, z13));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static HashMap zoijcleaow(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new iobyxmoadg(iobyxmoadgVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new iobyxmoadg(iobyxmoadgVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e13) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e13);
            } catch (NoSuchMethodException e14) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e14);
            } catch (InvocationTargetException e15) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e15);
            }
        }
        return map2;
    }

    public float eablkybsjg() {
        switch (this.f8115ppxfxbqfkf) {
            case INT_TYPE:
                return this.f8116wkgbmnqykc;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f8110eablkybsjg;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f8113lqeggnwhkg ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void gtknphoqwx(Object obj) {
        switch (this.f8115ppxfxbqfkf) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f8116wkgbmnqykc = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f8110eablkybsjg = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f8114nufgyqmvbu = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f8111gxszxtbevo = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f8113lqeggnwhkg = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f8110eablkybsjg = ((Float) obj).floatValue();
                break;
        }
    }

    public void gxszxtbevo(float[] fArr) {
        switch (this.f8115ppxfxbqfkf) {
            case INT_TYPE:
                fArr[0] = this.f8116wkgbmnqykc;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f8110eablkybsjg;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i13 = this.f8114nufgyqmvbu;
                int i14 = (i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i15 = (i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i16 = (i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i17 = i13 & KotlinVersion.MAX_COMPONENT_VALUE;
                float fPow = (float) Math.pow(i15 / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(i16 / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow(i17 / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i14 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f8113lqeggnwhkg ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f8110eablkybsjg;
                return;
            default:
                return;
        }
    }

    public void iobyxmoadg(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f8117zoijcleaow;
        if (this.f8112iobyxmoadg) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (this.f8115ppxfxbqfkf) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f8116wkgbmnqykc));
                    break;
                case FLOAT_TYPE:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f8110eablkybsjg));
                    break;
                case COLOR_TYPE:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f8114nufgyqmvbu));
                    break;
                case COLOR_DRAWABLE_TYPE:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f8114nufgyqmvbu);
                    method.invoke(view, colorDrawable);
                    break;
                case STRING_TYPE:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f8111gxszxtbevo);
                    break;
                case BOOLEAN_TYPE:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f8113lqeggnwhkg));
                    break;
                case DIMENSION_TYPE:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f8110eablkybsjg));
                    break;
                default:
                    break;
            }
        } catch (IllegalAccessException e13) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e13);
        } catch (NoSuchMethodException e14) {
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e14);
        } catch (InvocationTargetException e15) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e15);
        }
    }

    public boolean lqeggnwhkg() {
        int iOrdinal = this.f8115ppxfxbqfkf.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int nufgyqmvbu() {
        int iOrdinal = this.f8115ppxfxbqfkf.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public String ppxfxbqfkf() {
        return this.f8117zoijcleaow;
    }

    public EnumC0129iobyxmoadg wkgbmnqykc() {
        return this.f8115ppxfxbqfkf;
    }

    public iobyxmoadg(iobyxmoadg iobyxmoadgVar, Object obj) {
        this.f8112iobyxmoadg = false;
        this.f8117zoijcleaow = iobyxmoadgVar.f8117zoijcleaow;
        this.f8115ppxfxbqfkf = iobyxmoadgVar.f8115ppxfxbqfkf;
        gtknphoqwx(obj);
    }
}
