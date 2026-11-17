package ig1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.ojitshcjhn;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final iobyxmoadg f42565cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f42566yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f42567esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gtknphoqwx f42568istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f42569lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f42570pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f42571zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, tg.iobyxmoadg deleteListener, int i13, int i14) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(deleteListener, "deleteListener");
        this.f42567esjtqupxsv = deleteListener;
        this.f42569lereixgezr = i13;
        this.f42570pmvmpeiblj = i14;
        this.f42571zynmafqrjb = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.65f, -2, 0, false, false, 28, null);
        this.f42568istkbnxepw = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ig1.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f42556zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ojitshcjhn btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogReplacementDeleteProductProloyaltyBinding");
        return (ojitshcjhn) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f42567esjtqupxsv.invoke();
        wkgbmnqykcVar.dismiss();
    }

    private final ojitshcjhn gtknphoqwx() {
        return (ojitshcjhn) this.f42568istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public ojitshcjhn iobyxmoadg() {
        ojitshcjhn ojitshcjhnVarPpxfxbqfkf = ojitshcjhn.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(ojitshcjhnVarPpxfxbqfkf, "inflate(...)");
        return ojitshcjhnVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        gtknphoqwx().f128296ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ig1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f42572zdlpuopuiu, view);
            }
        });
        gtknphoqwx().f128298zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ig1.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f42564zdlpuopuiu, view);
            }
        });
        gtknphoqwx().f128295lqeggnwhkg.setText(this.f42569lereixgezr);
        gtknphoqwx().f128293gxszxtbevo.setText(this.f42570pmvmpeiblj);
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f42571zynmafqrjb;
    }
}
