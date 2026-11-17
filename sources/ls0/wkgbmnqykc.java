package ls0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import b31.gxszxtbevo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textview.MaterialTextView;
import gg.gtknphoqwx;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends xr0.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Date f63969cdpycssgdh;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.iobyxmoadg f63970esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final xr0.iobyxmoadg.zoijcleaow f63971iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Date f63972istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final draadjrbmk f63973lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f63974pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gtknphoqwx f63975yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Date f63976zynmafqrjb;

    public /* synthetic */ wkgbmnqykc(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, String str, Date date, Date date2, Date date3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : iobyxmoadgVar, (i13 & 8) != 0 ? null : draadjrbmkVar, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : date, (i13 & 64) != 0 ? null : date2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? date3 : null);
    }

    private final void agtfadlqog() {
        Calendar calendar = Calendar.getInstance();
        DatePicker datePicker = gtknphoqwx().f34893eablkybsjg;
        calendar.set(1, datePicker.getYear());
        calendar.set(2, datePicker.getMonth());
        calendar.set(5, datePicker.getDayOfMonth());
        draadjrbmk draadjrbmkVar = this.f63973lereixgezr;
        if (draadjrbmkVar != null) {
            Date time = calendar.getTime();
            zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
            draadjrbmkVar.invoke(time);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fr0.iobyxmoadg btonecajqb(wkgbmnqykc wkgbmnqykcVar) {
        a6.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        zdlpuopuiu.nufgyqmvbu(iobyxmoadgVarPpxfxbqfkf, "null cannot be cast to non-null type ru.myspar.proloyalty.common.databinding.DialogSpinnerDatepickerProloyaltyBinding");
        return (fr0.iobyxmoadg) iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, View view) {
        tg.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f63970esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        wkgbmnqykcVar.dismiss();
    }

    private final fr0.iobyxmoadg gtknphoqwx() {
        return (fr0.iobyxmoadg) this.f63975yadqdtsiqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.agtfadlqog();
        wkgbmnqykcVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xr0.iobyxmoadg
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public fr0.iobyxmoadg iobyxmoadg() {
        fr0.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = fr0.iobyxmoadg.ppxfxbqfkf(getLayoutInflater(), null, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    @Override // xr0.iobyxmoadg, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(gxszxtbevo.dialog_custom_insets);
        }
        fr0.iobyxmoadg iobyxmoadgVarGtknphoqwx = gtknphoqwx();
        Date date = this.f63976zynmafqrjb;
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            iobyxmoadgVarGtknphoqwx.f34893eablkybsjg.init(calendar.get(1), calendar.get(2), calendar.get(5), null);
        }
        iobyxmoadgVarGtknphoqwx.f34898zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ls0.zoijcleaow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.draadjrbmk(this.f63977zdlpuopuiu, view);
            }
        });
        iobyxmoadgVarGtknphoqwx.f34896ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: ls0.ppxfxbqfkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkgbmnqykc.wflxmlrfwp(this.f63968zdlpuopuiu, view);
            }
        });
        String str = this.f63974pmvmpeiblj;
        if (str != null) {
            MaterialTextView tvTitle = iobyxmoadgVarGtknphoqwx.f34894gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            iobyxmoadgVarGtknphoqwx.f34894gxszxtbevo.setText(str);
        }
        Date date2 = this.f63972istkbnxepw;
        if (date2 != null) {
            iobyxmoadgVarGtknphoqwx.f34893eablkybsjg.setMinDate(date2.getTime());
        }
        Date date3 = this.f63969cdpycssgdh;
        if (date3 != null) {
            iobyxmoadgVarGtknphoqwx.f34893eablkybsjg.setMaxDate(date3.getTime());
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i13) {
        setTitle(getContext().getString(i13));
    }

    @Override // xr0.iobyxmoadg
    protected xr0.iobyxmoadg.zoijcleaow wkgbmnqykc() {
        return this.f63971iozdgvuglv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, Boolean bool, tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, String str, Date date, Date date2, Date date3) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f63970esjtqupxsv = iobyxmoadgVar;
        this.f63973lereixgezr = draadjrbmkVar;
        this.f63974pmvmpeiblj = str;
        this.f63976zynmafqrjb = date;
        this.f63972istkbnxepw = date2;
        this.f63969cdpycssgdh = date3;
        this.f63975yadqdtsiqt = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ls0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.btonecajqb(this.f63967zdlpuopuiu);
            }
        });
        this.f63971iozdgvuglv = xr0.iobyxmoadg.zoijcleaow.zoijcleaow(super.wkgbmnqykc(), 0.0f, -1, 0, bool != null ? bool.booleanValue() : false, false, 21, null);
    }
}
