package gc0;

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
import m60.grlcpdaxtj;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends Dialog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Integer f36810cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private tg.iobyxmoadg f36811esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Integer f36812iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Integer f36813jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private tg.iobyxmoadg f36814lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private tg.iobyxmoadg f36815pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f36816yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private String f36817zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final grlcpdaxtj f36818zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final zoijcleaow f36809istkbnxepw = new zoijcleaow(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final int f36808cdpycssgdh = 8;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final eablkybsjg f36819iobyxmoadg;

        public iobyxmoadg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            this.f36819iobyxmoadg = new eablkybsjg(context);
        }

        public static /* synthetic */ iobyxmoadg gxszxtbevo(iobyxmoadg iobyxmoadgVar, int i13, tg.iobyxmoadg iobyxmoadgVar2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                iobyxmoadgVar2 = null;
            }
            return iobyxmoadgVar.eablkybsjg(i13, iobyxmoadgVar2);
        }

        public final iobyxmoadg eablkybsjg(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f36819iobyxmoadg.f36810cqumvgiudr = Integer.valueOf(i13);
            this.f36819iobyxmoadg.f36815pmvmpeiblj = iobyxmoadgVar;
            return this;
        }

        public final Dialog iobyxmoadg() {
            return this.f36819iobyxmoadg;
        }

        public final iobyxmoadg lqeggnwhkg(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f36819iobyxmoadg.f36813jyumaefscl = Integer.valueOf(i13);
            this.f36819iobyxmoadg.f36811esjtqupxsv = iobyxmoadgVar;
            return this;
        }

        public final iobyxmoadg nufgyqmvbu(int i13) {
            eablkybsjg eablkybsjgVar = this.f36819iobyxmoadg;
            eablkybsjgVar.f36817zdlpuopuiu = eablkybsjgVar.getContext().getString(i13);
            return this;
        }

        public final iobyxmoadg ppxfxbqfkf(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f36819iobyxmoadg.f36816yggfygwlhe = message;
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(int i13, tg.iobyxmoadg iobyxmoadgVar) {
            this.f36819iobyxmoadg.f36812iwizpuwonk = Integer.valueOf(i13);
            this.f36819iobyxmoadg.f36814lereixgezr = iobyxmoadgVar;
            return this;
        }

        public final iobyxmoadg zoijcleaow(int i13) {
            String string = this.f36819iobyxmoadg.getContext().getString(i13);
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
        grlcpdaxtj grlcpdaxtjVarPpxfxbqfkf = grlcpdaxtj.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(grlcpdaxtjVarPpxfxbqfkf, "inflate(...)");
        this.f36818zynmafqrjb = grlcpdaxtjVarPpxfxbqfkf;
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
        MaterialTextView materialTextView = this.f36818zynmafqrjb.f65518gxszxtbevo;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }

    private final void oxmwwwfdhm(int i13, final tg.iobyxmoadg iobyxmoadgVar) {
        MaterialButton neutralButton = this.f36818zynmafqrjb.f65522wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(neutralButton, "neutralButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        wflxmlrfwp(neutralButton, string, new tg.iobyxmoadg() { // from class: gc0.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return eablkybsjg.kcexrzcfyt(iobyxmoadgVar, this);
            }
        });
    }

    private final void rgvfuqvkyq(int i13, final tg.iobyxmoadg iobyxmoadgVar) {
        MaterialButton negativeButton = this.f36818zynmafqrjb.f65521ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(negativeButton, "negativeButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        wflxmlrfwp(negativeButton, string, new tg.iobyxmoadg() { // from class: gc0.iobyxmoadg
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: gc0.wkgbmnqykc
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
        MaterialButton positiveButton = this.f36818zynmafqrjb.f65517eablkybsjg;
        zdlpuopuiu.dxjokdxxww(positiveButton, "positiveButton");
        String string = getContext().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        wflxmlrfwp(positiveButton, string, new tg.iobyxmoadg() { // from class: gc0.ppxfxbqfkf
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
        setContentView(this.f36818zynmafqrjb.getRoot());
        setCancelable(true);
        String str = this.f36817zdlpuopuiu;
        if (str != null) {
            setTitle(str);
        }
        String str2 = this.f36816yggfygwlhe;
        if (str2 != null) {
            ojitshcjhn(str2);
        }
        Integer num = this.f36813jyumaefscl;
        if (num != null) {
            zdlpuopuiu(num.intValue(), this.f36811esjtqupxsv);
        }
        Integer num2 = this.f36810cqumvgiudr;
        if (num2 != null) {
            oxmwwwfdhm(num2.intValue(), this.f36815pmvmpeiblj);
        }
        Integer num3 = this.f36812iwizpuwonk;
        if (num3 != null) {
            rgvfuqvkyq(num3.intValue(), this.f36814lereixgezr);
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
        MaterialTextView materialTextView = this.f36818zynmafqrjb.f65520lqeggnwhkg;
        materialTextView.setText(charSequence);
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(0);
    }
}
