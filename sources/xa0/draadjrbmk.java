package xa0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import ru.myspar.core.navigation.model.NavigationPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f121882cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f121883esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final gg.gtknphoqwx f121884istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private String f121885lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private String f121886pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private String f121887zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f121883esjtqupxsv = iobyxmoadgVar;
        this.f121884istkbnxepw = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xa0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return draadjrbmk.ojitshcjhn(this.f121878zdlpuopuiu);
            }
        });
        this.f121882cdpycssgdh = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, 0, 0, bool != null ? bool.booleanValue() : false, false, 23, null);
    }

    private final void jyumaefscl(CharSequence charSequence) {
        MaterialTextView materialTextView = rgvfuqvkyq().f66039eablkybsjg;
        materialTextView.setText(charSequence);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(tg.iobyxmoadg iobyxmoadgVar, DialogInterface dialogInterface) {
        iobyxmoadgVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.vdvldrhtss ojitshcjhn(draadjrbmk draadjrbmkVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = draadjrbmkVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogQuizBinding");
        return (m60.vdvldrhtss) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final m60.vdvldrhtss rgvfuqvkyq() {
        return (m60.vdvldrhtss) this.f121884istkbnxepw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(draadjrbmk draadjrbmkVar) {
        if (draadjrbmkVar.f121887zynmafqrjb != null) {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(f40.zoijcleaow.URL, draadjrbmkVar.f121887zynmafqrjb, null, null, false, null, null, false, 252, null));
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
        button.setOnClickListener(new View.OnClickListener() { // from class: xa0.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                draadjrbmk.yggfygwlhe(iobyxmoadgVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public m60.vdvldrhtss iobyxmoadg() {
        m60.vdvldrhtss vdvldrhtssVarPpxfxbqfkf = m60.vdvldrhtss.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(vdvldrhtssVarPpxfxbqfkf, "inflate(...)");
        return vdvldrhtssVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = this.f121885lereixgezr;
        if (str != null) {
            setTitle(str);
        }
        String str2 = this.f121886pmvmpeiblj;
        if (str2 != null) {
            jyumaefscl(str2);
        }
        MaterialButton btnPositive = rgvfuqvkyq().f66042ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnPositive, "btnPositive");
        zdlpuopuiu(btnPositive, new tg.iobyxmoadg() { // from class: xa0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return draadjrbmk.vdvldrhtss(this.f121901zdlpuopuiu);
            }
        });
        MaterialButton btnNegative = rgvfuqvkyq().f66044zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnNegative, "btnNegative");
        zdlpuopuiu(btnNegative, new tg.iobyxmoadg() { // from class: xa0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return draadjrbmk.oxmwwwfdhm(this.f121902zdlpuopuiu);
            }
        });
        final tg.iobyxmoadg iobyxmoadgVar = this.f121883esjtqupxsv;
        if (iobyxmoadgVar != null) {
            setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xa0.dxjokdxxww
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    draadjrbmk.kcexrzcfyt(iobyxmoadgVar, dialogInterface);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        MaterialTextView materialTextView = rgvfuqvkyq().f66040gxszxtbevo;
        materialTextView.setText(charSequence);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121882cdpycssgdh;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final draadjrbmk f121888iobyxmoadg;

        public iobyxmoadg(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            this.f121888iobyxmoadg = new draadjrbmk(context, bool, iobyxmoadgVar);
        }

        public final draadjrbmk iobyxmoadg() {
            return this.f121888iobyxmoadg;
        }

        public final iobyxmoadg zoijcleaow(wflxmlrfwp params) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
            this.f121888iobyxmoadg.f121885lereixgezr = params.ppxfxbqfkf();
            this.f121888iobyxmoadg.f121886pmvmpeiblj = params.iobyxmoadg();
            this.f121888iobyxmoadg.f121887zynmafqrjb = params.zoijcleaow();
            return this;
        }

        public /* synthetic */ iobyxmoadg(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(context, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : iobyxmoadgVar);
        }
    }
}
