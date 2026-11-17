package kk;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.SPaySdkApp;

/* JADX INFO: loaded from: classes3.dex */
public final class tq extends ba0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final k5 f58714zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(k5 helpersItemClickActionListener) {
        super(lo.f57488zdlpuopuiu);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helpersItemClickActionListener, "helpersItemClickActionListener");
        this.f58714zoijcleaow = helpersItemClickActionListener;
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        gn gnVar = (gn) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gnVar, "<this>");
        return Integer.valueOf(gnVar.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof gn;
    }

    @Override // kk.ba0
    public final void zoijcleaow(a6.iobyxmoadg iobyxmoadgVar, Object obj) {
        igdgnonuha igdgnonuhaVar = (igdgnonuha) iobyxmoadgVar;
        gn item = (gn) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(igdgnonuhaVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        bq sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            df dfVarIobyxmoadg = ((tk) sdkComponent).iobyxmoadg();
            String str = item.f56725wkgbmnqykc;
            AppCompatImageView targetView = igdgnonuhaVar.f57044zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetView, "spaySrihAcivHelperIcon");
            ae imageRequestBuilder = ae.f55810zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetView, "targetView");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            e7.nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new e7.nufgyqmvbu.iobyxmoadg(dfVarIobyxmoadg.f56266iobyxmoadg).zoijcleaow(str).btonecajqb(targetView);
            imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
            dfVarIobyxmoadg.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
        }
        igdgnonuhaVar.f57043wkgbmnqykc.setText(item.f56723iobyxmoadg);
        igdgnonuhaVar.f57042ppxfxbqfkf.setText(item.f56726zoijcleaow);
        ConstraintLayout spaySrihClRoot = igdgnonuhaVar.f57040eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySrihClRoot, "spaySrihClRoot");
        spaySrihClRoot.setOnClickListener(new pp(new kotlin.jvm.internal.jpowsppfya(), this, item));
    }
}
