package pl1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.rate.rate_bonus_product.api.model.RateProductResultDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final RateProductResultDialogArgs f76935esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f76936lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f76937pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final iobyxmoadg f76934zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f76933istkbnxepw = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(Context context, RateProductResultDialogArgs args) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(args, "args");
        this.f76935esjtqupxsv = args;
        this.f76936lereixgezr = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: pl1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return dxjokdxxww.nufgyqmvbu(this.f76946zdlpuopuiu);
            }
        });
        this.f76937pmvmpeiblj = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, btonecajqb(), 0, false, false, 21, null);
    }

    private final int btonecajqb() {
        int iGtknphoqwx = gtknphoqwx();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return iGtknphoqwx - (wr0.iobyxmoadg.iobyxmoadg(32, context) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.dismiss();
    }

    private final tl1.iobyxmoadg dxjokdxxww() {
        return (tl1.iobyxmoadg) this.f76936lereixgezr.getValue();
    }

    private final int gtknphoqwx() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tl1.iobyxmoadg nufgyqmvbu(dxjokdxxww dxjokdxxwwVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.rate.rate_bonuse_product.impl.databinding.DialogRateProductResultProloyaltyBinding");
        return (tl1.iobyxmoadg) iobyxmoadgVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg
    protected a6.iobyxmoadg iobyxmoadg() {
        tl1.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = tl1.iobyxmoadg.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Integer bonusQuantity = this.f76935esjtqupxsv.getBonusQuantity();
        if (bonusQuantity != null) {
            int iIntValue = bonusQuantity.intValue();
            String quantityString = getContext().getResources().getQuantityString(sl1.ppxfxbqfkf.rate_product_will_charge, iIntValue);
            zdlpuopuiu.dxjokdxxww(quantityString, "getQuantityString(...)");
            String quantityString2 = getContext().getResources().getQuantityString(vk0.gxszxtbevo.plural_purchase_bonuses, iIntValue, Integer.valueOf(iIntValue));
            zdlpuopuiu.dxjokdxxww(quantityString2, "getQuantityString(...)");
            dxjokdxxww().f111046ppxfxbqfkf.setText(quantityString + " " + quantityString2);
        }
        dxjokdxxww().f111048zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: pl1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.draadjrbmk(this.f76947zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f76937pmvmpeiblj;
    }
}
