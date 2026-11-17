package y81;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f124085esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final tg.iobyxmoadg f124086lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gtknphoqwx f124087pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final iobyxmoadg f124084zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f124083istkbnxepw = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ wkgbmnqykc(Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, iobyxmoadgVar, (i13 & 4) != 0 ? null : iobyxmoadgVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f124085esjtqupxsv.invoke();
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z41.zoijcleaow btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogComboAfterAddProductsToBaketProloyaltyBinding");
        return (z41.zoijcleaow) iobyxmoadgVarPpxfxbqfkf;
    }

    private final int draadjrbmk() {
        int iWflxmlrfwp = wflxmlrfwp();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return iWflxmlrfwp - (wr0.iobyxmoadg.iobyxmoadg(45, context) * 2);
    }

    private final z41.zoijcleaow gtknphoqwx() {
        return (z41.zoijcleaow) this.f124087pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(wkgbmnqykc wkgbmnqykcVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f124086lereixgezr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        wkgbmnqykcVar.dismiss();
    }

    private final int wflxmlrfwp() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public z41.zoijcleaow iobyxmoadg() {
        z41.zoijcleaow zoijcleaowVarPpxfxbqfkf = z41.zoijcleaow.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarPpxfxbqfkf, "inflate(...)");
        return zoijcleaowVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z41.zoijcleaow zoijcleaowVarGtknphoqwx = gtknphoqwx();
        zoijcleaowVarGtknphoqwx.f128577ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: y81.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.agtfadlqog(this.f124088zdlpuopuiu, view);
            }
        });
        zoijcleaowVarGtknphoqwx.f128579zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: y81.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.ojitshcjhn(this.f124082zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, draadjrbmk(), 0, false, false, 29, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, tg.iobyxmoadg onBtnClickNavigateToBasket, tg.iobyxmoadg iobyxmoadgVar) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onBtnClickNavigateToBasket, "onBtnClickNavigateToBasket");
        this.f124085esjtqupxsv = onBtnClickNavigateToBasket;
        this.f124086lereixgezr = iobyxmoadgVar;
        this.f124087pmvmpeiblj = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: y81.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f124081zdlpuopuiu);
            }
        });
    }
}
