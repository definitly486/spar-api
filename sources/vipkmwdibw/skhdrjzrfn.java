package vipkmwdibw;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.v0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class skhdrjzrfn {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final SnapshotStateList f117252btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f117253draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final SnapshotStateList f117254dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f117255eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f117256gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.compose.runtime.auzgnhcxok f117257gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jrbgnlbqoe f117258iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final androidx.compose.runtime.auzgnhcxok f117259lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f117260nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f117261ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final i1 f117262wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f117263wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final skhdrjzrfn f117264zoijcleaow;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f117266jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f117267yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        float f117268zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn kcexrzcfyt(skhdrjzrfn skhdrjzrfnVar, float f13, long j13) {
            if (!skhdrjzrfnVar.lereixgezr()) {
                skhdrjzrfnVar.istkbnxepw(j13, f13);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = skhdrjzrfn.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f117266jyumaefscl = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            final float fYadqdtsiqt;
            pj.cllcsxoeiz cllcsxoeizVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f117267yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar2 = (pj.cllcsxoeiz) this.f117266jyumaefscl;
                fYadqdtsiqt = tbqsvytpvh.yadqdtsiqt(cllcsxoeizVar2.getCoroutineContext());
                cllcsxoeizVar = cllcsxoeizVar2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fYadqdtsiqt = this.f117268zdlpuopuiu;
                cllcsxoeizVar = (pj.cllcsxoeiz) this.f117266jyumaefscl;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            while (pj.dsvhmnatus.nufgyqmvbu(cllcsxoeizVar)) {
                final skhdrjzrfn skhdrjzrfnVar = skhdrjzrfn.this;
                tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: vipkmwdibw.igdgnonuha
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj2) {
                        return skhdrjzrfn.eablkybsjg.kcexrzcfyt(skhdrjzrfnVar, fYadqdtsiqt, ((Long) obj2).longValue());
                    }
                };
                this.f117266jyumaefscl = cllcsxoeizVar;
                this.f117268zdlpuopuiu = fYadqdtsiqt;
                this.f117267yggfygwlhe = 1;
                if (androidx.compose.runtime.weqkydbzbr.ppxfxbqfkf(draadjrbmkVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gxszxtbevo implements androidx.compose.runtime.ntlheqmsrt {
        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
        }
    }

    public final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ezmngbhpjk f117269iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final androidx.compose.runtime.iwxlajgraz f117270ppxfxbqfkf = c1.ppxfxbqfkf(null, null, 2, null);

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f117272zoijcleaow;

        /* JADX INFO: renamed from: vipkmwdibw.skhdrjzrfn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public final class C2916iobyxmoadg implements i1 {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            private tg.draadjrbmk f117274jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private tg.draadjrbmk f117275yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final wkgbmnqykc f117276zdlpuopuiu;

            public C2916iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
                this.f117276zdlpuopuiu = wkgbmnqykcVar;
                this.f117275yggfygwlhe = draadjrbmkVar;
                this.f117274jyumaefscl = draadjrbmkVar2;
            }

            public final void agtfadlqog(tg.draadjrbmk draadjrbmkVar) {
                this.f117274jyumaefscl = draadjrbmkVar;
            }

            public final tg.draadjrbmk draadjrbmk() {
                return this.f117275yggfygwlhe;
            }

            @Override // androidx.compose.runtime.i1
            public Object getValue() {
                rgvfuqvkyq(skhdrjzrfn.this.zdlpuopuiu());
                return this.f117276zdlpuopuiu.getValue();
            }

            public final wkgbmnqykc iobyxmoadg() {
                return this.f117276zdlpuopuiu;
            }

            public final void ojitshcjhn(tg.draadjrbmk draadjrbmkVar) {
                this.f117275yggfygwlhe = draadjrbmkVar;
            }

            public final void rgvfuqvkyq(zoijcleaow zoijcleaowVar) {
                Object objInvoke = this.f117274jyumaefscl.invoke(zoijcleaowVar.iobyxmoadg());
                if (!skhdrjzrfn.this.lereixgezr()) {
                    this.f117276zdlpuopuiu.dsvhmnatus(objInvoke, (wwaezpbzkn) this.f117275yggfygwlhe.invoke(zoijcleaowVar));
                } else {
                    this.f117276zdlpuopuiu.cllcsxoeiz(this.f117274jyumaefscl.invoke(zoijcleaowVar.zoijcleaow()), objInvoke, (wwaezpbzkn) this.f117275yggfygwlhe.invoke(zoijcleaowVar));
                }
            }

            public final tg.draadjrbmk wkgbmnqykc() {
                return this.f117274jyumaefscl;
            }
        }

        public iobyxmoadg(ezmngbhpjk ezmngbhpjkVar, String str) {
            this.f117269iobyxmoadg = ezmngbhpjkVar;
            this.f117272zoijcleaow = str;
        }

        public final i1 iobyxmoadg(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
            C2916iobyxmoadg c2916iobyxmoadgZoijcleaow = zoijcleaow();
            if (c2916iobyxmoadgZoijcleaow == null) {
                skhdrjzrfn skhdrjzrfnVar = skhdrjzrfn.this;
                c2916iobyxmoadgZoijcleaow = new C2916iobyxmoadg(skhdrjzrfnVar.new wkgbmnqykc(draadjrbmkVar2.invoke(skhdrjzrfnVar.ojitshcjhn()), agtfadlqog.dxjokdxxww(this.f117269iobyxmoadg, draadjrbmkVar2.invoke(skhdrjzrfn.this.ojitshcjhn())), this.f117269iobyxmoadg, this.f117272zoijcleaow), draadjrbmkVar, draadjrbmkVar2);
                skhdrjzrfn skhdrjzrfnVar2 = skhdrjzrfn.this;
                ppxfxbqfkf(c2916iobyxmoadgZoijcleaow);
                skhdrjzrfnVar2.gxszxtbevo(c2916iobyxmoadgZoijcleaow.iobyxmoadg());
            }
            skhdrjzrfn skhdrjzrfnVar3 = skhdrjzrfn.this;
            c2916iobyxmoadgZoijcleaow.agtfadlqog(draadjrbmkVar2);
            c2916iobyxmoadgZoijcleaow.ojitshcjhn(draadjrbmkVar);
            c2916iobyxmoadgZoijcleaow.rgvfuqvkyq(skhdrjzrfnVar3.zdlpuopuiu());
            return c2916iobyxmoadgZoijcleaow;
        }

        public final void ppxfxbqfkf(C2916iobyxmoadg c2916iobyxmoadg) {
            this.f117270ppxfxbqfkf.setValue(c2916iobyxmoadg);
        }

        public final void wkgbmnqykc() {
            C2916iobyxmoadg c2916iobyxmoadgZoijcleaow = zoijcleaow();
            if (c2916iobyxmoadgZoijcleaow != null) {
                skhdrjzrfn skhdrjzrfnVar = skhdrjzrfn.this;
                c2916iobyxmoadgZoijcleaow.iobyxmoadg().cllcsxoeiz(c2916iobyxmoadgZoijcleaow.wkgbmnqykc().invoke(skhdrjzrfnVar.zdlpuopuiu().zoijcleaow()), c2916iobyxmoadgZoijcleaow.wkgbmnqykc().invoke(skhdrjzrfnVar.zdlpuopuiu().iobyxmoadg()), (wwaezpbzkn) c2916iobyxmoadgZoijcleaow.draadjrbmk().invoke(skhdrjzrfnVar.zdlpuopuiu()));
            }
        }

        public final C2916iobyxmoadg zoijcleaow() {
            return (C2916iobyxmoadg) this.f117270ppxfxbqfkf.getValue();
        }
    }

    private static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f117277iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Object f117278zoijcleaow;

        public ppxfxbqfkf(Object obj, Object obj2) {
            this.f117277iobyxmoadg = obj;
            this.f117278zoijcleaow = obj2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof zoijcleaow) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), zoijcleaowVar.zoijcleaow()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(), zoijcleaowVar.iobyxmoadg())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object objZoijcleaow = zoijcleaow();
            int iHashCode = (objZoijcleaow != null ? objZoijcleaow.hashCode() : 0) * 31;
            Object objIobyxmoadg = iobyxmoadg();
            return iHashCode + (objIobyxmoadg != null ? objIobyxmoadg.hashCode() : 0);
        }

        @Override // vipkmwdibw.skhdrjzrfn.zoijcleaow
        public Object iobyxmoadg() {
            return this.f117278zoijcleaow;
        }

        @Override // vipkmwdibw.skhdrjzrfn.zoijcleaow
        public Object zoijcleaow() {
            return this.f117277iobyxmoadg;
        }
    }

    public final class wkgbmnqykc implements i1 {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private final androidx.compose.runtime.iwxlajgraz f117279cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final androidx.compose.runtime.iwxlajgraz f117280cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final androidx.compose.runtime.iwxlajgraz f117281esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private final androidx.compose.runtime.auzgnhcxok f117282iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private boolean f117283istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final czzsidtyhn f117284iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final androidx.compose.runtime.iwxlajgraz f117285jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private roivzttewh f117286lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private boolean f117287lmojexxdyd;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final androidx.compose.runtime.iwxlajgraz f117288pmvmpeiblj;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        private final wwaezpbzkn f117289wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private kcexrzcfyt f117290yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final String f117291yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ezmngbhpjk f117293zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private final androidx.compose.runtime.roivzttewh f117294zynmafqrjb;

        public wkgbmnqykc(Object obj, kcexrzcfyt kcexrzcfytVar, ezmngbhpjk ezmngbhpjkVar, String str) {
            Object objInvoke;
            this.f117293zdlpuopuiu = ezmngbhpjkVar;
            this.f117291yggfygwlhe = str;
            this.f117285jyumaefscl = c1.ppxfxbqfkf(obj, null, 2, null);
            czzsidtyhn czzsidtyhnVarBtonecajqb = draadjrbmk.btonecajqb(0.0f, 0.0f, null, 7, null);
            this.f117284iwizpuwonk = czzsidtyhnVarBtonecajqb;
            this.f117280cqumvgiudr = c1.ppxfxbqfkf(czzsidtyhnVarBtonecajqb, null, 2, null);
            this.f117281esjtqupxsv = c1.ppxfxbqfkf(new roivzttewh(wkgbmnqykc(), ezmngbhpjkVar, obj, rgvfuqvkyq(), kcexrzcfytVar), null, 2, null);
            this.f117288pmvmpeiblj = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
            this.f117294zynmafqrjb = androidx.compose.runtime.ezmngbhpjk.iobyxmoadg(-1.0f);
            this.f117279cdpycssgdh = c1.ppxfxbqfkf(obj, null, 2, null);
            this.f117290yadqdtsiqt = kcexrzcfytVar;
            this.f117282iozdgvuglv = m0.iobyxmoadg(iobyxmoadg().wkgbmnqykc());
            Float f13 = (Float) d0.nufgyqmvbu().get(ezmngbhpjkVar);
            if (f13 != null) {
                float fFloatValue = f13.floatValue();
                kcexrzcfyt kcexrzcfytVar2 = (kcexrzcfyt) ezmngbhpjkVar.iobyxmoadg().invoke(obj);
                int iZoijcleaow = kcexrzcfytVar2.zoijcleaow();
                for (int i13 = 0; i13 < iZoijcleaow; i13++) {
                    kcexrzcfytVar2.eablkybsjg(i13, fFloatValue);
                }
                objInvoke = this.f117293zdlpuopuiu.zoijcleaow().invoke(kcexrzcfytVar2);
            } else {
                objInvoke = null;
            }
            this.f117289wwaezpbzkn = draadjrbmk.btonecajqb(0.0f, 0.0f, objInvoke, 3, null);
        }

        private final void cdpycssgdh(Object obj) {
            this.f117285jyumaefscl.setValue(obj);
        }

        private final void cqumvgiudr(roivzttewh roivzttewhVar) {
            this.f117281esjtqupxsv.setValue(roivzttewhVar);
        }

        static /* synthetic */ void hkdspvbjdz(wkgbmnqykc wkgbmnqykcVar, Object obj, boolean z13, int i13, Object obj2) {
            if ((i13 & 1) != 0) {
                obj = wkgbmnqykcVar.getValue();
            }
            if ((i13 & 2) != 0) {
                z13 = false;
            }
            wkgbmnqykcVar.ylkuphrtab(obj, z13);
        }

        private final void lereixgezr(wwaezpbzkn wwaezpbzknVar) {
            this.f117280cqumvgiudr.setValue(wwaezpbzknVar);
        }

        private final Object rgvfuqvkyq() {
            return this.f117285jyumaefscl.getValue();
        }

        private final void ylkuphrtab(Object obj, boolean z13) {
            roivzttewh roivzttewhVar = this.f117286lereixgezr;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(roivzttewhVar != null ? roivzttewhVar.lqeggnwhkg() : null, rgvfuqvkyq())) {
                cqumvgiudr(new roivzttewh(this.f117289wwaezpbzkn, this.f117293zdlpuopuiu, obj, obj, zdlpuopuiu.lqeggnwhkg(this.f117290yadqdtsiqt)));
                this.f117283istkbnxepw = true;
                pmvmpeiblj(iobyxmoadg().wkgbmnqykc());
                return;
            }
            gtknphoqwx gtknphoqwxVarWkgbmnqykc = (!z13 || this.f117287lmojexxdyd || (wkgbmnqykc() instanceof czzsidtyhn)) ? wkgbmnqykc() : this.f117289wwaezpbzkn;
            if (skhdrjzrfn.this.kcexrzcfyt() > 0) {
                gtknphoqwxVarWkgbmnqykc = draadjrbmk.ppxfxbqfkf(gtknphoqwxVarWkgbmnqykc, skhdrjzrfn.this.kcexrzcfyt());
            }
            cqumvgiudr(new roivzttewh(gtknphoqwxVarWkgbmnqykc, this.f117293zdlpuopuiu, obj, rgvfuqvkyq(), this.f117290yadqdtsiqt));
            pmvmpeiblj(iobyxmoadg().wkgbmnqykc());
            this.f117283istkbnxepw = false;
            skhdrjzrfn.this.pmvmpeiblj();
        }

        public final jztzpxfvev.iobyxmoadg agtfadlqog() {
            return null;
        }

        public final void cllcsxoeiz(Object obj, Object obj2, wwaezpbzkn wwaezpbzknVar) {
            cdpycssgdh(obj2);
            lereixgezr(wwaezpbzknVar);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg().dxjokdxxww(), obj) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg().lqeggnwhkg(), obj2)) {
                return;
            }
            hkdspvbjdz(this, obj, false, 2, null);
        }

        public final long draadjrbmk() {
            return this.f117282iozdgvuglv.ppxfxbqfkf();
        }

        public final void dsvhmnatus(Object obj, wwaezpbzkn wwaezpbzknVar) {
            if (this.f117283istkbnxepw) {
                roivzttewh roivzttewhVar = this.f117286lereixgezr;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, roivzttewhVar != null ? roivzttewhVar.lqeggnwhkg() : null)) {
                    return;
                }
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(rgvfuqvkyq(), obj) && ojitshcjhn() == -1.0f) {
                return;
            }
            cdpycssgdh(obj);
            lereixgezr(wwaezpbzknVar);
            ylkuphrtab(ojitshcjhn() == -3.0f ? obj : getValue(), !vdvldrhtss());
            zynmafqrjb(ojitshcjhn() == -3.0f);
            if (ojitshcjhn() >= 0.0f) {
                iozdgvuglv(iobyxmoadg().gxszxtbevo((long) (iobyxmoadg().wkgbmnqykc() * ojitshcjhn())));
            } else if (ojitshcjhn() == -3.0f) {
                iozdgvuglv(obj);
            }
            this.f117283istkbnxepw = false;
            istkbnxepw(-1.0f);
        }

        @Override // androidx.compose.runtime.i1
        public Object getValue() {
            return this.f117279cdpycssgdh.getValue();
        }

        public final roivzttewh iobyxmoadg() {
            return (roivzttewh) this.f117281esjtqupxsv.getValue();
        }

        public void iozdgvuglv(Object obj) {
            this.f117279cdpycssgdh.setValue(obj);
        }

        public final void istkbnxepw(float f13) {
            this.f117294zynmafqrjb.pkzmftpjix(f13);
        }

        public final void jyumaefscl(long j13) {
            if (ojitshcjhn() == -1.0f) {
                this.f117287lmojexxdyd = true;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg().lqeggnwhkg(), iobyxmoadg().dxjokdxxww())) {
                    iozdgvuglv(iobyxmoadg().lqeggnwhkg());
                } else {
                    iozdgvuglv(iobyxmoadg().gxszxtbevo(j13));
                    this.f117290yadqdtsiqt = iobyxmoadg().zoijcleaow(j13);
                }
            }
        }

        public final void kcexrzcfyt(long j13, boolean z13) {
            if (z13) {
                j13 = iobyxmoadg().wkgbmnqykc();
            }
            iozdgvuglv(iobyxmoadg().gxszxtbevo(j13));
            this.f117290yadqdtsiqt = iobyxmoadg().zoijcleaow(j13);
            if (iobyxmoadg().ppxfxbqfkf(j13)) {
                zynmafqrjb(true);
            }
        }

        public final float ojitshcjhn() {
            return this.f117294zynmafqrjb.zoijcleaow();
        }

        public final void pmvmpeiblj(long j13) {
            this.f117282iozdgvuglv.tzroggbefp(j13);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + rgvfuqvkyq() + ", spec: " + wkgbmnqykc();
        }

        public final boolean vdvldrhtss() {
            return ((Boolean) this.f117288pmvmpeiblj.getValue()).booleanValue();
        }

        public final wwaezpbzkn wkgbmnqykc() {
            return (wwaezpbzkn) this.f117280cqumvgiudr.getValue();
        }

        public final void zdlpuopuiu() {
            istkbnxepw(-2.0f);
        }

        public final void zynmafqrjb(boolean z13) {
            this.f117288pmvmpeiblj.setValue(Boolean.valueOf(z13));
        }
    }

    public interface zoijcleaow {
        Object iobyxmoadg();

        default boolean ppxfxbqfkf(Object obj, Object obj2) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zoijcleaow()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, iobyxmoadg());
        }

        Object zoijcleaow();
    }

    public skhdrjzrfn(jrbgnlbqoe jrbgnlbqoeVar, skhdrjzrfn skhdrjzrfnVar, String str) {
        this.f117258iobyxmoadg = jrbgnlbqoeVar;
        this.f117264zoijcleaow = skhdrjzrfnVar;
        this.f117261ppxfxbqfkf = str;
        this.f117263wkgbmnqykc = c1.ppxfxbqfkf(ojitshcjhn(), null, 2, null);
        this.f117255eablkybsjg = c1.ppxfxbqfkf(new ppxfxbqfkf(ojitshcjhn(), ojitshcjhn()), null, 2, null);
        this.f117257gxszxtbevo = m0.iobyxmoadg(0L);
        this.f117259lqeggnwhkg = m0.iobyxmoadg(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f117260nufgyqmvbu = c1.ppxfxbqfkf(bool, null, 2, null);
        this.f117254dxjokdxxww = v0.gxszxtbevo();
        this.f117252btonecajqb = v0.gxszxtbevo();
        this.f117256gtknphoqwx = c1.ppxfxbqfkf(bool, null, 2, null);
        this.f117262wflxmlrfwp = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: vipkmwdibw.dvvnrvtcbc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Long.valueOf(skhdrjzrfn.kegysxyocb(this.f117058zdlpuopuiu));
            }
        });
        jrbgnlbqoeVar.gxszxtbevo(this);
    }

    private static final boolean btonecajqb(i1 i1Var) {
        return ((Boolean) i1Var.getValue()).booleanValue();
    }

    private final long cqumvgiudr() {
        return this.f117257gxszxtbevo.ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(skhdrjzrfn skhdrjzrfnVar, Object obj, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        skhdrjzrfnVar.nufgyqmvbu(obj, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(skhdrjzrfn skhdrjzrfnVar) {
        return !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(skhdrjzrfnVar.jyumaefscl(), skhdrjzrfnVar.ojitshcjhn()) || skhdrjzrfnVar.esjtqupxsv() || skhdrjzrfnVar.iwizpuwonk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.ntlheqmsrt gtknphoqwx(pj.cllcsxoeiz cllcsxoeizVar, skhdrjzrfn skhdrjzrfnVar, androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, pj.wypolnanlu.UNDISPATCHED, skhdrjzrfnVar.new eablkybsjg(null), 1, null);
        return new gxszxtbevo();
    }

    private final void hkdspvbjdz(zoijcleaow zoijcleaowVar) {
        this.f117255eablkybsjg.setValue(zoijcleaowVar);
    }

    private final boolean iwizpuwonk() {
        return ((Boolean) this.f117260nufgyqmvbu.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long kegysxyocb(skhdrjzrfn skhdrjzrfnVar) {
        return skhdrjzrfnVar.wflxmlrfwp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void pmvmpeiblj() {
        wypolnanlu(true);
        if (lereixgezr()) {
            SnapshotStateList snapshotStateList = this.f117254dxjokdxxww;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i13 = 0; i13 < size; i13++) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) snapshotStateList.get(i13);
                jMax = Math.max(jMax, wkgbmnqykcVar.draadjrbmk());
                wkgbmnqykcVar.jyumaefscl(this.f117253draadjrbmk);
            }
            wypolnanlu(false);
        }
    }

    private final void stevsuqkhv(long j13) {
        this.f117257gxszxtbevo.tzroggbefp(j13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long wflxmlrfwp() {
        SnapshotStateList snapshotStateList = this.f117254dxjokdxxww;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            jMax = Math.max(jMax, ((wkgbmnqykc) snapshotStateList.get(i13)).draadjrbmk());
        }
        SnapshotStateList snapshotStateList2 = this.f117252btonecajqb;
        int size2 = snapshotStateList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            jMax = Math.max(jMax, ((skhdrjzrfn) snapshotStateList2.get(i14)).wflxmlrfwp());
        }
        return jMax;
    }

    private final void wypolnanlu(boolean z13) {
        this.f117260nufgyqmvbu.setValue(Boolean.valueOf(z13));
    }

    public final List agtfadlqog() {
        return this.f117254dxjokdxxww;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cdpycssgdh(long j13, boolean z13) {
        boolean z14 = true;
        if (yggfygwlhe() == Long.MIN_VALUE) {
            iozdgvuglv(j13);
        } else if (!this.f117258iobyxmoadg.ppxfxbqfkf()) {
            this.f117258iobyxmoadg.eablkybsjg(true);
        }
        wypolnanlu(false);
        SnapshotStateList snapshotStateList = this.f117254dxjokdxxww;
        int size = snapshotStateList.size();
        for (int i13 = 0; i13 < size; i13++) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) snapshotStateList.get(i13);
            if (!wkgbmnqykcVar.vdvldrhtss()) {
                wkgbmnqykcVar.kcexrzcfyt(j13, z13);
            }
            if (!wkgbmnqykcVar.vdvldrhtss()) {
                z14 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.f117252btonecajqb;
        int size2 = snapshotStateList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            skhdrjzrfn skhdrjzrfnVar = (skhdrjzrfn) snapshotStateList2.get(i14);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(skhdrjzrfnVar.jyumaefscl(), skhdrjzrfnVar.ojitshcjhn())) {
                skhdrjzrfnVar.cdpycssgdh(j13, z13);
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(skhdrjzrfnVar.jyumaefscl(), skhdrjzrfnVar.ojitshcjhn())) {
                z14 = false;
            }
        }
        if (z14) {
            yadqdtsiqt();
        }
    }

    public final void cllcsxoeiz(long j13) {
        this.f117259lqeggnwhkg.tzroggbefp(j13);
    }

    public final void dsvhmnatus(Object obj) {
        this.f117263wkgbmnqykc.setValue(obj);
    }

    public final boolean esjtqupxsv() {
        return yggfygwlhe() != Long.MIN_VALUE;
    }

    public final boolean gxszxtbevo(wkgbmnqykc wkgbmnqykcVar) {
        return this.f117254dxjokdxxww.add(wkgbmnqykcVar);
    }

    public final void hcddaimhww(long j13) {
        if (this.f117264zoijcleaow == null) {
            stevsuqkhv(j13);
        }
    }

    public final void iozdgvuglv(long j13) {
        cllcsxoeiz(j13);
        this.f117258iobyxmoadg.eablkybsjg(true);
    }

    public final void istkbnxepw(long j13, float f13) {
        if (yggfygwlhe() == Long.MIN_VALUE) {
            iozdgvuglv(j13);
        }
        long jYggfygwlhe = j13 - yggfygwlhe();
        if (f13 != 0.0f) {
            jYggfygwlhe = vg.iobyxmoadg.eablkybsjg(jYggfygwlhe / ((double) f13));
        }
        hcddaimhww(jYggfygwlhe);
        cdpycssgdh(jYggfygwlhe, f13 == 0.0f);
    }

    public final void jpowsppfya(boolean z13) {
        this.f117256gtknphoqwx.setValue(Boolean.valueOf(z13));
    }

    public final Object jyumaefscl() {
        return this.f117263wkgbmnqykc.getValue();
    }

    public final long kcexrzcfyt() {
        skhdrjzrfn skhdrjzrfnVar = this.f117264zoijcleaow;
        return skhdrjzrfnVar != null ? skhdrjzrfnVar.kcexrzcfyt() : cqumvgiudr();
    }

    public final boolean lereixgezr() {
        return ((Boolean) this.f117256gtknphoqwx.getValue()).booleanValue();
    }

    public final void lmojexxdyd(iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        iobyxmoadg.C2916iobyxmoadg c2916iobyxmoadgZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (c2916iobyxmoadgZoijcleaow == null || (wkgbmnqykcVarIobyxmoadg = c2916iobyxmoadgZoijcleaow.iobyxmoadg()) == null) {
            return;
        }
        wwaezpbzkn(wkgbmnqykcVarIobyxmoadg);
    }

    public final boolean lqeggnwhkg(skhdrjzrfn skhdrjzrfnVar) {
        return this.f117252btonecajqb.add(skhdrjzrfnVar);
    }

    public final void nufgyqmvbu(final Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1493585151);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(obj) : draadjrbmkVarBtonecajqb.lmojexxdyd(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? 32 : 16;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1493585151, i14, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1180)");
            }
            if (lereixgezr()) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(467781377);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(466120769);
                tzroggbefp(obj);
                int i15 = i14 & 112;
                boolean z13 = i15 == 32;
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: vipkmwdibw.uawqvzlxes
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Boolean.valueOf(skhdrjzrfn.dxjokdxxww(this.f117311zdlpuopuiu));
                        }
                    });
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                if (btonecajqb((i1) objYadqdtsiqt)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(466528884);
                    Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt2 = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    final pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) objYadqdtsiqt2;
                    boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar) | (i15 == 32);
                    Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: vipkmwdibw.auzgnhcxok
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return skhdrjzrfn.gtknphoqwx(cllcsxoeizVar, this, (androidx.compose.runtime.ulzqkzuiru) obj2);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    androidx.compose.runtime.jlmebxxoox.iobyxmoadg(cllcsxoeizVar, this, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, i15);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(467771457);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: vipkmwdibw.iwxlajgraz
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj2, Object obj3) {
                    return skhdrjzrfn.draadjrbmk(this.f117129zdlpuopuiu, obj, i13, (androidx.compose.runtime.draadjrbmk) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final Object ojitshcjhn() {
        return this.f117258iobyxmoadg.iobyxmoadg();
    }

    public final long oxmwwwfdhm() {
        return this.f117253draadjrbmk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pkzmftpjix(Object obj, Object obj2, long j13) {
        cllcsxoeiz(Long.MIN_VALUE);
        this.f117258iobyxmoadg.eablkybsjg(false);
        if (!lereixgezr() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ojitshcjhn(), obj) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefscl(), obj2)) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ojitshcjhn(), obj)) {
                jrbgnlbqoe jrbgnlbqoeVar = this.f117258iobyxmoadg;
                if (jrbgnlbqoeVar instanceof ribwqtqdhb) {
                    ((ribwqtqdhb) jrbgnlbqoeVar).wkgbmnqykc(obj);
                }
            }
            dsvhmnatus(obj2);
            jpowsppfya(true);
            hkdspvbjdz(new ppxfxbqfkf(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f117252btonecajqb;
        int size = snapshotStateList.size();
        for (int i13 = 0; i13 < size; i13++) {
            skhdrjzrfn skhdrjzrfnVar = (skhdrjzrfn) snapshotStateList.get(i13);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(skhdrjzrfnVar, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (skhdrjzrfnVar.lereixgezr()) {
                skhdrjzrfnVar.pkzmftpjix(skhdrjzrfnVar.ojitshcjhn(), skhdrjzrfnVar.jyumaefscl(), j13);
            }
        }
        SnapshotStateList snapshotStateList2 = this.f117254dxjokdxxww;
        int size2 = snapshotStateList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((wkgbmnqykc) snapshotStateList2.get(i14)).jyumaefscl(j13);
        }
        this.f117253draadjrbmk = j13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean rgvfuqvkyq() {
        SnapshotStateList snapshotStateList = this.f117254dxjokdxxww;
        int size = snapshotStateList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((wkgbmnqykc) snapshotStateList.get(i13)).agtfadlqog();
        }
        SnapshotStateList snapshotStateList2 = this.f117252btonecajqb;
        int size2 = snapshotStateList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            if (((skhdrjzrfn) snapshotStateList2.get(i14)).rgvfuqvkyq()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        List listAgtfadlqog = agtfadlqog();
        int size = listAgtfadlqog.size();
        String str = "Transition animation values: ";
        for (int i13 = 0; i13 < size; i13++) {
            str = str + ((wkgbmnqykc) listAgtfadlqog.get(i13)) + ", ";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void tzroggbefp(Object obj) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefscl(), obj)) {
            return;
        }
        hkdspvbjdz(new ppxfxbqfkf(jyumaefscl(), obj));
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ojitshcjhn(), jyumaefscl())) {
            this.f117258iobyxmoadg.wkgbmnqykc(jyumaefscl());
        }
        dsvhmnatus(obj);
        if (!esjtqupxsv()) {
            wypolnanlu(true);
        }
        SnapshotStateList snapshotStateList = this.f117254dxjokdxxww;
        int size = snapshotStateList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((wkgbmnqykc) snapshotStateList.get(i13)).zdlpuopuiu();
        }
    }

    public final String vdvldrhtss() {
        return this.f117261ppxfxbqfkf;
    }

    public final void wwaezpbzkn(wkgbmnqykc wkgbmnqykcVar) {
        this.f117254dxjokdxxww.remove(wkgbmnqykcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void yadqdtsiqt() {
        cllcsxoeiz(Long.MIN_VALUE);
        jrbgnlbqoe jrbgnlbqoeVar = this.f117258iobyxmoadg;
        if (jrbgnlbqoeVar instanceof ribwqtqdhb) {
            ((ribwqtqdhb) jrbgnlbqoeVar).wkgbmnqykc(jyumaefscl());
        }
        hcddaimhww(0L);
        this.f117258iobyxmoadg.eablkybsjg(false);
        SnapshotStateList snapshotStateList = this.f117252btonecajqb;
        int size = snapshotStateList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((skhdrjzrfn) snapshotStateList.get(i13)).yadqdtsiqt();
        }
    }

    public final long yggfygwlhe() {
        return this.f117259lqeggnwhkg.ppxfxbqfkf();
    }

    public final boolean ylkuphrtab(skhdrjzrfn skhdrjzrfnVar) {
        return this.f117252btonecajqb.remove(skhdrjzrfnVar);
    }

    public final zoijcleaow zdlpuopuiu() {
        return (zoijcleaow) this.f117255eablkybsjg.getValue();
    }

    public final void zynmafqrjb() {
        yadqdtsiqt();
        this.f117258iobyxmoadg.lqeggnwhkg();
    }

    public skhdrjzrfn(jrbgnlbqoe jrbgnlbqoeVar, String str) {
        this(jrbgnlbqoeVar, null, str);
    }

    public skhdrjzrfn(Object obj, String str) {
        this(new ribwqtqdhb(obj), null, str);
    }
}
