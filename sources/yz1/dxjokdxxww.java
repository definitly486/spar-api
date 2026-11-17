package yz1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.rate_bonus_product.api.model.RateProductResultDialogArgs;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final RateProductResultDialogArgs f126889esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f126890lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f126891pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final iobyxmoadg f126888zynmafqrjb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f126887istkbnxepw = 8;

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
        this.f126889esjtqupxsv = args;
        this.f126890lereixgezr = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: yz1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return dxjokdxxww.nufgyqmvbu(this.f126900zdlpuopuiu);
            }
        });
        this.f126891pmvmpeiblj = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, btonecajqb(), 0, false, false, 21, null);
    }

    private final int btonecajqb() {
        int iGtknphoqwx = gtknphoqwx();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        return iGtknphoqwx - (ct.iobyxmoadg.iobyxmoadg(32, context) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.dismiss();
    }

    private final c02.iobyxmoadg dxjokdxxww() {
        return (c02.iobyxmoadg) this.f126890lereixgezr.getValue();
    }

    private final int gtknphoqwx() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c02.iobyxmoadg nufgyqmvbu(dxjokdxxww dxjokdxxwwVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.rate.rate_bonuse_product.impl.databinding.DialogRateProductResultBinding");
        return (c02.iobyxmoadg) iobyxmoadgVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg
    protected a6.iobyxmoadg iobyxmoadg() {
        c02.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = c02.iobyxmoadg.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Integer bonusQuantity = this.f126889esjtqupxsv.getBonusQuantity();
        if (bonusQuantity != null) {
            int iIntValue = bonusQuantity.intValue();
            String quantityString = getContext().getResources().getQuantityString(b02.ppxfxbqfkf.rate_product_will_charge, iIntValue);
            zdlpuopuiu.dxjokdxxww(quantityString, "getQuantityString(...)");
            String quantityString2 = getContext().getResources().getQuantityString(pm.lqeggnwhkg.plural_purchase_bonuses, iIntValue, Integer.valueOf(iIntValue));
            zdlpuopuiu.dxjokdxxww(quantityString2, "getQuantityString(...)");
            dxjokdxxww().f18224ppxfxbqfkf.setText(quantityString + " " + quantityString2);
        }
        dxjokdxxww().f18226zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: yz1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.draadjrbmk(this.f126901zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f126891pmvmpeiblj;
    }
}
