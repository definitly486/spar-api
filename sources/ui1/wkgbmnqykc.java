package ui1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f113624esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f113625lereixgezr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, tg.iobyxmoadg confirmClickListener) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(confirmClickListener, "confirmClickListener");
        this.f113624esjtqupxsv = confirmClickListener;
        this.f113625lereixgezr = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ui1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f113623zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yi1.ppxfxbqfkf btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.purchases.impl.databinding.DialogPurchaseConfirmProloyaltyBinding");
        return (yi1.ppxfxbqfkf) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f113624esjtqupxsv.invoke();
        wkgbmnqykcVar.dismiss();
    }

    private final yi1.ppxfxbqfkf gtknphoqwx() {
        return (yi1.ppxfxbqfkf) this.f113625lereixgezr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public yi1.ppxfxbqfkf iobyxmoadg() {
        yi1.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = yi1.ppxfxbqfkf.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yi1.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = gtknphoqwx();
        ppxfxbqfkfVarGtknphoqwx.f125452zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ui1.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f113622zdlpuopuiu, view);
            }
        });
        ppxfxbqfkfVarGtknphoqwx.f125450ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ui1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f113626zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -2, 0, false, false, 29, null);
    }
}
