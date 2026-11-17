package xj0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private tg.iobyxmoadg f122624esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f122625lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f122626pmvmpeiblj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f122625lereixgezr = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f122626pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xj0.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f122620zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sj0.iobyxmoadg btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.payment.impl.databinding.DialogChangePaymentVariantBinding");
        return (sj0.iobyxmoadg) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.dismiss();
    }

    private final sj0.iobyxmoadg gtknphoqwx() {
        return (sj0.iobyxmoadg) this.f122626pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f122624esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        wkgbmnqykcVar.dismiss();
    }

    public final void agtfadlqog() {
        this.f122624esjtqupxsv = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public sj0.iobyxmoadg iobyxmoadg() {
        sj0.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = sj0.iobyxmoadg.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    public final void ojitshcjhn(tg.iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f122624esjtqupxsv = listener;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sj0.iobyxmoadg iobyxmoadgVarGtknphoqwx = gtknphoqwx();
        iobyxmoadgVarGtknphoqwx.f107144ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: xj0.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f122618zdlpuopuiu, view);
            }
        });
        iobyxmoadgVarGtknphoqwx.f107146zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: xj0.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f122627zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f122625lereixgezr;
    }
}
