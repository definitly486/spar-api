package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    void agtfadlqog() {
    }

    public abstract int btonecajqb();

    public boolean draadjrbmk() {
        return false;
    }

    public abstract void dxjokdxxww(boolean z13);

    public abstract Context gtknphoqwx();

    public abstract void kcexrzcfyt(boolean z13);

    public boolean lqeggnwhkg() {
        return false;
    }

    public abstract boolean nufgyqmvbu();

    public abstract boolean ojitshcjhn(int i13, KeyEvent keyEvent);

    public abstract void oxmwwwfdhm(boolean z13);

    public boolean rgvfuqvkyq(KeyEvent keyEvent) {
        return false;
    }

    public boolean vdvldrhtss() {
        return false;
    }

    public void wflxmlrfwp(Configuration configuration) {
    }

    public androidx.appcompat.view.zoijcleaow yggfygwlhe(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return null;
    }

    public abstract void zdlpuopuiu(CharSequence charSequence);

    /* JADX INFO: renamed from: androidx.appcompat.app.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C0067iobyxmoadg extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f2634iobyxmoadg;

        public C0067iobyxmoadg(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2634iobyxmoadg = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.ActionBarLayout);
            this.f2634iobyxmoadg = typedArrayObtainStyledAttributes.getInt(lqeggnwhkg.btonecajqb.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0067iobyxmoadg(int i13, int i14) {
            super(i13, i14);
            this.f2634iobyxmoadg = 8388627;
        }

        public C0067iobyxmoadg(C0067iobyxmoadg c0067iobyxmoadg) {
            super((ViewGroup.MarginLayoutParams) c0067iobyxmoadg);
            this.f2634iobyxmoadg = 0;
            this.f2634iobyxmoadg = c0067iobyxmoadg.f2634iobyxmoadg;
        }

        public C0067iobyxmoadg(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2634iobyxmoadg = 0;
        }
    }
}
