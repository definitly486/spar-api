package xa0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textview.MaterialTextView;
import m60.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public final class yggfygwlhe extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final tg.rgvfuqvkyq f121922cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f121923esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f121924iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final String f121925istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final tg.rgvfuqvkyq f121926lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final iobyxmoadg f121927pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gg.gtknphoqwx f121928yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f121929zynmafqrjb;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f121930iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f121931zoijcleaow;

        public iobyxmoadg(int i13, int i14) {
            this.f121930iobyxmoadg = i13;
            this.f121931zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f121930iobyxmoadg == iobyxmoadgVar.f121930iobyxmoadg && this.f121931zoijcleaow == iobyxmoadgVar.f121931zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f121930iobyxmoadg) * 31) + Integer.hashCode(this.f121931zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f121930iobyxmoadg;
        }

        public String toString() {
            return "SetTimeParams(hour=" + this.f121930iobyxmoadg + ", minute=" + this.f121931zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f121931zoijcleaow;
        }
    }

    public /* synthetic */ yggfygwlhe(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, iobyxmoadg iobyxmoadgVar2, String str, String str2, tg.rgvfuqvkyq rgvfuqvkyqVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : iobyxmoadgVar, (i13 & 8) != 0 ? null : rgvfuqvkyqVar, (i13 & 16) != 0 ? null : iobyxmoadgVar2, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? null : str2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? rgvfuqvkyqVar2 : null);
    }

    private final void agtfadlqog() {
        esjtqupxsv esjtqupxsvVarGtknphoqwx = gtknphoqwx();
        tg.rgvfuqvkyq rgvfuqvkyqVar = this.f121922cdpycssgdh;
        if (rgvfuqvkyqVar == null || ((Boolean) rgvfuqvkyqVar.invoke(Integer.valueOf(esjtqupxsvVarGtknphoqwx.f65487eablkybsjg.getHour()), Integer.valueOf(esjtqupxsvVarGtknphoqwx.f65487eablkybsjg.getMinute()))).booleanValue()) {
            tg.rgvfuqvkyq rgvfuqvkyqVar2 = this.f121926lereixgezr;
            if (rgvfuqvkyqVar2 != null) {
                rgvfuqvkyqVar2.invoke(Integer.valueOf(esjtqupxsvVarGtknphoqwx.f65487eablkybsjg.getHour()), Integer.valueOf(esjtqupxsvVarGtknphoqwx.f65487eablkybsjg.getMinute()));
            }
            dismiss();
            return;
        }
        String str = this.f121925istkbnxepw;
        if (str != null) {
            esjtqupxsvVarGtknphoqwx.f65488gxszxtbevo.setText(str);
            MaterialTextView tvErrorMessage = esjtqupxsvVarGtknphoqwx.f65488gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvErrorMessage, "tvErrorMessage");
            tvErrorMessage.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final esjtqupxsv btonecajqb(yggfygwlhe yggfygwlheVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = yggfygwlheVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogSpinnerTimepickerBinding");
        return (esjtqupxsv) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(yggfygwlhe yggfygwlheVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = yggfygwlheVar.f121923esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        yggfygwlheVar.dismiss();
    }

    private final esjtqupxsv gtknphoqwx() {
        return (esjtqupxsv) this.f121928yadqdtsiqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(yggfygwlhe yggfygwlheVar, View view) {
        yggfygwlheVar.agtfadlqog();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public esjtqupxsv iobyxmoadg() {
        esjtqupxsv esjtqupxsvVarPpxfxbqfkf = esjtqupxsv.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(esjtqupxsvVarPpxfxbqfkf, "inflate(...)");
        return esjtqupxsvVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(s40.gxszxtbevo.dialog_custom_insets);
        }
        esjtqupxsv esjtqupxsvVarGtknphoqwx = gtknphoqwx();
        esjtqupxsvVarGtknphoqwx.f65487eablkybsjg.setIs24HourView(Boolean.TRUE);
        iobyxmoadg iobyxmoadgVar = this.f121927pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            esjtqupxsvVarGtknphoqwx.f65487eablkybsjg.setMinute(iobyxmoadgVar.zoijcleaow());
            esjtqupxsvVarGtknphoqwx.f65487eablkybsjg.setHour(iobyxmoadgVar.iobyxmoadg());
        }
        esjtqupxsvVarGtknphoqwx.f65493zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: xa0.oxmwwwfdhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yggfygwlhe.draadjrbmk(this.f121904zdlpuopuiu, view);
            }
        });
        esjtqupxsvVarGtknphoqwx.f65491ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: xa0.kcexrzcfyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yggfygwlhe.wflxmlrfwp(this.f121900zdlpuopuiu, view);
            }
        });
        String str = this.f121929zynmafqrjb;
        if (str != null) {
            MaterialTextView tvTitle = esjtqupxsvVarGtknphoqwx.f65490lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            esjtqupxsvVarGtknphoqwx.f65490lqeggnwhkg.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        setTitle(getContext().getString(i13));
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121924iozdgvuglv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, iobyxmoadg iobyxmoadgVar2, String str, String str2, tg.rgvfuqvkyq rgvfuqvkyqVar2) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f121923esjtqupxsv = iobyxmoadgVar;
        this.f121926lereixgezr = rgvfuqvkyqVar;
        this.f121927pmvmpeiblj = iobyxmoadgVar2;
        this.f121929zynmafqrjb = str;
        this.f121925istkbnxepw = str2;
        this.f121922cdpycssgdh = rgvfuqvkyqVar2;
        this.f121928yadqdtsiqt = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xa0.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return yggfygwlhe.btonecajqb(this.f121932zdlpuopuiu);
            }
        });
        this.f121924iozdgvuglv = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -1, 0, bool != null ? bool.booleanValue() : false, false, 21, null);
    }
}
