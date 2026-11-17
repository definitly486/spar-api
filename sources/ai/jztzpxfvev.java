package ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class jztzpxfvev {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f1953iobyxmoadg = new LinkedHashMap();

    public final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f1954iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ jztzpxfvev f1955zoijcleaow;

        /* JADX INFO: renamed from: ai.jztzpxfvev$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public final class C0042iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f1956eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f1957iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final List f1958ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private gg.vdvldrhtss f1959wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f1960zoijcleaow;

            public C0042iobyxmoadg(iobyxmoadg iobyxmoadgVar, String functionName, String str) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionName, "functionName");
                this.f1956eablkybsjg = iobyxmoadgVar;
                this.f1957iobyxmoadg = functionName;
                this.f1960zoijcleaow = str;
                this.f1958ppxfxbqfkf = new ArrayList();
                this.f1959wkgbmnqykc = gg.cqumvgiudr.iobyxmoadg("V", null);
            }

            public final gg.vdvldrhtss iobyxmoadg() {
                bi.iozdgvuglv iozdgvuglvVar = bi.iozdgvuglv.f16272iobyxmoadg;
                String strPpxfxbqfkf = this.f1956eablkybsjg.ppxfxbqfkf();
                String str = this.f1957iobyxmoadg;
                List list = this.f1958ppxfxbqfkf;
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((gg.vdvldrhtss) it.next()).lqeggnwhkg());
                }
                String strDraadjrbmk = iozdgvuglvVar.draadjrbmk(strPpxfxbqfkf, iozdgvuglvVar.btonecajqb(str, arrayList, (String) this.f1959wkgbmnqykc.lqeggnwhkg()));
                czzsidtyhn czzsidtyhnVar = (czzsidtyhn) this.f1959wkgbmnqykc.nufgyqmvbu();
                List list2 = this.f1958ppxfxbqfkf;
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((czzsidtyhn) ((gg.vdvldrhtss) it2.next()).nufgyqmvbu());
                }
                return gg.cqumvgiudr.iobyxmoadg(strDraadjrbmk, new crxdokpmqz(czzsidtyhnVar, arrayList2, this.f1960zoijcleaow));
            }

            public final void ppxfxbqfkf(String type, nufgyqmvbu... qualifiers) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qualifiers, "qualifiers");
                Iterable<hg.cllcsxoeiz> iterableV = hg.agtfadlqog.v(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(iterableV, 10)), 16));
                for (hg.cllcsxoeiz cllcsxoeizVar : iterableV) {
                    linkedHashMap.put(Integer.valueOf(cllcsxoeizVar.ppxfxbqfkf()), (nufgyqmvbu) cllcsxoeizVar.wkgbmnqykc());
                }
                this.f1959wkgbmnqykc = gg.cqumvgiudr.iobyxmoadg(type, new czzsidtyhn(linkedHashMap));
            }

            public final void wkgbmnqykc(qi.eablkybsjg type) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
                String strNufgyqmvbu = type.nufgyqmvbu();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu, "getDesc(...)");
                this.f1959wkgbmnqykc = gg.cqumvgiudr.iobyxmoadg(strNufgyqmvbu, null);
            }

            public final void zoijcleaow(String type, nufgyqmvbu... qualifiers) {
                czzsidtyhn czzsidtyhnVar;
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qualifiers, "qualifiers");
                List list = this.f1958ppxfxbqfkf;
                if (qualifiers.length == 0) {
                    czzsidtyhnVar = null;
                } else {
                    Iterable<hg.cllcsxoeiz> iterableV = hg.agtfadlqog.v(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(iterableV, 10)), 16));
                    for (hg.cllcsxoeiz cllcsxoeizVar : iterableV) {
                        linkedHashMap.put(Integer.valueOf(cllcsxoeizVar.ppxfxbqfkf()), (nufgyqmvbu) cllcsxoeizVar.wkgbmnqykc());
                    }
                    czzsidtyhnVar = new czzsidtyhn(linkedHashMap);
                }
                list.add(gg.cqumvgiudr.iobyxmoadg(type, czzsidtyhnVar));
            }
        }

        public iobyxmoadg(jztzpxfvev jztzpxfvevVar, String className) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(className, "className");
            this.f1955zoijcleaow = jztzpxfvevVar;
            this.f1954iobyxmoadg = className;
        }

        public static /* synthetic */ void zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str2 = null;
            }
            iobyxmoadgVar.iobyxmoadg(str, str2, draadjrbmkVar);
        }

        public final void iobyxmoadg(String name, String str, tg.draadjrbmk block) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
            Map map = this.f1955zoijcleaow.f1953iobyxmoadg;
            C0042iobyxmoadg c0042iobyxmoadg = new C0042iobyxmoadg(this, name, str);
            block.invoke(c0042iobyxmoadg);
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = c0042iobyxmoadg.iobyxmoadg();
            map.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }

        public final String ppxfxbqfkf() {
            return this.f1954iobyxmoadg;
        }
    }

    public final Map zoijcleaow() {
        return this.f1953iobyxmoadg;
    }
}
