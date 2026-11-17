package ih;

import hg.ikoacuggdj;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f44282iobyxmoadg = new wkgbmnqykc();

    private wkgbmnqykc() {
    }

    public static /* synthetic */ jh.eablkybsjg gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, ii.ppxfxbqfkf ppxfxbqfkfVar, gh.dxjokdxxww dxjokdxxwwVar, Integer num, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        return wkgbmnqykcVar.eablkybsjg(ppxfxbqfkfVar, dxjokdxxwwVar, num);
    }

    public final jh.eablkybsjg eablkybsjg(ii.ppxfxbqfkf fqName, gh.dxjokdxxww builtIns, Integer num) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        ii.zoijcleaow zoijcleaowVarWflxmlrfwp = (num == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fqName, ppxfxbqfkf.f44265iobyxmoadg.nufgyqmvbu())) ? ppxfxbqfkf.f44265iobyxmoadg.wflxmlrfwp(fqName) : gh.ojitshcjhn.iobyxmoadg(num.intValue());
        if (zoijcleaowVarWflxmlrfwp != null) {
            return builtIns.ojitshcjhn(zoijcleaowVarWflxmlrfwp.iobyxmoadg());
        }
        return null;
    }

    public final jh.eablkybsjg iobyxmoadg(jh.eablkybsjg mutable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mutable, "mutable");
        ii.ppxfxbqfkf ppxfxbqfkfVarOjitshcjhn = ppxfxbqfkf.f44265iobyxmoadg.ojitshcjhn(li.dxjokdxxww.wflxmlrfwp(mutable));
        if (ppxfxbqfkfVarOjitshcjhn != null) {
            jh.eablkybsjg eablkybsjgVarOjitshcjhn = pi.eablkybsjg.wflxmlrfwp(mutable).ojitshcjhn(ppxfxbqfkfVarOjitshcjhn);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarOjitshcjhn, "getBuiltInClassByFqName(...)");
            return eablkybsjgVarOjitshcjhn;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final Collection lqeggnwhkg(ii.ppxfxbqfkf fqName, gh.dxjokdxxww builtIns) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        jh.eablkybsjg eablkybsjgVarGxszxtbevo = gxszxtbevo(this, fqName, builtIns, null, 4, null);
        if (eablkybsjgVarGxszxtbevo == null) {
            return ikoacuggdj.eablkybsjg();
        }
        ii.ppxfxbqfkf ppxfxbqfkfVarRgvfuqvkyq = ppxfxbqfkf.f44265iobyxmoadg.rgvfuqvkyq(pi.eablkybsjg.rgvfuqvkyq(eablkybsjgVarGxszxtbevo));
        return ppxfxbqfkfVarRgvfuqvkyq == null ? ikoacuggdj.wkgbmnqykc(eablkybsjgVarGxszxtbevo) : hg.jyumaefscl.rgvfuqvkyq(eablkybsjgVarGxszxtbevo, builtIns.ojitshcjhn(ppxfxbqfkfVarRgvfuqvkyq));
    }

    public final boolean ppxfxbqfkf(jh.eablkybsjg mutable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mutable, "mutable");
        return ppxfxbqfkf.f44265iobyxmoadg.gtknphoqwx(li.dxjokdxxww.wflxmlrfwp(mutable));
    }

    public final boolean wkgbmnqykc(jh.eablkybsjg readOnly) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(readOnly, "readOnly");
        return ppxfxbqfkf.f44265iobyxmoadg.draadjrbmk(li.dxjokdxxww.wflxmlrfwp(readOnly));
    }

    public final jh.eablkybsjg zoijcleaow(jh.eablkybsjg readOnly) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(readOnly, "readOnly");
        ii.ppxfxbqfkf ppxfxbqfkfVarRgvfuqvkyq = ppxfxbqfkf.f44265iobyxmoadg.rgvfuqvkyq(li.dxjokdxxww.wflxmlrfwp(readOnly));
        if (ppxfxbqfkfVarRgvfuqvkyq != null) {
            jh.eablkybsjg eablkybsjgVarOjitshcjhn = pi.eablkybsjg.wflxmlrfwp(readOnly).ojitshcjhn(ppxfxbqfkfVarRgvfuqvkyq);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarOjitshcjhn, "getBuiltInClassByFqName(...)");
            return eablkybsjgVarOjitshcjhn;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }
}
