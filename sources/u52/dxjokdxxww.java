package u52;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.iwizpuwonk;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final k62.ppxfxbqfkf f112730esjtqupxsv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zoijcleaow f112731lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f112732pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final gtknphoqwx f112733zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final iobyxmoadg f112729istkbnxepw = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final int f112728cdpycssgdh = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void ppxfxbqfkf(k62.ppxfxbqfkf ppxfxbqfkfVar);

        void zoijcleaow(k62.ppxfxbqfkf ppxfxbqfkfVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(Context context, k62.ppxfxbqfkf shop, zoijcleaow listener) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(shop, "shop");
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.f112730esjtqupxsv = shop;
        this.f112731lereixgezr = listener;
        this.f112732pmvmpeiblj = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.75f, -2, 0, false, false, 28, null);
        this.f112733zynmafqrjb = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: u52.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return dxjokdxxww.draadjrbmk(this.f112738zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iwizpuwonk draadjrbmk(dxjokdxxww dxjokdxxwwVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = dxjokdxxwwVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogSpecialBannerShopDetailsBinding");
        return (iwizpuwonk) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.f112731lereixgezr.iobyxmoadg();
        dxjokdxxwwVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.f112731lereixgezr.ppxfxbqfkf(dxjokdxxwwVar.f112730esjtqupxsv);
        dxjokdxxwwVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(dxjokdxxww dxjokdxxwwVar, View view) {
        dxjokdxxwwVar.f112731lereixgezr.zoijcleaow(dxjokdxxwwVar.f112730esjtqupxsv);
        dxjokdxxwwVar.dismiss();
    }

    private final iwizpuwonk wflxmlrfwp() {
        return (iwizpuwonk) this.f112733zynmafqrjb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public iwizpuwonk iobyxmoadg() {
        iwizpuwonk iwizpuwonkVarPpxfxbqfkf = iwizpuwonk.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iwizpuwonkVarPpxfxbqfkf, "inflate(...)");
        return iwizpuwonkVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iwizpuwonk iwizpuwonkVarWflxmlrfwp = wflxmlrfwp();
        iwizpuwonkVarWflxmlrfwp.f65617gtknphoqwx.setText(this.f112730esjtqupxsv.lqeggnwhkg());
        iwizpuwonkVarWflxmlrfwp.f65614btonecajqb.setText(this.f112730esjtqupxsv.nufgyqmvbu());
        iwizpuwonkVarWflxmlrfwp.f65615dxjokdxxww.setText(this.f112730esjtqupxsv.iobyxmoadg());
        iwizpuwonkVarWflxmlrfwp.f65622ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: u52.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.agtfadlqog(this.f112743zdlpuopuiu, view);
            }
        });
        iwizpuwonkVarWflxmlrfwp.f65624zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: u52.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.ojitshcjhn(this.f112734zdlpuopuiu, view);
            }
        });
        iwizpuwonkVarWflxmlrfwp.f65616eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: u52.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.rgvfuqvkyq(this.f112735zdlpuopuiu, view);
            }
        });
        iwizpuwonkVarWflxmlrfwp.f65623wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: u52.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.vdvldrhtss(this.f112737zdlpuopuiu, view);
            }
        });
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f112732pmvmpeiblj;
    }
}
