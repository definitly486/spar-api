package kk;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.SPaySdkApp;

/* JADX INFO: loaded from: classes3.dex */
public final class dn extends ba0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final n6 f56306zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(n6 helpersItemClickActionListener) {
        super(yk.f59461zdlpuopuiu);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helpersItemClickActionListener, "helpersItemClickActionListener");
        this.f56306zoijcleaow = helpersItemClickActionListener;
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        x0 x0Var = (x0) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(x0Var, "<this>");
        return Integer.valueOf(x0Var.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof x0;
    }

    @Override // kk.ba0
    public final void zoijcleaow(a6.iobyxmoadg iobyxmoadgVar, Object obj) {
        q2 q2Var = (q2) iobyxmoadgVar;
        x0 item = (x0) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(q2Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        bq sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            df dfVarIobyxmoadg = ((tk) sdkComponent).iobyxmoadg();
            String str = item.f59228wkgbmnqykc;
            AppCompatImageView targetView = q2Var.f58146zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetView, "spaySrihAcivHelperIcon");
            ae imageRequestBuilder = ae.f55810zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetView, "targetView");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            e7.nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new e7.nufgyqmvbu.iobyxmoadg(dfVarIobyxmoadg.f56266iobyxmoadg).zoijcleaow(str).btonecajqb(targetView);
            imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
            dfVarIobyxmoadg.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
        }
        q2Var.f58145wkgbmnqykc.setText(item.f59226iobyxmoadg);
        q2Var.f58144ppxfxbqfkf.setText(item.f59229zoijcleaow);
        ConstraintLayout spaySrihClRoot = q2Var.f58142eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySrihClRoot, "spaySrihClRoot");
        spaySrihClRoot.setOnClickListener(new bm(new kotlin.jvm.internal.jpowsppfya(), this, item));
    }
}
