package yg1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private tg.iobyxmoadg f124977esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f124978lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f124979pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f124978lereixgezr = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f124979pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: yg1.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f124970zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg1.iobyxmoadg btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.payment.impl.databinding.DialogChangePaymentVariantProloyaltyBinding");
        return (tg1.iobyxmoadg) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.dismiss();
    }

    private final tg1.iobyxmoadg gtknphoqwx() {
        return (tg1.iobyxmoadg) this.f124979pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f124977esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        wkgbmnqykcVar.dismiss();
    }

    public final void agtfadlqog() {
        this.f124977esjtqupxsv = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public tg1.iobyxmoadg iobyxmoadg() {
        tg1.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = tg1.iobyxmoadg.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    public final void ojitshcjhn(tg.iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f124977esjtqupxsv = listener;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tg1.iobyxmoadg iobyxmoadgVarGtknphoqwx = gtknphoqwx();
        iobyxmoadgVarGtknphoqwx.f110476ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: yg1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f124980zdlpuopuiu, view);
            }
        });
        iobyxmoadgVarGtknphoqwx.f110478zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: yg1.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f124972zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f124978lereixgezr;
    }
}
