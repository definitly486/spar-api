package ru.myspar.scango.impl.screens.cart.presentation.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k22.wflxmlrfwp;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import zg.btonecajqb;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0018\u00010\u0013R\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", "onLayoutChildren", "<init>", "(Landroid/content/Context;Ltg/iobyxmoadg;)V", "Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager$iobyxmoadg;", "k1", "()Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager$iobyxmoadg;", "g1", "Lzg/btonecajqb;", "range", "", "expectedVisibility", "h1", "(Lzg/btonecajqb;Z)Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager$iobyxmoadg;", "Landroidx/recyclerview/widget/RecyclerView$iwizpuwonk;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "state", "p", "(Landroidx/recyclerview/widget/RecyclerView$iwizpuwonk;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "j1", "jhduphickx", "Ltg/iobyxmoadg;", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoCartContentLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name and from kotlin metadata */
    private final tg.iobyxmoadg onLayoutChildren;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanGoCartContentLayoutManager(Context context, tg.iobyxmoadg iobyxmoadgVar) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.onLayoutChildren = iobyxmoadgVar;
    }

    private final iobyxmoadg g1() {
        return i1(this, new btonecajqb(0, vipkmwdibw()), false, 2, null);
    }

    private final iobyxmoadg h1(btonecajqb range, boolean expectedVisibility) {
        int iWkgbmnqykc = range.wkgbmnqykc();
        int iEablkybsjg = range.eablkybsjg();
        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = null;
        if (iWkgbmnqykc > iEablkybsjg) {
            iWkgbmnqykc = -1;
            break;
        }
        while (true) {
            View viewMbcevpiqjq = mbcevpiqjq(iWkgbmnqykc);
            if (!zdlpuopuiu.eablkybsjg(viewMbcevpiqjq != null ? viewMbcevpiqjq.getTag() : null, u22.iobyxmoadg.f112529iobyxmoadg)) {
                if (iWkgbmnqykc == iEablkybsjg) {
                    iWkgbmnqykc = -1;
                    break;
                }
                iWkgbmnqykc++;
            } else {
                wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(viewMbcevpiqjq);
                break;
            }
        }
        return new iobyxmoadg(iWkgbmnqykc, wflxmlrfwpVarIobyxmoadg, expectedVisibility);
    }

    static /* synthetic */ iobyxmoadg i1(ScanGoCartContentLayoutManager scanGoCartContentLayoutManager, btonecajqb btonecajqbVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return scanGoCartContentLayoutManager.h1(btonecajqbVar, z13);
    }

    private final iobyxmoadg k1() {
        return h1(new btonecajqb(o0(), v0()), true);
    }

    public final iobyxmoadg j1() {
        iobyxmoadg iobyxmoadgVarK1 = k1();
        iobyxmoadg iobyxmoadgVarG1 = g1();
        if (iobyxmoadgVarK1.zoijcleaow()) {
            return iobyxmoadgVarK1;
        }
        if (iobyxmoadgVarG1.zoijcleaow()) {
            return iobyxmoadgVarG1;
        }
        return new iobyxmoadg(0, null, false, 7, null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void p(RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state) {
        tg.iobyxmoadg iobyxmoadgVar;
        super.p(recycler, state);
        if (state != null) {
            state.zoijcleaow();
            if (state.zoijcleaow() <= 0 || (iobyxmoadgVar = this.onLayoutChildren) == null) {
                return;
            }
            iobyxmoadgVar.invoke();
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f103384iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f103385ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f103386wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wflxmlrfwp f103387zoijcleaow;

        public iobyxmoadg(int i13, wflxmlrfwp wflxmlrfwpVar, boolean z13) {
            this.f103384iobyxmoadg = i13;
            this.f103387zoijcleaow = wflxmlrfwpVar;
            this.f103385ppxfxbqfkf = z13;
            this.f103386wkgbmnqykc = (wflxmlrfwpVar == null || i13 == -1) ? false : true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f103384iobyxmoadg == iobyxmoadgVar.f103384iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f103387zoijcleaow, iobyxmoadgVar.f103387zoijcleaow) && this.f103385ppxfxbqfkf == iobyxmoadgVar.f103385ppxfxbqfkf;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f103384iobyxmoadg) * 31;
            wflxmlrfwp wflxmlrfwpVar = this.f103387zoijcleaow;
            return ((iHashCode + (wflxmlrfwpVar == null ? 0 : wflxmlrfwpVar.hashCode())) * 31) + Boolean.hashCode(this.f103385ppxfxbqfkf);
        }

        public final wflxmlrfwp iobyxmoadg() {
            return this.f103387zoijcleaow;
        }

        public String toString() {
            return "ProductHolderModel(position=" + this.f103384iobyxmoadg + ", productBinding=" + this.f103387zoijcleaow + ", isVisible=" + this.f103385ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f103386wkgbmnqykc;
        }

        public /* synthetic */ iobyxmoadg(int i13, wflxmlrfwp wflxmlrfwpVar, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
            this((i14 & 1) != 0 ? -1 : i13, (i14 & 2) != 0 ? null : wflxmlrfwpVar, (i14 & 4) != 0 ? false : z13);
        }
    }
}
