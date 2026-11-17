package igdgnonuha;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
final class vipkmwdibw implements iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f44009eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f44010iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f44011ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f44012wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f44013zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList f44014jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.btonecajqb f44015yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44016zdlpuopuiu;

        /* JADX INFO: renamed from: igdgnonuha.vipkmwdibw$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1026iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList f44017zdlpuopuiu;

            C1026iobyxmoadg(SnapshotStateList snapshotStateList) {
                this.f44017zdlpuopuiu = snapshotStateList;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(metgxyhuhe.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (dxjokdxxwwVar instanceof metgxyhuhe.lqeggnwhkg) {
                    this.f44017zdlpuopuiu.add(dxjokdxxwwVar);
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.nufgyqmvbu) {
                    this.f44017zdlpuopuiu.remove(((metgxyhuhe.nufgyqmvbu) dxjokdxxwwVar).iobyxmoadg());
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.wkgbmnqykc) {
                    this.f44017zdlpuopuiu.add(dxjokdxxwwVar);
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.eablkybsjg) {
                    this.f44017zdlpuopuiu.remove(((metgxyhuhe.eablkybsjg) dxjokdxxwwVar).iobyxmoadg());
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.zoijcleaow) {
                    this.f44017zdlpuopuiu.add(dxjokdxxwwVar);
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.ppxfxbqfkf) {
                    this.f44017zdlpuopuiu.remove(((metgxyhuhe.agtfadlqog.ppxfxbqfkf) dxjokdxxwwVar).iobyxmoadg());
                } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.iobyxmoadg) {
                    this.f44017zdlpuopuiu.remove(((metgxyhuhe.agtfadlqog.iobyxmoadg) dxjokdxxwwVar).iobyxmoadg());
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(metgxyhuhe.btonecajqb btonecajqbVar, SnapshotStateList snapshotStateList, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44015yggfygwlhe = btonecajqbVar;
            this.f44014jyumaefscl = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f44015yggfygwlhe, this.f44014jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44016zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = this.f44015yggfygwlhe.ppxfxbqfkf();
                C1026iobyxmoadg c1026iobyxmoadg = new C1026iobyxmoadg(this.f44014jyumaefscl);
                this.f44016zdlpuopuiu = 1;
                if (lqeggnwhkgVarPpxfxbqfkf.collect(c1026iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw f44018cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.dxjokdxxww f44019esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ boolean f44020iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ float f44021jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.zoijcleaow f44022yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44023zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(vipkmwdibw.zoijcleaow zoijcleaowVar, float f13, boolean z13, vipkmwdibw vipkmwdibwVar, metgxyhuhe.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44022yggfygwlhe = zoijcleaowVar;
            this.f44021jyumaefscl = f13;
            this.f44020iwizpuwonk = z13;
            this.f44018cqumvgiudr = vipkmwdibwVar;
            this.f44019esjtqupxsv = dxjokdxxwwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f44022yggfygwlhe, this.f44021jyumaefscl, this.f44020iwizpuwonk, this.f44018cqumvgiudr, this.f44019esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44023zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!w0.nufgyqmvbu.dxjokdxxww(((w0.nufgyqmvbu) this.f44022yggfygwlhe.gtknphoqwx()).draadjrbmk(), this.f44021jyumaefscl)) {
                    if (this.f44020iwizpuwonk) {
                        float fDraadjrbmk = ((w0.nufgyqmvbu) this.f44022yggfygwlhe.gtknphoqwx()).draadjrbmk();
                        metgxyhuhe.dxjokdxxww wkgbmnqykcVar = null;
                        if (w0.nufgyqmvbu.dxjokdxxww(fDraadjrbmk, this.f44018cqumvgiudr.f44013zoijcleaow)) {
                            wkgbmnqykcVar = new metgxyhuhe.agtfadlqog.zoijcleaow(g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf(), null);
                        } else if (w0.nufgyqmvbu.dxjokdxxww(fDraadjrbmk, this.f44018cqumvgiudr.f44012wkgbmnqykc)) {
                            wkgbmnqykcVar = new metgxyhuhe.lqeggnwhkg();
                        } else if (w0.nufgyqmvbu.dxjokdxxww(fDraadjrbmk, this.f44018cqumvgiudr.f44009eablkybsjg)) {
                            wkgbmnqykcVar = new metgxyhuhe.wkgbmnqykc();
                        }
                        vipkmwdibw.zoijcleaow zoijcleaowVar = this.f44022yggfygwlhe;
                        float f13 = this.f44021jyumaefscl;
                        metgxyhuhe.dxjokdxxww dxjokdxxwwVar = this.f44019esjtqupxsv;
                        this.f44023zdlpuopuiu = 2;
                        if (eslsurpljm.wkgbmnqykc(zoijcleaowVar, f13, wkgbmnqykcVar, dxjokdxxwwVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        vipkmwdibw.zoijcleaow zoijcleaowVar2 = this.f44022yggfygwlhe;
                        w0.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = w0.nufgyqmvbu.wkgbmnqykc(this.f44021jyumaefscl);
                        this.f44023zdlpuopuiu = 1;
                        if (zoijcleaowVar2.zdlpuopuiu(nufgyqmvbuVarWkgbmnqykc, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ vipkmwdibw(float f13, float f14, float f15, float f16, float f17, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, f15, f16, f17);
    }

    @Override // igdgnonuha.iwizpuwonk
    public androidx.compose.runtime.i1 iobyxmoadg(boolean z13, metgxyhuhe.btonecajqb btonecajqbVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        float f13;
        draadjrbmkVar.sopmlzcsov(-1588756907);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1588756907, i13, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:500)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = androidx.compose.runtime.v0.gxszxtbevo();
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objYadqdtsiqt;
        boolean z14 = true;
        boolean z15 = (((i13 & 112) ^ 48) > 32 && draadjrbmkVar.ulzqkzuiru(btonecajqbVar)) || (i13 & 48) == 32;
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (z15 || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new iobyxmoadg(btonecajqbVar, snapshotStateList, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        androidx.compose.runtime.jlmebxxoox.eablkybsjg(btonecajqbVar, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, (i13 >> 3) & 14);
        metgxyhuhe.dxjokdxxww dxjokdxxwwVar = (metgxyhuhe.dxjokdxxww) hg.jyumaefscl.lxfrhoxuzk(snapshotStateList);
        if (!z13) {
            f13 = this.f44011ppxfxbqfkf;
        } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.zoijcleaow) {
            f13 = this.f44013zoijcleaow;
        } else if (dxjokdxxwwVar instanceof metgxyhuhe.lqeggnwhkg) {
            f13 = this.f44012wkgbmnqykc;
        } else {
            f13 = dxjokdxxwwVar instanceof metgxyhuhe.wkgbmnqykc ? this.f44009eablkybsjg : this.f44010iobyxmoadg;
        }
        float f14 = f13;
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt3 = new vipkmwdibw.zoijcleaow(w0.nufgyqmvbu.wkgbmnqykc(f14), vipkmwdibw.p.stevsuqkhv(w0.nufgyqmvbu.f118267yggfygwlhe), null, null, 12, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
        }
        vipkmwdibw.zoijcleaow zoijcleaowVar = (vipkmwdibw.zoijcleaow) objYadqdtsiqt3;
        w0.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = w0.nufgyqmvbu.wkgbmnqykc(f14);
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(zoijcleaowVar) | draadjrbmkVar.zoijcleaow(f14) | ((((i13 & 14) ^ 6) > 4 && draadjrbmkVar.iobyxmoadg(z13)) || (i13 & 6) == 4);
        if ((((i13 & 896) ^ 384) <= 256 || !draadjrbmkVar.ulzqkzuiru(this)) && (i13 & 384) != 256) {
            z14 = false;
        }
        boolean zLmojexxdyd2 = zLmojexxdyd | z14 | draadjrbmkVar.lmojexxdyd(dxjokdxxwwVar);
        Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd2 || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
            Object zoijcleaowVar2 = new zoijcleaow(zoijcleaowVar, f14, z13, this, dxjokdxxwwVar, null);
            draadjrbmkVar.jyumaefscl(zoijcleaowVar2);
            objYadqdtsiqt4 = zoijcleaowVar2;
        }
        androidx.compose.runtime.jlmebxxoox.eablkybsjg(nufgyqmvbuVarWkgbmnqykc, (tg.rgvfuqvkyq) objYadqdtsiqt4, draadjrbmkVar, 0);
        androidx.compose.runtime.i1 i1VarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return i1VarLqeggnwhkg;
    }

    private vipkmwdibw(float f13, float f14, float f15, float f16, float f17) {
        this.f44010iobyxmoadg = f13;
        this.f44013zoijcleaow = f14;
        this.f44011ppxfxbqfkf = f15;
        this.f44012wkgbmnqykc = f16;
        this.f44009eablkybsjg = f17;
    }
}
