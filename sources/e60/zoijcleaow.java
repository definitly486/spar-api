package e60;

import android.view.View;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;
import androidx.lifecycle.vipkmwdibw;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ RecyclerView f30601zdlpuopuiu;

        iobyxmoadg(RecyclerView recyclerView) {
            this.f30601zdlpuopuiu = recyclerView;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f30601zdlpuopuiu.setAdapter(null);
            super.onDestroy(owner);
        }
    }

    public static final void iobyxmoadg(RecyclerView recyclerView, List data) {
        zdlpuopuiu.btonecajqb(recyclerView, "<this>");
        zdlpuopuiu.btonecajqb(data, "data");
        zoijcleaow(recyclerView, data.size() > 7);
    }

    public static final void ppxfxbqfkf(RecyclerView recyclerView, RecyclerView.nufgyqmvbu adapter, a6.iobyxmoadg binding) {
        gtknphoqwx lifecycle;
        zdlpuopuiu.btonecajqb(recyclerView, "<this>");
        zdlpuopuiu.btonecajqb(adapter, "adapter");
        zdlpuopuiu.btonecajqb(binding, "binding");
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(adapter);
        }
        View root = binding.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        vdvldrhtss vdvldrhtssVarIobyxmoadg = vipkmwdibw.iobyxmoadg(root);
        if (vdvldrhtssVarIobyxmoadg == null || (lifecycle = vdvldrhtssVarIobyxmoadg.getLifecycle()) == null) {
            return;
        }
        lifecycle.iobyxmoadg(new iobyxmoadg(recyclerView));
    }

    public static final void zoijcleaow(RecyclerView recyclerView, boolean z13) {
        zdlpuopuiu.btonecajqb(recyclerView, "<this>");
        if (z13 && !(recyclerView.getLayoutManager() instanceof InfiniteLayoutManager)) {
            recyclerView.setLayoutManager(new InfiniteLayoutManager(0, false));
        } else {
            if (z13 || (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                return;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        }
    }
}
