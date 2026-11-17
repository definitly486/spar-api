package ki;

import gg.wwaezpbzkn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.crxdokpmqz;
import jh.hkdspvbjdz;
import jh.iyctptxqzt;
import jh.jlmebxxoox;
import jh.jpowsppfya;
import jh.mbcevpiqjq;
import jh.oipsdeybqn;
import jh.ribwqtqdhb;
import jh.sopmlzcsov;
import jh.uwvvkdfqfp;
import jh.vipkmwdibw;
import jh.weqkydbzbr;
import jh.yfnezrywwk;
import kotlin.NoWhenBranchMatchedException;
import zi.ageimvtcrz;
import zi.grlcpdaxtj;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.ixidwrxhsl;
import zi.kegysxyocb;
import zi.metgxyhuhe;
import zi.mhtqkkgtqm;
import zi.stevsuqkhv;
import zi.ulzqkzuiru;
import zi.ylkuphrtab;
import zi.zeieaojujs;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe extends agtfadlqog implements iwizpuwonk {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final gg.gtknphoqwx f55661agtfadlqog;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final lereixgezr f55662wflxmlrfwp;

    private final class iobyxmoadg implements jh.ojitshcjhn {

        /* JADX INFO: renamed from: ki.yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public /* synthetic */ class C1183iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f55664iobyxmoadg;

            static {
                int[] iArr = new int[yadqdtsiqt.values().length];
                try {
                    iArr[yadqdtsiqt.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yadqdtsiqt.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yadqdtsiqt.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f55664iobyxmoadg = iArr;
            }
        }

        public iobyxmoadg() {
        }

        private final void zdlpuopuiu(sopmlzcsov sopmlzcsovVar, StringBuilder sb3, String str) throws IOException {
            int i13 = C1183iobyxmoadg.f55664iobyxmoadg[yggfygwlhe.this.fmlbqenlif().ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    rgvfuqvkyq(sopmlzcsovVar, sb3);
                    return;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            yggfygwlhe.this.B(sopmlzcsovVar, sb3);
            sb3.append(str + " for ");
            yggfygwlhe yggfygwlheVar = yggfygwlhe.this;
            crxdokpmqz crxdokpmqzVarMbcevpiqjq = sopmlzcsovVar.mbcevpiqjq();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(crxdokpmqzVarMbcevpiqjq, "getCorrespondingProperty(...)");
            yggfygwlheVar.m0(crxdokpmqzVarMbcevpiqjq, sb3);
        }

        public void agtfadlqog(jh.eablkybsjg descriptor, StringBuilder builder) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.H(descriptor, builder);
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object btonecajqb(yfnezrywwk yfnezrywwkVar, Object obj) {
            lereixgezr(yfnezrywwkVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public void cqumvgiudr(vipkmwdibw descriptor, StringBuilder builder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            builder.append(descriptor.getName());
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object draadjrbmk(hkdspvbjdz hkdspvbjdzVar, Object obj) {
            oxmwwwfdhm(hkdspvbjdzVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object dxjokdxxww(ribwqtqdhb ribwqtqdhbVar, Object obj) throws IOException {
            iwizpuwonk(ribwqtqdhbVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object eablkybsjg(jh.eablkybsjg eablkybsjgVar, Object obj) throws IOException {
            agtfadlqog(eablkybsjgVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public void esjtqupxsv(uwvvkdfqfp descriptor, StringBuilder builder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.v0(descriptor, builder);
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object gtknphoqwx(mbcevpiqjq mbcevpiqjqVar, Object obj) {
            kcexrzcfyt(mbcevpiqjqVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object gxszxtbevo(jh.lmojexxdyd lmojexxdydVar, Object obj) {
            vdvldrhtss(lmojexxdydVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object iobyxmoadg(vipkmwdibw vipkmwdibwVar, Object obj) {
            cqumvgiudr(vipkmwdibwVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public void iwizpuwonk(ribwqtqdhb descriptor, StringBuilder builder) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            zdlpuopuiu(descriptor, builder, "setter");
        }

        public void jyumaefscl(jlmebxxoox descriptor, StringBuilder builder) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            zdlpuopuiu(descriptor, builder, "getter");
        }

        public void kcexrzcfyt(mbcevpiqjq descriptor, StringBuilder builder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.k0(descriptor, builder);
        }

        public void lereixgezr(yfnezrywwk descriptor, StringBuilder builder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.B0(descriptor, builder, true);
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object lqeggnwhkg(jh.draadjrbmk draadjrbmkVar, Object obj) throws IOException {
            ojitshcjhn(draadjrbmkVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object nufgyqmvbu(crxdokpmqz crxdokpmqzVar, Object obj) throws IOException {
            yggfygwlhe(crxdokpmqzVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public void ojitshcjhn(jh.draadjrbmk constructorDescriptor, StringBuilder builder) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constructorDescriptor, "constructorDescriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.M(constructorDescriptor, builder);
        }

        public void oxmwwwfdhm(hkdspvbjdz descriptor, StringBuilder builder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.i0(descriptor, builder);
        }

        public void pmvmpeiblj(iyctptxqzt descriptor, StringBuilder builder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.G0(descriptor, true, builder, true);
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object ppxfxbqfkf(uwvvkdfqfp uwvvkdfqfpVar, Object obj) {
            esjtqupxsv(uwvvkdfqfpVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public void rgvfuqvkyq(jh.lereixgezr descriptor, StringBuilder builder) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.U(descriptor, builder);
        }

        public void vdvldrhtss(jh.lmojexxdyd descriptor, StringBuilder builder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.e0(descriptor, builder, true);
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object wflxmlrfwp(jh.lereixgezr lereixgezrVar, Object obj) throws IOException {
            rgvfuqvkyq(lereixgezrVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object wkgbmnqykc(jlmebxxoox jlmebxxooxVar, Object obj) throws IOException {
            jyumaefscl(jlmebxxooxVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public void yggfygwlhe(crxdokpmqz descriptor, StringBuilder builder) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
            yggfygwlhe.this.m0(descriptor, builder);
        }

        @Override // jh.ojitshcjhn
        public /* bridge */ /* synthetic */ Object zoijcleaow(iyctptxqzt iyctptxqztVar, Object obj) {
            pmvmpeiblj(iyctptxqztVar, (StringBuilder) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f55665iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f55666zoijcleaow;

        static {
            int[] iArr = new int[iozdgvuglv.values().length];
            try {
                iArr[iozdgvuglv.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iozdgvuglv.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55665iobyxmoadg = iArr;
            int[] iArr2 = new int[cdpycssgdh.values().length];
            try {
                iArr2[cdpycssgdh.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[cdpycssgdh.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[cdpycssgdh.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f55666zoijcleaow = iArr2;
        }
    }

    public yggfygwlhe(lereixgezr options) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(options, "options");
        this.f55662wflxmlrfwp = options;
        options.bfopjjpdmp();
        this.f55661agtfadlqog = gg.draadjrbmk.zoijcleaow(new ojitshcjhn(this));
    }

    private final void A(StringBuilder sb3, zi.iobyxmoadg iobyxmoadgVar) {
        iozdgvuglv iozdgvuglvVarJ = j();
        iozdgvuglv iozdgvuglvVar = iozdgvuglv.HTML;
        if (iozdgvuglvVarJ == iozdgvuglvVar) {
            sb3.append("<font color=\"808080\"><i>");
        }
        sb3.append(" /* ");
        sb3.append("from: ");
        g0(sb3, iobyxmoadgVar.c());
        sb3.append(" */");
        if (j() == iozdgvuglvVar) {
            sb3.append("</i></font>");
        }
    }

    static /* synthetic */ void A0(yggfygwlhe yggfygwlheVar, StringBuilder sb3, kegysxyocb kegysxyocbVar, zeieaojujs zeieaojujsVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            zeieaojujsVar = kegysxyocbVar.grlcpdaxtj();
        }
        yggfygwlheVar.z0(sb3, kegysxyocbVar, zeieaojujsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(sopmlzcsov sopmlzcsovVar, StringBuilder sb3) {
        Z(sopmlzcsovVar, sb3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(yfnezrywwk yfnezrywwkVar, StringBuilder sb3, boolean z13) {
        if (z13) {
            sb3.append(y());
        }
        if (o()) {
            sb3.append("/*");
            sb3.append(yfnezrywwkVar.getIndex());
            sb3.append("*/ ");
        }
        d0(sb3, yfnezrywwkVar.cqumvgiudr(), "reified");
        String strLqeggnwhkg = yfnezrywwkVar.draadjrbmk().lqeggnwhkg();
        boolean z14 = true;
        d0(sb3, strLqeggnwhkg.length() > 0, strLqeggnwhkg);
        F(this, sb3, yfnezrywwkVar, null, 2, null);
        e0(yfnezrywwkVar, sb3, z13);
        int size = yfnezrywwkVar.getUpperBounds().size();
        if ((size > 1 && !z13) || size == 1) {
            kegysxyocb kegysxyocbVar = (kegysxyocb) yfnezrywwkVar.getUpperBounds().iterator().next();
            if (!gh.dxjokdxxww.uwvvkdfqfp(kegysxyocbVar)) {
                sb3.append(" : ");
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
                sb3.append(ntlheqmsrt(kegysxyocbVar));
            }
        } else if (z13) {
            for (kegysxyocb kegysxyocbVar2 : yfnezrywwkVar.getUpperBounds()) {
                if (!gh.dxjokdxxww.uwvvkdfqfp(kegysxyocbVar2)) {
                    if (z14) {
                        sb3.append(" : ");
                    } else {
                        sb3.append(" & ");
                    }
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar2);
                    sb3.append(ntlheqmsrt(kegysxyocbVar2));
                    z14 = false;
                }
            }
        }
        if (z13) {
            sb3.append(u());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    private final void C(jh.lereixgezr lereixgezrVar, StringBuilder sb3) {
        boolean z13;
        boolean z14 = false;
        if (lereixgezrVar.isOperator()) {
            Collection collectionEablkybsjg = lereixgezrVar.eablkybsjg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "getOverriddenDescriptors(...)");
            Collection collection = collectionEablkybsjg;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((jh.lereixgezr) it.next()).isOperator()) {
                            if (!tbqsvytpvh()) {
                                z13 = false;
                            }
                        }
                    }
                }
            }
            z13 = true;
        } else {
            z13 = false;
        }
        if (lereixgezrVar.isInfix()) {
            Collection collectionEablkybsjg2 = lereixgezrVar.eablkybsjg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg2, "getOverriddenDescriptors(...)");
            Collection collection2 = collectionEablkybsjg2;
            if (collection2.isEmpty()) {
                z14 = true;
            } else {
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    if (((jh.lereixgezr) it2.next()).isInfix()) {
                        if (tbqsvytpvh()) {
                            break;
                        }
                    }
                }
                z14 = true;
            }
        }
        d0(sb3, lereixgezrVar.istkbnxepw(), "tailrec");
        u0(lereixgezrVar, sb3);
        d0(sb3, lereixgezrVar.isInline(), "inline");
        d0(sb3, z14, "infix");
        d0(sb3, z13, "operator");
    }

    private final void C0(StringBuilder sb3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B0((yfnezrywwk) it.next(), sb3, false);
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
    }

    private final List D(kh.ppxfxbqfkf ppxfxbqfkfVar) {
        jh.wkgbmnqykc wkgbmnqykcVarCdpycssgdh;
        List listDxjokdxxww;
        Map mapZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        List listWflxmlrfwp = null;
        jh.eablkybsjg eablkybsjgVarDraadjrbmk = a() ? pi.eablkybsjg.draadjrbmk(ppxfxbqfkfVar) : null;
        if (eablkybsjgVarDraadjrbmk != null && (wkgbmnqykcVarCdpycssgdh = eablkybsjgVarDraadjrbmk.cdpycssgdh()) != null && (listDxjokdxxww = wkgbmnqykcVarCdpycssgdh.dxjokdxxww()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listDxjokdxxww) {
                if (((iyctptxqzt) obj).auzgnhcxok()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((iyctptxqzt) it.next()).getName());
            }
            listWflxmlrfwp = arrayList2;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listWflxmlrfwp) {
            if (!mapZoijcleaow.containsKey((ii.gxszxtbevo) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((ii.gxszxtbevo) it2.next()).zoijcleaow() + " = ...");
        }
        Set<Map.Entry> setEntrySet = mapZoijcleaow.entrySet();
        ArrayList arrayList5 = new ArrayList(hg.jyumaefscl.cqumvgiudr(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            ii.gxszxtbevo gxszxtbevoVar = (ii.gxszxtbevo) entry.getKey();
            ni.lqeggnwhkg lqeggnwhkgVar = (ni.lqeggnwhkg) entry.getValue();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(gxszxtbevoVar.zoijcleaow());
            sb3.append(" = ");
            sb3.append(!listWflxmlrfwp.contains(gxszxtbevoVar) ? L(lqeggnwhkgVar) : "...");
            arrayList5.add(sb3.toString());
        }
        return hg.jyumaefscl.b(hg.jyumaefscl.ixidwrxhsl(arrayList4, arrayList5));
    }

    private final void D0(List list, StringBuilder sb3, boolean z13) {
        if (t() || list.isEmpty()) {
            return;
        }
        sb3.append(y());
        C0(sb3, list);
        sb3.append(u());
        if (z13) {
            sb3.append(" ");
        }
    }

    private final void E(StringBuilder sb3, kh.iobyxmoadg iobyxmoadgVar, kh.eablkybsjg eablkybsjgVar) {
        if (ageimvtcrz().contains(jyumaefscl.ANNOTATIONS)) {
            Set setNufgyqmvbu = iobyxmoadgVar instanceof kegysxyocb ? nufgyqmvbu() : igdgnonuha();
            tg.draadjrbmk draadjrbmkVarRoivzttewh = roivzttewh();
            for (kh.ppxfxbqfkf ppxfxbqfkfVar : iobyxmoadgVar.getAnnotations()) {
                if (!hg.jyumaefscl.xrmfcynszj(setNufgyqmvbu, ppxfxbqfkfVar.gxszxtbevo()) && !x(ppxfxbqfkfVar) && (draadjrbmkVarRoivzttewh == null || ((Boolean) draadjrbmkVarRoivzttewh.invoke(ppxfxbqfkfVar)).booleanValue())) {
                    sb3.append(wypolnanlu(ppxfxbqfkfVar, eablkybsjgVar));
                    if (skhdrjzrfn()) {
                        sb3.append('\n');
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
                    } else {
                        sb3.append(" ");
                    }
                }
            }
        }
    }

    private final void E0(weqkydbzbr weqkydbzbrVar, StringBuilder sb3, boolean z13) {
        if (z13 || !(weqkydbzbrVar instanceof iyctptxqzt)) {
            sb3.append(X(weqkydbzbrVar.jpowsppfya() ? "var" : "val"));
            sb3.append(" ");
        }
    }

    static /* synthetic */ void F(yggfygwlhe yggfygwlheVar, StringBuilder sb3, kh.iobyxmoadg iobyxmoadgVar, kh.eablkybsjg eablkybsjgVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            eablkybsjgVar = null;
        }
        yggfygwlheVar.E(sb3, iobyxmoadgVar, eablkybsjgVar);
    }

    static /* synthetic */ void F0(yggfygwlhe yggfygwlheVar, weqkydbzbr weqkydbzbrVar, StringBuilder sb3, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        yggfygwlheVar.E0(weqkydbzbrVar, sb3, z13);
    }

    private final void G(jh.dxjokdxxww dxjokdxxwwVar, StringBuilder sb3) {
        List listRgvfuqvkyq = dxjokdxxwwVar.rgvfuqvkyq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq, "getDeclaredTypeParameters(...)");
        List parameters = dxjokdxxwwVar.btonecajqb().getParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
        if (o() && dxjokdxxwwVar.lereixgezr() && parameters.size() > listRgvfuqvkyq.size()) {
            sb3.append(" /*captured type parameters: ");
            C0(sb3, parameters.subList(listRgvfuqvkyq.size(), parameters.size()));
            sb3.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final void G0(iyctptxqzt iyctptxqztVar, boolean z13, StringBuilder sb3, boolean z14) {
        boolean z15;
        if (z14) {
            sb3.append(X("value-parameter"));
            sb3.append(" ");
        }
        if (o()) {
            sb3.append("/*");
            sb3.append(iyctptxqztVar.getIndex());
            sb3.append("*/ ");
        }
        F(this, sb3, iyctptxqztVar, null, 2, null);
        d0(sb3, iyctptxqztVar.zfvoamnweg(), "crossinline");
        d0(sb3, iyctptxqztVar.sflfametgt(), "noinline");
        boolean z16 = false;
        if (d()) {
            jh.iobyxmoadg iobyxmoadgVarZoijcleaow = iyctptxqztVar.zoijcleaow();
            jh.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVarZoijcleaow instanceof jh.wkgbmnqykc ? (jh.wkgbmnqykc) iobyxmoadgVarZoijcleaow : null;
            if (wkgbmnqykcVar == null || !wkgbmnqykcVar.vipkmwdibw()) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else {
            z15 = false;
        }
        if (z15) {
            d0(sb3, nuxfzjnpeb(), "actual");
        }
        I0(iyctptxqztVar, z13, sb3, z14, z15);
        if (dvvnrvtcbc() != null) {
            if (dxjokdxxww() ? iyctptxqztVar.auzgnhcxok() : pi.eablkybsjg.gxszxtbevo(iyctptxqztVar)) {
                z16 = true;
            }
        }
        if (z16) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" = ");
            tg.draadjrbmk draadjrbmkVarDvvnrvtcbc = dvvnrvtcbc();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(draadjrbmkVarDvvnrvtcbc);
            sb4.append((String) draadjrbmkVarDvvnrvtcbc.invoke(iyctptxqztVar));
            sb3.append(sb4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(jh.eablkybsjg eablkybsjgVar, StringBuilder sb3) throws IOException {
        jh.wkgbmnqykc wkgbmnqykcVarCdpycssgdh;
        boolean z13 = eablkybsjgVar.getKind() == jh.gxszxtbevo.ENUM_ENTRY;
        if (!i()) {
            List listSopmlzcsov = eablkybsjgVar.sopmlzcsov();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listSopmlzcsov, "getContextReceivers(...)");
            O(listSopmlzcsov, sb3);
            F(this, sb3, eablkybsjgVar, null, 2, null);
            if (!z13) {
                jh.yggfygwlhe visibility = eablkybsjgVar.getVisibility();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility, "getVisibility(...)");
                J0(visibility, sb3);
            }
            if ((eablkybsjgVar.getKind() != jh.gxszxtbevo.INTERFACE || eablkybsjgVar.vdvldrhtss() != jh.cdpycssgdh.ABSTRACT) && (!eablkybsjgVar.getKind().wkgbmnqykc() || eablkybsjgVar.vdvldrhtss() != jh.cdpycssgdh.FINAL)) {
                jh.cdpycssgdh cdpycssgdhVarVdvldrhtss = eablkybsjgVar.vdvldrhtss();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cdpycssgdhVarVdvldrhtss, "getModality(...)");
                b0(cdpycssgdhVarVdvldrhtss, sb3, w(eablkybsjgVar));
            }
            Z(eablkybsjgVar, sb3);
            d0(sb3, ageimvtcrz().contains(jyumaefscl.INNER) && eablkybsjgVar.lereixgezr(), "inner");
            d0(sb3, ageimvtcrz().contains(jyumaefscl.DATA) && eablkybsjgVar.hszhottldk(), "data");
            d0(sb3, ageimvtcrz().contains(jyumaefscl.INLINE) && eablkybsjgVar.isInline(), "inline");
            d0(sb3, ageimvtcrz().contains(jyumaefscl.VALUE) && eablkybsjgVar.kcexrzcfyt(), "value");
            d0(sb3, ageimvtcrz().contains(jyumaefscl.FUN) && eablkybsjgVar.ikoacuggdj(), "fun");
            I(eablkybsjgVar, sb3);
        }
        if (li.dxjokdxxww.cqumvgiudr(eablkybsjgVar)) {
            K(eablkybsjgVar, sb3);
        } else {
            if (!i()) {
                r0(sb3);
            }
            e0(eablkybsjgVar, sb3, true);
        }
        if (z13) {
            return;
        }
        List listRgvfuqvkyq = eablkybsjgVar.rgvfuqvkyq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq, "getDeclaredTypeParameters(...)");
        D0(listRgvfuqvkyq, sb3, false);
        G(eablkybsjgVar, sb3);
        if (!eablkybsjgVar.getKind().wkgbmnqykc() && auzgnhcxok() && (wkgbmnqykcVarCdpycssgdh = eablkybsjgVar.cdpycssgdh()) != null) {
            sb3.append(" ");
            F(this, sb3, wkgbmnqykcVarCdpycssgdh, null, 2, null);
            jh.yggfygwlhe visibility2 = wkgbmnqykcVarCdpycssgdh.getVisibility();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility2, "getVisibility(...)");
            J0(visibility2, sb3);
            sb3.append(X("constructor"));
            List listDxjokdxxww = wkgbmnqykcVarCdpycssgdh.dxjokdxxww();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
            H0(listDxjokdxxww, wkgbmnqykcVarCdpycssgdh.jztzpxfvev(), sb3);
        }
        s0(eablkybsjgVar, sb3);
        K0(listRgvfuqvkyq, sb3);
    }

    private final void H0(Collection collection, boolean z13, StringBuilder sb3) {
        boolean zM0 = M0(z13);
        int size = collection.size();
        n().iobyxmoadg(size, sb3);
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            iyctptxqzt iyctptxqztVar = (iyctptxqzt) it.next();
            n().ppxfxbqfkf(iyctptxqztVar, i13, size, sb3);
            G0(iyctptxqztVar, zM0, sb3, false);
            n().zoijcleaow(iyctptxqztVar, i13, size, sb3);
            i13++;
        }
        n().wkgbmnqykc(size, sb3);
    }

    private final void I(jh.eablkybsjg eablkybsjgVar, StringBuilder sb3) {
        sb3.append(X(agtfadlqog.f55534iobyxmoadg.iobyxmoadg(eablkybsjgVar)));
    }

    private final void I0(weqkydbzbr weqkydbzbrVar, boolean z13, StringBuilder sb3, boolean z14, boolean z15) {
        kegysxyocb type = weqkydbzbrVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        iyctptxqzt iyctptxqztVar = weqkydbzbrVar instanceof iyctptxqzt ? (iyctptxqzt) weqkydbzbrVar : null;
        kegysxyocb kegysxyocbVarIyctptxqzt = iyctptxqztVar != null ? iyctptxqztVar.iyctptxqzt() : null;
        kegysxyocb kegysxyocbVar = kegysxyocbVarIyctptxqzt == null ? type : kegysxyocbVarIyctptxqzt;
        d0(sb3, kegysxyocbVarIyctptxqzt != null, "vararg");
        if (z15 || (z14 && !i())) {
            E0(weqkydbzbrVar, sb3, z15);
        }
        if (z13) {
            e0(weqkydbzbrVar, sb3, z14);
            sb3.append(": ");
        }
        sb3.append(ntlheqmsrt(kegysxyocbVar));
        W(weqkydbzbrVar, sb3);
        if (!o() || kegysxyocbVarIyctptxqzt == null) {
            return;
        }
        sb3.append(" /*");
        sb3.append(ntlheqmsrt(type));
        sb3.append("*/");
    }

    private final boolean J0(jh.yggfygwlhe yggfygwlheVar, StringBuilder sb3) {
        if (!ageimvtcrz().contains(jyumaefscl.VISIBILITY)) {
            return false;
        }
        if (fyldjkxazc()) {
            yggfygwlheVar = yggfygwlheVar.gxszxtbevo();
        }
        if (!c() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yggfygwlheVar, jh.zdlpuopuiu.f51352draadjrbmk)) {
            return false;
        }
        sb3.append(X(yggfygwlheVar.ppxfxbqfkf()));
        sb3.append(" ");
        return true;
    }

    private final void K(jh.wflxmlrfwp wflxmlrfwpVar, StringBuilder sb3) {
        if (yzdjzghtvl()) {
            if (i()) {
                sb3.append("companion object");
            }
            r0(sb3);
            jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = wflxmlrfwpVar.zoijcleaow();
            if (wflxmlrfwpVarZoijcleaow != null) {
                sb3.append("of ");
                ii.gxszxtbevo name = wflxmlrfwpVarZoijcleaow.getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                sb3.append(mbcevpiqjq(name, false));
            }
        }
        if (o() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar.getName(), ii.nufgyqmvbu.f44476wkgbmnqykc)) {
            if (!i()) {
                r0(sb3);
            }
            ii.gxszxtbevo name2 = wflxmlrfwpVar.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name2, "getName(...)");
            sb3.append(mbcevpiqjq(name2, true));
        }
    }

    private final void K0(List list, StringBuilder sb3) throws IOException {
        if (t()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yfnezrywwk yfnezrywwkVar = (yfnezrywwk) it.next();
            List upperBounds = yfnezrywwkVar.getUpperBounds();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
            for (kegysxyocb kegysxyocbVar : hg.jyumaefscl.rlfsiqarku(upperBounds, 1)) {
                StringBuilder sb4 = new StringBuilder();
                ii.gxszxtbevo name = yfnezrywwkVar.getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                sb4.append(mbcevpiqjq(name, false));
                sb4.append(" : ");
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
                sb4.append(ntlheqmsrt(kegysxyocbVar));
                arrayList.add(sb4.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb3.append(" ");
        sb3.append(X("where"));
        sb3.append(" ");
        hg.wwaezpbzkn.roivzttewh(arrayList, sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    private final String L(ni.lqeggnwhkg lqeggnwhkgVar) {
        tg.draadjrbmk draadjrbmkVarWypolnanlu = this.f55662wflxmlrfwp.wypolnanlu();
        if (draadjrbmkVarWypolnanlu != null) {
            return (String) draadjrbmkVarWypolnanlu.invoke(lqeggnwhkgVar);
        }
        if (lqeggnwhkgVar instanceof ni.zoijcleaow) {
            Iterable iterable = (Iterable) ((ni.zoijcleaow) lqeggnwhkgVar).zoijcleaow();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strL = L((ni.lqeggnwhkg) it.next());
                if (strL != null) {
                    arrayList.add(strL);
                }
            }
            return hg.jyumaefscl.iwxlajgraz(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (lqeggnwhkgVar instanceof ni.iobyxmoadg) {
            return mj.kcexrzcfyt.lxfrhoxuzk(agtfadlqog.stevsuqkhv(this, (kh.ppxfxbqfkf) ((ni.iobyxmoadg) lqeggnwhkgVar).zoijcleaow(), null, 2, null), "@");
        }
        if (!(lqeggnwhkgVar instanceof ni.kcexrzcfyt)) {
            return lqeggnwhkgVar.toString();
        }
        ni.kcexrzcfyt.zoijcleaow zoijcleaowVar = (ni.kcexrzcfyt.zoijcleaow) ((ni.kcexrzcfyt) lqeggnwhkgVar).zoijcleaow();
        if (zoijcleaowVar instanceof ni.kcexrzcfyt.zoijcleaow.iobyxmoadg) {
            return ((ni.kcexrzcfyt.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg() + "::class";
        }
        if (!(zoijcleaowVar instanceof ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow c1512zoijcleaow = (ni.kcexrzcfyt.zoijcleaow.C1512zoijcleaow) zoijcleaowVar;
        String strZoijcleaow = c1512zoijcleaow.zoijcleaow().iobyxmoadg().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        for (int i13 = 0; i13 < c1512zoijcleaow.iobyxmoadg(); i13++) {
            strZoijcleaow = "kotlin.Array<" + strZoijcleaow + '>';
        }
        return strZoijcleaow + "::class";
    }

    private final boolean L0(kegysxyocb kegysxyocbVar) {
        if (gh.nufgyqmvbu.rgvfuqvkyq(kegysxyocbVar)) {
            List listFyldjkxazc = kegysxyocbVar.fyldjkxazc();
            if (listFyldjkxazc == null || !listFyldjkxazc.isEmpty()) {
                Iterator it = listFyldjkxazc.iterator();
                while (it.hasNext()) {
                    if (((iwxlajgraz) it.next()).zoijcleaow()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public final void M(jh.draadjrbmk draadjrbmkVar, StringBuilder sb3) throws IOException {
        boolean z13;
        jh.wkgbmnqykc wkgbmnqykcVarCdpycssgdh;
        F(this, sb3, draadjrbmkVar, null, 2, null);
        if (this.f55662wflxmlrfwp.crxdokpmqz() || draadjrbmkVar.jhduphickx().vdvldrhtss() != jh.cdpycssgdh.SEALED) {
            jh.yggfygwlhe visibility = draadjrbmkVar.getVisibility();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility, "getVisibility(...)");
            if (J0(visibility, sb3)) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        Y(draadjrbmkVar, sb3);
        boolean z14 = krqnebusok() || !draadjrbmkVar.vipkmwdibw() || z13;
        if (z14) {
            sb3.append(X("constructor"));
        }
        jh.dxjokdxxww dxjokdxxwwVarZoijcleaow = draadjrbmkVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dxjokdxxwwVarZoijcleaow, "getContainingDeclaration(...)");
        if (g()) {
            if (z14) {
                sb3.append(" ");
            }
            e0(dxjokdxxwwVarZoijcleaow, sb3, true);
            List typeParameters = draadjrbmkVar.getTypeParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
            D0(typeParameters, sb3, false);
        }
        List listDxjokdxxww = draadjrbmkVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        H0(listDxjokdxxww, draadjrbmkVar.jztzpxfvev(), sb3);
        if (eslsurpljm() && !draadjrbmkVar.vipkmwdibw() && (dxjokdxxwwVarZoijcleaow instanceof jh.eablkybsjg) && (wkgbmnqykcVarCdpycssgdh = ((jh.eablkybsjg) dxjokdxxwwVarZoijcleaow).cdpycssgdh()) != null) {
            List listDxjokdxxww2 = wkgbmnqykcVarCdpycssgdh.dxjokdxxww();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listDxjokdxxww2) {
                iyctptxqzt iyctptxqztVar = (iyctptxqzt) obj;
                if (!iyctptxqztVar.auzgnhcxok() && iyctptxqztVar.iyctptxqzt() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb3.append(" : ");
                sb3.append(X("this"));
                sb3.append(hg.jyumaefscl.iwxlajgraz(arrayList, ", ", "(", ")", 0, null, oxmwwwfdhm.f55648zdlpuopuiu, 24, null));
            }
        }
        if (g()) {
            List typeParameters2 = draadjrbmkVar.getTypeParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters2, "getTypeParameters(...)");
            K0(typeParameters2, sb3);
        }
    }

    private final boolean M0(boolean z13) {
        int i13 = zoijcleaow.f55666zoijcleaow[mhtqkkgtqm().ordinal()];
        if (i13 == 1) {
            return true;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z13) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence N(iyctptxqzt iyctptxqztVar) {
        return "";
    }

    private final void O(List list, StringBuilder sb3) {
        if (list.isEmpty()) {
            return;
        }
        sb3.append("context(");
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            int i14 = i13 + 1;
            vipkmwdibw vipkmwdibwVar = (vipkmwdibw) it.next();
            E(sb3, vipkmwdibwVar, kh.eablkybsjg.RECEIVER);
            kegysxyocb type = vipkmwdibwVar.getType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            sb3.append(S(type));
            if (i13 == hg.jyumaefscl.ojitshcjhn(list)) {
                sb3.append(") ");
            } else {
                sb3.append(", ");
            }
            i13 = i14;
        }
    }

    private final void P(StringBuilder sb3, kegysxyocb kegysxyocbVar) {
        F(this, sb3, kegysxyocbVar, null, 2, null);
        zi.esjtqupxsv esjtqupxsvVar = kegysxyocbVar instanceof zi.esjtqupxsv ? (zi.esjtqupxsv) kegysxyocbVar : null;
        if (esjtqupxsvVar != null) {
            esjtqupxsvVar.c();
        }
        if (!ulzqkzuiru.iobyxmoadg(kegysxyocbVar)) {
            A0(this, sb3, kegysxyocbVar, null, 2, null);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } else if (ej.wkgbmnqykc.lereixgezr(kegysxyocbVar) && jrbgnlbqoe()) {
            sb3.append(Q(bj.draadjrbmk.f16409iobyxmoadg.rgvfuqvkyq(kegysxyocbVar)));
        } else {
            if (!(kegysxyocbVar instanceof bj.dxjokdxxww) || fiwbwshyhd()) {
                sb3.append(kegysxyocbVar.grlcpdaxtj().toString());
            } else {
                sb3.append(((bj.dxjokdxxww) kegysxyocbVar).krqnebusok());
            }
            sb3.append(w0(kegysxyocbVar.fyldjkxazc()));
        }
        if (kegysxyocbVar.mhtqkkgtqm()) {
            sb3.append("?");
        }
        if (metgxyhuhe.ppxfxbqfkf(kegysxyocbVar)) {
            sb3.append(" & Any");
        }
    }

    private final String Q(String str) {
        int i13 = zoijcleaow.f55665iobyxmoadg[j().ordinal()];
        if (i13 == 1) {
            return str;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void R(StringBuilder sb3, zi.iobyxmoadg iobyxmoadgVar) {
        iozdgvuglv iozdgvuglvVarJ = j();
        iozdgvuglv iozdgvuglvVar = iozdgvuglv.HTML;
        if (iozdgvuglvVarJ == iozdgvuglvVar) {
            sb3.append("<font color=\"808080\"><i>");
        }
        sb3.append(" /* ");
        sb3.append("= ");
        g0(sb3, iobyxmoadgVar.lmojexxdyd());
        sb3.append(" */");
        if (j() == iozdgvuglvVar) {
            sb3.append("</i></font>");
        }
    }

    private final String S(kegysxyocb kegysxyocbVar) {
        String strNtlheqmsrt = ntlheqmsrt(kegysxyocbVar);
        if ((!L0(kegysxyocbVar) || ageimvtcrz.draadjrbmk(kegysxyocbVar)) && !(kegysxyocbVar instanceof zi.esjtqupxsv)) {
            return strNtlheqmsrt;
        }
        return '(' + strNtlheqmsrt + ')';
    }

    private final String T(List list) {
        return weqkydbzbr(lmojexxdyd.ppxfxbqfkf(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(jh.lereixgezr lereixgezrVar, StringBuilder sb3) throws IOException {
        if (!i()) {
            if (!h()) {
                List listZeieaojujs = lereixgezrVar.zeieaojujs();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listZeieaojujs, "getContextReceiverParameters(...)");
                O(listZeieaojujs, sb3);
                F(this, sb3, lereixgezrVar, null, 2, null);
                jh.yggfygwlhe visibility = lereixgezrVar.getVisibility();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility, "getVisibility(...)");
                J0(visibility, sb3);
                c0(lereixgezrVar, sb3);
                if (wizcaqwiak()) {
                    Z(lereixgezrVar, sb3);
                }
                h0(lereixgezrVar, sb3);
                if (wizcaqwiak()) {
                    C(lereixgezrVar, sb3);
                } else {
                    u0(lereixgezrVar, sb3);
                }
                Y(lereixgezrVar, sb3);
                if (o()) {
                    if (lereixgezrVar.dvvnrvtcbc()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (lereixgezrVar.lxfrhoxuzk()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb3.append(X("fun"));
            sb3.append(" ");
            List typeParameters = lereixgezrVar.getTypeParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
            D0(typeParameters, sb3, true);
            o0(lereixgezrVar, sb3);
        }
        e0(lereixgezrVar, sb3, true);
        List listDxjokdxxww = lereixgezrVar.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        H0(listDxjokdxxww, lereixgezrVar.jztzpxfvev(), sb3);
        p0(lereixgezrVar, sb3);
        kegysxyocb returnType = lereixgezrVar.getReturnType();
        if (!r() && (m() || returnType == null || !gh.dxjokdxxww.skhdrjzrfn(returnType))) {
            sb3.append(": ");
            sb3.append(returnType == null ? "[NULL]" : ntlheqmsrt(returnType));
        }
        List typeParameters2 = lereixgezrVar.getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters2, "getTypeParameters(...)");
        K0(typeParameters2, sb3);
    }

    private final void V(StringBuilder sb3, kegysxyocb kegysxyocbVar) {
        ii.gxszxtbevo gxszxtbevoVarWkgbmnqykc;
        int length = sb3.length();
        F(lxfrhoxuzk(), sb3, kegysxyocbVar, null, 2, null);
        boolean z13 = sb3.length() != length;
        kegysxyocb kegysxyocbVarGtknphoqwx = gh.nufgyqmvbu.gtknphoqwx(kegysxyocbVar);
        List listEablkybsjg = gh.nufgyqmvbu.eablkybsjg(kegysxyocbVar);
        boolean zOxmwwwfdhm = gh.nufgyqmvbu.oxmwwwfdhm(kegysxyocbVar);
        boolean zMhtqkkgtqm = kegysxyocbVar.mhtqkkgtqm();
        boolean z14 = zMhtqkkgtqm || (z13 && kegysxyocbVarGtknphoqwx != null);
        if (z14) {
            if (zOxmwwwfdhm) {
                sb3.insert(length, '(');
            } else {
                if (z13) {
                    mj.iobyxmoadg.ppxfxbqfkf(mj.kcexrzcfyt.v(sb3));
                    if (sb3.charAt(mj.kcexrzcfyt.xrmfcynszj(sb3) - 1) != ')') {
                        sb3.insert(mj.kcexrzcfyt.xrmfcynszj(sb3), "()");
                    }
                }
                sb3.append("(");
            }
        }
        if (!listEablkybsjg.isEmpty()) {
            sb3.append("context(");
            Iterator it = listEablkybsjg.subList(0, hg.jyumaefscl.ojitshcjhn(listEablkybsjg)).iterator();
            while (it.hasNext()) {
                f0(sb3, (kegysxyocb) it.next());
                sb3.append(", ");
            }
            f0(sb3, (kegysxyocb) hg.jyumaefscl.skhdrjzrfn(listEablkybsjg));
            sb3.append(") ");
        }
        d0(sb3, zOxmwwwfdhm, "suspend");
        if (kegysxyocbVarGtknphoqwx != null) {
            boolean z15 = (L0(kegysxyocbVarGtknphoqwx) && !kegysxyocbVarGtknphoqwx.mhtqkkgtqm()) || v(kegysxyocbVarGtknphoqwx) || (kegysxyocbVarGtknphoqwx instanceof zi.esjtqupxsv);
            if (z15) {
                sb3.append("(");
            }
            f0(sb3, kegysxyocbVarGtknphoqwx);
            if (z15) {
                sb3.append(")");
            }
            sb3.append(".");
        }
        sb3.append("(");
        if (!gh.nufgyqmvbu.agtfadlqog(kegysxyocbVar) || kegysxyocbVar.fyldjkxazc().size() > 1) {
            int i13 = 0;
            for (iwxlajgraz iwxlajgrazVar : gh.nufgyqmvbu.wflxmlrfwp(kegysxyocbVar)) {
                int i14 = i13 + 1;
                if (i13 > 0) {
                    sb3.append(", ");
                }
                if (ixidwrxhsl()) {
                    kegysxyocb type = iwxlajgrazVar.getType();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                    gxszxtbevoVarWkgbmnqykc = gh.nufgyqmvbu.wkgbmnqykc(type);
                } else {
                    gxszxtbevoVarWkgbmnqykc = null;
                }
                if (gxszxtbevoVarWkgbmnqykc != null) {
                    sb3.append(mbcevpiqjq(gxszxtbevoVarWkgbmnqykc, false));
                    sb3.append(": ");
                }
                sb3.append(ulzqkzuiru(iwxlajgrazVar));
                i13 = i14;
            }
        } else {
            sb3.append("???");
        }
        sb3.append(") ");
        sb3.append(iyctptxqzt());
        sb3.append(" ");
        f0(sb3, gh.nufgyqmvbu.draadjrbmk(kegysxyocbVar));
        if (z14) {
            sb3.append(")");
        }
        if (zMhtqkkgtqm) {
            sb3.append("?");
        }
    }

    private final void W(weqkydbzbr weqkydbzbrVar, StringBuilder sb3) {
        ni.lqeggnwhkg lqeggnwhkgVarYdmasvzmpa;
        String strL;
        if (!hszhottldk() || (lqeggnwhkgVarYdmasvzmpa = weqkydbzbrVar.ydmasvzmpa()) == null || (strL = L(lqeggnwhkgVarYdmasvzmpa)) == null) {
            return;
        }
        sb3.append(" = ");
        sb3.append(weqkydbzbr(strL));
    }

    private final String X(String str) {
        int i13 = zoijcleaow.f55665iobyxmoadg[j().ordinal()];
        if (i13 == 1) {
            return str;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (uawqvzlxes()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final void Y(jh.zoijcleaow zoijcleaowVar, StringBuilder sb3) {
        if (ageimvtcrz().contains(jyumaefscl.MEMBER_KIND) && o() && zoijcleaowVar.getKind() != jh.zoijcleaow.iobyxmoadg.DECLARATION) {
            sb3.append("/*");
            sb3.append(hj.iobyxmoadg.gxszxtbevo(zoijcleaowVar.getKind().name()));
            sb3.append("*/ ");
        }
    }

    private final void Z(jh.istkbnxepw istkbnxepwVar, StringBuilder sb3) {
        d0(sb3, istkbnxepwVar.isExternal(), "external");
        boolean z13 = false;
        d0(sb3, ageimvtcrz().contains(jyumaefscl.EXPECT) && istkbnxepwVar.czzsidtyhn(), "expect");
        if (ageimvtcrz().contains(jyumaefscl.ACTUAL) && istkbnxepwVar.ulzqkzuiru()) {
            z13 = true;
        }
        d0(sb3, z13, "actual");
    }

    private final void b0(jh.cdpycssgdh cdpycssgdhVar, StringBuilder sb3, jh.cdpycssgdh cdpycssgdhVar2) {
        if (b() || cdpycssgdhVar != cdpycssgdhVar2) {
            d0(sb3, ageimvtcrz().contains(jyumaefscl.MODALITY), hj.iobyxmoadg.gxszxtbevo(cdpycssgdhVar.name()));
        }
    }

    private final void bfopjjpdmp(StringBuilder sb3, List list) throws IOException {
        hg.wwaezpbzkn.roivzttewh(list, sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new vdvldrhtss(this));
    }

    private final void c0(jh.zoijcleaow zoijcleaowVar, StringBuilder sb3) {
        if (li.dxjokdxxww.pkzmftpjix(zoijcleaowVar) && zoijcleaowVar.vdvldrhtss() == jh.cdpycssgdh.FINAL) {
            return;
        }
        if (grlcpdaxtj() == istkbnxepw.RENDER_OVERRIDE && zoijcleaowVar.vdvldrhtss() == jh.cdpycssgdh.OPEN && z(zoijcleaowVar)) {
            return;
        }
        jh.cdpycssgdh cdpycssgdhVarVdvldrhtss = zoijcleaowVar.vdvldrhtss();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cdpycssgdhVarVdvldrhtss, "getModality(...)");
        b0(cdpycssgdhVarVdvldrhtss, sb3, w(zoijcleaowVar));
    }

    private final void d0(StringBuilder sb3, boolean z13, String str) {
        if (z13) {
            sb3.append(X(str));
            sb3.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(jh.wflxmlrfwp wflxmlrfwpVar, StringBuilder sb3, boolean z13) {
        ii.gxszxtbevo name = wflxmlrfwpVar.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        sb3.append(mbcevpiqjq(name, z13));
    }

    private final void f0(StringBuilder sb3, kegysxyocb kegysxyocbVar) {
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = kegysxyocbVar.jrbgnlbqoe();
        zi.iobyxmoadg iobyxmoadgVar = grlcpdaxtjVarJrbgnlbqoe instanceof zi.iobyxmoadg ? (zi.iobyxmoadg) grlcpdaxtjVarJrbgnlbqoe : null;
        if (iobyxmoadgVar == null) {
            g0(sb3, kegysxyocbVar);
            return;
        }
        if (e()) {
            g0(sb3, iobyxmoadgVar.lmojexxdyd());
            if (rhgxfdycjh()) {
                A(sb3, iobyxmoadgVar);
                return;
            }
            return;
        }
        g0(sb3, iobyxmoadgVar.c());
        if (f()) {
            R(sb3, iobyxmoadgVar);
        }
    }

    private final void g0(StringBuilder sb3, kegysxyocb kegysxyocbVar) {
        if ((kegysxyocbVar instanceof ixidwrxhsl) && dxjokdxxww() && !((ixidwrxhsl) kegysxyocbVar).ezmngbhpjk()) {
            sb3.append("<Not computed yet>");
            return;
        }
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = kegysxyocbVar.jrbgnlbqoe();
        if (grlcpdaxtjVarJrbgnlbqoe instanceof ylkuphrtab) {
            sb3.append(((ylkuphrtab) grlcpdaxtjVarJrbgnlbqoe).a(this, this));
        } else {
            if (!(grlcpdaxtjVarJrbgnlbqoe instanceof ikoacuggdj)) {
                throw new NoWhenBranchMatchedException();
            }
            q0(sb3, (ikoacuggdj) grlcpdaxtjVarJrbgnlbqoe);
        }
    }

    private final void h0(jh.zoijcleaow zoijcleaowVar, StringBuilder sb3) {
        if (ageimvtcrz().contains(jyumaefscl.OVERRIDE) && z(zoijcleaowVar) && grlcpdaxtj() != istkbnxepw.RENDER_OPEN) {
            d0(sb3, true, "override");
            if (o()) {
                sb3.append("/*");
                sb3.append(zoijcleaowVar.eablkybsjg().size());
                sb3.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(hkdspvbjdz hkdspvbjdzVar, StringBuilder sb3) {
        j0(hkdspvbjdzVar.gxszxtbevo(), "package-fragment", sb3);
        if (dxjokdxxww()) {
            sb3.append(" in ");
            e0(hkdspvbjdzVar.zoijcleaow(), sb3, false);
        }
    }

    private final String iyctptxqzt() {
        int i13 = zoijcleaow.f55665iobyxmoadg[j().ordinal()];
        if (i13 == 1) {
            return weqkydbzbr("->");
        }
        if (i13 == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void j0(ii.ppxfxbqfkf ppxfxbqfkfVar, String str, StringBuilder sb3) {
        sb3.append(X(str));
        ii.wkgbmnqykc wkgbmnqykcVarBtonecajqb = ppxfxbqfkfVar.btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarBtonecajqb, "toUnsafe(...)");
        String strTzroggbefp = tzroggbefp(wkgbmnqykcVarBtonecajqb);
        if (strTzroggbefp.length() > 0) {
            sb3.append(" ");
            sb3.append(strTzroggbefp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(mbcevpiqjq mbcevpiqjqVar, StringBuilder sb3) {
        j0(mbcevpiqjqVar.gxszxtbevo(), "package", sb3);
        if (dxjokdxxww()) {
            sb3.append(" in context of ");
            e0(mbcevpiqjqVar.iwxlajgraz(), sb3, false);
        }
    }

    private final void l0(StringBuilder sb3, jh.ulzqkzuiru ulzqkzuiruVar) {
        jh.ulzqkzuiru ulzqkzuiruVarPpxfxbqfkf = ulzqkzuiruVar.ppxfxbqfkf();
        if (ulzqkzuiruVarPpxfxbqfkf != null) {
            l0(sb3, ulzqkzuiruVarPpxfxbqfkf);
            sb3.append('.');
            ii.gxszxtbevo name = ulzqkzuiruVar.zoijcleaow().getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            sb3.append(mbcevpiqjq(name, false));
        } else {
            zeieaojujs zeieaojujsVarBtonecajqb = ulzqkzuiruVar.zoijcleaow().btonecajqb();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zeieaojujsVarBtonecajqb, "getTypeConstructor(...)");
            sb3.append(x0(zeieaojujsVarBtonecajqb));
        }
        sb3.append(w0(ulzqkzuiruVar.iobyxmoadg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yggfygwlhe lrnfpwlwnk(yggfygwlhe yggfygwlheVar) {
        agtfadlqog agtfadlqogVarSopmlzcsov = yggfygwlheVar.sopmlzcsov(zdlpuopuiu.f55667zdlpuopuiu);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(agtfadlqogVarSopmlzcsov, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (yggfygwlhe) agtfadlqogVarSopmlzcsov;
    }

    private final yggfygwlhe lxfrhoxuzk() {
        return (yggfygwlhe) this.f55661agtfadlqog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(crxdokpmqz crxdokpmqzVar, StringBuilder sb3) throws IOException {
        if (!i()) {
            if (!h()) {
                List listZeieaojujs = crxdokpmqzVar.zeieaojujs();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listZeieaojujs, "getContextReceiverParameters(...)");
                O(listZeieaojujs, sb3);
                n0(crxdokpmqzVar, sb3);
                jh.yggfygwlhe visibility = crxdokpmqzVar.getVisibility();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility, "getVisibility(...)");
                J0(visibility, sb3);
                boolean z13 = false;
                d0(sb3, ageimvtcrz().contains(jyumaefscl.CONST) && crxdokpmqzVar.ribwqtqdhb(), "const");
                Z(crxdokpmqzVar, sb3);
                c0(crxdokpmqzVar, sb3);
                h0(crxdokpmqzVar, sb3);
                if (ageimvtcrz().contains(jyumaefscl.LATEINIT) && crxdokpmqzVar.nuxfzjnpeb()) {
                    z13 = true;
                }
                d0(sb3, z13, "lateinit");
                Y(crxdokpmqzVar, sb3);
            }
            F0(this, crxdokpmqzVar, sb3, false, 4, null);
            List typeParameters = crxdokpmqzVar.getTypeParameters();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
            D0(typeParameters, sb3, true);
            o0(crxdokpmqzVar, sb3);
        }
        e0(crxdokpmqzVar, sb3, true);
        sb3.append(": ");
        kegysxyocb type = crxdokpmqzVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        sb3.append(ntlheqmsrt(type));
        p0(crxdokpmqzVar, sb3);
        W(crxdokpmqzVar, sb3);
        List typeParameters2 = crxdokpmqzVar.getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters2, "getTypeParameters(...)");
        K0(typeParameters2, sb3);
    }

    private final void n0(crxdokpmqz crxdokpmqzVar, StringBuilder sb3) {
        if (ageimvtcrz().contains(jyumaefscl.ANNOTATIONS)) {
            F(this, sb3, crxdokpmqzVar, null, 2, null);
            jh.iwizpuwonk iwizpuwonkVarLrnfpwlwnk = crxdokpmqzVar.lrnfpwlwnk();
            if (iwizpuwonkVarLrnfpwlwnk != null) {
                E(sb3, iwizpuwonkVarLrnfpwlwnk, kh.eablkybsjg.FIELD);
            }
            jh.iwizpuwonk iwizpuwonkVarCllcsxoeiz = crxdokpmqzVar.cllcsxoeiz();
            if (iwizpuwonkVarCllcsxoeiz != null) {
                E(sb3, iwizpuwonkVarCllcsxoeiz, kh.eablkybsjg.PROPERTY_DELEGATE_FIELD);
            }
            if (fmlbqenlif() == yadqdtsiqt.NONE) {
                jlmebxxoox jlmebxxooxVarWkgbmnqykc = crxdokpmqzVar.wkgbmnqykc();
                if (jlmebxxooxVarWkgbmnqykc != null) {
                    E(sb3, jlmebxxooxVarWkgbmnqykc, kh.eablkybsjg.PROPERTY_GETTER);
                }
                ribwqtqdhb ribwqtqdhbVarNufgyqmvbu = crxdokpmqzVar.nufgyqmvbu();
                if (ribwqtqdhbVarNufgyqmvbu != null) {
                    E(sb3, ribwqtqdhbVarNufgyqmvbu, kh.eablkybsjg.PROPERTY_SETTER);
                    List listDxjokdxxww = ribwqtqdhbVarNufgyqmvbu.dxjokdxxww();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
                    iyctptxqzt iyctptxqztVar = (iyctptxqzt) hg.jyumaefscl.yzdjzghtvl(listDxjokdxxww);
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iyctptxqztVar);
                    E(sb3, iyctptxqztVar, kh.eablkybsjg.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void o0(jh.iobyxmoadg iobyxmoadgVar, StringBuilder sb3) {
        vipkmwdibw vipkmwdibwVarHkdspvbjdz = iobyxmoadgVar.hkdspvbjdz();
        if (vipkmwdibwVarHkdspvbjdz != null) {
            E(sb3, vipkmwdibwVarHkdspvbjdz, kh.eablkybsjg.RECEIVER);
            kegysxyocb type = vipkmwdibwVarHkdspvbjdz.getType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            sb3.append(S(type));
            sb3.append(".");
        }
    }

    private final void oipsdeybqn(StringBuilder sb3, jh.wflxmlrfwp wflxmlrfwpVar) {
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow;
        String name;
        if ((wflxmlrfwpVar instanceof hkdspvbjdz) || (wflxmlrfwpVar instanceof mbcevpiqjq) || (wflxmlrfwpVarZoijcleaow = wflxmlrfwpVar.zoijcleaow()) == null || (wflxmlrfwpVarZoijcleaow instanceof jh.lmojexxdyd)) {
            return;
        }
        sb3.append(" ");
        sb3.append(a0("defined in"));
        sb3.append(" ");
        ii.wkgbmnqykc wkgbmnqykcVarWflxmlrfwp = li.dxjokdxxww.wflxmlrfwp(wflxmlrfwpVarZoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarWflxmlrfwp, "getFqName(...)");
        sb3.append(wkgbmnqykcVarWflxmlrfwp.eablkybsjg() ? "root package" : tzroggbefp(wkgbmnqykcVarWflxmlrfwp));
        if (q() && (wflxmlrfwpVarZoijcleaow instanceof hkdspvbjdz) && (wflxmlrfwpVar instanceof jh.rgvfuqvkyq) && (name = ((jh.rgvfuqvkyq) wflxmlrfwpVar).lqeggnwhkg().zoijcleaow().getName()) != null) {
            sb3.append(" ");
            sb3.append(a0("in file"));
            sb3.append(" ");
            sb3.append(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence opjhrmiecq(yggfygwlhe yggfygwlheVar, iwxlajgraz it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (it.zoijcleaow()) {
            return "*";
        }
        kegysxyocb type = it.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        String strNtlheqmsrt = yggfygwlheVar.ntlheqmsrt(type);
        if (it.ppxfxbqfkf() == mhtqkkgtqm.INVARIANT) {
            return strNtlheqmsrt;
        }
        return it.ppxfxbqfkf() + ' ' + strNtlheqmsrt;
    }

    private final void p0(jh.iobyxmoadg iobyxmoadgVar, StringBuilder sb3) {
        vipkmwdibw vipkmwdibwVarHkdspvbjdz;
        if (ezmngbhpjk() && (vipkmwdibwVarHkdspvbjdz = iobyxmoadgVar.hkdspvbjdz()) != null) {
            sb3.append(" on ");
            kegysxyocb type = vipkmwdibwVarHkdspvbjdz.getType();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            sb3.append(ntlheqmsrt(type));
        }
    }

    private final void q0(StringBuilder sb3, ikoacuggdj ikoacuggdjVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ikoacuggdjVar, ageimvtcrz.f129997zoijcleaow) || ageimvtcrz.gtknphoqwx(ikoacuggdjVar)) {
            sb3.append("???");
            return;
        }
        if (bj.draadjrbmk.ojitshcjhn(ikoacuggdjVar)) {
            if (!l()) {
                sb3.append("???");
                return;
            }
            zeieaojujs zeieaojujsVarGrlcpdaxtj = ikoacuggdjVar.grlcpdaxtj();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zeieaojujsVarGrlcpdaxtj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb3.append(Q(((bj.btonecajqb) zeieaojujsVarGrlcpdaxtj).lqeggnwhkg(0)));
            return;
        }
        if (ulzqkzuiru.iobyxmoadg(ikoacuggdjVar)) {
            P(sb3, ikoacuggdjVar);
        } else if (L0(ikoacuggdjVar)) {
            V(sb3, ikoacuggdjVar);
        } else {
            P(sb3, ikoacuggdjVar);
        }
    }

    private final void r0(StringBuilder sb3) {
        int length = sb3.length();
        if (length == 0 || sb3.charAt(length - 1) != ' ') {
            sb3.append(' ');
        }
    }

    private final void s0(jh.eablkybsjg eablkybsjgVar, StringBuilder sb3) throws IOException {
        if (s() || gh.dxjokdxxww.zfvoamnweg(eablkybsjgVar.ojitshcjhn())) {
            return;
        }
        Collection collectionZoijcleaow = eablkybsjgVar.btonecajqb().zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionZoijcleaow, "getSupertypes(...)");
        if (collectionZoijcleaow.isEmpty()) {
            return;
        }
        if (collectionZoijcleaow.size() == 1 && gh.dxjokdxxww.jhduphickx((kegysxyocb) collectionZoijcleaow.iterator().next())) {
            return;
        }
        r0(sb3);
        sb3.append(": ");
        hg.wwaezpbzkn.roivzttewh(collectionZoijcleaow, sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new kcexrzcfyt(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence t0(yggfygwlhe yggfygwlheVar, kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(kegysxyocbVar);
        return yggfygwlheVar.ntlheqmsrt(kegysxyocbVar);
    }

    private final String u() {
        return weqkydbzbr(">");
    }

    private final void u0(jh.lereixgezr lereixgezrVar, StringBuilder sb3) {
        d0(sb3, lereixgezrVar.isSuspend(), "suspend");
    }

    private final boolean v(kegysxyocb kegysxyocbVar) {
        return gh.nufgyqmvbu.oxmwwwfdhm(kegysxyocbVar) || !kegysxyocbVar.getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(uwvvkdfqfp uwvvkdfqfpVar, StringBuilder sb3) {
        F(this, sb3, uwvvkdfqfpVar, null, 2, null);
        jh.yggfygwlhe visibility = uwvvkdfqfpVar.getVisibility();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(visibility, "getVisibility(...)");
        J0(visibility, sb3);
        Z(uwvvkdfqfpVar, sb3);
        sb3.append(X("typealias"));
        sb3.append(" ");
        e0(uwvvkdfqfpVar, sb3, true);
        List listRgvfuqvkyq = uwvvkdfqfpVar.rgvfuqvkyq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq, "getDeclaredTypeParameters(...)");
        D0(listRgvfuqvkyq, sb3, false);
        G(uwvvkdfqfpVar, sb3);
        sb3.append(" = ");
        sb3.append(ntlheqmsrt(uwvvkdfqfpVar.opjhrmiecq()));
    }

    private final jh.cdpycssgdh w(jh.istkbnxepw istkbnxepwVar) {
        if (istkbnxepwVar instanceof jh.eablkybsjg) {
            return ((jh.eablkybsjg) istkbnxepwVar).getKind() == jh.gxszxtbevo.INTERFACE ? jh.cdpycssgdh.ABSTRACT : jh.cdpycssgdh.FINAL;
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = istkbnxepwVar.zoijcleaow();
        jh.eablkybsjg eablkybsjgVar = wflxmlrfwpVarZoijcleaow instanceof jh.eablkybsjg ? (jh.eablkybsjg) wflxmlrfwpVarZoijcleaow : null;
        if (eablkybsjgVar != null && (istkbnxepwVar instanceof jh.zoijcleaow)) {
            jh.zoijcleaow zoijcleaowVar = (jh.zoijcleaow) istkbnxepwVar;
            Collection collectionEablkybsjg = zoijcleaowVar.eablkybsjg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "getOverriddenDescriptors(...)");
            if (!collectionEablkybsjg.isEmpty() && eablkybsjgVar.vdvldrhtss() != jh.cdpycssgdh.FINAL) {
                return jh.cdpycssgdh.OPEN;
            }
            if (eablkybsjgVar.getKind() != jh.gxszxtbevo.INTERFACE || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.getVisibility(), jh.zdlpuopuiu.f51357iobyxmoadg)) {
                return jh.cdpycssgdh.FINAL;
            }
            jh.cdpycssgdh cdpycssgdhVarVdvldrhtss = zoijcleaowVar.vdvldrhtss();
            jh.cdpycssgdh cdpycssgdhVar = jh.cdpycssgdh.ABSTRACT;
            return cdpycssgdhVarVdvldrhtss == cdpycssgdhVar ? cdpycssgdhVar : jh.cdpycssgdh.OPEN;
        }
        return jh.cdpycssgdh.FINAL;
    }

    private final String weqkydbzbr(String str) {
        return j().wkgbmnqykc(str);
    }

    private final boolean x(kh.ppxfxbqfkf ppxfxbqfkfVar) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.gxszxtbevo(), gh.ojitshcjhn.iobyxmoadg.f37356yadqdtsiqt);
    }

    private final String y() {
        return weqkydbzbr("<");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object y0(kegysxyocb it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it;
    }

    private final boolean z(jh.zoijcleaow zoijcleaowVar) {
        return !zoijcleaowVar.eablkybsjg().isEmpty();
    }

    private final void z0(StringBuilder sb3, kegysxyocb kegysxyocbVar, zeieaojujs zeieaojujsVar) {
        jh.ulzqkzuiru ulzqkzuiruVarWkgbmnqykc = oipsdeybqn.wkgbmnqykc(kegysxyocbVar);
        if (ulzqkzuiruVarWkgbmnqykc != null) {
            l0(sb3, ulzqkzuiruVarWkgbmnqykc);
        } else {
            sb3.append(x0(zeieaojujsVar));
            sb3.append(w0(kegysxyocbVar.fyldjkxazc()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zeieaojujs(iwizpuwonk withOptions) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(withOptions, "$this$withOptions");
        withOptions.gtknphoqwx(hg.ikoacuggdj.draadjrbmk(withOptions.nufgyqmvbu(), hg.jyumaefscl.rgvfuqvkyq(gh.ojitshcjhn.iobyxmoadg.f37302istkbnxepw, gh.ojitshcjhn.iobyxmoadg.f37278cdpycssgdh)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public String J(jh.nufgyqmvbu klass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(klass, "klass");
        return bj.draadjrbmk.wflxmlrfwp(klass) ? klass.btonecajqb().toString() : iwxlajgraz().iobyxmoadg(klass, this);
    }

    public boolean a() {
        return this.f55662wflxmlrfwp.ulzqkzuiru();
    }

    public String a0(String message) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        int i13 = zoijcleaow.f55665iobyxmoadg[j().ordinal()];
        if (i13 == 1) {
            return message;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    public Set ageimvtcrz() {
        return this.f55662wflxmlrfwp.ylkuphrtab();
    }

    @Override // ki.iwizpuwonk
    public void agtfadlqog(ki.zoijcleaow zoijcleaowVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<set-?>");
        this.f55662wflxmlrfwp.agtfadlqog(zoijcleaowVar);
    }

    public boolean auzgnhcxok() {
        return this.f55662wflxmlrfwp.pmvmpeiblj();
    }

    public boolean b() {
        return this.f55662wflxmlrfwp.sopmlzcsov();
    }

    @Override // ki.iwizpuwonk
    public ki.iobyxmoadg btonecajqb() {
        return this.f55662wflxmlrfwp.btonecajqb();
    }

    public boolean c() {
        return this.f55662wflxmlrfwp.crxdokpmqz();
    }

    public boolean d() {
        return this.f55662wflxmlrfwp.jlmebxxoox();
    }

    @Override // ki.iwizpuwonk
    public void draadjrbmk(Set set) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<set-?>");
        this.f55662wflxmlrfwp.draadjrbmk(set);
    }

    @Override // ki.agtfadlqog
    public String dsvhmnatus(jh.wflxmlrfwp declarationDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb3 = new StringBuilder();
        declarationDescriptor.tbqsvytpvh(new iobyxmoadg(), sb3);
        if (p()) {
            oipsdeybqn(sb3, declarationDescriptor);
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public tg.draadjrbmk dvvnrvtcbc() {
        return this.f55662wflxmlrfwp.istkbnxepw();
    }

    @Override // ki.iwizpuwonk
    public boolean dxjokdxxww() {
        return this.f55662wflxmlrfwp.dxjokdxxww();
    }

    public boolean e() {
        return this.f55662wflxmlrfwp.ribwqtqdhb();
    }

    @Override // ki.iwizpuwonk
    public boolean eablkybsjg() {
        return this.f55662wflxmlrfwp.eablkybsjg();
    }

    public boolean eslsurpljm() {
        return this.f55662wflxmlrfwp.mbcevpiqjq();
    }

    public boolean ezmngbhpjk() {
        return this.f55662wflxmlrfwp.stevsuqkhv();
    }

    public boolean f() {
        return this.f55662wflxmlrfwp.vipkmwdibw();
    }

    public boolean fiwbwshyhd() {
        return this.f55662wflxmlrfwp.wwaezpbzkn();
    }

    public yadqdtsiqt fmlbqenlif() {
        return this.f55662wflxmlrfwp.dsvhmnatus();
    }

    public boolean fyldjkxazc() {
        return this.f55662wflxmlrfwp.pkzmftpjix();
    }

    public boolean g() {
        return this.f55662wflxmlrfwp.jhduphickx();
    }

    public istkbnxepw grlcpdaxtj() {
        return this.f55662wflxmlrfwp.hcddaimhww();
    }

    @Override // ki.iwizpuwonk
    public void gtknphoqwx(Set set) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<set-?>");
        this.f55662wflxmlrfwp.gtknphoqwx(set);
    }

    @Override // ki.iwizpuwonk
    public void gxszxtbevo(boolean z13) {
        this.f55662wflxmlrfwp.gxszxtbevo(z13);
    }

    public boolean h() {
        return this.f55662wflxmlrfwp.ikoacuggdj();
    }

    public boolean hszhottldk() {
        return this.f55662wflxmlrfwp.lmojexxdyd();
    }

    public boolean i() {
        return this.f55662wflxmlrfwp.okpsazkaxt();
    }

    public Set igdgnonuha() {
        return this.f55662wflxmlrfwp.yadqdtsiqt();
    }

    @Override // ki.iwizpuwonk
    public boolean iobyxmoadg() {
        return this.f55662wflxmlrfwp.iobyxmoadg();
    }

    public final lereixgezr ipoelvxyzq() {
        return this.f55662wflxmlrfwp;
    }

    public ki.zoijcleaow iwxlajgraz() {
        return this.f55662wflxmlrfwp.zynmafqrjb();
    }

    public boolean ixidwrxhsl() {
        return this.f55662wflxmlrfwp.hkdspvbjdz();
    }

    public iozdgvuglv j() {
        return this.f55662wflxmlrfwp.jztzpxfvev();
    }

    public boolean jrbgnlbqoe() {
        return this.f55662wflxmlrfwp.cllcsxoeiz();
    }

    public tg.draadjrbmk k() {
        return this.f55662wflxmlrfwp.xrmfcynszj();
    }

    @Override // ki.agtfadlqog
    public String kegysxyocb(String lowerRendered, String upperRendered, gh.dxjokdxxww builtIns) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upperRendered, "upperRendered");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        if (lmojexxdyd.gxszxtbevo(lowerRendered, upperRendered)) {
            if (!mj.kcexrzcfyt.stevsuqkhv(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        ki.zoijcleaow zoijcleaowVarIwxlajgraz = iwxlajgraz();
        jh.eablkybsjg eablkybsjgVarIwizpuwonk = builtIns.iwizpuwonk();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarIwizpuwonk, "getCollection(...)");
        String strK = mj.kcexrzcfyt.k(zoijcleaowVarIwxlajgraz.iobyxmoadg(eablkybsjgVarIwizpuwonk, this), "Collection", null, 2, null);
        String strWkgbmnqykc = lmojexxdyd.wkgbmnqykc(lowerRendered, strK + "Mutable", upperRendered, strK, strK + "(Mutable)");
        if (strWkgbmnqykc != null) {
            return strWkgbmnqykc;
        }
        String strWkgbmnqykc2 = lmojexxdyd.wkgbmnqykc(lowerRendered, strK + "MutableMap.MutableEntry", upperRendered, strK + "Map.Entry", strK + "(Mutable)Map.(Mutable)Entry");
        if (strWkgbmnqykc2 != null) {
            return strWkgbmnqykc2;
        }
        ki.zoijcleaow zoijcleaowVarIwxlajgraz2 = iwxlajgraz();
        jh.eablkybsjg eablkybsjgVarBtonecajqb = builtIns.btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(eablkybsjgVarBtonecajqb, "getArray(...)");
        String strK2 = mj.kcexrzcfyt.k(zoijcleaowVarIwxlajgraz2.iobyxmoadg(eablkybsjgVarBtonecajqb, this), "Array", null, 2, null);
        String strWkgbmnqykc3 = lmojexxdyd.wkgbmnqykc(lowerRendered, strK2 + weqkydbzbr("Array<"), upperRendered, strK2 + weqkydbzbr("Array<out "), strK2 + weqkydbzbr("Array<(out) "));
        if (strWkgbmnqykc3 != null) {
            return strWkgbmnqykc3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public boolean krqnebusok() {
        return this.f55662wflxmlrfwp.ntlheqmsrt();
    }

    public boolean l() {
        return this.f55662wflxmlrfwp.metgxyhuhe();
    }

    @Override // ki.iwizpuwonk
    public void lqeggnwhkg(boolean z13) {
        this.f55662wflxmlrfwp.lqeggnwhkg(z13);
    }

    public boolean m() {
        return this.f55662wflxmlrfwp.rlfsiqarku();
    }

    @Override // ki.agtfadlqog
    public String mbcevpiqjq(ii.gxszxtbevo name, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        String strWeqkydbzbr = weqkydbzbr(lmojexxdyd.zoijcleaow(name));
        if (!uawqvzlxes() || j() != iozdgvuglv.HTML || !z13) {
            return strWeqkydbzbr;
        }
        return "<b>" + strWeqkydbzbr + "</b>";
    }

    public cdpycssgdh mhtqkkgtqm() {
        return this.f55662wflxmlrfwp.jpowsppfya();
    }

    public agtfadlqog.zoijcleaow n() {
        return this.f55662wflxmlrfwp.czzsidtyhn();
    }

    @Override // ki.agtfadlqog
    public String ntlheqmsrt(kegysxyocb type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        StringBuilder sb3 = new StringBuilder();
        f0(sb3, (kegysxyocb) k().invoke(type));
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    @Override // ki.iwizpuwonk
    public Set nufgyqmvbu() {
        return this.f55662wflxmlrfwp.nufgyqmvbu();
    }

    public boolean nuxfzjnpeb() {
        return this.f55662wflxmlrfwp.iwizpuwonk();
    }

    public boolean o() {
        return this.f55662wflxmlrfwp.uwvvkdfqfp();
    }

    @Override // ki.iwizpuwonk
    public void ojitshcjhn(boolean z13) {
        this.f55662wflxmlrfwp.ojitshcjhn(z13);
    }

    @Override // ki.iwizpuwonk
    public void oxmwwwfdhm(boolean z13) {
        this.f55662wflxmlrfwp.oxmwwwfdhm(z13);
    }

    public boolean p() {
        return this.f55662wflxmlrfwp.yfnezrywwk();
    }

    @Override // ki.iwizpuwonk
    public void ppxfxbqfkf(boolean z13) {
        this.f55662wflxmlrfwp.ppxfxbqfkf(z13);
    }

    public boolean q() {
        return this.f55662wflxmlrfwp.ydmasvzmpa();
    }

    public boolean r() {
        return this.f55662wflxmlrfwp.sflfametgt();
    }

    @Override // ki.iwizpuwonk
    public void rgvfuqvkyq(boolean z13) {
        this.f55662wflxmlrfwp.rgvfuqvkyq(z13);
    }

    public boolean rhgxfdycjh() {
        return this.f55662wflxmlrfwp.kegysxyocb();
    }

    public tg.draadjrbmk roivzttewh() {
        return this.f55662wflxmlrfwp.esjtqupxsv();
    }

    public boolean s() {
        return this.f55662wflxmlrfwp.zfvoamnweg();
    }

    public boolean skhdrjzrfn() {
        return this.f55662wflxmlrfwp.cdpycssgdh();
    }

    public boolean t() {
        return this.f55662wflxmlrfwp.oipsdeybqn();
    }

    public boolean tbqsvytpvh() {
        return this.f55662wflxmlrfwp.cqumvgiudr();
    }

    @Override // ki.agtfadlqog
    public String tzroggbefp(ii.wkgbmnqykc fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        List listNufgyqmvbu = fqName.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listNufgyqmvbu, "pathSegments(...)");
        return T(listNufgyqmvbu);
    }

    public boolean uawqvzlxes() {
        return this.f55662wflxmlrfwp.lereixgezr();
    }

    @Override // ki.agtfadlqog
    public String ulzqkzuiru(iwxlajgraz typeProjection) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeProjection, "typeProjection");
        StringBuilder sb3 = new StringBuilder();
        bfopjjpdmp(sb3, hg.jyumaefscl.eablkybsjg(typeProjection));
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    @Override // ki.iwizpuwonk
    public boolean vdvldrhtss() {
        return this.f55662wflxmlrfwp.vdvldrhtss();
    }

    public String w0(List typeArguments) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(y());
        bfopjjpdmp(sb3, typeArguments);
        sb3.append(u());
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    @Override // ki.iwizpuwonk
    public void wflxmlrfwp(iozdgvuglv iozdgvuglvVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iozdgvuglvVar, "<set-?>");
        this.f55662wflxmlrfwp.wflxmlrfwp(iozdgvuglvVar);
    }

    public boolean wizcaqwiak() {
        return this.f55662wflxmlrfwp.iozdgvuglv();
    }

    @Override // ki.iwizpuwonk
    public void wkgbmnqykc(cdpycssgdh cdpycssgdhVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cdpycssgdhVar, "<set-?>");
        this.f55662wflxmlrfwp.wkgbmnqykc(cdpycssgdhVar);
    }

    @Override // ki.agtfadlqog
    public String wypolnanlu(kh.ppxfxbqfkf annotation, kh.eablkybsjg eablkybsjgVar) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotation, "annotation");
        StringBuilder sb3 = new StringBuilder();
        sb3.append('@');
        if (eablkybsjgVar != null) {
            sb3.append(eablkybsjgVar.wkgbmnqykc() + ':');
        }
        kegysxyocb type = annotation.getType();
        sb3.append(ntlheqmsrt(type));
        if (vdvldrhtss()) {
            List listD = D(annotation);
            if (iobyxmoadg() || !listD.isEmpty()) {
                hg.wwaezpbzkn.roivzttewh(listD, sb3, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (o() && (ulzqkzuiru.iobyxmoadg(type) || (type.grlcpdaxtj().ylkuphrtab() instanceof jpowsppfya.zoijcleaow))) {
            sb3.append(" /* annotation class not found */");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public String x0(zeieaojujs typeConstructor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeConstructor, "typeConstructor");
        jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = typeConstructor.ylkuphrtab();
        if ((nufgyqmvbuVarYlkuphrtab instanceof yfnezrywwk) || (nufgyqmvbuVarYlkuphrtab instanceof jh.eablkybsjg) || (nufgyqmvbuVarYlkuphrtab instanceof uwvvkdfqfp)) {
            return J(nufgyqmvbuVarYlkuphrtab);
        }
        if (nufgyqmvbuVarYlkuphrtab == null) {
            return typeConstructor instanceof stevsuqkhv ? ((stevsuqkhv) typeConstructor).agtfadlqog(rgvfuqvkyq.f55652zdlpuopuiu) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + nufgyqmvbuVarYlkuphrtab.getClass()).toString());
    }

    public boolean yzdjzghtvl() {
        return this.f55662wflxmlrfwp.tzroggbefp();
    }

    @Override // ki.iwizpuwonk
    public void zoijcleaow(boolean z13) {
        this.f55662wflxmlrfwp.zoijcleaow(z13);
    }
}
