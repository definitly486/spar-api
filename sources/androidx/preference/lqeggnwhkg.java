package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.iwizpuwonk;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends iwizpuwonk {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final RecyclerView f12506gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final v1.iobyxmoadg f12507lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    final v1.iobyxmoadg f12508nufgyqmvbu;

    class iobyxmoadg extends v1.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // v1.iobyxmoadg
        public boolean btonecajqb(View view, int i13, Bundle bundle) {
            return lqeggnwhkg.this.f12507lqeggnwhkg.btonecajqb(view, i13, bundle);
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            Preference preferenceGxszxtbevo;
            lqeggnwhkg.this.f12507lqeggnwhkg.lqeggnwhkg(view, zdlpuopuiuVar);
            int iYfnezrywwk = lqeggnwhkg.this.f12506gxszxtbevo.yfnezrywwk(view);
            RecyclerView.nufgyqmvbu adapter = lqeggnwhkg.this.f12506gxszxtbevo.getAdapter();
            if ((adapter instanceof wkgbmnqykc) && (preferenceGxszxtbevo = ((wkgbmnqykc) adapter).gxszxtbevo(iYfnezrywwk)) != null) {
                preferenceGxszxtbevo.wypolnanlu(zdlpuopuiuVar);
            }
        }
    }

    public lqeggnwhkg(RecyclerView recyclerView) {
        super(recyclerView);
        this.f12507lqeggnwhkg = super.agtfadlqog();
        this.f12508nufgyqmvbu = new iobyxmoadg();
        this.f12506gxszxtbevo = recyclerView;
    }

    @Override // androidx.recyclerview.widget.iwizpuwonk
    public v1.iobyxmoadg agtfadlqog() {
        return this.f12508nufgyqmvbu;
    }
}
