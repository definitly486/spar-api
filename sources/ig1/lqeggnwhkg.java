package ig1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final iobyxmoadg f42557cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f42558yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f42559esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gtknphoqwx f42560istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f42561lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f42562pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f42563zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Context context, tg.iobyxmoadg dismissListener, int i13, int i14) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(dismissListener, "dismissListener");
        this.f42559esjtqupxsv = dismissListener;
        this.f42561lereixgezr = i13;
        this.f42562pmvmpeiblj = i14;
        this.f42563zynmafqrjb = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.65f, -2, 0, false, false, 28, null);
        this.f42560istkbnxepw = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ig1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.dxjokdxxww(this.f42555zdlpuopuiu);
            }
        });
    }

    private final rgvfuqvkyq btonecajqb() {
        return (rgvfuqvkyq) this.f42560istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rgvfuqvkyq dxjokdxxww(lqeggnwhkg lqeggnwhkgVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogReplacementTimeIsOverProloyaltyBinding");
        return (rgvfuqvkyq) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f42559esjtqupxsv.invoke();
        lqeggnwhkgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public rgvfuqvkyq iobyxmoadg() {
        rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = rgvfuqvkyq.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(rgvfuqvkyqVarPpxfxbqfkf, "inflate(...)");
        return rgvfuqvkyqVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        btonecajqb().f128362zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ig1.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.gtknphoqwx(this.f42554zdlpuopuiu, view);
            }
        });
        btonecajqb().f128357eablkybsjg.setText(this.f42561lereixgezr);
        btonecajqb().f128358gxszxtbevo.setText(this.f42562pmvmpeiblj);
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f42563zynmafqrjb;
    }
}
