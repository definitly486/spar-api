package x81;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f121492cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f121493esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gg.gtknphoqwx f121494istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private String f121495lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private String f121496pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private String f121497zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f121493esjtqupxsv = iobyxmoadgVar;
        this.f121494istkbnxepw = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x81.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return draadjrbmk.ojitshcjhn(this.f121491zdlpuopuiu);
            }
        });
        this.f121492cdpycssgdh = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, 0, 0, bool != null ? bool.booleanValue() : false, false, 23, null);
    }

    private final void jyumaefscl(CharSequence charSequence) {
        MaterialTextView materialTextView = rgvfuqvkyq().f128439eablkybsjg;
        materialTextView.setText(charSequence);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(tg.iobyxmoadg iobyxmoadgVar, DialogInterface dialogInterface) {
        iobyxmoadgVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z41.wflxmlrfwp ojitshcjhn(draadjrbmk draadjrbmkVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = draadjrbmkVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogQuizProloyaltyBinding");
        return (z41.wflxmlrfwp) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final z41.wflxmlrfwp rgvfuqvkyq() {
        return (z41.wflxmlrfwp) this.f121494istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar.f121497zynmafqrjb != null) {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(k21.ojitshcjhn.URL, draadjrbmkVar.f121497zynmafqrjb, null, null, false, null, null, false, 252, null));
        }
        draadjrbmkVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(tg.iobyxmoadg iobyxmoadgVar, View view) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    private final void zdlpuopuiu(Button button, final tg.iobyxmoadg iobyxmoadgVar) {
        button.setVisibility(0);
        button.setOnClickListener(new View.OnClickListener() { // from class: x81.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.yggfygwlhe(iobyxmoadgVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public z41.wflxmlrfwp iobyxmoadg() {
        z41.wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = z41.wflxmlrfwp.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wflxmlrfwpVarPpxfxbqfkf, "inflate(...)");
        return wflxmlrfwpVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = this.f121495lereixgezr;
        if (str != null) {
            setTitle(str);
        }
        String str2 = this.f121496pmvmpeiblj;
        if (str2 != null) {
            jyumaefscl(str2);
        }
        MaterialButton btnPositive = rgvfuqvkyq().f128442ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnPositive, "btnPositive");
        zdlpuopuiu(btnPositive, new tg.iobyxmoadg() { // from class: x81.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return draadjrbmk.vdvldrhtss(this.f121509zdlpuopuiu);
            }
        });
        MaterialButton btnNegative = rgvfuqvkyq().f128444zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnNegative, "btnNegative");
        zdlpuopuiu(btnNegative, new tg.iobyxmoadg() { // from class: x81.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return draadjrbmk.oxmwwwfdhm(this.f121510zdlpuopuiu);
            }
        });
        final tg.iobyxmoadg iobyxmoadgVar = this.f121493esjtqupxsv;
        if (iobyxmoadgVar != null) {
            setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: x81.dxjokdxxww
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    draadjrbmk.kcexrzcfyt(iobyxmoadgVar, dialogInterface);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        MaterialTextView materialTextView = rgvfuqvkyq().f128440gxszxtbevo;
        materialTextView.setText(charSequence);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121492cdpycssgdh;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final draadjrbmk f121498iobyxmoadg;

        public iobyxmoadg(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            this.f121498iobyxmoadg = new draadjrbmk(context, bool, iobyxmoadgVar);
        }

        public final draadjrbmk iobyxmoadg() {
            return this.f121498iobyxmoadg;
        }

        public final iobyxmoadg zoijcleaow(wflxmlrfwp params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f121498iobyxmoadg.f121495lereixgezr = params.ppxfxbqfkf();
            this.f121498iobyxmoadg.f121496pmvmpeiblj = params.iobyxmoadg();
            this.f121498iobyxmoadg.f121497zynmafqrjb = params.zoijcleaow();
            return this;
        }

        public /* synthetic */ iobyxmoadg(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(context, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : iobyxmoadgVar);
        }
    }
}
