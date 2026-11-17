package sd0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.yggfygwlhe;
import pm.dxjokdxxww;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final iobyxmoadg f106015iozdgvuglv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f106016lmojexxdyd = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final gtknphoqwx f106017cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final mb0.wkgbmnqykc f106018esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f106019istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final List f106020lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final boolean f106021pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gtknphoqwx f106022yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final zoijcleaow f106023zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void ppxfxbqfkf(mb0.wkgbmnqykc wkgbmnqykcVar);

        void zoijcleaow(mb0.wkgbmnqykc wkgbmnqykcVar, boolean z13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Context context, mb0.wkgbmnqykc shop, List services, boolean z13, zoijcleaow listener) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(shop, "shop");
        zdlpuopuiu.btonecajqb(services, "services");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f106018esjtqupxsv = shop;
        this.f106020lereixgezr = services;
        this.f106021pmvmpeiblj = z13;
        this.f106023zynmafqrjb = listener;
        this.f106019istkbnxepw = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f106017cdpycssgdh = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: sd0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.agtfadlqog(this.f106013zdlpuopuiu);
            }
        });
        this.f106022yadqdtsiqt = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: sd0.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.draadjrbmk();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yggfygwlhe agtfadlqog(lqeggnwhkg lqeggnwhkgVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogShopDetailsBinding");
        return (yggfygwlhe) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final td0.iobyxmoadg draadjrbmk() {
        return new td0.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f106023zynmafqrjb.iobyxmoadg();
        lqeggnwhkgVar.dismiss();
    }

    private final td0.iobyxmoadg ojitshcjhn() {
        return (td0.iobyxmoadg) this.f106022yadqdtsiqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f106023zynmafqrjb.zoijcleaow(lqeggnwhkgVar.f106018esjtqupxsv, lqeggnwhkgVar.f106021pmvmpeiblj);
        lqeggnwhkgVar.dismiss();
    }

    private final yggfygwlhe rgvfuqvkyq() {
        return (yggfygwlhe) this.f106017cdpycssgdh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(lqeggnwhkg lqeggnwhkgVar, View view) {
        lqeggnwhkgVar.f106023zynmafqrjb.ppxfxbqfkf(lqeggnwhkgVar.f106018esjtqupxsv);
        lqeggnwhkgVar.dismiss();
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yggfygwlhe yggfygwlheVarRgvfuqvkyq = rgvfuqvkyq();
        yggfygwlheVarRgvfuqvkyq.f66155wflxmlrfwp.setText(this.f106018esjtqupxsv.nufgyqmvbu());
        yggfygwlheVarRgvfuqvkyq.f66149gtknphoqwx.setText(this.f106018esjtqupxsv.wkgbmnqykc());
        yggfygwlheVarRgvfuqvkyq.f66145btonecajqb.setText(this.f106018esjtqupxsv.iobyxmoadg());
        yggfygwlheVarRgvfuqvkyq.f66156wkgbmnqykc.setText(getContext().getString(this.f106021pmvmpeiblj ? dxjokdxxww.shop_addresses_button_on_map : dxjokdxxww.shop_addresses_button_in_list));
        yggfygwlheVarRgvfuqvkyq.f66147dxjokdxxww.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView rvServices = yggfygwlheVarRgvfuqvkyq.f66147dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(rvServices, "rvServices");
        e60.zoijcleaow.ppxfxbqfkf(rvServices, ojitshcjhn(), yggfygwlheVarRgvfuqvkyq);
        ojitshcjhn().wkgbmnqykc(this.f106020lereixgezr);
        yggfygwlheVarRgvfuqvkyq.f66154ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: sd0.iobyxmoadg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.vdvldrhtss(this.f106014zdlpuopuiu, view);
            }
        });
        yggfygwlheVarRgvfuqvkyq.f66156wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: sd0.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.oxmwwwfdhm(this.f106026zdlpuopuiu, view);
            }
        });
        yggfygwlheVarRgvfuqvkyq.f66157zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: sd0.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.kcexrzcfyt(this.f106024zdlpuopuiu, view);
            }
        });
        yggfygwlheVarRgvfuqvkyq.f66148eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: sd0.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.zdlpuopuiu(this.f106025zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public yggfygwlhe iobyxmoadg() {
        yggfygwlhe yggfygwlheVarPpxfxbqfkf = yggfygwlhe.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(yggfygwlheVarPpxfxbqfkf, "inflate(...)");
        return yggfygwlheVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f106019istkbnxepw;
    }
}
