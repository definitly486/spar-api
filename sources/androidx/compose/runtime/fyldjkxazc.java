package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class fyldjkxazc implements opjhrmiecq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ydmasvzmpa f5616yggfygwlhe = new ydmasvzmpa();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final opjhrmiecq f5617zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f5618iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f5620yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f5621zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f5620yggfygwlhe = obj;
            this.f5618iwizpuwonk |= Integer.MIN_VALUE;
            return fyldjkxazc.this.mbcevpiqjq(null, this);
        }
    }

    public fyldjkxazc(opjhrmiecq opjhrmiecqVar) {
        this.f5617zdlpuopuiu = opjhrmiecqVar;
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return opjhrmiecq.iobyxmoadg.iobyxmoadg(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return opjhrmiecq.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.opjhrmiecq
    public Object mbcevpiqjq(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f5618iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f5618iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objMbcevpiqjq = iobyxmoadgVar.f5620yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f5618iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                draadjrbmkVar = (tg.draadjrbmk) iobyxmoadgVar.f5621zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objMbcevpiqjq);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objMbcevpiqjq);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objMbcevpiqjq);
        ydmasvzmpa ydmasvzmpaVar = this.f5616yggfygwlhe;
        iobyxmoadgVar.f5621zdlpuopuiu = draadjrbmkVar;
        iobyxmoadgVar.f5618iwizpuwonk = 1;
        if (ydmasvzmpaVar.ppxfxbqfkf(iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        opjhrmiecq opjhrmiecqVar = this.f5617zdlpuopuiu;
        iobyxmoadgVar.f5621zdlpuopuiu = null;
        iobyxmoadgVar.f5618iwizpuwonk = 2;
        objMbcevpiqjq = opjhrmiecqVar.mbcevpiqjq(draadjrbmkVar, iobyxmoadgVar);
        return objMbcevpiqjq == objGxszxtbevo ? objGxszxtbevo : objMbcevpiqjq;
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return opjhrmiecq.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb plus(lg.btonecajqb btonecajqbVar) {
        return opjhrmiecq.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }

    public final void ppxfxbqfkf() {
        this.f5616yggfygwlhe.gxszxtbevo();
    }

    public final void zoijcleaow() {
        this.f5616yggfygwlhe.wkgbmnqykc();
    }
}
