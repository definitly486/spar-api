package kk;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class cw implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f56194zdlpuopuiu;

    public cw(npi.spay.x1 x1Var) {
        this.f56194zdlpuopuiu = x1Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        npi.spay.x1 x1Var = this.f56194zdlpuopuiu;
        int i13 = npi.spay.x1.f70592iwizpuwonk;
        x1Var.getClass();
        metgxyhuhe metgxyhuheVar = new metgxyhuhe((List) obj);
        a6.iobyxmoadg iobyxmoadgVar = x1Var.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        RecyclerView recyclerView = ((y10) iobyxmoadgVar).f59364dxjokdxxww;
        recyclerView.setAdapter(metgxyhuheVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
