package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class m6 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f57595zdlpuopuiu;

    public m6(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f57595zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        j5 j5Var;
        if (gxszxtbevoVar instanceof j5) {
            j5Var = (j5) gxszxtbevoVar;
            int i13 = j5Var.f57152yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                j5Var.f57152yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                j5Var = new j5(this, gxszxtbevoVar);
            }
        } else {
            j5Var = new j5(this, gxszxtbevoVar);
        }
        Object obj2 = j5Var.f57153zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = j5Var.f57152yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f57595zdlpuopuiu;
            if (((ln) obj).f57485iobyxmoadg instanceof a40) {
                j5Var.f57152yggfygwlhe = 1;
                if (nufgyqmvbuVar.emit(obj, j5Var) == objGxszxtbevo) {
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
