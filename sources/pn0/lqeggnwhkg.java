package pn0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f77007esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f77008lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f77009pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final iobyxmoadg f77006zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f77005istkbnxepw = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Context context, tg.iobyxmoadg onDelete) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onDelete, "onDelete");
        this.f77007esjtqupxsv = onDelete;
        this.f77008lereixgezr = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f77009pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: pn0.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.btonecajqb(this.f77023zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z41.ppxfxbqfkf btonecajqb(lqeggnwhkg lqeggnwhkgVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogDeleteAccountConfirmProloyaltyBinding");
        return (z41.ppxfxbqfkf) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.dismiss();
    }

    private final z41.ppxfxbqfkf gtknphoqwx() {
        return (z41.ppxfxbqfkf) this.f77009pmvmpeiblj.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f77007esjtqupxsv.invoke();
        lqeggnwhkgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public z41.ppxfxbqfkf iobyxmoadg() {
        z41.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = z41.ppxfxbqfkf.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z41.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = gtknphoqwx();
        ppxfxbqfkfVarGtknphoqwx.f128356zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: pn0.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.draadjrbmk(this.f77002zdlpuopuiu, view);
            }
        });
        ppxfxbqfkfVarGtknphoqwx.f128354ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: pn0.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.wflxmlrfwp(this.f77003zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f77008lereixgezr;
    }
}
