package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class k70 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f57272zdlpuopuiu;

    public k70(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f57272zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        h60 h60Var;
        if (gxszxtbevoVar instanceof h60) {
            h60Var = (h60) gxszxtbevoVar;
            int i13 = h60Var.f56836yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                h60Var.f56836yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                h60Var = new h60(this, gxszxtbevoVar);
            }
        } else {
            h60Var = new h60(this, gxszxtbevoVar);
        }
        Object obj2 = h60Var.f56837zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = h60Var.f56836yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f57272zdlpuopuiu;
            if (obj instanceof q5) {
                h60Var.f56836yggfygwlhe = 1;
                if (nufgyqmvbuVar.emit(obj, h60Var) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
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
