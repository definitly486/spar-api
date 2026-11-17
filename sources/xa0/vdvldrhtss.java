package xa0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textview.MaterialTextView;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class vdvldrhtss extends dt.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Date f121909cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f121910esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final dt.iobyxmoadg.zoijcleaow f121911iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Date f121912istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final tg.draadjrbmk f121913lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f121914pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gg.gtknphoqwx f121915yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Date f121916zynmafqrjb;

    public /* synthetic */ vdvldrhtss(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, String str, Date date, Date date2, Date date3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : iobyxmoadgVar, (i13 & 8) != 0 ? null : draadjrbmkVar, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : date, (i13 & 64) != 0 ? null : date2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? date3 : null);
    }

    private final void agtfadlqog() {
        Calendar calendar = Calendar.getInstance();
        DatePicker datePicker = gtknphoqwx().f65413eablkybsjg;
        calendar.set(1, datePicker.getYear());
        calendar.set(2, datePicker.getMonth());
        calendar.set(5, datePicker.getDayOfMonth());
        tg.draadjrbmk draadjrbmkVar = this.f121913lereixgezr;
        if (draadjrbmkVar != null) {
            Date time = calendar.getTime();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
            draadjrbmkVar.invoke(time);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m60.cqumvgiudr btonecajqb(vdvldrhtss vdvldrhtssVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = vdvldrhtssVar.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.databinding.DialogSpinnerDatepickerBinding");
        return (m60.cqumvgiudr) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(vdvldrhtss vdvldrhtssVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = vdvldrhtssVar.f121910esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        vdvldrhtssVar.dismiss();
    }

    private final m60.cqumvgiudr gtknphoqwx() {
        return (m60.cqumvgiudr) this.f121915yadqdtsiqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(vdvldrhtss vdvldrhtssVar, View view) {
        vdvldrhtssVar.agtfadlqog();
        vdvldrhtssVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dt.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public m60.cqumvgiudr iobyxmoadg() {
        m60.cqumvgiudr cqumvgiudrVarPpxfxbqfkf = m60.cqumvgiudr.ppxfxbqfkf(getLayoutInflater(), null, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cqumvgiudrVarPpxfxbqfkf, "inflate(...)");
        return cqumvgiudrVarPpxfxbqfkf;
    }

    @Override // dt.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(s40.gxszxtbevo.dialog_custom_insets);
        }
        m60.cqumvgiudr cqumvgiudrVarGtknphoqwx = gtknphoqwx();
        Date date = this.f121916zynmafqrjb;
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            cqumvgiudrVarGtknphoqwx.f65413eablkybsjg.init(calendar.get(1), calendar.get(2), calendar.get(5), null);
        }
        cqumvgiudrVarGtknphoqwx.f65418zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: xa0.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.draadjrbmk(this.f121903zdlpuopuiu, view);
            }
        });
        cqumvgiudrVarGtknphoqwx.f65416ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: xa0.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.wflxmlrfwp(this.f121908zdlpuopuiu, view);
            }
        });
        String str = this.f121914pmvmpeiblj;
        if (str != null) {
            MaterialTextView tvTitle = cqumvgiudrVarGtknphoqwx.f65414gxszxtbevo;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            cqumvgiudrVarGtknphoqwx.f65414gxszxtbevo.setText(str);
        }
        Date date2 = this.f121912istkbnxepw;
        if (date2 != null) {
            cqumvgiudrVarGtknphoqwx.f65413eablkybsjg.setMinDate(date2.getTime());
        }
        Date date3 = this.f121909cdpycssgdh;
        if (date3 != null) {
            cqumvgiudrVarGtknphoqwx.f65413eablkybsjg.setMaxDate(date3.getTime());
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        setTitle(getContext().getString(i13));
    }

    @Override // dt.iobyxmoadg
    protected dt.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f121911iozdgvuglv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdvldrhtss(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, String str, Date date, Date date2, Date date3) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f121910esjtqupxsv = iobyxmoadgVar;
        this.f121913lereixgezr = draadjrbmkVar;
        this.f121914pmvmpeiblj = str;
        this.f121916zynmafqrjb = date;
        this.f121912istkbnxepw = date2;
        this.f121909cdpycssgdh = date3;
        this.f121915yadqdtsiqt = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xa0.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return vdvldrhtss.btonecajqb(this.f121877zdlpuopuiu);
            }
        });
        this.f121911iozdgvuglv = dt.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -1, 0, bool != null ? bool.booleanValue() : false, false, 21, null);
    }
}
