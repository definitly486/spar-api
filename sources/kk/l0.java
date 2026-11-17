package kk;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.SPaySdkApp;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends ba0 {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final q7 f57368zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(q7 helpersItemClickActionListener) {
        super(skhdrjzrfn.f58560zdlpuopuiu);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helpersItemClickActionListener, "helpersItemClickActionListener");
        this.f57368zoijcleaow = helpersItemClickActionListener;
    }

    @Override // kk.ba0
    public final Integer iobyxmoadg(Object obj) {
        n1 n1Var = (n1) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(n1Var, "<this>");
        return Integer.valueOf(n1Var.hashCode());
    }

    @Override // kk.ba0
    public final boolean ppxfxbqfkf(Object item) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        return item instanceof n1;
    }

    @Override // kk.ba0
    public final void zoijcleaow(a6.iobyxmoadg iobyxmoadgVar, Object obj) {
        y5 y5Var = (y5) iobyxmoadgVar;
        n1 item = (n1) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(y5Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        bq sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            df dfVarIobyxmoadg = ((tk) sdkComponent).iobyxmoadg();
            String str = item.f57707wkgbmnqykc;
            AppCompatImageView targetView = y5Var.f59388zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(targetView, "spaySrishAcivHelperIcon");
            ae imageRequestBuilder = ae.f55810zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetView, "targetView");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(imageRequestBuilder, "imageRequestBuilder");
            e7.nufgyqmvbu.iobyxmoadg iobyxmoadgVarBtonecajqb = new e7.nufgyqmvbu.iobyxmoadg(dfVarIobyxmoadg.f56266iobyxmoadg).zoijcleaow(str).btonecajqb(targetView);
            imageRequestBuilder.invoke(iobyxmoadgVarBtonecajqb);
            dfVarIobyxmoadg.f56267zoijcleaow.iobyxmoadg(iobyxmoadgVarBtonecajqb.iobyxmoadg());
        }
        y5Var.f59387wkgbmnqykc.setText(item.f57705iobyxmoadg);
        y5Var.f59386ppxfxbqfkf.setText(item.f57708zoijcleaow);
        ConstraintLayout spaySrishClRoot = y5Var.f59384eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySrishClRoot, "spaySrishClRoot");
        spaySrishClRoot.setOnClickListener(new i(new kotlin.jvm.internal.jpowsppfya(), this, item));
    }
}
