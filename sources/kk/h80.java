package kk;

import java.util.List;
import npi.spay.Nb;

/* JADX INFO: loaded from: classes3.dex */
public final class h80 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Nb f56849zdlpuopuiu;

    public h80(Nb nb3) {
        this.f56849zdlpuopuiu = nb3;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        List list = (List) obj;
        gp gpVar = this.f56849zdlpuopuiu.f70558cqumvgiudr;
        if (gpVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("helpersAdapter");
            gpVar = null;
        }
        gpVar.ppxfxbqfkf(list);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
