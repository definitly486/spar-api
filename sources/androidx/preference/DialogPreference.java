package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private Drawable f12342czzsidtyhn;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private CharSequence f12343metgxyhuhe;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private CharSequence f12344rlfsiqarku;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private CharSequence f12345uwvvkdfqfp;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private int f12346ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private CharSequence f12347yfnezrywwk;

    public interface iobyxmoadg {
        Preference rgvfuqvkyq(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdvldrhtss.DialogPreference, i13, i14);
        String strWflxmlrfwp = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.DialogPreference_dialogTitle, vdvldrhtss.DialogPreference_android_dialogTitle);
        this.f12343metgxyhuhe = strWflxmlrfwp;
        if (strWflxmlrfwp == null) {
            this.f12343metgxyhuhe = esjtqupxsv();
        }
        this.f12344rlfsiqarku = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.DialogPreference_dialogMessage, vdvldrhtss.DialogPreference_android_dialogMessage);
        this.f12342czzsidtyhn = i1.gtknphoqwx.ppxfxbqfkf(typedArrayObtainStyledAttributes, vdvldrhtss.DialogPreference_dialogIcon, vdvldrhtss.DialogPreference_android_dialogIcon);
        this.f12345uwvvkdfqfp = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.DialogPreference_positiveButtonText, vdvldrhtss.DialogPreference_android_positiveButtonText);
        this.f12347yfnezrywwk = i1.gtknphoqwx.wflxmlrfwp(typedArrayObtainStyledAttributes, vdvldrhtss.DialogPreference_negativeButtonText, vdvldrhtss.DialogPreference_android_negativeButtonText);
        this.f12346ydmasvzmpa = i1.gtknphoqwx.draadjrbmk(typedArrayObtainStyledAttributes, vdvldrhtss.DialogPreference_dialogLayout, vdvldrhtss.DialogPreference_android_dialogLayout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void jpowsppfya() {
        jyumaefscl().ojitshcjhn(this);
    }

    public Drawable lrnfpwlwnk() {
        return this.f12342czzsidtyhn;
    }

    public CharSequence nuxfzjnpeb() {
        return this.f12344rlfsiqarku;
    }

    public CharSequence roivzttewh() {
        return this.f12347yfnezrywwk;
    }

    public CharSequence tbqsvytpvh() {
        return this.f12343metgxyhuhe;
    }

    public CharSequence uawqvzlxes() {
        return this.f12345uwvvkdfqfp;
    }

    public int zeieaojujs() {
        return this.f12346ydmasvzmpa;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i1.gtknphoqwx.iobyxmoadg(context, dxjokdxxww.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
