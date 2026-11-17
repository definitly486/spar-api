package go1;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class ojitshcjhn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f38085iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f38086zoijcleaow;

    private ojitshcjhn(ConstraintLayout constraintLayout, MaterialButton materialButton) {
        this.f38085iobyxmoadg = constraintLayout;
        this.f38086zoijcleaow = materialButton;
    }

    public static ojitshcjhn iobyxmoadg(View view) {
        int i13 = on1.zoijcleaow.btnCart;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            return new ojitshcjhn((ConstraintLayout) view, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38085iobyxmoadg;
    }
}
