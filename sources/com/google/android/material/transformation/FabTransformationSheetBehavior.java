package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import da.iobyxmoadg;
import ea.gxszxtbevo;
import ea.nufgyqmvbu;
import java.util.HashMap;
import java.util.Map;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Map f23576zynmafqrjb;

    public FabTransformationSheetBehavior() {
    }

    private void xrmfcynszj(View view, boolean z13) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z13) {
                this.f23576zynmafqrjb = new HashMap(childCount);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                boolean z14 = (childAt.getLayoutParams() instanceof CoordinatorLayout.gxszxtbevo) && (((CoordinatorLayout.gxszxtbevo) childAt.getLayoutParams()).gxszxtbevo() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z14) {
                    if (z13) {
                        this.f23576zynmafqrjb.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        jhduphickx.uawqvzlxes(childAt, 4);
                    } else {
                        Map map = this.f23576zynmafqrjb;
                        if (map != null && map.containsKey(childAt)) {
                            jhduphickx.uawqvzlxes(childAt, ((Integer) this.f23576zynmafqrjb.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (z13) {
                return;
            }
            this.f23576zynmafqrjb = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean jpowsppfya(View view, View view2, boolean z13, boolean z14) {
        xrmfcynszj(view2, z13);
        return super.jpowsppfya(view, view2, z13, z14);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.zoijcleaow okpsazkaxt(Context context, boolean z13) {
        int i13 = z13 ? iobyxmoadg.mtrl_fab_transformation_sheet_expand_spec : iobyxmoadg.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.zoijcleaow zoijcleaowVar = new FabTransformationBehavior.zoijcleaow();
        zoijcleaowVar.f23569iobyxmoadg = gxszxtbevo.ppxfxbqfkf(context, i13);
        zoijcleaowVar.f23570zoijcleaow = new nufgyqmvbu(17, 0.0f, 0.0f);
        return zoijcleaowVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
