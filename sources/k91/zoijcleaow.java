package k91;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.dxjokdxxww;
import b31.gxszxtbevo;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(RecyclerView recyclerView) {
        zdlpuopuiu.btonecajqb(recyclerView, "<this>");
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(recyclerView.getContext(), 1);
        Drawable drawable = androidx.core.content.iobyxmoadg.getDrawable(recyclerView.getContext(), gxszxtbevo.shape_item_divider);
        if (drawable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dxjokdxxwwVar.nufgyqmvbu(drawable);
        recyclerView.btonecajqb(dxjokdxxwwVar);
    }
}
