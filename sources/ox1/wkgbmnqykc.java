package ox1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f75068esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f75069lereixgezr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, tg.iobyxmoadg confirmClickListener) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(confirmClickListener, "confirmClickListener");
        this.f75068esjtqupxsv = confirmClickListener;
        this.f75069lereixgezr = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ox1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f75067zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sx1.ppxfxbqfkf btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.purchases.impl.databinding.DialogPurchaseConfirmBinding");
        return (sx1.ppxfxbqfkf) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f75068esjtqupxsv.invoke();
        wkgbmnqykcVar.dismiss();
    }

    private final sx1.ppxfxbqfkf gtknphoqwx() {
        return (sx1.ppxfxbqfkf) this.f75069lereixgezr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public sx1.ppxfxbqfkf iobyxmoadg() {
        sx1.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = sx1.ppxfxbqfkf.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sx1.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = gtknphoqwx();
        ppxfxbqfkfVarGtknphoqwx.f108681zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ox1.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f75066zdlpuopuiu, view);
            }
        });
        ppxfxbqfkfVarGtknphoqwx.f108679ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ox1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f75070zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -2, 0, false, false, 29, null);
    }
}
