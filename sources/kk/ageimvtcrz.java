package kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ageimvtcrz extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final ageimvtcrz f55815zdlpuopuiu = new ageimvtcrz();

    public ageimvtcrz() {
        super(3, o1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lspay/sdk/databinding/SpayRvItemCardSelectionHeaderBinding;", 0);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p13 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
        View viewInflate = p13.inflate(R.layout.spay_rv_item_card_selection_header, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i13 = R.id.spay_sricsh_actv_header_not_enough_money;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
        return new o1(linearLayoutCompat, appCompatTextView, linearLayoutCompat);
    }
}
