package fa1;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import z41.nuxfzjnpeb;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends Dialog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Integer f33350cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private tg.iobyxmoadg f33351esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Integer f33352iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Integer f33353jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private tg.iobyxmoadg f33354lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private tg.iobyxmoadg f33355pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f33356yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private String f33357zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final nuxfzjnpeb f33358zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final zoijcleaow f33349istkbnxepw = new zoijcleaow(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final int f33348cdpycssgdh = 8;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final eablkybsjg f33359iobyxmoadg;

        public iobyxmoadg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            this.f33359iobyxmoadg = new eablkybsjg(context);
        }

        public static /* synthetic */ iobyxmoadg gxszxtbevo(iobyxmoadg iobyxmoadgVar, int i13, tg.iobyxmoadg iobyxmoadgVar2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                iobyxmoadgVar2 = null;
            }
            return iobyxmoadgVar.eablkybsjg(i13, iobyxmoadgVar2);
        }

        public final iobyxmoadg eablkybsjg(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f33359iobyxmoadg.f33350cqumvgiudr = Integer.valueOf(i13);
            this.f33359iobyxmoadg.f33355pmvmpeiblj = iobyxmoadgVar;
            return this;
        }

        public final Dialog iobyxmoadg() {
            return this.f33359iobyxmoadg;
        }

        public final iobyxmoadg lqeggnwhkg(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f33359iobyxmoadg.f33353jyumaefscl = Integer.valueOf(i13);
            this.f33359iobyxmoadg.f33351esjtqupxsv = iobyxmoadgVar;
            return this;
        }

        public final iobyxmoadg nufgyqmvbu(int i13) {
            eablkybsjg eablkybsjgVar = this.f33359iobyxmoadg;
            eablkybsjgVar.f33357zdlpuopuiu = eablkybsjgVar.getContext().getString(i13);
            return this;
        }

        public final iobyxmoadg ppxfxbqfkf(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f33359iobyxmoadg.f33356yggfygwlhe = message;
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f33359iobyxmoadg.f33352iwizpuwonk = Integer.valueOf(i13);
            this.f33359iobyxmoadg.f33354lereixgezr = iobyxmoadgVar;
            return this;
        }

        public final iobyxmoadg zoijcleaow(int i13) {
            String string = this.f33359iobyxmoadg.getContext().getString(i13);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
            return ppxfxbqfkf(string);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        nuxfzjnpeb nuxfzjnpebVarPpxfxbqfkf = nuxfzjnpeb.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(nuxfzjnpebVarPpxfxbqfkf, "inflate(...)");
        this.f33358zynmafqrjb = nuxfzjnpebVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void agtfadlqog(tg.iobyxmoadg iobyxmoadgVar, View view) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(tg.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        eablkybsjgVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ojitshcjhn(CharSequence charSequence) {
        MaterialTextView materialTextView = this.f33358zynmafqrjb.f128285gxszxtbevo;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    private final void oxmwwwfdhm(int i13, final tg.iobyxmoadg iobyxmoadgVar) {
        MaterialButton neutralButton = this.f33358zynmafqrjb.f128289wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(neutralButton, "neutralButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        wflxmlrfwp(neutralButton, string, new tg.iobyxmoadg() { // from class: fa1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return eablkybsjg.kcexrzcfyt(iobyxmoadgVar, this);
            }
        });
    }

    private final void rgvfuqvkyq(int i13, final tg.iobyxmoadg iobyxmoadgVar) {
        MaterialButton negativeButton = this.f33358zynmafqrjb.f128288ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(negativeButton, "negativeButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        wflxmlrfwp(negativeButton, string, new tg.iobyxmoadg() { // from class: fa1.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return eablkybsjg.vdvldrhtss(iobyxmoadgVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(tg.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        eablkybsjgVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void wflxmlrfwp(TextView textView, String str, final tg.iobyxmoadg iobyxmoadgVar) {
        textView.setText(str);
        textView.setVisibility(0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: fa1.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eablkybsjg.agtfadlqog(iobyxmoadgVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(tg.iobyxmoadg iobyxmoadgVar, eablkybsjg eablkybsjgVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        eablkybsjgVar.dismiss();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zdlpuopuiu(int i13, final tg.iobyxmoadg iobyxmoadgVar) {
        MaterialButton positiveButton = this.f33358zynmafqrjb.f128284eablkybsjg;
        zdlpuopuiu.dxjokdxxww(positiveButton, "positiveButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        wflxmlrfwp(positiveButton, string, new tg.iobyxmoadg() { // from class: fa1.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return eablkybsjg.yggfygwlhe(iobyxmoadgVar, this);
            }
        });
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f33358zynmafqrjb.getRoot());
        setCancelable(true);
        String str = this.f33357zdlpuopuiu;
        if (str != null) {
            setTitle(str);
        }
        String str2 = this.f33356yggfygwlhe;
        if (str2 != null) {
            ojitshcjhn(str2);
        }
        Integer num = this.f33353jyumaefscl;
        if (num != null) {
            zdlpuopuiu(num.intValue(), this.f33351esjtqupxsv);
        }
        Integer num2 = this.f33350cqumvgiudr;
        if (num2 != null) {
            oxmwwwfdhm(num2.intValue(), this.f33355pmvmpeiblj);
        }
        Integer num3 = this.f33352iwizpuwonk;
        if (num3 != null) {
            rgvfuqvkyq(num3.intValue(), this.f33354lereixgezr);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.85f;
            }
            if (attributes != null) {
                attributes.width = -2;
            }
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        setTitle(getContext().getString(i13));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        MaterialTextView materialTextView = this.f33358zynmafqrjb.f128287lqeggnwhkg;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }
}
