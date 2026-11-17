package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import spay.sdk.view.PhoneNumberCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class v80 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialButton f58975eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ConstraintLayout f58976iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final PhoneNumberCompositeView f58977ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f58978wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatButton f58979zoijcleaow;

    public v80(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, PhoneNumberCompositeView phoneNumberCompositeView, AppCompatTextView appCompatTextView, MaterialButton materialButton) {
        this.f58976iobyxmoadg = constraintLayout;
        this.f58979zoijcleaow = appCompatButton;
        this.f58977ppxfxbqfkf = phoneNumberCompositeView;
        this.f58978wkgbmnqykc = appCompatTextView;
        this.f58975eablkybsjg = materialButton;
    }

    @Override // a6.iobyxmoadg
    public final View getRoot() {
        return this.f58976iobyxmoadg;
    }
}
