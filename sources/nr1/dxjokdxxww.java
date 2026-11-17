package nr1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ds1.ppxfxbqfkf f70891esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zoijcleaow f70892lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f70893pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final gtknphoqwx f70894zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final iobyxmoadg f70890istkbnxepw = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final int f70889cdpycssgdh = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void ppxfxbqfkf(ds1.ppxfxbqfkf ppxfxbqfkfVar);

        void zoijcleaow(ds1.ppxfxbqfkf ppxfxbqfkfVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(Context context, ds1.ppxfxbqfkf shop, zoijcleaow listener) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(shop, "shop");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f70891esjtqupxsv = shop;
        this.f70892lereixgezr = listener;
        this.f70893pmvmpeiblj = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f70894zynmafqrjb = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: nr1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return dxjokdxxww.draadjrbmk(this.f70904zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt draadjrbmk(dxjokdxxww dxjokdxxwwVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogSpecialBannerShopDetailsProloyaltyBinding");
        return (kcexrzcfyt) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.f70892lereixgezr.iobyxmoadg();
        dxjokdxxwwVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.f70892lereixgezr.ppxfxbqfkf(dxjokdxxwwVar.f70891esjtqupxsv);
        dxjokdxxwwVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.f70892lereixgezr.zoijcleaow(dxjokdxxwwVar.f70891esjtqupxsv);
        dxjokdxxwwVar.dismiss();
    }

    private final kcexrzcfyt wflxmlrfwp() {
        return (kcexrzcfyt) this.f70894zynmafqrjb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt iobyxmoadg() {
        kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = kcexrzcfyt.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(kcexrzcfytVarPpxfxbqfkf, "inflate(...)");
        return kcexrzcfytVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kcexrzcfyt kcexrzcfytVarWflxmlrfwp = wflxmlrfwp();
        kcexrzcfytVarWflxmlrfwp.f128211gtknphoqwx.setText(this.f70891esjtqupxsv.lqeggnwhkg());
        kcexrzcfytVarWflxmlrfwp.f128208btonecajqb.setText(this.f70891esjtqupxsv.nufgyqmvbu());
        kcexrzcfytVarWflxmlrfwp.f128209dxjokdxxww.setText(this.f70891esjtqupxsv.iobyxmoadg());
        kcexrzcfytVarWflxmlrfwp.f128216ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: nr1.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.agtfadlqog(this.f70895zdlpuopuiu, view);
            }
        });
        kcexrzcfytVarWflxmlrfwp.f128218zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: nr1.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.ojitshcjhn(this.f70896zdlpuopuiu, view);
            }
        });
        kcexrzcfytVarWflxmlrfwp.f128210eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: nr1.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.rgvfuqvkyq(this.f70898zdlpuopuiu, view);
            }
        });
        kcexrzcfytVarWflxmlrfwp.f128217wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: nr1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.vdvldrhtss(this.f70899zdlpuopuiu, view);
            }
        });
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f70893pmvmpeiblj;
    }
}
