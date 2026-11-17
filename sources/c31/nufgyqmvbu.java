package c31;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager;
import tg.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public class nufgyqmvbu extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private kcexrzcfyt f18683dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f18684eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f18685gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18686iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f18687lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f18688nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f18689ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f18690wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f18691zoijcleaow;

    public /* synthetic */ nufgyqmvbu(int i13, int i14, int i15, int i16, int i17, int i18, boolean z13, boolean z14, int i19, gtknphoqwx gtknphoqwxVar) {
        this((i19 & 1) != 0 ? 0 : i13, (i19 & 2) != 0 ? 0 : i14, (i19 & 4) != 0 ? 0 : i15, (i19 & 8) != 0 ? 0 : i16, (i19 & 16) != 0 ? 0 : i17, (i19 & 32) != 0 ? 0 : i18, (i19 & 64) != 0 ? false : z13, (i19 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z14 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nufgyqmvbu(Rect rect, View view, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        zdlpuopuiu.btonecajqb(rect, "<unused var>");
        zdlpuopuiu.btonecajqb(view, "<unused var>");
        zdlpuopuiu.btonecajqb(recyclerView, "<unused var>");
        zdlpuopuiu.btonecajqb(zynmafqrjbVar, "<unused var>");
        return false;
    }

    public int agtfadlqog() {
        return this.f18689ppxfxbqfkf;
    }

    public boolean btonecajqb() {
        return this.f18688nufgyqmvbu;
    }

    public int draadjrbmk() {
        return this.f18690wkgbmnqykc;
    }

    public boolean dxjokdxxww() {
        return this.f18687lqeggnwhkg;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(outRect, "outRect");
        zdlpuopuiu.btonecajqb(view, "view");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(state, "state");
        int iYfnezrywwk = parent.yfnezrywwk(view);
        if (iYfnezrywwk == -1 || ((Boolean) this.f18683dxjokdxxww.invoke(outRect, view, parent, state, Integer.valueOf(iYfnezrywwk))).booleanValue() || lqeggnwhkg(parent.getAdapter(), iYfnezrywwk)) {
            return;
        }
        boolean z13 = parent.getLayoutManager() instanceof InfiniteLayoutManager;
        RecyclerView.rgvfuqvkyq layoutManager = parent.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        boolean z14 = false;
        if (linearLayoutManager != null && linearLayoutManager.G0() == 0) {
            z14 = true;
        }
        RecyclerView.rgvfuqvkyq layoutManager2 = parent.getLayoutManager();
        LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
        if (linearLayoutManager2 != null) {
            linearLayoutManager2.G0();
        }
        if (iYfnezrywwk == 0) {
            outRect.top += ojitshcjhn();
        }
        if (iYfnezrywwk > 0) {
            outRect.top += rgvfuqvkyq();
        }
        if (iYfnezrywwk == state.zoijcleaow() - 1) {
            outRect.bottom += gtknphoqwx();
        }
        if (iYfnezrywwk < state.zoijcleaow() - 1) {
            outRect.bottom += draadjrbmk();
        }
        if (z13 || z14) {
            if (iYfnezrywwk > 0 || dxjokdxxww() || z13) {
                outRect.left += wflxmlrfwp();
            }
            if (iYfnezrywwk < state.zoijcleaow() - 1 || btonecajqb() || z13) {
                outRect.right += agtfadlqog();
                return;
            }
            return;
        }
        if (iYfnezrywwk == 0 && dxjokdxxww()) {
            outRect.left += wflxmlrfwp();
            outRect.right += agtfadlqog();
        } else if (iYfnezrywwk > 0 && iYfnezrywwk < state.zoijcleaow() - 1) {
            outRect.left += wflxmlrfwp();
            outRect.right += agtfadlqog();
        } else if (iYfnezrywwk == state.zoijcleaow() - 1 && btonecajqb()) {
            outRect.left += wflxmlrfwp();
            outRect.right += agtfadlqog();
        }
    }

    public int gtknphoqwx() {
        return this.f18685gxszxtbevo;
    }

    protected boolean lqeggnwhkg(RecyclerView.nufgyqmvbu nufgyqmvbuVar, int i13) {
        List listPpxfxbqfkf;
        Object objLrnfpwlwnk;
        df.wkgbmnqykc wkgbmnqykcVar = nufgyqmvbuVar instanceof df.wkgbmnqykc ? (df.wkgbmnqykc) nufgyqmvbuVar : null;
        if (wkgbmnqykcVar == null || (listPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf()) == null || (objLrnfpwlwnk = jyumaefscl.lrnfpwlwnk(listPpxfxbqfkf, i13)) == null) {
            return false;
        }
        return objLrnfpwlwnk instanceof wkgbmnqykc;
    }

    public int ojitshcjhn() {
        return this.f18684eablkybsjg;
    }

    public int rgvfuqvkyq() {
        return this.f18691zoijcleaow;
    }

    public final void vdvldrhtss(kcexrzcfyt kcexrzcfytVar) {
        zdlpuopuiu.btonecajqb(kcexrzcfytVar, "<set-?>");
        this.f18683dxjokdxxww = kcexrzcfytVar;
    }

    public int wflxmlrfwp() {
        return this.f18686iobyxmoadg;
    }

    public nufgyqmvbu(int i13, int i14, int i15, int i16, int i17, int i18, boolean z13, boolean z14) {
        this.f18686iobyxmoadg = i13;
        this.f18691zoijcleaow = i14;
        this.f18689ppxfxbqfkf = i15;
        this.f18690wkgbmnqykc = i16;
        this.f18684eablkybsjg = i17;
        this.f18685gxszxtbevo = i18;
        this.f18687lqeggnwhkg = z13;
        this.f18688nufgyqmvbu = z14;
        this.f18683dxjokdxxww = new kcexrzcfyt() { // from class: c31.lqeggnwhkg
            @Override // tg.kcexrzcfyt
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(nufgyqmvbu.nufgyqmvbu((Rect) obj, (View) obj2, (RecyclerView) obj3, (RecyclerView.zynmafqrjb) obj4, ((Integer) obj5).intValue()));
            }
        };
    }
}
