package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class yb0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f59414zdlpuopuiu;

    public yb0(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f59414zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        ta0 ta0Var;
        if (gxszxtbevoVar instanceof ta0) {
            ta0Var = (ta0) gxszxtbevoVar;
            int i13 = ta0Var.f58641yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ta0Var.f58641yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                ta0Var = new ta0(this, gxszxtbevoVar);
            }
        } else {
            ta0Var = new ta0(this, gxszxtbevoVar);
        }
        Object obj2 = ta0Var.f58642zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ta0Var.f58641yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f59414zdlpuopuiu;
            Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((po) obj) == po.SEVERAL_CARDS);
            ta0Var.f58641yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(boolIobyxmoadg, ta0Var) == objGxszxtbevo) {
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
