package xi;

import hg.ikoacuggdj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.crxdokpmqz;
import jh.jztzpxfvev;
import jh.uwvvkdfqfp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iwizpuwonk extends si.draadjrbmk {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f122449gxszxtbevo = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iwizpuwonk.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(iwizpuwonk.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yi.btonecajqb f122450eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f122451ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yi.dxjokdxxww f122452wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vi.rgvfuqvkyq f122453zoijcleaow;

    private interface iobyxmoadg {
        uwvvkdfqfp eablkybsjg(ii.gxszxtbevo gxszxtbevoVar);

        Set gxszxtbevo();

        Set iobyxmoadg();

        void lqeggnwhkg(Collection collection, si.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, rh.zoijcleaow zoijcleaowVar);

        Set ppxfxbqfkf();

        Collection wkgbmnqykc(ii.gxszxtbevo gxszxtbevoVar, rh.zoijcleaow zoijcleaowVar);

        Collection zoijcleaow(ii.gxszxtbevo gxszxtbevoVar, rh.zoijcleaow zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ppxfxbqfkf implements iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        static final /* synthetic */ ah.gtknphoqwx[] f122454btonecajqb = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(ppxfxbqfkf.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(ppxfxbqfkf.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk f122455dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final yi.lqeggnwhkg f122456eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final yi.nufgyqmvbu f122457gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f122458iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final yi.dxjokdxxww f122459lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final yi.dxjokdxxww f122460nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f122461ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final yi.lqeggnwhkg f122462wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f122463zoijcleaow;

        public static final class iobyxmoadg implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iwizpuwonk f122464jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f122465yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq f122466zdlpuopuiu;

            public iobyxmoadg(kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq rgvfuqvkyqVar, ByteArrayInputStream byteArrayInputStream, iwizpuwonk iwizpuwonkVar) {
                this.f122466zdlpuopuiu = rgvfuqvkyqVar;
                this.f122465yggfygwlhe = byteArrayInputStream;
                this.f122464jyumaefscl = iwizpuwonkVar;
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog invoke() {
                return (kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) this.f122466zdlpuopuiu.ppxfxbqfkf(this.f122465yggfygwlhe, this.f122464jyumaefscl.kcexrzcfyt().ppxfxbqfkf().gtknphoqwx());
            }
        }

        public ppxfxbqfkf(iwizpuwonk iwizpuwonkVar, List functionList, List propertyList, List typeAliasList) throws IOException {
            Map mapDxjokdxxww;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionList, "functionList");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(propertyList, "propertyList");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeAliasList, "typeAliasList");
            this.f122455dxjokdxxww = iwizpuwonkVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                ii.gxszxtbevo gxszxtbevoVarZoijcleaow = vi.jpowsppfya.zoijcleaow(iwizpuwonkVar.kcexrzcfyt().lqeggnwhkg(), ((di.dxjokdxxww) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) obj)).czzsidtyhn());
                Object arrayList = linkedHashMap.get(gxszxtbevoVarZoijcleaow);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(gxszxtbevoVarZoijcleaow, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f122458iobyxmoadg = oxmwwwfdhm(linkedHashMap);
            iwizpuwonk iwizpuwonkVar2 = this.f122455dxjokdxxww;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                ii.gxszxtbevo gxszxtbevoVarZoijcleaow2 = vi.jpowsppfya.zoijcleaow(iwizpuwonkVar2.kcexrzcfyt().lqeggnwhkg(), ((di.agtfadlqog) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) obj2)).rlfsiqarku());
                Object arrayList2 = linkedHashMap2.get(gxszxtbevoVarZoijcleaow2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(gxszxtbevoVarZoijcleaow2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f122463zoijcleaow = oxmwwwfdhm(linkedHashMap2);
            if (this.f122455dxjokdxxww.kcexrzcfyt().ppxfxbqfkf().lqeggnwhkg().wkgbmnqykc()) {
                iwizpuwonk iwizpuwonkVar3 = this.f122455dxjokdxxww;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    ii.gxszxtbevo gxszxtbevoVarZoijcleaow3 = vi.jpowsppfya.zoijcleaow(iwizpuwonkVar3.kcexrzcfyt().lqeggnwhkg(), ((di.oxmwwwfdhm) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) obj3)).jhduphickx());
                    Object arrayList3 = linkedHashMap3.get(gxszxtbevoVarZoijcleaow3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(gxszxtbevoVarZoijcleaow3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapDxjokdxxww = oxmwwwfdhm(linkedHashMap3);
            } else {
                mapDxjokdxxww = hg.tzroggbefp.dxjokdxxww();
            }
            this.f122461ppxfxbqfkf = mapDxjokdxxww;
            this.f122462wkgbmnqykc = this.f122455dxjokdxxww.kcexrzcfyt().nufgyqmvbu().dxjokdxxww(new wwaezpbzkn(this));
            this.f122456eablkybsjg = this.f122455dxjokdxxww.kcexrzcfyt().nufgyqmvbu().dxjokdxxww(new ylkuphrtab(this));
            this.f122457gxszxtbevo = this.f122455dxjokdxxww.kcexrzcfyt().nufgyqmvbu().eablkybsjg(new pkzmftpjix(this));
            this.f122459lqeggnwhkg = this.f122455dxjokdxxww.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new hcddaimhww(this, this.f122455dxjokdxxww));
            this.f122460nufgyqmvbu = this.f122455dxjokdxxww.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new jpowsppfya(this, this.f122455dxjokdxxww));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        private final Collection agtfadlqog(ii.gxszxtbevo gxszxtbevoVar) {
            List<di.agtfadlqog> listWflxmlrfwp;
            Map map = this.f122463zoijcleaow;
            kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq PARSER = di.agtfadlqog.f28435wypolnanlu;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PARSER, "PARSER");
            iwizpuwonk iwizpuwonkVar = this.f122455dxjokdxxww;
            byte[] bArr = (byte[]) map.get(gxszxtbevoVar);
            if (bArr != null) {
                listWflxmlrfwp = lj.wflxmlrfwp.crxdokpmqz(lj.wflxmlrfwp.ojitshcjhn(new iobyxmoadg(PARSER, new ByteArrayInputStream(bArr), this.f122455dxjokdxxww)));
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                }
            } else {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(listWflxmlrfwp.size());
            for (di.agtfadlqog agtfadlqogVar : listWflxmlrfwp) {
                vi.hcddaimhww hcddaimhwwVarGxszxtbevo = iwizpuwonkVar.kcexrzcfyt().gxszxtbevo();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(agtfadlqogVar);
                crxdokpmqz crxdokpmqzVarYggfygwlhe = hcddaimhwwVarGxszxtbevo.yggfygwlhe(agtfadlqogVar);
                if (crxdokpmqzVarYggfygwlhe != null) {
                    arrayList.add(crxdokpmqzVarYggfygwlhe);
                }
            }
            iwizpuwonkVar.ojitshcjhn(gxszxtbevoVar, arrayList);
            return jj.iobyxmoadg.ppxfxbqfkf(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection kcexrzcfyt(ppxfxbqfkf ppxfxbqfkfVar, ii.gxszxtbevo it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            return ppxfxbqfkfVar.agtfadlqog(it);
        }

        private final uwvvkdfqfp ojitshcjhn(ii.gxszxtbevo gxszxtbevoVar) {
            di.oxmwwwfdhm oxmwwwfdhmVarWeqkydbzbr;
            byte[] bArr = (byte[]) this.f122461ppxfxbqfkf.get(gxszxtbevoVar);
            if (bArr == null || (oxmwwwfdhmVarWeqkydbzbr = di.oxmwwwfdhm.weqkydbzbr(new ByteArrayInputStream(bArr), this.f122455dxjokdxxww.kcexrzcfyt().ppxfxbqfkf().gtknphoqwx())) == null) {
                return null;
            }
            return this.f122455dxjokdxxww.kcexrzcfyt().gxszxtbevo().lereixgezr(oxmwwwfdhmVarWeqkydbzbr);
        }

        private final Map oxmwwwfdhm(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg) it.next()).lqeggnwhkg(byteArrayOutputStream);
                    arrayList.add(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set rgvfuqvkyq(ppxfxbqfkf ppxfxbqfkfVar, iwizpuwonk iwizpuwonkVar) {
            return ikoacuggdj.draadjrbmk(ppxfxbqfkfVar.f122458iobyxmoadg.keySet(), iwizpuwonkVar.iwizpuwonk());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, ii.gxszxtbevo it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            return ppxfxbqfkfVar.wflxmlrfwp(it);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002a  */
        private final Collection wflxmlrfwp(ii.gxszxtbevo gxszxtbevoVar) {
            List<di.dxjokdxxww> listWflxmlrfwp;
            Map map = this.f122458iobyxmoadg;
            kotlin.reflect.jvm.internal.impl.protobuf.rgvfuqvkyq PARSER = di.dxjokdxxww.f28504wypolnanlu;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(PARSER, "PARSER");
            iwizpuwonk iwizpuwonkVar = this.f122455dxjokdxxww;
            byte[] bArr = (byte[]) map.get(gxszxtbevoVar);
            if (bArr != null) {
                listWflxmlrfwp = lj.wflxmlrfwp.crxdokpmqz(lj.wflxmlrfwp.ojitshcjhn(new iobyxmoadg(PARSER, new ByteArrayInputStream(bArr), this.f122455dxjokdxxww)));
                if (listWflxmlrfwp == null) {
                    listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                }
            } else {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            ArrayList arrayList = new ArrayList(listWflxmlrfwp.size());
            for (di.dxjokdxxww dxjokdxxwwVar : listWflxmlrfwp) {
                vi.hcddaimhww hcddaimhwwVarGxszxtbevo = iwizpuwonkVar.kcexrzcfyt().gxszxtbevo();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dxjokdxxwwVar);
                jztzpxfvev jztzpxfvevVarKcexrzcfyt = hcddaimhwwVarGxszxtbevo.kcexrzcfyt(dxjokdxxwwVar);
                if (!iwizpuwonkVar.pmvmpeiblj(jztzpxfvevVarKcexrzcfyt)) {
                    jztzpxfvevVarKcexrzcfyt = null;
                }
                if (jztzpxfvevVarKcexrzcfyt != null) {
                    arrayList.add(jztzpxfvevVarKcexrzcfyt);
                }
            }
            iwizpuwonkVar.agtfadlqog(gxszxtbevoVar, arrayList);
            return jj.iobyxmoadg.ppxfxbqfkf(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set yggfygwlhe(ppxfxbqfkf ppxfxbqfkfVar, iwizpuwonk iwizpuwonkVar) {
            return ikoacuggdj.draadjrbmk(ppxfxbqfkfVar.f122463zoijcleaow.keySet(), iwizpuwonkVar.cqumvgiudr());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uwvvkdfqfp zdlpuopuiu(ppxfxbqfkf ppxfxbqfkfVar, ii.gxszxtbevo it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            return ppxfxbqfkfVar.ojitshcjhn(it);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public uwvvkdfqfp eablkybsjg(ii.gxszxtbevo name) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            return (uwvvkdfqfp) this.f122457gxszxtbevo.invoke(name);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Set gxszxtbevo() {
            return this.f122461ppxfxbqfkf.keySet();
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Set iobyxmoadg() {
            return (Set) yi.wflxmlrfwp.iobyxmoadg(this.f122459lqeggnwhkg, this, f122454btonecajqb[0]);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public void lqeggnwhkg(Collection result, si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter, rh.zoijcleaow location) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            if (kindFilter.iobyxmoadg(si.wkgbmnqykc.f106753ppxfxbqfkf.dxjokdxxww())) {
                Set<ii.gxszxtbevo> setPpxfxbqfkf = ppxfxbqfkf();
                ArrayList arrayList = new ArrayList();
                for (ii.gxszxtbevo gxszxtbevoVar : setPpxfxbqfkf) {
                    if (((Boolean) nameFilter.invoke(gxszxtbevoVar)).booleanValue()) {
                        arrayList.addAll(zoijcleaow(gxszxtbevoVar, location));
                    }
                }
                li.draadjrbmk INSTANCE = li.draadjrbmk.f62591zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(INSTANCE, "INSTANCE");
                hg.jyumaefscl.zynmafqrjb(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.iobyxmoadg(si.wkgbmnqykc.f106753ppxfxbqfkf.wkgbmnqykc())) {
                Set<ii.gxszxtbevo> setIobyxmoadg = iobyxmoadg();
                ArrayList arrayList2 = new ArrayList();
                for (ii.gxszxtbevo gxszxtbevoVar2 : setIobyxmoadg) {
                    if (((Boolean) nameFilter.invoke(gxszxtbevoVar2)).booleanValue()) {
                        arrayList2.addAll(wkgbmnqykc(gxszxtbevoVar2, location));
                    }
                }
                li.draadjrbmk INSTANCE2 = li.draadjrbmk.f62591zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(INSTANCE2, "INSTANCE");
                hg.jyumaefscl.zynmafqrjb(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Set ppxfxbqfkf() {
            return (Set) yi.wflxmlrfwp.iobyxmoadg(this.f122460nufgyqmvbu, this, f122454btonecajqb[1]);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            return !iobyxmoadg().contains(name) ? hg.jyumaefscl.wflxmlrfwp() : (Collection) this.f122462wkgbmnqykc.invoke(name);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            return !ppxfxbqfkf().contains(name) ? hg.jyumaefscl.wflxmlrfwp() : (Collection) this.f122456eablkybsjg.invoke(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        static final /* synthetic */ ah.gtknphoqwx[] f122467ojitshcjhn = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "allProperties", "getAllProperties()Ljava/util/List;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(zoijcleaow.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk f122468agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final yi.dxjokdxxww f122469btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final yi.dxjokdxxww f122470draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final yi.dxjokdxxww f122471dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final yi.dxjokdxxww f122472eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final yi.dxjokdxxww f122473gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final yi.dxjokdxxww f122474gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f122475iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final yi.dxjokdxxww f122476lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final yi.dxjokdxxww f122477nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f122478ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final yi.dxjokdxxww f122479wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final yi.dxjokdxxww f122480wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f122481zoijcleaow;

        public zoijcleaow(iwizpuwonk iwizpuwonkVar, List functionList, List propertyList, List typeAliasList) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionList, "functionList");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(propertyList, "propertyList");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeAliasList, "typeAliasList");
            this.f122468agtfadlqog = iwizpuwonkVar;
            this.f122475iobyxmoadg = functionList;
            this.f122481zoijcleaow = propertyList;
            this.f122478ppxfxbqfkf = iwizpuwonkVar.kcexrzcfyt().ppxfxbqfkf().lqeggnwhkg().wkgbmnqykc() ? typeAliasList : hg.jyumaefscl.wflxmlrfwp();
            this.f122480wkgbmnqykc = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new cqumvgiudr(this));
            this.f122472eablkybsjg = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new esjtqupxsv(this));
            this.f122474gxszxtbevo = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new lereixgezr(this));
            this.f122476lqeggnwhkg = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new pmvmpeiblj(this));
            this.f122477nufgyqmvbu = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new zynmafqrjb(this));
            this.f122471dxjokdxxww = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new istkbnxepw(this));
            this.f122469btonecajqb = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new cdpycssgdh(this));
            this.f122473gtknphoqwx = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new yadqdtsiqt(this));
            this.f122470draadjrbmk = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new iozdgvuglv(this, iwizpuwonkVar));
            this.f122479wflxmlrfwp = iwizpuwonkVar.kcexrzcfyt().nufgyqmvbu().wkgbmnqykc(new lmojexxdyd(this, iwizpuwonkVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set cdpycssgdh(zoijcleaow zoijcleaowVar, iwizpuwonk iwizpuwonkVar) {
            List list = zoijcleaowVar.f122475iobyxmoadg;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            iwizpuwonk iwizpuwonkVar2 = zoijcleaowVar.f122468agtfadlqog;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(vi.jpowsppfya.zoijcleaow(iwizpuwonkVar2.kcexrzcfyt().lqeggnwhkg(), ((di.dxjokdxxww) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) it.next())).czzsidtyhn()));
            }
            return ikoacuggdj.draadjrbmk(linkedHashSet, iwizpuwonkVar.iwizpuwonk());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map cllcsxoeiz(zoijcleaow zoijcleaowVar) {
            List listLmojexxdyd = zoijcleaowVar.lmojexxdyd();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listLmojexxdyd) {
                ii.gxszxtbevo name = ((crxdokpmqz) obj).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List cqumvgiudr(ii.gxszxtbevo gxszxtbevoVar) {
            List listYlkuphrtab = ylkuphrtab();
            iwizpuwonk iwizpuwonkVar = this.f122468agtfadlqog;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listYlkuphrtab) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((jh.wflxmlrfwp) obj).getName(), gxszxtbevoVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            iwizpuwonkVar.agtfadlqog(gxszxtbevoVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map dsvhmnatus(zoijcleaow zoijcleaowVar) {
            List listWwaezpbzkn = zoijcleaowVar.wwaezpbzkn();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(listWwaezpbzkn, 10)), 16));
            for (Object obj : listWwaezpbzkn) {
                ii.gxszxtbevo name = ((uwvvkdfqfp) obj).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        private final List esjtqupxsv(ii.gxszxtbevo gxszxtbevoVar) {
            List listPkzmftpjix = pkzmftpjix();
            iwizpuwonk iwizpuwonkVar = this.f122468agtfadlqog;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listPkzmftpjix) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((jh.wflxmlrfwp) obj).getName(), gxszxtbevoVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            iwizpuwonkVar.ojitshcjhn(gxszxtbevoVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final Map hcddaimhww() {
            return (Map) yi.wflxmlrfwp.iobyxmoadg(this.f122469btonecajqb, this, f122467ojitshcjhn[6]);
        }

        private final Map hkdspvbjdz() {
            return (Map) yi.wflxmlrfwp.iobyxmoadg(this.f122471dxjokdxxww, this, f122467ojitshcjhn[5]);
        }

        private final List iozdgvuglv() {
            return (List) yi.wflxmlrfwp.iobyxmoadg(this.f122476lqeggnwhkg, this, f122467ojitshcjhn[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List istkbnxepw(zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.lereixgezr();
        }

        private final List iwizpuwonk() {
            List list = this.f122475iobyxmoadg;
            iwizpuwonk iwizpuwonkVar = this.f122468agtfadlqog;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jztzpxfvev jztzpxfvevVarKcexrzcfyt = iwizpuwonkVar.kcexrzcfyt().gxszxtbevo().kcexrzcfyt((di.dxjokdxxww) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) it.next()));
                if (!iwizpuwonkVar.pmvmpeiblj(jztzpxfvevVarKcexrzcfyt)) {
                    jztzpxfvevVarKcexrzcfyt = null;
                }
                if (jztzpxfvevVarKcexrzcfyt != null) {
                    arrayList.add(jztzpxfvevVarKcexrzcfyt);
                }
            }
            return arrayList;
        }

        private final Map jpowsppfya() {
            return (Map) yi.wflxmlrfwp.iobyxmoadg(this.f122473gtknphoqwx, this, f122467ojitshcjhn[7]);
        }

        private final List jyumaefscl() {
            Set setCqumvgiudr = this.f122468agtfadlqog.cqumvgiudr();
            ArrayList arrayList = new ArrayList();
            Iterator it = setCqumvgiudr.iterator();
            while (it.hasNext()) {
                hg.jyumaefscl.istkbnxepw(arrayList, esjtqupxsv((ii.gxszxtbevo) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List kcexrzcfyt(zoijcleaow zoijcleaowVar) {
            return hg.jyumaefscl.ixidwrxhsl(zoijcleaowVar.pkzmftpjix(), zoijcleaowVar.jyumaefscl());
        }

        private final List lereixgezr() {
            List list = this.f122481zoijcleaow;
            iwizpuwonk iwizpuwonkVar = this.f122468agtfadlqog;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                crxdokpmqz crxdokpmqzVarYggfygwlhe = iwizpuwonkVar.kcexrzcfyt().gxszxtbevo().yggfygwlhe((di.agtfadlqog) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) it.next()));
                if (crxdokpmqzVarYggfygwlhe != null) {
                    arrayList.add(crxdokpmqzVarYggfygwlhe);
                }
            }
            return arrayList;
        }

        private final List lmojexxdyd() {
            return (List) yi.wflxmlrfwp.iobyxmoadg(this.f122477nufgyqmvbu, this, f122467ojitshcjhn[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List oxmwwwfdhm(zoijcleaow zoijcleaowVar) {
            return hg.jyumaefscl.ixidwrxhsl(zoijcleaowVar.ylkuphrtab(), zoijcleaowVar.yggfygwlhe());
        }

        private final List pkzmftpjix() {
            return (List) yi.wflxmlrfwp.iobyxmoadg(this.f122472eablkybsjg, this, f122467ojitshcjhn[1]);
        }

        private final List pmvmpeiblj() {
            List list = this.f122478ppxfxbqfkf;
            iwizpuwonk iwizpuwonkVar = this.f122468agtfadlqog;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uwvvkdfqfp uwvvkdfqfpVarLereixgezr = iwizpuwonkVar.kcexrzcfyt().gxszxtbevo().lereixgezr((di.oxmwwwfdhm) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) it.next()));
                if (uwvvkdfqfpVarLereixgezr != null) {
                    arrayList.add(uwvvkdfqfpVarLereixgezr);
                }
            }
            return arrayList;
        }

        private final List wwaezpbzkn() {
            return (List) yi.wflxmlrfwp.iobyxmoadg(this.f122474gxszxtbevo, this, f122467ojitshcjhn[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set wypolnanlu(zoijcleaow zoijcleaowVar, iwizpuwonk iwizpuwonkVar) {
            List list = zoijcleaowVar.f122481zoijcleaow;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            iwizpuwonk iwizpuwonkVar2 = zoijcleaowVar.f122468agtfadlqog;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(vi.jpowsppfya.zoijcleaow(iwizpuwonkVar2.kcexrzcfyt().lqeggnwhkg(), ((di.agtfadlqog) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) it.next())).rlfsiqarku()));
            }
            return ikoacuggdj.draadjrbmk(linkedHashSet, iwizpuwonkVar.cqumvgiudr());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map yadqdtsiqt(zoijcleaow zoijcleaowVar) {
            List listIozdgvuglv = zoijcleaowVar.iozdgvuglv();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listIozdgvuglv) {
                ii.gxszxtbevo name = ((jztzpxfvev) obj).getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List yggfygwlhe() {
            Set setIwizpuwonk = this.f122468agtfadlqog.iwizpuwonk();
            ArrayList arrayList = new ArrayList();
            Iterator it = setIwizpuwonk.iterator();
            while (it.hasNext()) {
                hg.jyumaefscl.istkbnxepw(arrayList, cqumvgiudr((ii.gxszxtbevo) it.next()));
            }
            return arrayList;
        }

        private final List ylkuphrtab() {
            return (List) yi.wflxmlrfwp.iobyxmoadg(this.f122480wkgbmnqykc, this, f122467ojitshcjhn[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List zdlpuopuiu(zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.pmvmpeiblj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List zynmafqrjb(zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.iwizpuwonk();
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public uwvvkdfqfp eablkybsjg(ii.gxszxtbevo name) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            return (uwvvkdfqfp) hkdspvbjdz().get(name);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Set gxszxtbevo() {
            List list = this.f122478ppxfxbqfkf;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            iwizpuwonk iwizpuwonkVar = this.f122468agtfadlqog;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(vi.jpowsppfya.zoijcleaow(iwizpuwonkVar.kcexrzcfyt().lqeggnwhkg(), ((di.oxmwwwfdhm) ((kotlin.reflect.jvm.internal.impl.protobuf.agtfadlqog) it.next())).jhduphickx()));
            }
            return linkedHashSet;
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Set iobyxmoadg() {
            return (Set) yi.wflxmlrfwp.iobyxmoadg(this.f122470draadjrbmk, this, f122467ojitshcjhn[8]);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public void lqeggnwhkg(Collection result, si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter, rh.zoijcleaow location) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            if (kindFilter.iobyxmoadg(si.wkgbmnqykc.f106753ppxfxbqfkf.dxjokdxxww())) {
                for (Object obj : lmojexxdyd()) {
                    ii.gxszxtbevo name = ((crxdokpmqz) obj).getName();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.iobyxmoadg(si.wkgbmnqykc.f106753ppxfxbqfkf.wkgbmnqykc())) {
                for (Object obj2 : iozdgvuglv()) {
                    ii.gxszxtbevo name2 = ((jztzpxfvev) obj2).getName();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name2, "getName(...)");
                    if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Set ppxfxbqfkf() {
            return (Set) yi.wflxmlrfwp.iobyxmoadg(this.f122479wflxmlrfwp, this, f122467ojitshcjhn[9]);
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
            Collection collection;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            return (iobyxmoadg().contains(name) && (collection = (Collection) hcddaimhww().get(name)) != null) ? collection : hg.jyumaefscl.wflxmlrfwp();
        }

        @Override // xi.iwizpuwonk.iobyxmoadg
        public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
            Collection collection;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
            return (ppxfxbqfkf().contains(name) && (collection = (Collection) jpowsppfya().get(name)) != null) ? collection : hg.jyumaefscl.wflxmlrfwp();
        }
    }

    protected iwizpuwonk(vi.rgvfuqvkyq c13, List functionList, List propertyList, List typeAliasList, tg.iobyxmoadg classNames) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionList, "functionList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(propertyList, "propertyList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeAliasList, "typeAliasList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classNames, "classNames");
        this.f122453zoijcleaow = c13;
        this.f122451ppxfxbqfkf = vdvldrhtss(functionList, propertyList, typeAliasList);
        this.f122452wkgbmnqykc = c13.nufgyqmvbu().wkgbmnqykc(new yggfygwlhe(classNames));
        this.f122450eablkybsjg = c13.nufgyqmvbu().iobyxmoadg(new jyumaefscl(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set draadjrbmk(iwizpuwonk iwizpuwonkVar) {
        Set setJyumaefscl = iwizpuwonkVar.jyumaefscl();
        if (setJyumaefscl == null) {
            return null;
        }
        return ikoacuggdj.draadjrbmk(ikoacuggdj.draadjrbmk(iwizpuwonkVar.zdlpuopuiu(), iwizpuwonkVar.f122451ppxfxbqfkf.gxszxtbevo()), setJyumaefscl);
    }

    private final uwvvkdfqfp esjtqupxsv(ii.gxszxtbevo gxszxtbevoVar) {
        return this.f122451ppxfxbqfkf.eablkybsjg(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set gtknphoqwx(tg.iobyxmoadg iobyxmoadgVar) {
        return hg.jyumaefscl.r((Iterable) iobyxmoadgVar.invoke());
    }

    private final jh.eablkybsjg oxmwwwfdhm(ii.gxszxtbevo gxszxtbevoVar) {
        return this.f122453zoijcleaow.ppxfxbqfkf().zoijcleaow(rgvfuqvkyq(gxszxtbevoVar));
    }

    private final iobyxmoadg vdvldrhtss(List list, List list2, List list3) {
        return this.f122453zoijcleaow.ppxfxbqfkf().lqeggnwhkg().iobyxmoadg() ? new zoijcleaow(this, list, list2, list3) : new ppxfxbqfkf(this, list, list2, list3);
    }

    private final Set yggfygwlhe() {
        return (Set) yi.wflxmlrfwp.zoijcleaow(this.f122450eablkybsjg, this, f122449gxszxtbevo[1]);
    }

    protected void agtfadlqog(ii.gxszxtbevo name, List functions) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functions, "functions");
    }

    protected abstract void btonecajqb(Collection collection, tg.draadjrbmk draadjrbmkVar);

    protected abstract Set cqumvgiudr();

    @Override // si.draadjrbmk, si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        if (lereixgezr(name)) {
            return oxmwwwfdhm(name);
        }
        if (this.f122451ppxfxbqfkf.gxszxtbevo().contains(name)) {
            return esjtqupxsv(name);
        }
        return null;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Set iobyxmoadg() {
        return this.f122451ppxfxbqfkf.iobyxmoadg();
    }

    protected abstract Set iwizpuwonk();

    protected abstract Set jyumaefscl();

    protected final vi.rgvfuqvkyq kcexrzcfyt() {
        return this.f122453zoijcleaow;
    }

    protected boolean lereixgezr(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return zdlpuopuiu().contains(name);
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Set lqeggnwhkg() {
        return yggfygwlhe();
    }

    protected void ojitshcjhn(ii.gxszxtbevo name, List descriptors) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptors, "descriptors");
    }

    protected boolean pmvmpeiblj(jztzpxfvev function) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(function, "function");
        return true;
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Set ppxfxbqfkf() {
        return this.f122451ppxfxbqfkf.ppxfxbqfkf();
    }

    protected abstract ii.zoijcleaow rgvfuqvkyq(ii.gxszxtbevo gxszxtbevoVar);

    protected final Collection wflxmlrfwp(si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        ArrayList arrayList = new ArrayList(0);
        si.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = si.wkgbmnqykc.f106753ppxfxbqfkf;
        if (kindFilter.iobyxmoadg(iobyxmoadgVar.lqeggnwhkg())) {
            btonecajqb(arrayList, nameFilter);
        }
        this.f122451ppxfxbqfkf.lqeggnwhkg(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf())) {
            for (ii.gxszxtbevo gxszxtbevoVar : zdlpuopuiu()) {
                if (((Boolean) nameFilter.invoke(gxszxtbevoVar)).booleanValue()) {
                    jj.iobyxmoadg.iobyxmoadg(arrayList, oxmwwwfdhm(gxszxtbevoVar));
                }
            }
        }
        if (kindFilter.iobyxmoadg(si.wkgbmnqykc.f106753ppxfxbqfkf.nufgyqmvbu())) {
            for (ii.gxszxtbevo gxszxtbevoVar2 : this.f122451ppxfxbqfkf.gxszxtbevo()) {
                if (((Boolean) nameFilter.invoke(gxszxtbevoVar2)).booleanValue()) {
                    jj.iobyxmoadg.iobyxmoadg(arrayList, this.f122451ppxfxbqfkf.eablkybsjg(gxszxtbevoVar2));
                }
            }
        }
        return jj.iobyxmoadg.ppxfxbqfkf(arrayList);
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Collection wkgbmnqykc(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return this.f122451ppxfxbqfkf.wkgbmnqykc(name, location);
    }

    public final Set zdlpuopuiu() {
        return (Set) yi.wflxmlrfwp.iobyxmoadg(this.f122452wkgbmnqykc, this, f122449gxszxtbevo[0]);
    }

    @Override // si.draadjrbmk, si.gtknphoqwx
    public Collection zoijcleaow(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        return this.f122451ppxfxbqfkf.zoijcleaow(name, location);
    }
}
