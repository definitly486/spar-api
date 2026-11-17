package ni;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jh.lmojexxdyd;
import kotlin.NoWhenBranchMatchedException;
import zi.ikoacuggdj;
import zi.kegysxyocb;
import zi.lxfrhoxuzk;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.opjhrmiecq;
import zi.skhdrjzrfn;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss implements zeieaojujs {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f70104gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gg.gtknphoqwx f70105eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f70106iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f70107ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ikoacuggdj f70108wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lmojexxdyd f70109zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: ni.vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private enum EnumC1513iobyxmoadg {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;


            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            private static final /* synthetic */ ng.iobyxmoadg f70110iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
        }

        public /* synthetic */ class zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f70114iobyxmoadg;

            static {
                int[] iArr = new int[EnumC1513iobyxmoadg.values().length];
                try {
                    iArr[EnumC1513iobyxmoadg.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1513iobyxmoadg.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f70114iobyxmoadg = iArr;
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final ikoacuggdj eablkybsjg(ikoacuggdj ikoacuggdjVar, ikoacuggdj ikoacuggdjVar2, EnumC1513iobyxmoadg enumC1513iobyxmoadg) {
            if (ikoacuggdjVar == null || ikoacuggdjVar2 == null) {
                return null;
            }
            zeieaojujs zeieaojujsVarGrlcpdaxtj = ikoacuggdjVar.grlcpdaxtj();
            zeieaojujs zeieaojujsVarGrlcpdaxtj2 = ikoacuggdjVar2.grlcpdaxtj();
            boolean z13 = zeieaojujsVarGrlcpdaxtj instanceof vdvldrhtss;
            if (z13 && (zeieaojujsVarGrlcpdaxtj2 instanceof vdvldrhtss)) {
                return ppxfxbqfkf((vdvldrhtss) zeieaojujsVarGrlcpdaxtj, (vdvldrhtss) zeieaojujsVarGrlcpdaxtj2, enumC1513iobyxmoadg);
            }
            if (z13) {
                return wkgbmnqykc((vdvldrhtss) zeieaojujsVarGrlcpdaxtj, ikoacuggdjVar2);
            }
            if (zeieaojujsVarGrlcpdaxtj2 instanceof vdvldrhtss) {
                return wkgbmnqykc((vdvldrhtss) zeieaojujsVarGrlcpdaxtj2, ikoacuggdjVar);
            }
            return null;
        }

        private final ikoacuggdj iobyxmoadg(Collection collection, EnumC1513iobyxmoadg enumC1513iobyxmoadg) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                ikoacuggdj ikoacuggdjVar = (ikoacuggdj) it.next();
                next = vdvldrhtss.f70104gxszxtbevo.eablkybsjg((ikoacuggdj) next, ikoacuggdjVar, enumC1513iobyxmoadg);
            }
            return (ikoacuggdj) next;
        }

        private final ikoacuggdj ppxfxbqfkf(vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2, EnumC1513iobyxmoadg enumC1513iobyxmoadg) {
            Set setTbqsvytpvh;
            int i13 = zoijcleaow.f70114iobyxmoadg[enumC1513iobyxmoadg.ordinal()];
            if (i13 == 1) {
                setTbqsvytpvh = hg.jyumaefscl.tbqsvytpvh(vdvldrhtssVar.btonecajqb(), vdvldrhtssVar2.btonecajqb());
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setTbqsvytpvh = hg.jyumaefscl.s(vdvldrhtssVar.btonecajqb(), vdvldrhtssVar2.btonecajqb());
            }
            return ntlheqmsrt.gxszxtbevo(opjhrmiecq.f130109yggfygwlhe.btonecajqb(), new vdvldrhtss(vdvldrhtssVar.f70106iobyxmoadg, vdvldrhtssVar.f70109zoijcleaow, setTbqsvytpvh, null), false);
        }

        private final ikoacuggdj wkgbmnqykc(vdvldrhtss vdvldrhtssVar, ikoacuggdj ikoacuggdjVar) {
            if (vdvldrhtssVar.btonecajqb().contains(ikoacuggdjVar)) {
                return ikoacuggdjVar;
            }
            return null;
        }

        public final ikoacuggdj zoijcleaow(Collection types) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(types, "types");
            return iobyxmoadg(types, EnumC1513iobyxmoadg.INTERSECTION_TYPE);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ vdvldrhtss(long j13, lmojexxdyd lmojexxdydVar, Set set, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, lmojexxdydVar, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List agtfadlqog(vdvldrhtss vdvldrhtssVar) {
        ikoacuggdj ikoacuggdjVarOjitshcjhn = vdvldrhtssVar.wflxmlrfwp().cqumvgiudr().ojitshcjhn();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
        List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(lxfrhoxuzk.gxszxtbevo(ikoacuggdjVarOjitshcjhn, hg.jyumaefscl.eablkybsjg(new skhdrjzrfn(mhtqkkgtqm.IN_VARIANCE, vdvldrhtssVar.f70108wkgbmnqykc)), null, 2, null));
        if (!vdvldrhtssVar.draadjrbmk()) {
            listKcexrzcfyt.add(vdvldrhtssVar.wflxmlrfwp().jpowsppfya());
        }
        return listKcexrzcfyt;
    }

    private final boolean draadjrbmk() {
        Collection collectionIobyxmoadg = jyumaefscl.iobyxmoadg(this.f70109zoijcleaow);
        if ((collectionIobyxmoadg instanceof Collection) && collectionIobyxmoadg.isEmpty()) {
            return true;
        }
        Iterator it = collectionIobyxmoadg.iterator();
        while (it.hasNext()) {
            if (this.f70107ppxfxbqfkf.contains((kegysxyocb) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final List gtknphoqwx() {
        return (List) this.f70105eablkybsjg.getValue();
    }

    private final String ojitshcjhn() {
        return '[' + hg.jyumaefscl.iwxlajgraz(this.f70107ppxfxbqfkf, StringUtils.COMMA, null, null, 0, null, rgvfuqvkyq.f70103zdlpuopuiu, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence rgvfuqvkyq(kegysxyocb it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.toString();
    }

    public final Set btonecajqb() {
        return this.f70107ppxfxbqfkf;
    }

    @Override // zi.zeieaojujs
    public boolean eablkybsjg() {
        return false;
    }

    @Override // zi.zeieaojujs
    public List getParameters() {
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // zi.zeieaojujs
    public zeieaojujs iobyxmoadg(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public String toString() {
        return "IntegerLiteralType" + ojitshcjhn();
    }

    @Override // zi.zeieaojujs
    public gh.dxjokdxxww wflxmlrfwp() {
        return this.f70109zoijcleaow.wflxmlrfwp();
    }

    @Override // zi.zeieaojujs
    public jh.nufgyqmvbu wkgbmnqykc() {
        return null;
    }

    @Override // zi.zeieaojujs
    public Collection zoijcleaow() {
        return gtknphoqwx();
    }

    private vdvldrhtss(long j13, lmojexxdyd lmojexxdydVar, Set set) {
        this.f70108wkgbmnqykc = ntlheqmsrt.gxszxtbevo(opjhrmiecq.f130109yggfygwlhe.btonecajqb(), this, false);
        this.f70105eablkybsjg = gg.draadjrbmk.zoijcleaow(new ojitshcjhn(this));
        this.f70106iobyxmoadg = j13;
        this.f70109zoijcleaow = lmojexxdydVar;
        this.f70107ppxfxbqfkf = set;
    }
}
