package m22;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import k22.kcexrzcfyt;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private Integer f64989cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f64990esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private tg.iobyxmoadg f64991iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private CharSequence f64992istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Integer f64993lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private tg.iobyxmoadg f64994lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private String f64995pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final gg.gtknphoqwx f64996wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private Integer f64997yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Integer f64998zynmafqrjb;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final zoijcleaow f64988ylkuphrtab = new zoijcleaow(null);

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final int f64987pkzmftpjix = 8;

    public static final class iobyxmoadg implements r12.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lqeggnwhkg f64999iobyxmoadg;

        public iobyxmoadg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            this.f64999iobyxmoadg = new lqeggnwhkg(context);
        }

        public iobyxmoadg btonecajqb(int i13) {
            this.f64999iobyxmoadg.f64998zynmafqrjb = Integer.valueOf(i13);
            return this;
        }

        public iobyxmoadg dxjokdxxww(int i13) {
            lqeggnwhkg lqeggnwhkgVar = this.f64999iobyxmoadg;
            lqeggnwhkgVar.f64995pmvmpeiblj = lqeggnwhkgVar.getContext().getString(i13);
            return this;
        }

        public iobyxmoadg eablkybsjg(CharSequence message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f64999iobyxmoadg.f64992istkbnxepw = message;
            return this;
        }

        public iobyxmoadg gxszxtbevo(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            lqeggnwhkg lqeggnwhkgVar = this.f64999iobyxmoadg;
            lqeggnwhkgVar.f64997yadqdtsiqt = Integer.valueOf(i13);
            lqeggnwhkgVar.f64994lmojexxdyd = iobyxmoadgVar;
            return this;
        }

        public iobyxmoadg lqeggnwhkg(int i13) {
            this.f64999iobyxmoadg.f64993lereixgezr = Integer.valueOf(i13);
            return this;
        }

        @Override // r12.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            lqeggnwhkg lqeggnwhkgVar = this.f64999iobyxmoadg;
            lqeggnwhkgVar.f64989cdpycssgdh = Integer.valueOf(i13);
            lqeggnwhkgVar.f64991iozdgvuglv = iobyxmoadgVar;
            return this;
        }

        public dt.iobyxmoadg ppxfxbqfkf() {
            return this.f64999iobyxmoadg;
        }

        public iobyxmoadg wkgbmnqykc(int i13) {
            String string = this.f64999iobyxmoadg.getContext().getString(i13);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
            return eablkybsjg(string);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f64990esjtqupxsv = new dt.iobyxmoadg.zoijcleaow(0.85f, -2, 0, false, true);
        this.f64996wwaezpbzkn = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: m22.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.oxmwwwfdhm(this.f64983zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(tg.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        lqeggnwhkgVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void esjtqupxsv(int i13) {
        kcexrzcfyt().f53591zoijcleaow.setBackgroundResource(i13);
    }

    private final void iwizpuwonk(int i13, final tg.iobyxmoadg iobyxmoadgVar) {
        MaterialButton negativeButton = kcexrzcfyt().f53589ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(negativeButton, "negativeButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        zdlpuopuiu(negativeButton, string, new tg.iobyxmoadg() { // from class: m22.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.cqumvgiudr(iobyxmoadgVar, this);
            }
        });
        kcexrzcfyt().f53589ppxfxbqfkf.setVisibility(0);
    }

    private final void jyumaefscl(CharSequence charSequence) {
        MaterialTextView materialTextView = kcexrzcfyt().f53586eablkybsjg;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    private final kcexrzcfyt kcexrzcfyt() {
        return (kcexrzcfyt) this.f64996wwaezpbzkn.getValue();
    }

    private final void lereixgezr(int i13, final tg.iobyxmoadg iobyxmoadgVar) {
        MaterialButton positiveButton = kcexrzcfyt().f53590wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(positiveButton, "positiveButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        zdlpuopuiu(positiveButton, string, new tg.iobyxmoadg() { // from class: m22.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lqeggnwhkg.pmvmpeiblj(iobyxmoadgVar, this);
            }
        });
        kcexrzcfyt().f53590wkgbmnqykc.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kcexrzcfyt oxmwwwfdhm(lqeggnwhkg lqeggnwhkgVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.scango.impl.databinding.PopupScanAndGoBinding");
        return (kcexrzcfyt) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(tg.iobyxmoadg iobyxmoadgVar, lqeggnwhkg lqeggnwhkgVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        lqeggnwhkgVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(tg.iobyxmoadg iobyxmoadgVar, View view) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    private final void zdlpuopuiu(TextView textView, String str, final tg.iobyxmoadg iobyxmoadgVar) {
        textView.setText(str);
        textView.setVisibility(0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: m22.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.yggfygwlhe(iobyxmoadgVar, view);
            }
        });
    }

    private final void zynmafqrjb(int i13) {
        kcexrzcfyt().f53587gxszxtbevo.setTypeface(null, i13);
    }

    @Override // dt.iobyxmoadg
    protected a6.iobyxmoadg iobyxmoadg() {
        kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = kcexrzcfyt.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(kcexrzcfytVarPpxfxbqfkf, "inflate(...)");
        return kcexrzcfytVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Integer num = this.f64993lereixgezr;
        if (num != null) {
            esjtqupxsv(num.intValue());
        }
        String str = this.f64995pmvmpeiblj;
        if (str != null) {
            setTitle(str);
        }
        Integer num2 = this.f64998zynmafqrjb;
        if (num2 != null) {
            zynmafqrjb(num2.intValue());
        }
        CharSequence charSequence = this.f64992istkbnxepw;
        if (charSequence != null) {
            jyumaefscl(charSequence);
        }
        Integer num3 = this.f64989cdpycssgdh;
        if (num3 != null) {
            lereixgezr(num3.intValue(), this.f64991iozdgvuglv);
        }
        Integer num4 = this.f64997yadqdtsiqt;
        if (num4 != null) {
            iwizpuwonk(num4.intValue(), this.f64994lmojexxdyd);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        setTitle(getContext().getString(i13));
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f64990esjtqupxsv;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        MaterialTextView materialTextView = kcexrzcfyt().f53587gxszxtbevo;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }
}
