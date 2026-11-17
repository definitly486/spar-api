package aj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.cllcsxoeiz;
import zi.grlcpdaxtj;
import zi.ikoacuggdj;
import zi.jpowsppfya;
import zi.kegysxyocb;
import zi.metgxyhuhe;
import zi.opjhrmiecq;
import zi.stevsuqkhv;

/* JADX INFO: loaded from: classes3.dex */
public final class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lereixgezr f2060iobyxmoadg = new lereixgezr();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ iobyxmoadg[] f2061cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f2062esjtqupxsv;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f2066zdlpuopuiu = new ppxfxbqfkf("START", 0);

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final iobyxmoadg f2065yggfygwlhe = new C0047iobyxmoadg("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public static final iobyxmoadg f2064jyumaefscl = new wkgbmnqykc("UNKNOWN", 2);

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final iobyxmoadg f2063iwizpuwonk = new zoijcleaow("NOT_NULL", 3);

        /* JADX INFO: renamed from: aj.lereixgezr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0047iobyxmoadg extends iobyxmoadg {
            C0047iobyxmoadg(String str, int i13) {
                super(str, i13, null);
            }

            @Override // aj.lereixgezr.iobyxmoadg
            public iobyxmoadg wkgbmnqykc(grlcpdaxtj nextType) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nextType, "nextType");
                return lqeggnwhkg(nextType);
            }
        }

        static final class ppxfxbqfkf extends iobyxmoadg {
            ppxfxbqfkf(String str, int i13) {
                super(str, i13, null);
            }

            @Override // aj.lereixgezr.iobyxmoadg
            public iobyxmoadg wkgbmnqykc(grlcpdaxtj nextType) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nextType, "nextType");
                return lqeggnwhkg(nextType);
            }
        }

        static final class wkgbmnqykc extends iobyxmoadg {
            wkgbmnqykc(String str, int i13) {
                super(str, i13, null);
            }

            @Override // aj.lereixgezr.iobyxmoadg
            public iobyxmoadg wkgbmnqykc(grlcpdaxtj nextType) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nextType, "nextType");
                iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg(nextType);
                return iobyxmoadgVarLqeggnwhkg == iobyxmoadg.f2065yggfygwlhe ? this : iobyxmoadgVarLqeggnwhkg;
            }
        }

        static final class zoijcleaow extends iobyxmoadg {
            zoijcleaow(String str, int i13) {
                super(str, i13, null);
            }

            @Override // aj.lereixgezr.iobyxmoadg
            /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
            public zoijcleaow wkgbmnqykc(grlcpdaxtj nextType) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nextType, "nextType");
                return this;
            }
        }

        static {
            iobyxmoadg[] iobyxmoadgVarArrIobyxmoadg = iobyxmoadg();
            f2061cqumvgiudr = iobyxmoadgVarArrIobyxmoadg;
            f2062esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadgVarArrIobyxmoadg);
        }

        public /* synthetic */ iobyxmoadg(String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, i13);
        }

        private static final /* synthetic */ iobyxmoadg[] iobyxmoadg() {
            return new iobyxmoadg[]{f2066zdlpuopuiu, f2065yggfygwlhe, f2064jyumaefscl, f2063iwizpuwonk};
        }

        public static iobyxmoadg valueOf(String str) {
            return (iobyxmoadg) Enum.valueOf(iobyxmoadg.class, str);
        }

        public static iobyxmoadg[] values() {
            return (iobyxmoadg[]) f2061cqumvgiudr.clone();
        }

        protected final iobyxmoadg lqeggnwhkg(grlcpdaxtj grlcpdaxtjVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(grlcpdaxtjVar, "<this>");
            if (grlcpdaxtjVar.mhtqkkgtqm()) {
                return f2065yggfygwlhe;
            }
            if (grlcpdaxtjVar instanceof zi.esjtqupxsv) {
                ((zi.esjtqupxsv) grlcpdaxtjVar).c();
            }
            return oxmwwwfdhm.f2069iobyxmoadg.iobyxmoadg(grlcpdaxtjVar) ? f2063iwizpuwonk : f2064jyumaefscl;
        }

        public abstract iobyxmoadg wkgbmnqykc(grlcpdaxtj grlcpdaxtjVar);

        private iobyxmoadg(String str, int i13) {
            super(str, i13);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.rgvfuqvkyq implements tg.rgvfuqvkyq {
        ppxfxbqfkf(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final ah.gxszxtbevo getOwner() {
            return cllcsxoeiz.zoijcleaow(vdvldrhtss.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kegysxyocb p13, kegysxyocb p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return Boolean.valueOf(((vdvldrhtss) this.receiver).ppxfxbqfkf(p13, p14));
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.rgvfuqvkyq implements tg.rgvfuqvkyq {
        zoijcleaow(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final ah.gxszxtbevo getOwner() {
            return cllcsxoeiz.zoijcleaow(lereixgezr.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kegysxyocb p13, kegysxyocb p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return Boolean.valueOf(((lereixgezr) this.receiver).lqeggnwhkg(p13, p14));
        }
    }

    private lereixgezr() {
    }

    private final ikoacuggdj eablkybsjg(Set set) {
        if (set.size() == 1) {
            return (ikoacuggdj) hg.jyumaefscl.rhgxfdycjh(set);
        }
        new esjtqupxsv(set);
        Set set2 = set;
        Collection collectionPpxfxbqfkf = ppxfxbqfkf(set2, new zoijcleaow(this));
        collectionPpxfxbqfkf.isEmpty();
        ikoacuggdj ikoacuggdjVarZoijcleaow = ni.vdvldrhtss.f70104gxszxtbevo.zoijcleaow(collectionPpxfxbqfkf);
        if (ikoacuggdjVarZoijcleaow != null) {
            return ikoacuggdjVarZoijcleaow;
        }
        Collection collectionPpxfxbqfkf2 = ppxfxbqfkf(collectionPpxfxbqfkf, new ppxfxbqfkf(rgvfuqvkyq.f2070zoijcleaow.iobyxmoadg()));
        collectionPpxfxbqfkf2.isEmpty();
        return collectionPpxfxbqfkf2.size() < 2 ? (ikoacuggdj) hg.jyumaefscl.rhgxfdycjh(collectionPpxfxbqfkf2) : new stevsuqkhv(set2).btonecajqb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gxszxtbevo(Set set) {
        return "This collections cannot be empty! input types: " + hg.jyumaefscl.iwxlajgraz(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean lqeggnwhkg(kegysxyocb kegysxyocbVar, kegysxyocb kegysxyocbVar2) {
        vdvldrhtss vdvldrhtssVarIobyxmoadg = rgvfuqvkyq.f2070zoijcleaow.iobyxmoadg();
        return vdvldrhtssVarIobyxmoadg.zoijcleaow(kegysxyocbVar, kegysxyocbVar2) && !vdvldrhtssVarIobyxmoadg.zoijcleaow(kegysxyocbVar2, kegysxyocbVar);
    }

    private final Collection ppxfxbqfkf(Collection collection, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        ArrayList<ikoacuggdj> arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "iterator(...)");
        while (it.hasNext()) {
            ikoacuggdj ikoacuggdjVar = (ikoacuggdj) it.next();
            if (!arrayList.isEmpty()) {
                for (ikoacuggdj ikoacuggdjVar2 : arrayList) {
                    if (ikoacuggdjVar2 != ikoacuggdjVar) {
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ikoacuggdjVar2);
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ikoacuggdjVar);
                        if (((Boolean) rgvfuqvkyqVar.invoke(ikoacuggdjVar2, ikoacuggdjVar)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final ikoacuggdj wkgbmnqykc(List types) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(types, "types");
        types.size();
        ArrayList<ikoacuggdj> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            ikoacuggdj ikoacuggdjVar = (ikoacuggdj) it.next();
            if (ikoacuggdjVar.grlcpdaxtj() instanceof stevsuqkhv) {
                Collection collectionZoijcleaow = ikoacuggdjVar.grlcpdaxtj().zoijcleaow();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
                Collection<kegysxyocb> collection = collectionZoijcleaow;
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection, 10));
                for (kegysxyocb kegysxyocbVar : collection) {
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
                    ikoacuggdj ikoacuggdjVarWkgbmnqykc = jpowsppfya.wkgbmnqykc(kegysxyocbVar);
                    if (ikoacuggdjVar.mhtqkkgtqm()) {
                        ikoacuggdjVarWkgbmnqykc = ikoacuggdjVarWkgbmnqykc.fmlbqenlif(true);
                    }
                    arrayList2.add(ikoacuggdjVarWkgbmnqykc);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(ikoacuggdjVar);
            }
        }
        iobyxmoadg iobyxmoadgVarWkgbmnqykc = iobyxmoadg.f2066zdlpuopuiu;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iobyxmoadgVarWkgbmnqykc = iobyxmoadgVarWkgbmnqykc.wkgbmnqykc((grlcpdaxtj) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ikoacuggdj ikoacuggdjVarDxjokdxxww : arrayList) {
            if (iobyxmoadgVarWkgbmnqykc == iobyxmoadg.f2063iwizpuwonk) {
                if (ikoacuggdjVarDxjokdxxww instanceof dxjokdxxww) {
                    ikoacuggdjVarDxjokdxxww = metgxyhuhe.gtknphoqwx((dxjokdxxww) ikoacuggdjVarDxjokdxxww);
                }
                ikoacuggdjVarDxjokdxxww = metgxyhuhe.dxjokdxxww(ikoacuggdjVarDxjokdxxww, false, 1, null);
            }
            linkedHashSet.add(ikoacuggdjVarDxjokdxxww);
        }
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(types, 10));
        Iterator it3 = types.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ikoacuggdj) it3.next()).ipoelvxyzq());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((opjhrmiecq) next).btonecajqb((opjhrmiecq) it4.next());
        }
        return eablkybsjg(linkedHashSet).rhgxfdycjh((opjhrmiecq) next);
    }
}
