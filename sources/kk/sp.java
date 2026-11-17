package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sp implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ sj.nufgyqmvbu f58571zdlpuopuiu;

    public sp(sj.nufgyqmvbu nufgyqmvbuVar) {
        this.f58571zdlpuopuiu = nufgyqmvbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        oo ooVar;
        if (gxszxtbevoVar instanceof oo) {
            ooVar = (oo) gxszxtbevoVar;
            int i13 = ooVar.f57984yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ooVar.f57984yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                ooVar = new oo(this, gxszxtbevoVar);
            }
        } else {
            ooVar = new oo(this, gxszxtbevoVar);
        }
        Object obj2 = ooVar.f57985zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ooVar.f57984yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj2);
            sj.nufgyqmvbu nufgyqmvbuVar = this.f58571zdlpuopuiu;
            if (!((List) obj).isEmpty()) {
                ooVar.f57984yggfygwlhe = 1;
                if (nufgyqmvbuVar.emit(obj, ooVar) == objGxszxtbevo) {
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
