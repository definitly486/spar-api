package c0;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f17840iobyxmoadg;

    private static class iobyxmoadg {
        static void eablkybsjg(ViewStructure viewStructure, int i13, String str, String str2, String str3) {
            viewStructure.setId(i13, str, str2, str3);
        }

        static void gxszxtbevo(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static Bundle iobyxmoadg(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void lqeggnwhkg(ViewStructure viewStructure, float f13, int i13, int i14, int i15) {
            viewStructure.setTextStyle(f13, i13, i14, i15);
        }

        static void ppxfxbqfkf(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void wkgbmnqykc(ViewStructure viewStructure, int i13, int i14, int i15, int i16, int i17, int i18) {
            viewStructure.setDimens(i13, i14, i15, i16, i17, i18);
        }

        static void zoijcleaow(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }
    }

    private eablkybsjg(ViewStructure viewStructure) {
        this.f17840iobyxmoadg = viewStructure;
    }

    public static eablkybsjg dxjokdxxww(ViewStructure viewStructure) {
        return new eablkybsjg(viewStructure);
    }

    public void eablkybsjg(int i13, String str, String str2, String str3) {
        iobyxmoadg.eablkybsjg((ViewStructure) this.f17840iobyxmoadg, i13, str, str2, str3);
    }

    public void gxszxtbevo(CharSequence charSequence) {
        iobyxmoadg.gxszxtbevo((ViewStructure) this.f17840iobyxmoadg, charSequence);
    }

    public Bundle iobyxmoadg() {
        return iobyxmoadg.iobyxmoadg((ViewStructure) this.f17840iobyxmoadg);
    }

    public void lqeggnwhkg(float f13, int i13, int i14, int i15) {
        iobyxmoadg.lqeggnwhkg((ViewStructure) this.f17840iobyxmoadg, f13, i13, i14, i15);
    }

    public ViewStructure nufgyqmvbu() {
        return (ViewStructure) this.f17840iobyxmoadg;
    }

    public void ppxfxbqfkf(CharSequence charSequence) {
        iobyxmoadg.ppxfxbqfkf((ViewStructure) this.f17840iobyxmoadg, charSequence);
    }

    public void wkgbmnqykc(int i13, int i14, int i15, int i16, int i17, int i18) {
        iobyxmoadg.wkgbmnqykc((ViewStructure) this.f17840iobyxmoadg, i13, i14, i15, i16, i17, i18);
    }

    public void zoijcleaow(String str) {
        iobyxmoadg.zoijcleaow((ViewStructure) this.f17840iobyxmoadg, str);
    }
}
