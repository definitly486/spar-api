package kk;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import npi.spay.Ln;
import npi.spay.Nb;

/* JADX INFO: loaded from: classes3.dex */
public final class tb0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Nb f58644zdlpuopuiu;

    public tb0(Nb nb3) {
        this.f58644zdlpuopuiu = nb3;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        List list = (List) obj;
        Nb nb3 = this.f58644zdlpuopuiu;
        int i13 = Nb.f70557esjtqupxsv;
        a6.iobyxmoadg iobyxmoadgVar = nb3.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        RecyclerView recyclerView = ((ls) iobyxmoadgVar).f57528gxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(recyclerView, "binding.spaySlhRvHintHelper");
        recyclerView.setVisibility(list.isEmpty() ? 4 : 0);
        d0 d0Var = this.f58644zdlpuopuiu.f70559iwizpuwonk;
        if (d0Var == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("hintsAdapter");
            d0Var = null;
        }
        d0Var.eablkybsjg(list);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
