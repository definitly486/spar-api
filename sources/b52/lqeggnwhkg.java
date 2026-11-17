package b52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.myspar.specialbanner.impl.presentation.views.RegistrationFormView;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RegistrationFormView f15324iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final RegistrationFormView f15325zoijcleaow;

    private lqeggnwhkg(RegistrationFormView registrationFormView, RegistrationFormView registrationFormView2) {
        this.f15324iobyxmoadg = registrationFormView;
        this.f15325zoijcleaow = registrationFormView2;
    }

    public static lqeggnwhkg iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RegistrationFormView registrationFormView = (RegistrationFormView) view;
        return new lqeggnwhkg(registrationFormView, registrationFormView);
    }

    public static lqeggnwhkg ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(t42.zoijcleaow.item_special_banner_form, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public RegistrationFormView getRoot() {
        return this.f15324iobyxmoadg;
    }
}
