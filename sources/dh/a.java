package dh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ah.rgvfuqvkyq, crxdokpmqz {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f28159iwizpuwonk = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(a.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final b f28160jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final e.iobyxmoadg f28161yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final jh.yfnezrywwk f28162zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f28163iobyxmoadg;

        static {
            int[] iArr = new int[zi.mhtqkkgtqm.values().length];
            try {
                iArr[zi.mhtqkkgtqm.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi.mhtqkkgtqm.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi.mhtqkkgtqm.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28163iobyxmoadg = iArr;
        }
    }

    public a(b bVar, jh.yfnezrywwk descriptor) {
        sopmlzcsov sopmlzcsovVarEablkybsjg;
        Object objTbqsvytpvh;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        this.f28162zdlpuopuiu = descriptor;
        this.f28161yggfygwlhe = e.ppxfxbqfkf(new krqnebusok(this));
        if (bVar == null) {
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = iobyxmoadg().zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow, "getContainingDeclaration(...)");
            if (wflxmlrfwpVarZoijcleaow instanceof jh.eablkybsjg) {
                objTbqsvytpvh = eablkybsjg((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow);
            } else {
                if (!(wflxmlrfwpVarZoijcleaow instanceof jh.zoijcleaow)) {
                    throw new c("Unknown type parameter container: " + wflxmlrfwpVarZoijcleaow);
                }
                jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow2 = ((jh.zoijcleaow) wflxmlrfwpVarZoijcleaow).zoijcleaow();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarZoijcleaow2, "getContainingDeclaration(...)");
                if (wflxmlrfwpVarZoijcleaow2 instanceof jh.eablkybsjg) {
                    sopmlzcsovVarEablkybsjg = eablkybsjg((jh.eablkybsjg) wflxmlrfwpVarZoijcleaow2);
                } else {
                    xi.zdlpuopuiu zdlpuopuiuVar = wflxmlrfwpVarZoijcleaow instanceof xi.zdlpuopuiu ? (xi.zdlpuopuiu) wflxmlrfwpVarZoijcleaow : null;
                    if (zdlpuopuiuVar == null) {
                        throw new c("Non-class callable descriptor must be deserialized: " + wflxmlrfwpVarZoijcleaow);
                    }
                    ah.wkgbmnqykc wkgbmnqykcVarEablkybsjg = sg.iobyxmoadg.eablkybsjg(ppxfxbqfkf(zdlpuopuiuVar));
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarEablkybsjg, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    sopmlzcsovVarEablkybsjg = (sopmlzcsov) wkgbmnqykcVarEablkybsjg;
                }
                objTbqsvytpvh = wflxmlrfwpVarZoijcleaow.tbqsvytpvh(new btonecajqb(sopmlzcsovVarEablkybsjg), gg.wwaezpbzkn.f37140iobyxmoadg);
            }
            bVar = (b) objTbqsvytpvh;
        }
        this.f28160jyumaefscl = bVar;
    }

    private final sopmlzcsov eablkybsjg(jh.eablkybsjg eablkybsjgVar) {
        Class clsVdvldrhtss = n.vdvldrhtss(eablkybsjgVar);
        sopmlzcsov sopmlzcsovVar = (sopmlzcsov) (clsVdvldrhtss != null ? sg.iobyxmoadg.eablkybsjg(clsVdvldrhtss) : null);
        if (sopmlzcsovVar != null) {
            return sopmlzcsovVar;
        }
        throw new c("Type parameter container is not resolved: " + eablkybsjgVar.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List gxszxtbevo(a aVar) {
        List upperBounds = aVar.iobyxmoadg().getUpperBounds();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new eslsurpljm((zi.kegysxyocb) it.next(), null, 2, null));
        }
        return arrayList;
    }

    private final Class ppxfxbqfkf(xi.zdlpuopuiu zdlpuopuiuVar) {
        Class clsZoijcleaow;
        xi.kcexrzcfyt kcexrzcfytVarPkzmftpjix = zdlpuopuiuVar.pkzmftpjix();
        bi.oxmwwwfdhm oxmwwwfdhmVar = kcexrzcfytVarPkzmftpjix instanceof bi.oxmwwwfdhm ? (bi.oxmwwwfdhm) kcexrzcfytVarPkzmftpjix : null;
        bi.cqumvgiudr cqumvgiudrVarLqeggnwhkg = oxmwwwfdhmVar != null ? oxmwwwfdhmVar.lqeggnwhkg() : null;
        oh.gxszxtbevo gxszxtbevoVar = cqumvgiudrVarLqeggnwhkg instanceof oh.gxszxtbevo ? (oh.gxszxtbevo) cqumvgiudrVarLqeggnwhkg : null;
        if (gxszxtbevoVar != null && (clsZoijcleaow = gxszxtbevoVar.zoijcleaow()) != null) {
            return clsZoijcleaow;
        }
        throw new c("Container of deserialized member is not resolved: " + zdlpuopuiuVar);
    }

    @Override // ah.rgvfuqvkyq
    public ah.oxmwwwfdhm draadjrbmk() {
        int i13 = iobyxmoadg.f28163iobyxmoadg[iobyxmoadg().draadjrbmk().ordinal()];
        if (i13 == 1) {
            return ah.oxmwwwfdhm.INVARIANT;
        }
        if (i13 == 2) {
            return ah.oxmwwwfdhm.IN;
        }
        if (i13 == 3) {
            return ah.oxmwwwfdhm.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f28160jyumaefscl, aVar.f28160jyumaefscl) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getName(), aVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // ah.rgvfuqvkyq
    public String getName() {
        String strZoijcleaow = iobyxmoadg().getName().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        return strZoijcleaow;
    }

    @Override // ah.rgvfuqvkyq
    public List getUpperBounds() {
        Object objZoijcleaow = this.f28161yggfygwlhe.zoijcleaow(this, f28159iwizpuwonk[0]);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objZoijcleaow, "getValue(...)");
        return (List) objZoijcleaow;
    }

    public int hashCode() {
        return (this.f28160jyumaefscl.hashCode() * 31) + getName().hashCode();
    }

    public String toString() {
        return kotlin.jvm.internal.ntlheqmsrt.f60028zdlpuopuiu.iobyxmoadg(this);
    }

    @Override // dh.crxdokpmqz
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public jh.yfnezrywwk iobyxmoadg() {
        return this.f28162zdlpuopuiu;
    }
}
