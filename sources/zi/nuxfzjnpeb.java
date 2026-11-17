package zi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nuxfzjnpeb extends igdgnonuha {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f130098ppxfxbqfkf = new iobyxmoadg(null);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: zi.nuxfzjnpeb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3316iobyxmoadg extends nuxfzjnpeb {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ boolean f130099eablkybsjg;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ Map f130100wkgbmnqykc;

            C3316iobyxmoadg(Map map, boolean z13) {
                this.f130100wkgbmnqykc = map;
                this.f130099eablkybsjg = z13;
            }

            @Override // zi.nuxfzjnpeb
            public iwxlajgraz gtknphoqwx(zeieaojujs key) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
                return (iwxlajgraz) this.f130100wkgbmnqykc.get(key);
            }

            @Override // zi.igdgnonuha
            public boolean gxszxtbevo() {
                return this.f130100wkgbmnqykc.isEmpty();
            }

            @Override // zi.igdgnonuha
            public boolean iobyxmoadg() {
                return this.f130099eablkybsjg;
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ nuxfzjnpeb eablkybsjg(iobyxmoadg iobyxmoadgVar, Map map, boolean z13, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                z13 = false;
            }
            return iobyxmoadgVar.wkgbmnqykc(map, z13);
        }

        public final igdgnonuha iobyxmoadg(kegysxyocb kotlinType) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinType, "kotlinType");
            return zoijcleaow(kotlinType.grlcpdaxtj(), kotlinType.fyldjkxazc());
        }

        public final nuxfzjnpeb ppxfxbqfkf(Map map) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "map");
            return eablkybsjg(this, map, false, 2, null);
        }

        public final nuxfzjnpeb wkgbmnqykc(Map map, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "map");
            return new C3316iobyxmoadg(map, z13);
        }

        public final igdgnonuha zoijcleaow(zeieaojujs typeConstructor, List arguments) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeConstructor, "typeConstructor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
            jh.yfnezrywwk yfnezrywwkVar = (jh.yfnezrywwk) hg.jyumaefscl.lxfrhoxuzk(parameters);
            if (yfnezrywwkVar == null || !yfnezrywwkVar.dsvhmnatus()) {
                return new hkdspvbjdz(parameters, arguments);
            }
            List parameters2 = typeConstructor.getParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters2, "getParameters(...)");
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(parameters2, 10));
            Iterator it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((jh.yfnezrywwk) it.next()).btonecajqb());
            }
            return eablkybsjg(this, hg.tzroggbefp.kcexrzcfyt(hg.jyumaefscl.w(arrayList, arguments)), false, 2, null);
        }

        private iobyxmoadg() {
        }
    }

    public static final nuxfzjnpeb btonecajqb(Map map) {
        return f130098ppxfxbqfkf.ppxfxbqfkf(map);
    }

    public static final igdgnonuha dxjokdxxww(zeieaojujs zeieaojujsVar, List list) {
        return f130098ppxfxbqfkf.zoijcleaow(zeieaojujsVar, list);
    }

    @Override // zi.igdgnonuha
    public iwxlajgraz eablkybsjg(kegysxyocb key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return gtknphoqwx(key.grlcpdaxtj());
    }

    public abstract iwxlajgraz gtknphoqwx(zeieaojujs zeieaojujsVar);
}
