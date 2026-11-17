package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ppxfxbqfkf f12491btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private zoijcleaow f12492draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private PreferenceScreen f12493dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f12494eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private iobyxmoadg f12495gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f12496gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f12497iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f12498lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private SharedPreferences f12500ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private SharedPreferences.Editor f12501wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f12502zoijcleaow = 0;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f12499nufgyqmvbu = 0;

    public interface iobyxmoadg {
        void kcexrzcfyt(Preference preference);
    }

    public interface ppxfxbqfkf {
        boolean zdlpuopuiu(Preference preference);
    }

    public static abstract class wkgbmnqykc {
    }

    public interface zoijcleaow {
        void draadjrbmk(PreferenceScreen preferenceScreen);
    }

    public gxszxtbevo(Context context) {
        this.f12497iobyxmoadg = context;
        wflxmlrfwp(zoijcleaow(context));
    }

    private static String zoijcleaow(Context context) {
        return context.getPackageName() + "_preferences";
    }

    boolean agtfadlqog() {
        return !this.f12494eablkybsjg;
    }

    public void btonecajqb(iobyxmoadg iobyxmoadgVar) {
        this.f12495gtknphoqwx = iobyxmoadgVar;
    }

    public void draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f12491btonecajqb = ppxfxbqfkfVar;
    }

    public SharedPreferences dxjokdxxww() {
        lqeggnwhkg();
        if (this.f12500ppxfxbqfkf == null) {
            this.f12500ppxfxbqfkf = (this.f12499nufgyqmvbu != 1 ? this.f12497iobyxmoadg : androidx.core.content.iobyxmoadg.createDeviceProtectedStorageContext(this.f12497iobyxmoadg)).getSharedPreferences(this.f12496gxszxtbevo, this.f12498lqeggnwhkg);
        }
        return this.f12500ppxfxbqfkf;
    }

    public ppxfxbqfkf eablkybsjg() {
        return this.f12491btonecajqb;
    }

    public void gtknphoqwx(zoijcleaow zoijcleaowVar) {
        this.f12492draadjrbmk = zoijcleaowVar;
    }

    public wkgbmnqykc gxszxtbevo() {
        return null;
    }

    public Preference iobyxmoadg(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f12493dxjokdxxww;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.lrnfpwlwnk(charSequence);
    }

    public androidx.preference.ppxfxbqfkf lqeggnwhkg() {
        return null;
    }

    public PreferenceScreen nufgyqmvbu() {
        return this.f12493dxjokdxxww;
    }

    public void ojitshcjhn(Preference preference) {
        iobyxmoadg iobyxmoadgVar = this.f12495gtknphoqwx;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.kcexrzcfyt(preference);
        }
    }

    SharedPreferences.Editor ppxfxbqfkf() {
        if (!this.f12494eablkybsjg) {
            return dxjokdxxww().edit();
        }
        if (this.f12501wkgbmnqykc == null) {
            this.f12501wkgbmnqykc = dxjokdxxww().edit();
        }
        return this.f12501wkgbmnqykc;
    }

    public void wflxmlrfwp(String str) {
        this.f12496gxszxtbevo = str;
        this.f12500ppxfxbqfkf = null;
    }

    public zoijcleaow wkgbmnqykc() {
        return this.f12492draadjrbmk;
    }
}
