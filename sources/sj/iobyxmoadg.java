package sj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: sj.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2621iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f106898iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f106900yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f106901zdlpuopuiu;

        C2621iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f106900yggfygwlhe = obj;
            this.f106898iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.lqeggnwhkg
    public final Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        C2621iobyxmoadg c2621iobyxmoadg;
        Throwable th2;
        tj.yggfygwlhe yggfygwlheVar;
        if (gxszxtbevoVar instanceof C2621iobyxmoadg) {
            c2621iobyxmoadg = (C2621iobyxmoadg) gxszxtbevoVar;
            int i13 = c2621iobyxmoadg.f106898iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2621iobyxmoadg.f106898iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2621iobyxmoadg = new C2621iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2621iobyxmoadg = new C2621iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2621iobyxmoadg.f106900yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2621iobyxmoadg.f106898iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yggfygwlheVar = (tj.yggfygwlhe) c2621iobyxmoadg.f106901zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
                yggfygwlheVar.releaseIntercepted();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th3) {
                th2 = th3;
                yggfygwlheVar.releaseIntercepted();
                throw th2;
            }
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        tj.yggfygwlhe yggfygwlheVar2 = new tj.yggfygwlhe(nufgyqmvbuVar, c2621iobyxmoadg.getContext());
        try {
            c2621iobyxmoadg.f106901zdlpuopuiu = yggfygwlheVar2;
            c2621iobyxmoadg.f106898iwizpuwonk = 1;
            if (ppxfxbqfkf(yggfygwlheVar2, c2621iobyxmoadg) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            yggfygwlheVar = yggfygwlheVar2;
            yggfygwlheVar.releaseIntercepted();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th4) {
            th2 = th4;
            yggfygwlheVar = yggfygwlheVar2;
            yggfygwlheVar.releaseIntercepted();
            throw th2;
        }
    }

    public abstract Object ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar);
}
