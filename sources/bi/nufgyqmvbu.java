package bi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jh.iyctptxqzt;
import jh.jpowsppfya;
import jh.xrmfcynszj;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final jpowsppfya f16294eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final vi.lqeggnwhkg f16295gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private hi.eablkybsjg f16296lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jh.lmojexxdyd f16297wkgbmnqykc;

    private abstract class iobyxmoadg implements cqumvgiudr.iobyxmoadg {

        /* JADX INFO: renamed from: bi.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0292iobyxmoadg implements cqumvgiudr.iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ ArrayList f16299eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final /* synthetic */ cqumvgiudr.iobyxmoadg f16300iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f16301ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ ii.gxszxtbevo f16302wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ cqumvgiudr.iobyxmoadg f16303zoijcleaow;

            C0292iobyxmoadg(cqumvgiudr.iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, ii.gxszxtbevo gxszxtbevoVar, ArrayList arrayList) {
                this.f16303zoijcleaow = iobyxmoadgVar;
                this.f16301ppxfxbqfkf = iobyxmoadgVar2;
                this.f16302wkgbmnqykc = gxszxtbevoVar;
                this.f16299eablkybsjg = arrayList;
                this.f16300iobyxmoadg = iobyxmoadgVar;
            }

            @Override // bi.cqumvgiudr.iobyxmoadg
            public cqumvgiudr.iobyxmoadg eablkybsjg(ii.gxszxtbevo gxszxtbevoVar, ii.zoijcleaow classId) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
                return this.f16300iobyxmoadg.eablkybsjg(gxszxtbevoVar, classId);
            }

            @Override // bi.cqumvgiudr.iobyxmoadg
            public void gxszxtbevo(ii.gxszxtbevo gxszxtbevoVar, Object obj) {
                this.f16300iobyxmoadg.gxszxtbevo(gxszxtbevoVar, obj);
            }

            @Override // bi.cqumvgiudr.iobyxmoadg
            public void iobyxmoadg() {
                this.f16303zoijcleaow.iobyxmoadg();
                this.f16301ppxfxbqfkf.nufgyqmvbu(this.f16302wkgbmnqykc, new ni.iobyxmoadg((kh.ppxfxbqfkf) hg.jyumaefscl.yzdjzghtvl(this.f16299eablkybsjg)));
            }

            @Override // bi.cqumvgiudr.iobyxmoadg
            public void ppxfxbqfkf(ii.gxszxtbevo gxszxtbevoVar, ni.gxszxtbevo value) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
                this.f16300iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar, value);
            }

            @Override // bi.cqumvgiudr.iobyxmoadg
            public void wkgbmnqykc(ii.gxszxtbevo gxszxtbevoVar, ii.zoijcleaow enumClassId, ii.gxszxtbevo enumEntryName) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumClassId, "enumClassId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumEntryName, "enumEntryName");
                this.f16300iobyxmoadg.wkgbmnqykc(gxszxtbevoVar, enumClassId, enumEntryName);
            }

            @Override // bi.cqumvgiudr.iobyxmoadg
            public cqumvgiudr.zoijcleaow zoijcleaow(ii.gxszxtbevo gxszxtbevoVar) {
                return this.f16300iobyxmoadg.zoijcleaow(gxszxtbevoVar);
            }
        }

        public static final class zoijcleaow implements cqumvgiudr.zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final ArrayList f16304iobyxmoadg = new ArrayList();

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ ii.gxszxtbevo f16305ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f16306wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f16307zoijcleaow;

            /* JADX INFO: renamed from: bi.nufgyqmvbu$iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0293iobyxmoadg implements cqumvgiudr.iobyxmoadg {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                private final /* synthetic */ cqumvgiudr.iobyxmoadg f16308iobyxmoadg;

                /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
                final /* synthetic */ zoijcleaow f16309ppxfxbqfkf;

                /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
                final /* synthetic */ ArrayList f16310wkgbmnqykc;

                /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
                final /* synthetic */ cqumvgiudr.iobyxmoadg f16311zoijcleaow;

                C0293iobyxmoadg(cqumvgiudr.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, ArrayList arrayList) {
                    this.f16311zoijcleaow = iobyxmoadgVar;
                    this.f16309ppxfxbqfkf = zoijcleaowVar;
                    this.f16310wkgbmnqykc = arrayList;
                    this.f16308iobyxmoadg = iobyxmoadgVar;
                }

                @Override // bi.cqumvgiudr.iobyxmoadg
                public cqumvgiudr.iobyxmoadg eablkybsjg(ii.gxszxtbevo gxszxtbevoVar, ii.zoijcleaow classId) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
                    return this.f16308iobyxmoadg.eablkybsjg(gxszxtbevoVar, classId);
                }

                @Override // bi.cqumvgiudr.iobyxmoadg
                public void gxszxtbevo(ii.gxszxtbevo gxszxtbevoVar, Object obj) {
                    this.f16308iobyxmoadg.gxszxtbevo(gxszxtbevoVar, obj);
                }

                @Override // bi.cqumvgiudr.iobyxmoadg
                public void iobyxmoadg() {
                    this.f16311zoijcleaow.iobyxmoadg();
                    this.f16309ppxfxbqfkf.f16304iobyxmoadg.add(new ni.iobyxmoadg((kh.ppxfxbqfkf) hg.jyumaefscl.yzdjzghtvl(this.f16310wkgbmnqykc)));
                }

                @Override // bi.cqumvgiudr.iobyxmoadg
                public void ppxfxbqfkf(ii.gxszxtbevo gxszxtbevoVar, ni.gxszxtbevo value) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
                    this.f16308iobyxmoadg.ppxfxbqfkf(gxszxtbevoVar, value);
                }

                @Override // bi.cqumvgiudr.iobyxmoadg
                public void wkgbmnqykc(ii.gxszxtbevo gxszxtbevoVar, ii.zoijcleaow enumClassId, ii.gxszxtbevo enumEntryName) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumClassId, "enumClassId");
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumEntryName, "enumEntryName");
                    this.f16308iobyxmoadg.wkgbmnqykc(gxszxtbevoVar, enumClassId, enumEntryName);
                }

                @Override // bi.cqumvgiudr.iobyxmoadg
                public cqumvgiudr.zoijcleaow zoijcleaow(ii.gxszxtbevo gxszxtbevoVar) {
                    return this.f16308iobyxmoadg.zoijcleaow(gxszxtbevoVar);
                }
            }

            zoijcleaow(nufgyqmvbu nufgyqmvbuVar, ii.gxszxtbevo gxszxtbevoVar, iobyxmoadg iobyxmoadgVar) {
                this.f16307zoijcleaow = nufgyqmvbuVar;
                this.f16305ppxfxbqfkf = gxszxtbevoVar;
                this.f16306wkgbmnqykc = iobyxmoadgVar;
            }

            @Override // bi.cqumvgiudr.zoijcleaow
            public void eablkybsjg(Object obj) {
                this.f16304iobyxmoadg.add(this.f16307zoijcleaow.dsvhmnatus(this.f16305ppxfxbqfkf, obj));
            }

            @Override // bi.cqumvgiudr.zoijcleaow
            public void iobyxmoadg() {
                this.f16306wkgbmnqykc.lqeggnwhkg(this.f16305ppxfxbqfkf, this.f16304iobyxmoadg);
            }

            @Override // bi.cqumvgiudr.zoijcleaow
            public cqumvgiudr.iobyxmoadg ppxfxbqfkf(ii.zoijcleaow classId) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
                ArrayList arrayList = new ArrayList();
                nufgyqmvbu nufgyqmvbuVar = this.f16307zoijcleaow;
                xrmfcynszj NO_SOURCE = xrmfcynszj.f51348iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(NO_SOURCE, "NO_SOURCE");
                cqumvgiudr.iobyxmoadg iobyxmoadgVarCqumvgiudr = nufgyqmvbuVar.cqumvgiudr(classId, NO_SOURCE, arrayList);
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarCqumvgiudr);
                return new C0293iobyxmoadg(iobyxmoadgVarCqumvgiudr, this, arrayList);
            }

            @Override // bi.cqumvgiudr.zoijcleaow
            public void wkgbmnqykc(ii.zoijcleaow enumClassId, ii.gxszxtbevo enumEntryName) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumClassId, "enumClassId");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumEntryName, "enumEntryName");
                this.f16304iobyxmoadg.add(new ni.gtknphoqwx(enumClassId, enumEntryName));
            }

            @Override // bi.cqumvgiudr.zoijcleaow
            public void zoijcleaow(ni.gxszxtbevo value) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
                this.f16304iobyxmoadg.add(new ni.kcexrzcfyt(value));
            }
        }

        public iobyxmoadg() {
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.iobyxmoadg eablkybsjg(ii.gxszxtbevo gxszxtbevoVar, ii.zoijcleaow classId) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
            ArrayList arrayList = new ArrayList();
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            xrmfcynszj NO_SOURCE = xrmfcynszj.f51348iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(NO_SOURCE, "NO_SOURCE");
            cqumvgiudr.iobyxmoadg iobyxmoadgVarCqumvgiudr = nufgyqmvbuVar.cqumvgiudr(classId, NO_SOURCE, arrayList);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarCqumvgiudr);
            return new C0292iobyxmoadg(iobyxmoadgVarCqumvgiudr, this, gxszxtbevoVar, arrayList);
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void gxszxtbevo(ii.gxszxtbevo gxszxtbevoVar, Object obj) {
            nufgyqmvbu(gxszxtbevoVar, nufgyqmvbu.this.dsvhmnatus(gxszxtbevoVar, obj));
        }

        public abstract void lqeggnwhkg(ii.gxszxtbevo gxszxtbevoVar, ArrayList arrayList);

        public abstract void nufgyqmvbu(ii.gxszxtbevo gxszxtbevoVar, ni.lqeggnwhkg lqeggnwhkgVar);

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void ppxfxbqfkf(ii.gxszxtbevo gxszxtbevoVar, ni.gxszxtbevo value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            nufgyqmvbu(gxszxtbevoVar, new ni.kcexrzcfyt(value));
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void wkgbmnqykc(ii.gxszxtbevo gxszxtbevoVar, ii.zoijcleaow enumClassId, ii.gxszxtbevo enumEntryName) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumClassId, "enumClassId");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(enumEntryName, "enumEntryName");
            nufgyqmvbu(gxszxtbevoVar, new ni.gtknphoqwx(enumClassId, enumEntryName));
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public cqumvgiudr.zoijcleaow zoijcleaow(ii.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(nufgyqmvbu.this, gxszxtbevoVar, this);
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ ii.zoijcleaow f16312eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ List f16313gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final /* synthetic */ xrmfcynszj f16314lqeggnwhkg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ jh.eablkybsjg f16316wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HashMap f16317zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(jh.eablkybsjg eablkybsjgVar, ii.zoijcleaow zoijcleaowVar, List list, xrmfcynszj xrmfcynszjVar) {
            super();
            this.f16316wkgbmnqykc = eablkybsjgVar;
            this.f16312eablkybsjg = zoijcleaowVar;
            this.f16313gxszxtbevo = list;
            this.f16314lqeggnwhkg = xrmfcynszjVar;
            this.f16317zoijcleaow = new HashMap();
        }

        @Override // bi.cqumvgiudr.iobyxmoadg
        public void iobyxmoadg() {
            if (nufgyqmvbu.this.iozdgvuglv(this.f16312eablkybsjg, this.f16317zoijcleaow) || nufgyqmvbu.this.iwizpuwonk(this.f16312eablkybsjg)) {
                return;
            }
            this.f16313gxszxtbevo.add(new kh.wkgbmnqykc(this.f16316wkgbmnqykc.ojitshcjhn(), this.f16317zoijcleaow, this.f16314lqeggnwhkg));
        }

        @Override // bi.nufgyqmvbu.iobyxmoadg
        public void lqeggnwhkg(ii.gxszxtbevo gxszxtbevoVar, ArrayList elements) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
            if (gxszxtbevoVar == null) {
                return;
            }
            iyctptxqzt iyctptxqztVarZoijcleaow = th.iobyxmoadg.zoijcleaow(gxszxtbevoVar, this.f16316wkgbmnqykc);
            if (iyctptxqztVarZoijcleaow != null) {
                HashMap map = this.f16317zoijcleaow;
                ni.dxjokdxxww dxjokdxxwwVar = ni.dxjokdxxww.f70090iobyxmoadg;
                List listPpxfxbqfkf = jj.iobyxmoadg.ppxfxbqfkf(elements);
                kegysxyocb type = iyctptxqztVarZoijcleaow.getType();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
                map.put(gxszxtbevoVar, dxjokdxxwwVar.ppxfxbqfkf(listPpxfxbqfkf, type));
                return;
            }
            if (nufgyqmvbu.this.iwizpuwonk(this.f16312eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVar.zoijcleaow(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof ni.iobyxmoadg) {
                        arrayList.add(obj);
                    }
                }
                List list = this.f16313gxszxtbevo;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add((kh.ppxfxbqfkf) ((ni.iobyxmoadg) it.next()).zoijcleaow());
                }
            }
        }

        @Override // bi.nufgyqmvbu.iobyxmoadg
        public void nufgyqmvbu(ii.gxszxtbevo gxszxtbevoVar, ni.lqeggnwhkg value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            if (gxszxtbevoVar != null) {
                this.f16317zoijcleaow.put(gxszxtbevoVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(jh.lmojexxdyd module, jpowsppfya notFoundClasses, yi.agtfadlqog storageManager, jyumaefscl kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinClassFinder, "kotlinClassFinder");
        this.f16297wkgbmnqykc = module;
        this.f16294eablkybsjg = notFoundClasses;
        this.f16295gxszxtbevo = new vi.lqeggnwhkg(module, notFoundClasses);
        this.f16296lqeggnwhkg = hi.eablkybsjg.f40416dxjokdxxww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ni.lqeggnwhkg dsvhmnatus(ii.gxszxtbevo gxszxtbevoVar, Object obj) {
        ni.lqeggnwhkg lqeggnwhkgVarEablkybsjg = ni.dxjokdxxww.f70090iobyxmoadg.eablkybsjg(obj, this.f16297wkgbmnqykc);
        if (lqeggnwhkgVarEablkybsjg != null) {
            return lqeggnwhkgVarEablkybsjg;
        }
        return ni.draadjrbmk.f70088zoijcleaow.iobyxmoadg("Unsupported annotation argument: " + gxszxtbevoVar);
    }

    private final jh.eablkybsjg kegysxyocb(ii.zoijcleaow zoijcleaowVar) {
        return jh.esjtqupxsv.wkgbmnqykc(this.f16297wkgbmnqykc, zoijcleaowVar, this.f16294eablkybsjg);
    }

    @Override // bi.eablkybsjg
    protected cqumvgiudr.iobyxmoadg cqumvgiudr(ii.zoijcleaow annotationClassId, xrmfcynszj source, List result) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        return new zoijcleaow(kegysxyocb(annotationClassId), annotationClassId, result, source);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bi.wkgbmnqykc
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public ni.lqeggnwhkg hkdspvbjdz(ni.lqeggnwhkg constant) {
        ni.lqeggnwhkg istkbnxepwVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constant, "constant");
        if (constant instanceof ni.wkgbmnqykc) {
            istkbnxepwVar = new ni.pmvmpeiblj(((Number) ((ni.wkgbmnqykc) constant).zoijcleaow()).byteValue());
        } else if (constant instanceof ni.iwizpuwonk) {
            istkbnxepwVar = new ni.cdpycssgdh(((Number) ((ni.iwizpuwonk) constant).zoijcleaow()).shortValue());
        } else if (constant instanceof ni.agtfadlqog) {
            istkbnxepwVar = new ni.zynmafqrjb(((Number) ((ni.agtfadlqog) constant).zoijcleaow()).intValue());
        } else {
            if (!(constant instanceof ni.zdlpuopuiu)) {
                return constant;
            }
            istkbnxepwVar = new ni.istkbnxepw(((Number) ((ni.zdlpuopuiu) constant).zoijcleaow()).longValue());
        }
        return istkbnxepwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bi.wkgbmnqykc
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public ni.lqeggnwhkg ylkuphrtab(String desc, Object initializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initializer, "initializer");
        if (mj.kcexrzcfyt.sopmlzcsov("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return ni.dxjokdxxww.f70090iobyxmoadg.eablkybsjg(initializer, this.f16297wkgbmnqykc);
    }

    public void tzroggbefp(hi.eablkybsjg eablkybsjgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eablkybsjgVar, "<set-?>");
        this.f16296lqeggnwhkg = eablkybsjgVar;
    }

    @Override // bi.eablkybsjg, vi.nufgyqmvbu
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public kh.ppxfxbqfkf iobyxmoadg(di.zoijcleaow proto, fi.ppxfxbqfkf nameResolver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        return this.f16295gxszxtbevo.iobyxmoadg(proto, nameResolver);
    }

    @Override // bi.eablkybsjg
    public hi.eablkybsjg yggfygwlhe() {
        return this.f16296lqeggnwhkg;
    }
}
