package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class metgxyhuhe {
    public static final float iobyxmoadg(int i13, int i14, boolean z13) {
        return z13 ? zoijcleaow(i13, i14) + 100 : zoijcleaow(i13, i14);
    }

    public static final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, xrmfcynszj xrmfcynszjVar, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, boolean z14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1070136913, i13, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = wkgbmnqykcVar.eablkybsjg(new LazyLayoutSemanticsModifier(iobyxmoadgVar, xrmfcynszjVar, jlmebxxooxVar, z13, z14));
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return wkgbmnqykcVarEablkybsjg;
    }

    public static final float zoijcleaow(int i13, int i14) {
        return i14 + (i13 * 500);
    }
}
