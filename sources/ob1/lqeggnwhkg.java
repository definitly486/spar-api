package ob1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.oxmwwwfdhm;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final iobyxmoadg f72542iozdgvuglv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f72543lmojexxdyd = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final gtknphoqwx f72544cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final l91.wkgbmnqykc f72545esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f72546istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final List f72547lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f72548pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gtknphoqwx f72549yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final zoijcleaow f72550zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void ppxfxbqfkf(l91.wkgbmnqykc wkgbmnqykcVar, boolean z13);

        void zoijcleaow(l91.wkgbmnqykc wkgbmnqykcVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Context context, l91.wkgbmnqykc shop, List services, boolean z13, zoijcleaow listener) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(shop, "shop");
        zdlpuopuiu.btonecajqb(services, "services");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f72545esjtqupxsv = shop;
        this.f72547lereixgezr = services;
        this.f72548pmvmpeiblj = z13;
        this.f72550zynmafqrjb = listener;
        this.f72546istkbnxepw = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f72544cdpycssgdh = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ob1.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.agtfadlqog(this.f72541zdlpuopuiu);
            }
        });
        this.f72549yadqdtsiqt = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ob1.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.draadjrbmk();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oxmwwwfdhm agtfadlqog(lqeggnwhkg lqeggnwhkgVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogShopDetailsProloyaltyBinding");
        return (oxmwwwfdhm) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pb1.iobyxmoadg draadjrbmk() {
        return new pb1.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f72550zynmafqrjb.iobyxmoadg();
        lqeggnwhkgVar.dismiss();
    }

    private final pb1.iobyxmoadg ojitshcjhn() {
        return (pb1.iobyxmoadg) this.f72549yadqdtsiqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f72550zynmafqrjb.ppxfxbqfkf(lqeggnwhkgVar.f72545esjtqupxsv, lqeggnwhkgVar.f72548pmvmpeiblj);
        lqeggnwhkgVar.dismiss();
    }

    private final oxmwwwfdhm rgvfuqvkyq() {
        return (oxmwwwfdhm) this.f72544cdpycssgdh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f72550zynmafqrjb.zoijcleaow(lqeggnwhkgVar.f72545esjtqupxsv);
        lqeggnwhkgVar.dismiss();
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        oxmwwwfdhm oxmwwwfdhmVarRgvfuqvkyq = rgvfuqvkyq();
        oxmwwwfdhmVarRgvfuqvkyq.f128322wflxmlrfwp.setText(this.f72545esjtqupxsv.nufgyqmvbu());
        oxmwwwfdhmVarRgvfuqvkyq.f128316gtknphoqwx.setText(this.f72545esjtqupxsv.wkgbmnqykc());
        oxmwwwfdhmVarRgvfuqvkyq.f128312btonecajqb.setText(this.f72545esjtqupxsv.iobyxmoadg());
        oxmwwwfdhmVarRgvfuqvkyq.f128323wkgbmnqykc.setText(getContext().getString(this.f72548pmvmpeiblj ? vk0.lqeggnwhkg.proloyalty_shop_addresses_button_on_map : vk0.lqeggnwhkg.proloyalty_shop_addresses_button_in_list));
        oxmwwwfdhmVarRgvfuqvkyq.f128314dxjokdxxww.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView rvServices = oxmwwwfdhmVarRgvfuqvkyq.f128314dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(rvServices, "rvServices");
        r41.zoijcleaow.ppxfxbqfkf(rvServices, ojitshcjhn(), oxmwwwfdhmVarRgvfuqvkyq);
        ojitshcjhn().wkgbmnqykc(this.f72547lereixgezr);
        oxmwwwfdhmVarRgvfuqvkyq.f128321ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ob1.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.vdvldrhtss(this.f72551zdlpuopuiu, view);
            }
        });
        oxmwwwfdhmVarRgvfuqvkyq.f128323wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: ob1.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.oxmwwwfdhm(this.f72552zdlpuopuiu, view);
            }
        });
        oxmwwwfdhmVarRgvfuqvkyq.f128324zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ob1.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.kcexrzcfyt(this.f72539zdlpuopuiu, view);
            }
        });
        oxmwwwfdhmVarRgvfuqvkyq.f128315eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: ob1.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.zdlpuopuiu(this.f72540zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public oxmwwwfdhm iobyxmoadg() {
        oxmwwwfdhm oxmwwwfdhmVarPpxfxbqfkf = oxmwwwfdhm.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarPpxfxbqfkf, "inflate(...)");
        return oxmwwwfdhmVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f72546istkbnxepw;
    }
}
