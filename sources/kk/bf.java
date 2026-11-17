package kk;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class bf implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.i2 f55980zdlpuopuiu;

    public bf(npi.spay.i2 i2Var) {
        this.f55980zdlpuopuiu = i2Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        npi.spay.i2 i2Var = this.f55980zdlpuopuiu;
        int i13 = npi.spay.i2.f70574iwizpuwonk;
        i2Var.getClass();
        metgxyhuhe metgxyhuheVar = new metgxyhuhe((List) obj);
        a6.iobyxmoadg iobyxmoadgVar = i2Var.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        RecyclerView recyclerView = ((j40) iobyxmoadgVar).f57144gxszxtbevo;
        recyclerView.setAdapter(metgxyhuheVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
