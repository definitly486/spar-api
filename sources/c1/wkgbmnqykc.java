package c1;

import d1.ojitshcjhn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    z0.dxjokdxxww f18438dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final iobyxmoadg f18439eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public wkgbmnqykc f18440gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private HashSet f18441iobyxmoadg = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public int f18442lqeggnwhkg = 0;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    int f18443nufgyqmvbu = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f18444ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final eablkybsjg f18445wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f18446zoijcleaow;

    public enum iobyxmoadg {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public wkgbmnqykc(eablkybsjg eablkybsjgVar, iobyxmoadg iobyxmoadgVar) {
        this.f18445wkgbmnqykc = eablkybsjgVar;
        this.f18439eablkybsjg = iobyxmoadgVar;
    }

    public boolean agtfadlqog() {
        return this.f18444ppxfxbqfkf;
    }

    public wkgbmnqykc btonecajqb() {
        return this.f18440gxszxtbevo;
    }

    public boolean draadjrbmk() {
        HashSet hashSet = this.f18441iobyxmoadg;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((wkgbmnqykc) it.next()).lqeggnwhkg().ojitshcjhn()) {
                return true;
            }
        }
        return false;
    }

    public z0.dxjokdxxww dxjokdxxww() {
        return this.f18438dxjokdxxww;
    }

    public int eablkybsjg() {
        if (this.f18444ppxfxbqfkf) {
            return this.f18446zoijcleaow;
        }
        return 0;
    }

    public iobyxmoadg gtknphoqwx() {
        return this.f18439eablkybsjg;
    }

    public int gxszxtbevo() {
        wkgbmnqykc wkgbmnqykcVar;
        if (this.f18445wkgbmnqykc.crxdokpmqz() == 8) {
            return 0;
        }
        return (this.f18443nufgyqmvbu == Integer.MIN_VALUE || (wkgbmnqykcVar = this.f18440gxszxtbevo) == null || wkgbmnqykcVar.f18445wkgbmnqykc.crxdokpmqz() != 8) ? this.f18442lqeggnwhkg : this.f18443nufgyqmvbu;
    }

    public boolean iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, int i13) {
        return zoijcleaow(wkgbmnqykcVar, i13, Integer.MIN_VALUE, false);
    }

    public void kcexrzcfyt(z0.ppxfxbqfkf ppxfxbqfkfVar) {
        z0.dxjokdxxww dxjokdxxwwVar = this.f18438dxjokdxxww;
        if (dxjokdxxwwVar == null) {
            this.f18438dxjokdxxww = new z0.dxjokdxxww(z0.dxjokdxxww.iobyxmoadg.UNRESTRICTED, null);
        } else {
            dxjokdxxwwVar.eablkybsjg();
        }
    }

    public final wkgbmnqykc lqeggnwhkg() {
        switch (this.f18439eablkybsjg) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f18445wkgbmnqykc.f18305tzroggbefp;
            case TOP:
                return this.f18445wkgbmnqykc.f18281mbcevpiqjq;
            case RIGHT:
                return this.f18445wkgbmnqykc.f18303stevsuqkhv;
            case BOTTOM:
                return this.f18445wkgbmnqykc.f18275kegysxyocb;
            default:
                throw new AssertionError(this.f18439eablkybsjg.name());
        }
    }

    public eablkybsjg nufgyqmvbu() {
        return this.f18445wkgbmnqykc;
    }

    public boolean ojitshcjhn() {
        return this.f18440gxszxtbevo != null;
    }

    public void oxmwwwfdhm() {
        this.f18444ppxfxbqfkf = false;
        this.f18446zoijcleaow = 0;
    }

    public void ppxfxbqfkf(int i13, ArrayList arrayList, ojitshcjhn ojitshcjhnVar) {
        HashSet hashSet = this.f18441iobyxmoadg;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                d1.dxjokdxxww.iobyxmoadg(((wkgbmnqykc) it.next()).f18445wkgbmnqykc, i13, arrayList, ojitshcjhnVar);
            }
        }
    }

    public boolean rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null) {
            return false;
        }
        iobyxmoadg iobyxmoadgVarGtknphoqwx = wkgbmnqykcVar.gtknphoqwx();
        iobyxmoadg iobyxmoadgVar = this.f18439eablkybsjg;
        if (iobyxmoadgVarGtknphoqwx == iobyxmoadgVar) {
            return iobyxmoadgVar != iobyxmoadg.BASELINE || (wkgbmnqykcVar.nufgyqmvbu().jhduphickx() && nufgyqmvbu().jhduphickx());
        }
        switch (iobyxmoadgVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z13 = iobyxmoadgVarGtknphoqwx == iobyxmoadg.LEFT || iobyxmoadgVarGtknphoqwx == iobyxmoadg.RIGHT;
                if (wkgbmnqykcVar.nufgyqmvbu() instanceof nufgyqmvbu) {
                    return z13 || iobyxmoadgVarGtknphoqwx == iobyxmoadg.CENTER_X;
                }
                return z13;
            case TOP:
            case BOTTOM:
                boolean z14 = iobyxmoadgVarGtknphoqwx == iobyxmoadg.TOP || iobyxmoadgVarGtknphoqwx == iobyxmoadg.BOTTOM;
                if (wkgbmnqykcVar.nufgyqmvbu() instanceof nufgyqmvbu) {
                    return z14 || iobyxmoadgVarGtknphoqwx == iobyxmoadg.CENTER_Y;
                }
                return z14;
            case BASELINE:
                return (iobyxmoadgVarGtknphoqwx == iobyxmoadg.LEFT || iobyxmoadgVarGtknphoqwx == iobyxmoadg.RIGHT) ? false : true;
            case CENTER:
                return (iobyxmoadgVarGtknphoqwx == iobyxmoadg.BASELINE || iobyxmoadgVarGtknphoqwx == iobyxmoadg.CENTER_X || iobyxmoadgVarGtknphoqwx == iobyxmoadg.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f18439eablkybsjg.name());
        }
    }

    public String toString() {
        return this.f18445wkgbmnqykc.jyumaefscl() + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f18439eablkybsjg.toString();
    }

    public void vdvldrhtss() {
        HashSet hashSet;
        wkgbmnqykc wkgbmnqykcVar = this.f18440gxszxtbevo;
        if (wkgbmnqykcVar != null && (hashSet = wkgbmnqykcVar.f18441iobyxmoadg) != null) {
            hashSet.remove(this);
            if (this.f18440gxszxtbevo.f18441iobyxmoadg.size() == 0) {
                this.f18440gxszxtbevo.f18441iobyxmoadg = null;
            }
        }
        this.f18441iobyxmoadg = null;
        this.f18440gxszxtbevo = null;
        this.f18442lqeggnwhkg = 0;
        this.f18443nufgyqmvbu = Integer.MIN_VALUE;
        this.f18444ppxfxbqfkf = false;
        this.f18446zoijcleaow = 0;
    }

    public boolean wflxmlrfwp() {
        HashSet hashSet = this.f18441iobyxmoadg;
        return hashSet != null && hashSet.size() > 0;
    }

    public HashSet wkgbmnqykc() {
        return this.f18441iobyxmoadg;
    }

    public void yggfygwlhe(int i13) {
        if (ojitshcjhn()) {
            this.f18443nufgyqmvbu = i13;
        }
    }

    public void zdlpuopuiu(int i13) {
        this.f18446zoijcleaow = i13;
        this.f18444ppxfxbqfkf = true;
    }

    public boolean zoijcleaow(wkgbmnqykc wkgbmnqykcVar, int i13, int i14, boolean z13) {
        if (wkgbmnqykcVar == null) {
            vdvldrhtss();
            return true;
        }
        if (!z13 && !rgvfuqvkyq(wkgbmnqykcVar)) {
            return false;
        }
        this.f18440gxszxtbevo = wkgbmnqykcVar;
        if (wkgbmnqykcVar.f18441iobyxmoadg == null) {
            wkgbmnqykcVar.f18441iobyxmoadg = new HashSet();
        }
        HashSet hashSet = this.f18440gxszxtbevo.f18441iobyxmoadg;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f18442lqeggnwhkg = i13;
        this.f18443nufgyqmvbu = i14;
        return true;
    }
}
