package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final int f5523dxjokdxxww = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.draadjrbmk f5524eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f5525gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw f5526iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Object f5527lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f5528nufgyqmvbu = true;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final u0 f5529ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iwxlajgraz f5530wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f5531zoijcleaow;

    public b(istkbnxepw istkbnxepwVar, Object obj, boolean z13, u0 u0Var, iwxlajgraz iwxlajgrazVar, tg.draadjrbmk draadjrbmkVar, boolean z14) {
        this.f5526iobyxmoadg = istkbnxepwVar;
        this.f5531zoijcleaow = z13;
        this.f5529ppxfxbqfkf = u0Var;
        this.f5530wkgbmnqykc = iwxlajgrazVar;
        this.f5524eablkybsjg = draadjrbmkVar;
        this.f5525gxszxtbevo = z14;
        this.f5527lqeggnwhkg = obj;
    }

    public final boolean btonecajqb() {
        return (this.f5531zoijcleaow || lqeggnwhkg() != null) && !this.f5525gxszxtbevo;
    }

    public final boolean dxjokdxxww() {
        return this.f5525gxszxtbevo;
    }

    public final u0 eablkybsjg() {
        return this.f5529ppxfxbqfkf;
    }

    public final iwxlajgraz gxszxtbevo() {
        return this.f5530wkgbmnqykc;
    }

    public final boolean iobyxmoadg() {
        return this.f5528nufgyqmvbu;
    }

    public final Object lqeggnwhkg() {
        return this.f5527lqeggnwhkg;
    }

    public final b nufgyqmvbu() {
        this.f5528nufgyqmvbu = false;
        return this;
    }

    public final tg.draadjrbmk ppxfxbqfkf() {
        return this.f5524eablkybsjg;
    }

    public final Object wkgbmnqykc() {
        if (this.f5531zoijcleaow) {
            return null;
        }
        iwxlajgraz iwxlajgrazVar = this.f5530wkgbmnqykc;
        if (iwxlajgrazVar != null) {
            return iwxlajgrazVar.getValue();
        }
        Object obj = this.f5527lqeggnwhkg;
        if (obj != null) {
            return obj;
        }
        jyumaefscl.yggfygwlhe("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final istkbnxepw zoijcleaow() {
        return this.f5526iobyxmoadg;
    }
}
