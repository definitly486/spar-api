package x81;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class vdvldrhtss extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final tg.rgvfuqvkyq f121517cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f121518esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f121519iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final String f121520istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final tg.rgvfuqvkyq f121521lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final iobyxmoadg f121522pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gg.gtknphoqwx f121523yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f121524zynmafqrjb;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f121525iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f121526zoijcleaow;

        public iobyxmoadg(int i13, int i14) {
            this.f121525iobyxmoadg = i13;
            this.f121526zoijcleaow = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f121525iobyxmoadg == iobyxmoadgVar.f121525iobyxmoadg && this.f121526zoijcleaow == iobyxmoadgVar.f121526zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f121525iobyxmoadg) * 31) + Integer.hashCode(this.f121526zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f121525iobyxmoadg;
        }

        public String toString() {
            return "SetTimeParams(hour=" + this.f121525iobyxmoadg + ", minute=" + this.f121526zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f121526zoijcleaow;
        }
    }

    public /* synthetic */ vdvldrhtss(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, iobyxmoadg iobyxmoadgVar2, String str, String str2, tg.rgvfuqvkyq rgvfuqvkyqVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : iobyxmoadgVar, (i13 & 8) != 0 ? null : rgvfuqvkyqVar, (i13 & 16) != 0 ? null : iobyxmoadgVar2, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? null : str2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? rgvfuqvkyqVar2 : null);
    }

    private final void agtfadlqog() {
        z41.zdlpuopuiu zdlpuopuiuVarGtknphoqwx = gtknphoqwx();
        tg.rgvfuqvkyq rgvfuqvkyqVar = this.f121517cdpycssgdh;
        if (rgvfuqvkyqVar == null || ((Boolean) rgvfuqvkyqVar.invoke(Integer.valueOf(zdlpuopuiuVarGtknphoqwx.f128562eablkybsjg.getHour()), Integer.valueOf(zdlpuopuiuVarGtknphoqwx.f128562eablkybsjg.getMinute()))).booleanValue()) {
            tg.rgvfuqvkyq rgvfuqvkyqVar2 = this.f121521lereixgezr;
            if (rgvfuqvkyqVar2 != null) {
                rgvfuqvkyqVar2.invoke(Integer.valueOf(zdlpuopuiuVarGtknphoqwx.f128562eablkybsjg.getHour()), Integer.valueOf(zdlpuopuiuVarGtknphoqwx.f128562eablkybsjg.getMinute()));
            }
            dismiss();
            return;
        }
        String str = this.f121520istkbnxepw;
        if (str != null) {
            zdlpuopuiuVarGtknphoqwx.f128563gxszxtbevo.setText(str);
            MaterialTextView tvErrorMessage = zdlpuopuiuVarGtknphoqwx.f128563gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvErrorMessage, "tvErrorMessage");
            tvErrorMessage.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z41.zdlpuopuiu btonecajqb(vdvldrhtss vdvldrhtssVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = vdvldrhtssVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.databinding.DialogSpinnerTimepickerProloyaltyBinding");
        return (z41.zdlpuopuiu) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(vdvldrhtss vdvldrhtssVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = vdvldrhtssVar.f121518esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        vdvldrhtssVar.dismiss();
    }

    private final z41.zdlpuopuiu gtknphoqwx() {
        return (z41.zdlpuopuiu) this.f121523yadqdtsiqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(vdvldrhtss vdvldrhtssVar, View view) {
        vdvldrhtssVar.agtfadlqog();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public z41.zdlpuopuiu iobyxmoadg() {
        z41.zdlpuopuiu zdlpuopuiuVarPpxfxbqfkf = z41.zdlpuopuiu.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarPpxfxbqfkf, "inflate(...)");
        return zdlpuopuiuVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(b31.gxszxtbevo.dialog_custom_insets);
        }
        z41.zdlpuopuiu zdlpuopuiuVarGtknphoqwx = gtknphoqwx();
        zdlpuopuiuVarGtknphoqwx.f128562eablkybsjg.setIs24HourView(Boolean.TRUE);
        iobyxmoadg iobyxmoadgVar = this.f121522pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            zdlpuopuiuVarGtknphoqwx.f128562eablkybsjg.setMinute(iobyxmoadgVar.zoijcleaow());
            zdlpuopuiuVarGtknphoqwx.f128562eablkybsjg.setHour(iobyxmoadgVar.iobyxmoadg());
        }
        zdlpuopuiuVarGtknphoqwx.f128568zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: x81.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.draadjrbmk(this.f121511zdlpuopuiu, view);
            }
        });
        zdlpuopuiuVarGtknphoqwx.f128566ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: x81.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.wflxmlrfwp(this.f121516zdlpuopuiu, view);
            }
        });
        String str = this.f121524zynmafqrjb;
        if (str != null) {
            MaterialTextView tvTitle = zdlpuopuiuVarGtknphoqwx.f128565lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            zdlpuopuiuVarGtknphoqwx.f128565lqeggnwhkg.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        setTitle(getContext().getString(i13));
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121519iozdgvuglv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdvldrhtss(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, iobyxmoadg iobyxmoadgVar2, String str, String str2, tg.rgvfuqvkyq rgvfuqvkyqVar2) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f121518esjtqupxsv = iobyxmoadgVar;
        this.f121521lereixgezr = rgvfuqvkyqVar;
        this.f121522pmvmpeiblj = iobyxmoadgVar2;
        this.f121524zynmafqrjb = str;
        this.f121520istkbnxepw = str2;
        this.f121517cdpycssgdh = rgvfuqvkyqVar2;
        this.f121523yadqdtsiqt = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x81.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return vdvldrhtss.btonecajqb(this.f121490zdlpuopuiu);
            }
        });
        this.f121519iozdgvuglv = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -1, 0, bool != null ? bool.booleanValue() : false, false, 21, null);
    }
}
