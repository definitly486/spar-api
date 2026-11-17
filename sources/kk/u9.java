package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class u9 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f58798zdlpuopuiu;

    public u9(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f58798zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        r8 r8Var;
        if (gxszxtbevoVar instanceof r8) {
            r8Var = (r8) gxszxtbevoVar;
            int i13 = r8Var.f58281yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                r8Var.f58281yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                r8Var = new r8(this, gxszxtbevoVar);
            }
        } else {
            r8Var = new r8(this, gxszxtbevoVar);
        }
        Object obj2 = r8Var.f58282zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = r8Var.f58281yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f58798zdlpuopuiu;
            hl hlVar = ((ln) obj).f57485iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.Loading");
            r8Var.f58281yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit((a40) hlVar, r8Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
