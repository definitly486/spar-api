package md;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gd.iobyxmoadg f66817zoijcleaow = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Bundle f66818iobyxmoadg;

    public gxszxtbevo() {
        this(new Bundle());
    }

    private lqeggnwhkg wkgbmnqykc(String str) {
        if (!iobyxmoadg(str)) {
            return lqeggnwhkg.iobyxmoadg();
        }
        try {
            return lqeggnwhkg.zoijcleaow((Integer) this.f66818iobyxmoadg.get(str));
        } catch (ClassCastException e13) {
            f66817zoijcleaow.zoijcleaow("Metadata key %s contains type other than int: %s", str, e13.getMessage());
            return lqeggnwhkg.iobyxmoadg();
        }
    }

    public lqeggnwhkg eablkybsjg(String str) {
        lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(str);
        return lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() ? lqeggnwhkg.eablkybsjg(Long.valueOf(((Integer) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).intValue())) : lqeggnwhkg.iobyxmoadg();
    }

    public boolean iobyxmoadg(String str) {
        return str != null && this.f66818iobyxmoadg.containsKey(str);
    }

    public lqeggnwhkg ppxfxbqfkf(String str) {
        Object obj;
        if (iobyxmoadg(str) && (obj = this.f66818iobyxmoadg.get(str)) != null) {
            if (obj instanceof Float) {
                return lqeggnwhkg.eablkybsjg(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return lqeggnwhkg.eablkybsjg((Double) obj);
            }
            f66817zoijcleaow.zoijcleaow("Metadata key %s contains type other than double: %s", str);
            return lqeggnwhkg.iobyxmoadg();
        }
        return lqeggnwhkg.iobyxmoadg();
    }

    public lqeggnwhkg zoijcleaow(String str) {
        if (!iobyxmoadg(str)) {
            return lqeggnwhkg.iobyxmoadg();
        }
        try {
            return lqeggnwhkg.zoijcleaow((Boolean) this.f66818iobyxmoadg.get(str));
        } catch (ClassCastException e13) {
            f66817zoijcleaow.zoijcleaow("Metadata key %s contains type other than boolean: %s", str, e13.getMessage());
            return lqeggnwhkg.iobyxmoadg();
        }
    }

    public gxszxtbevo(Bundle bundle) {
        this.f66818iobyxmoadg = (Bundle) bundle.clone();
    }
}
