package jztzpxfvev;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp implements rlfsiqarku {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private vipkmwdibw.pmvmpeiblj f53024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f53025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a.btonecajqb f53026zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f53027cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ xrmfcynszj f53028esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ float f53029iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53030jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f53031yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53032zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(float f13, wflxmlrfwp wflxmlrfwpVar, xrmfcynszj xrmfcynszjVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53029iwizpuwonk = f13;
            this.f53027cqumvgiudr = wflxmlrfwpVar;
            this.f53028esjtqupxsv = xrmfcynszjVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn kcexrzcfyt(kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, xrmfcynszj xrmfcynszjVar, kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar2, wflxmlrfwp wflxmlrfwpVar, vipkmwdibw.btonecajqb btonecajqbVar) {
            float fFloatValue = ((Number) btonecajqbVar.eablkybsjg()).floatValue() - pkzmftpjixVar.f60030zdlpuopuiu;
            float fWkgbmnqykc = xrmfcynszjVar.wkgbmnqykc(fFloatValue);
            pkzmftpjixVar.f60030zdlpuopuiu = ((Number) btonecajqbVar.eablkybsjg()).floatValue();
            pkzmftpjixVar2.f60030zdlpuopuiu = ((Number) btonecajqbVar.gxszxtbevo()).floatValue();
            if (Math.abs(fFloatValue - fWkgbmnqykc) > 0.5f) {
                btonecajqbVar.iobyxmoadg();
            }
            wflxmlrfwpVar.gxszxtbevo(wflxmlrfwpVar.eablkybsjg() + 1);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f53029iwizpuwonk, this.f53027cqumvgiudr, this.f53028esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            float f13;
            kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar;
            vipkmwdibw.wflxmlrfwp wflxmlrfwpVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53030jyumaefscl;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (Math.abs(this.f53029iwizpuwonk) > 1.0f) {
                    final kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar2 = new kotlin.jvm.internal.pkzmftpjix();
                    pkzmftpjixVar2.f60030zdlpuopuiu = this.f53029iwizpuwonk;
                    final kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar3 = new kotlin.jvm.internal.pkzmftpjix();
                    vipkmwdibw.wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = vipkmwdibw.agtfadlqog.ppxfxbqfkf(0.0f, this.f53029iwizpuwonk, 0L, 0L, false, 28, null);
                    try {
                        vipkmwdibw.pmvmpeiblj pmvmpeibljVar = this.f53027cqumvgiudr.f53024iobyxmoadg;
                        final xrmfcynszj xrmfcynszjVar = this.f53028esjtqupxsv;
                        final wflxmlrfwp wflxmlrfwpVar2 = this.f53027cqumvgiudr;
                        tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: jztzpxfvev.draadjrbmk
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return wflxmlrfwp.iobyxmoadg.kcexrzcfyt(pkzmftpjixVar3, xrmfcynszjVar, pkzmftpjixVar2, wflxmlrfwpVar2, (vipkmwdibw.btonecajqb) obj2);
                            }
                        };
                        this.f53032zdlpuopuiu = pkzmftpjixVar2;
                        this.f53031yggfygwlhe = wflxmlrfwpVarPpxfxbqfkf;
                        this.f53030jyumaefscl = 1;
                        if (vipkmwdibw.tbqsvytpvh.jyumaefscl(wflxmlrfwpVarPpxfxbqfkf, pmvmpeibljVar, false, draadjrbmkVar, this, 2, null) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        pkzmftpjixVar = pkzmftpjixVar2;
                        f13 = pkzmftpjixVar.f60030zdlpuopuiu;
                    } catch (CancellationException unused) {
                        pkzmftpjixVar = pkzmftpjixVar2;
                        wflxmlrfwpVar = wflxmlrfwpVarPpxfxbqfkf;
                        pkzmftpjixVar.f60030zdlpuopuiu = ((Number) wflxmlrfwpVar.agtfadlqog()).floatValue();
                    }
                } else {
                    f13 = this.f53029iwizpuwonk;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wflxmlrfwpVar = (vipkmwdibw.wflxmlrfwp) this.f53031yggfygwlhe;
                pkzmftpjixVar = (kotlin.jvm.internal.pkzmftpjix) this.f53032zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } catch (CancellationException unused2) {
                    pkzmftpjixVar.f60030zdlpuopuiu = ((Number) wflxmlrfwpVar.agtfadlqog()).floatValue();
                }
                f13 = pkzmftpjixVar.f60030zdlpuopuiu;
            }
            return kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(f13);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public wflxmlrfwp(vipkmwdibw.pmvmpeiblj pmvmpeibljVar, a.btonecajqb btonecajqbVar) {
        this.f53024iobyxmoadg = pmvmpeibljVar;
        this.f53026zoijcleaow = btonecajqbVar;
    }

    public final int eablkybsjg() {
        return this.f53025ppxfxbqfkf;
    }

    public final void gxszxtbevo(int i13) {
        this.f53025ppxfxbqfkf = i13;
    }

    @Override // jztzpxfvev.hkdspvbjdz
    public Object iobyxmoadg(xrmfcynszj xrmfcynszjVar, float f13, lg.gxszxtbevo gxszxtbevoVar) {
        this.f53025ppxfxbqfkf = 0;
        return pj.dxjokdxxww.lqeggnwhkg(this.f53026zoijcleaow, new iobyxmoadg(f13, this, xrmfcynszjVar, null), gxszxtbevoVar);
    }

    public void lqeggnwhkg(w0.wkgbmnqykc wkgbmnqykcVar) {
        this.f53024iobyxmoadg = ribwqtqdhb.zdlpuopuiu.ppxfxbqfkf(wkgbmnqykcVar);
    }

    public /* synthetic */ wflxmlrfwp(vipkmwdibw.pmvmpeiblj pmvmpeibljVar, a.btonecajqb btonecajqbVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(pmvmpeibljVar, (i13 & 2) != 0 ? androidx.compose.foundation.gestures.iobyxmoadg.lqeggnwhkg() : btonecajqbVar);
    }
}
