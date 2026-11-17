package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class va0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f58981zdlpuopuiu;

    public va0(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f58981zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        r90 r90Var;
        if (gxszxtbevoVar instanceof r90) {
            r90Var = (r90) gxszxtbevoVar;
            int i13 = r90Var.f58290yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                r90Var.f58290yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                r90Var = new r90(this, gxszxtbevoVar);
            }
        } else {
            r90Var = new r90(this, gxszxtbevoVar);
        }
        Object obj2 = r90Var.f58291zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = r90Var.f58290yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f58981zdlpuopuiu;
            hl hlVar = ((ln) obj).f57485iobyxmoadg;
            r90Var.f58290yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(hlVar, r90Var) == objGxszxtbevo) {
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
