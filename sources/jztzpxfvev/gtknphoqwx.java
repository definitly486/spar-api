package jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx implements jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f52671iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iozdgvuglv f52673zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ikoacuggdj.vipkmwdibw f52672ppxfxbqfkf = new ikoacuggdj.vipkmwdibw();

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f52674iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ikoacuggdj.ribwqtqdhb f52675jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52677zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52675jyumaefscl = ribwqtqdhbVar;
            this.f52674iwizpuwonk = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return gtknphoqwx.this.new iobyxmoadg(this.f52675jyumaefscl, this.f52674iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52677zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ikoacuggdj.vipkmwdibw vipkmwdibwVar = gtknphoqwx.this.f52672ppxfxbqfkf;
                iozdgvuglv iozdgvuglvVar = gtknphoqwx.this.f52673zoijcleaow;
                ikoacuggdj.ribwqtqdhb ribwqtqdhbVar = this.f52675jyumaefscl;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f52674iwizpuwonk;
                this.f52677zdlpuopuiu = 1;
                if (vipkmwdibwVar.gxszxtbevo(iozdgvuglvVar, ribwqtqdhbVar, rgvfuqvkyqVar, this) == objGxszxtbevo) {
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

    public static final class zoijcleaow implements iozdgvuglv {
        zoijcleaow() {
        }

        @Override // jztzpxfvev.iozdgvuglv
        public void iobyxmoadg(float f13) {
            gtknphoqwx.this.eablkybsjg().invoke(Float.valueOf(f13));
        }
    }

    public gtknphoqwx(tg.draadjrbmk draadjrbmkVar) {
        this.f52671iobyxmoadg = draadjrbmkVar;
    }

    public final tg.draadjrbmk eablkybsjg() {
        return this.f52671iobyxmoadg;
    }

    @Override // jztzpxfvev.jpowsppfya
    public Object zoijcleaow(ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = pj.dsvhmnatus.gxszxtbevo(new iobyxmoadg(ribwqtqdhbVar, rgvfuqvkyqVar, null), gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
