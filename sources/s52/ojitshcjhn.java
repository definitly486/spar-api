package s52;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import v1.metgxyhuhe;

/* JADX INFO: loaded from: classes6.dex */
public final class ojitshcjhn extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f105590ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f105591wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Drawable f105592iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f105593zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public ojitshcjhn(Drawable dividerDrawable) {
        zdlpuopuiu.btonecajqb(dividerDrawable, "dividerDrawable");
        this.f105592iobyxmoadg = dividerDrawable;
        this.f105593zoijcleaow = dividerDrawable.getIntrinsicHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(outRect, "outRect");
        zdlpuopuiu.btonecajqb(view, "view");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(state, "state");
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.nufgyqmvbu adapter2 = parent.getAdapter();
        int itemCount2 = adapter2 != null ? adapter2.getItemCount() - 1 : 0;
        int iYfnezrywwk = parent.yfnezrywwk(view);
        boolean z13 = iYfnezrywwk == itemCount2;
        boolean z14 = iYfnezrywwk == 0;
        int dimensionPixelSize = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_40);
        if (itemCount == 1) {
            outRect.top = 0;
            outRect.bottom = 0;
        } else if (z14) {
            outRect.top = 0;
            outRect.bottom = 0;
        } else if (z13) {
            outRect.top = dimensionPixelSize;
            outRect.bottom = 0;
        } else {
            outRect.top = dimensionPixelSize;
            outRect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void onDraw(Canvas c13, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        View view;
        int iYfnezrywwk;
        zdlpuopuiu.btonecajqb(c13, "c");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(state, "state");
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() - 1 : 0;
        int dimensionPixelSize = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_40) / 2;
        Iterator it = metgxyhuhe.iobyxmoadg(parent).iterator();
        while (it.hasNext() && (iYfnezrywwk = parent.yfnezrywwk((view = (View) it.next()))) != -1) {
            if (iYfnezrywwk != itemCount) {
                int left = view.getLeft();
                int bottom = view.getBottom() + dimensionPixelSize;
                this.f105592iobyxmoadg.setBounds(new Rect(left, bottom, view.getRight(), this.f105593zoijcleaow + bottom));
                this.f105592iobyxmoadg.draw(c13);
            }
        }
    }
}
