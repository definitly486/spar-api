package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.stevsuqkhv;
import androidx.collection.jztzpxfvev;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object[] f2683iobyxmoadg = new Object[2];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Class[] f2682zoijcleaow = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f2680ppxfxbqfkf = {R.attr.onClick};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f2681wkgbmnqykc = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f2676eablkybsjg = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int[] f2677gxszxtbevo = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String[] f2678lqeggnwhkg = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final jztzpxfvev f2679nufgyqmvbu = new jztzpxfvev();

    private static class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private Context f2684iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Method f2685jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f2686yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final View f2687zdlpuopuiu;

        public iobyxmoadg(View view, String str) {
            this.f2687zdlpuopuiu = view;
            this.f2686yggfygwlhe = str;
        }

        private void iobyxmoadg(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2686yggfygwlhe, View.class)) != null) {
                        this.f2685jyumaefscl = method;
                        this.f2684iwizpuwonk = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f2687zdlpuopuiu.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f2687zdlpuopuiu.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2686yggfygwlhe + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2687zdlpuopuiu.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f2685jyumaefscl == null) {
                iobyxmoadg(this.f2687zdlpuopuiu.getContext());
            }
            try {
                this.f2685jyumaefscl.invoke(this.f2684iwizpuwonk, view);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException("Could not execute method for android:onClick", e14);
            }
        }
    }

    private void iobyxmoadg(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2681wkgbmnqykc);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            jhduphickx.bfopjjpdmp(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2676eablkybsjg);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            jhduphickx.iyctptxqzt(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2677gxszxtbevo);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            jhduphickx.hszhottldk(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void jyumaefscl(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    private View kcexrzcfyt(Context context, String str, String str2) {
        String str3;
        jztzpxfvev jztzpxfvevVar = f2679nufgyqmvbu;
        Constructor constructor = (Constructor) jztzpxfvevVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2682zoijcleaow);
            jztzpxfvevVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2683iobyxmoadg);
    }

    private static Context yggfygwlhe(Context context, AttributeSet attributeSet, boolean z13, boolean z14) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.View, 0, 0);
        int resourceId = z13 ? typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.View_android_theme, 0) : 0;
        if (z14 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof androidx.appcompat.view.wkgbmnqykc) && ((androidx.appcompat.view.wkgbmnqykc) context).ppxfxbqfkf() == resourceId) ? context : new androidx.appcompat.view.wkgbmnqykc(context, resourceId);
        }
        return context;
    }

    private View zdlpuopuiu(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f2683iobyxmoadg;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return kcexrzcfyt(context, str, null);
            }
            int i13 = 0;
            while (true) {
                String[] strArr = f2678lqeggnwhkg;
                if (i13 >= strArr.length) {
                    return null;
                }
                View viewKcexrzcfyt = kcexrzcfyt(context, str, strArr[i13]);
                if (viewKcexrzcfyt != null) {
                    return viewKcexrzcfyt;
                }
                i13++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f2683iobyxmoadg;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private void zoijcleaow(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2680ppxfxbqfkf);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new iobyxmoadg(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    protected AppCompatSpinner agtfadlqog(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected androidx.appcompat.widget.wflxmlrfwp btonecajqb(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.wflxmlrfwp(context, attributeSet);
    }

    protected AppCompatRatingBar draadjrbmk(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    protected AppCompatImageView dxjokdxxww(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected AppCompatCheckBox eablkybsjg(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    protected AppCompatRadioButton gtknphoqwx(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.eablkybsjg gxszxtbevo(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.eablkybsjg(context, attributeSet);
    }

    protected AppCompatEditText lqeggnwhkg(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    protected AppCompatImageButton nufgyqmvbu(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    protected AppCompatTextView ojitshcjhn(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View oxmwwwfdhm(View view, String str, Context context, AttributeSet attributeSet, boolean z13, boolean z14, boolean z15, boolean z16) {
        View viewDraadjrbmk;
        Context context2 = (!z13 || view == null) ? context : view.getContext();
        if (z14 || z15) {
            context2 = yggfygwlhe(context2, attributeSet, z14, z15);
        }
        if (z16) {
            context2 = stevsuqkhv.zoijcleaow(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewDraadjrbmk = draadjrbmk(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "CheckedTextView":
                viewDraadjrbmk = gxszxtbevo(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "MultiAutoCompleteTextView":
                viewDraadjrbmk = btonecajqb(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "TextView":
                viewDraadjrbmk = ojitshcjhn(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "ImageButton":
                viewDraadjrbmk = nufgyqmvbu(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "SeekBar":
                viewDraadjrbmk = wflxmlrfwp(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "Spinner":
                viewDraadjrbmk = agtfadlqog(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "RadioButton":
                viewDraadjrbmk = gtknphoqwx(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "ToggleButton":
                viewDraadjrbmk = rgvfuqvkyq(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "ImageView":
                viewDraadjrbmk = dxjokdxxww(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "AutoCompleteTextView":
                viewDraadjrbmk = ppxfxbqfkf(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "CheckBox":
                viewDraadjrbmk = eablkybsjg(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "EditText":
                viewDraadjrbmk = lqeggnwhkg(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            case "Button":
                viewDraadjrbmk = wkgbmnqykc(context2, attributeSet);
                jyumaefscl(viewDraadjrbmk, str);
                break;
            default:
                viewDraadjrbmk = vdvldrhtss(context2, str, attributeSet);
                break;
        }
        if (viewDraadjrbmk == null && context != context2) {
            viewDraadjrbmk = zdlpuopuiu(context2, str, attributeSet);
        }
        if (viewDraadjrbmk != null) {
            zoijcleaow(viewDraadjrbmk, attributeSet);
            iobyxmoadg(context2, viewDraadjrbmk, attributeSet);
        }
        return viewDraadjrbmk;
    }

    protected androidx.appcompat.widget.ppxfxbqfkf ppxfxbqfkf(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ppxfxbqfkf(context, attributeSet);
    }

    protected androidx.appcompat.widget.cqumvgiudr rgvfuqvkyq(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.cqumvgiudr(context, attributeSet);
    }

    protected View vdvldrhtss(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    protected androidx.appcompat.widget.vdvldrhtss wflxmlrfwp(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.vdvldrhtss(context, attributeSet);
    }

    protected AppCompatButton wkgbmnqykc(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }
}
