package v6;

import e7.draadjrbmk;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import x6.lqeggnwhkg;
import z6.dxjokdxxww;
import z6.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f116156eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f116157iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f116158ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f116159wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f116160zoijcleaow;

    public /* synthetic */ iobyxmoadg(List list, List list2, List list3, List list4, List list5, gtknphoqwx gtknphoqwxVar) {
        this(list, list2, list3, list4, list5);
    }

    public final vdvldrhtss btonecajqb(Object obj, draadjrbmk draadjrbmkVar, wkgbmnqykc wkgbmnqykcVar, int i13) {
        int size = this.f116159wkgbmnqykc.size();
        while (i13 < size) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) this.f116159wkgbmnqykc.get(i13);
            dxjokdxxww.iobyxmoadg iobyxmoadgVar = (dxjokdxxww.iobyxmoadg) vdvldrhtssVar.iobyxmoadg();
            if (((Class) vdvldrhtssVar.wkgbmnqykc()).isAssignableFrom(obj.getClass())) {
                zdlpuopuiu.nufgyqmvbu(iobyxmoadgVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(obj, draadjrbmkVar, wkgbmnqykcVar);
                if (dxjokdxxwwVarIobyxmoadg != null) {
                    return cqumvgiudr.iobyxmoadg(dxjokdxxwwVarIobyxmoadg, Integer.valueOf(i13));
                }
            }
            i13++;
        }
        return null;
    }

    public final vdvldrhtss dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, draadjrbmk draadjrbmkVar, wkgbmnqykc wkgbmnqykcVar, int i13) {
        int size = this.f116156eablkybsjg.size();
        while (i13 < size) {
            lqeggnwhkg lqeggnwhkgVarIobyxmoadg = ((lqeggnwhkg.iobyxmoadg) this.f116156eablkybsjg.get(i13)).iobyxmoadg(wflxmlrfwpVar, draadjrbmkVar, wkgbmnqykcVar);
            if (lqeggnwhkgVarIobyxmoadg != null) {
                return cqumvgiudr.iobyxmoadg(lqeggnwhkgVarIobyxmoadg, Integer.valueOf(i13));
            }
            i13++;
        }
        return null;
    }

    public final List eablkybsjg() {
        return this.f116160zoijcleaow;
    }

    public final String gxszxtbevo(Object obj, draadjrbmk draadjrbmkVar) {
        List list = this.f116158ppxfxbqfkf;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) list.get(i13);
            b7.zoijcleaow zoijcleaowVar = (b7.zoijcleaow) vdvldrhtssVar.iobyxmoadg();
            if (((Class) vdvldrhtssVar.wkgbmnqykc()).isAssignableFrom(obj.getClass())) {
                zdlpuopuiu.nufgyqmvbu(zoijcleaowVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strIobyxmoadg = zoijcleaowVar.iobyxmoadg(obj, draadjrbmkVar);
                if (strIobyxmoadg != null) {
                    return strIobyxmoadg;
                }
            }
        }
        return null;
    }

    public final List iobyxmoadg() {
        return this.f116156eablkybsjg;
    }

    public final Object lqeggnwhkg(Object obj, draadjrbmk draadjrbmkVar) {
        List list = this.f116160zoijcleaow;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) list.get(i13);
            c7.wkgbmnqykc wkgbmnqykcVar = (c7.wkgbmnqykc) vdvldrhtssVar.iobyxmoadg();
            if (((Class) vdvldrhtssVar.wkgbmnqykc()).isAssignableFrom(obj.getClass())) {
                zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(obj, draadjrbmkVar);
                if (objIobyxmoadg != null) {
                    obj = objIobyxmoadg;
                }
            }
        }
        return obj;
    }

    public final C2883iobyxmoadg nufgyqmvbu() {
        return new C2883iobyxmoadg(this);
    }

    public final List ppxfxbqfkf() {
        return this.f116157iobyxmoadg;
    }

    public final List wkgbmnqykc() {
        return this.f116158ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f116159wkgbmnqykc;
    }

    private iobyxmoadg(List list, List list2, List list3, List list4, List list5) {
        this.f116157iobyxmoadg = list;
        this.f116160zoijcleaow = list2;
        this.f116158ppxfxbqfkf = list3;
        this.f116159wkgbmnqykc = list4;
        this.f116156eablkybsjg = list5;
    }

    /* JADX INFO: renamed from: v6.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2883iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f116161eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f116162iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f116163ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f116164wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f116165zoijcleaow;

        public C2883iobyxmoadg() {
            this.f116162iobyxmoadg = new ArrayList();
            this.f116165zoijcleaow = new ArrayList();
            this.f116163ppxfxbqfkf = new ArrayList();
            this.f116164wkgbmnqykc = new ArrayList();
            this.f116161eablkybsjg = new ArrayList();
        }

        public final iobyxmoadg eablkybsjg() {
            return new iobyxmoadg(i7.ppxfxbqfkf.iobyxmoadg(this.f116162iobyxmoadg), i7.ppxfxbqfkf.iobyxmoadg(this.f116165zoijcleaow), i7.ppxfxbqfkf.iobyxmoadg(this.f116163ppxfxbqfkf), i7.ppxfxbqfkf.iobyxmoadg(this.f116164wkgbmnqykc), i7.ppxfxbqfkf.iobyxmoadg(this.f116161eablkybsjg), null);
        }

        public final List gxszxtbevo() {
            return this.f116161eablkybsjg;
        }

        public final C2883iobyxmoadg iobyxmoadg(b7.zoijcleaow zoijcleaowVar, Class cls) {
            this.f116163ppxfxbqfkf.add(cqumvgiudr.iobyxmoadg(zoijcleaowVar, cls));
            return this;
        }

        public final List lqeggnwhkg() {
            return this.f116164wkgbmnqykc;
        }

        public final C2883iobyxmoadg ppxfxbqfkf(lqeggnwhkg.iobyxmoadg iobyxmoadgVar) {
            this.f116161eablkybsjg.add(iobyxmoadgVar);
            return this;
        }

        public final C2883iobyxmoadg wkgbmnqykc(dxjokdxxww.iobyxmoadg iobyxmoadgVar, Class cls) {
            this.f116164wkgbmnqykc.add(cqumvgiudr.iobyxmoadg(iobyxmoadgVar, cls));
            return this;
        }

        public final C2883iobyxmoadg zoijcleaow(c7.wkgbmnqykc wkgbmnqykcVar, Class cls) {
            this.f116165zoijcleaow.add(cqumvgiudr.iobyxmoadg(wkgbmnqykcVar, cls));
            return this;
        }

        public C2883iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            this.f116162iobyxmoadg = jyumaefscl.p(iobyxmoadgVar.ppxfxbqfkf());
            this.f116165zoijcleaow = jyumaefscl.p(iobyxmoadgVar.eablkybsjg());
            this.f116163ppxfxbqfkf = jyumaefscl.p(iobyxmoadgVar.wkgbmnqykc());
            this.f116164wkgbmnqykc = jyumaefscl.p(iobyxmoadgVar.zoijcleaow());
            this.f116161eablkybsjg = jyumaefscl.p(iobyxmoadgVar.iobyxmoadg());
        }
    }

    public iobyxmoadg() {
        this(jyumaefscl.wflxmlrfwp(), jyumaefscl.wflxmlrfwp(), jyumaefscl.wflxmlrfwp(), jyumaefscl.wflxmlrfwp(), jyumaefscl.wflxmlrfwp());
    }
}
