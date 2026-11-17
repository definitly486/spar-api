package yo1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final iobyxmoadg f126034cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f126035yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final bo1.ppxfxbqfkf f126036esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gg.gtknphoqwx f126037istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zoijcleaow f126038lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f126039pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f126040zynmafqrjb;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void zoijcleaow();
    }

    public /* synthetic */ wkgbmnqykc(Context context, bo1.ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? bo1.ppxfxbqfkf.AMOUNT : ppxfxbqfkfVar, zoijcleaowVar, (i13 & 8) != 0 ? false : z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final go1.zoijcleaow btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.scango.impl.databinding.DialogScanExciseStickerProloyaltyBinding");
        return (go1.zoijcleaow) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f126038lereixgezr.iobyxmoadg();
        wkgbmnqykcVar.dismiss();
    }

    private final go1.zoijcleaow gtknphoqwx() {
        return (go1.zoijcleaow) this.f126037istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.f126038lereixgezr.zoijcleaow();
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public go1.zoijcleaow iobyxmoadg() {
        go1.zoijcleaow zoijcleaowVarWkgbmnqykc = go1.zoijcleaow.wkgbmnqykc(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarWkgbmnqykc, "inflate(...)");
        return zoijcleaowVarWkgbmnqykc;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        go1.zoijcleaow zoijcleaowVarGtknphoqwx = gtknphoqwx();
        if (this.f126036esjtqupxsv != bo1.ppxfxbqfkf.WEIGHT) {
            zoijcleaowVarGtknphoqwx.f38128zoijcleaow.setText(getContext().getString(this.f126039pmvmpeiblj ? on1.wkgbmnqykc.proloyalty_scan_go_matrix_scan_skip_removing : on1.wkgbmnqykc.proloyalty_scan_go_matrix_scan_skip_adding));
        }
        zoijcleaowVarGtknphoqwx.f38126ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: yo1.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f126028zdlpuopuiu, view);
            }
        });
        zoijcleaowVarGtknphoqwx.f38128zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: yo1.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f126041zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f126040zynmafqrjb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, bo1.ppxfxbqfkf scanGoProductType, zoijcleaow listener, boolean z13) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(scanGoProductType, "scanGoProductType");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f126036esjtqupxsv = scanGoProductType;
        this.f126038lereixgezr = listener;
        this.f126039pmvmpeiblj = z13;
        this.f126040zynmafqrjb = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 20, null);
        this.f126037istkbnxepw = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: yo1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f126032zdlpuopuiu);
            }
        });
    }
}
