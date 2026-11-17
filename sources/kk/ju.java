package kk;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import npi.spay.Nf;

/* JADX INFO: loaded from: classes3.dex */
public final class ju implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Nf f57223yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ u00 f57224zdlpuopuiu;

    public ju(Nf nf2, u00 u00Var) {
        this.f57224zdlpuopuiu = u00Var;
        this.f57223yggfygwlhe = nf2;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        Set set = (Set) obj;
        RecyclerView observeViewModel$lambda$28$lambda$25$lambda$24 = this.f57224zdlpuopuiu.f58740dxjokdxxww;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(observeViewModel$lambda$28$lambda$25$lambda$24, "observeViewModel$lambda$28$lambda$25$lambda$24");
        observeViewModel$lambda$28$lambda$25$lambda$24.setVisibility(set.isEmpty() ? 4 : 0);
        d0 d0Var = this.f57223yggfygwlhe.f70561cqumvgiudr;
        if (d0Var == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("hintsAdapter");
            d0Var = null;
        }
        d0Var.eablkybsjg(hg.jyumaefscl.p(set));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
