package npi.spay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import kk.mk;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnpi/spay/P5;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class P5 extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zdlpuopuiu.btonecajqb(this, "<this>");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_empty, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        zdlpuopuiu.dxjokdxxww(new mk(frameLayout), "inflate(layoutInflater)");
        zdlpuopuiu.dxjokdxxww(frameLayout, "binding.root");
        return frameLayout;
    }
}
