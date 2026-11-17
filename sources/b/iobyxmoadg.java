package b;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f14829iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final AutofillManager f14830ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private AutofillId f14831wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f14832zoijcleaow;

    public iobyxmoadg(View view, ojitshcjhn ojitshcjhnVar) {
        this.f14829iobyxmoadg = view;
        this.f14832zoijcleaow = ojitshcjhnVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f14830ppxfxbqfkf = autofillManager;
        view.setImportantForAutofill(1);
        c0.iobyxmoadg iobyxmoadgVarIobyxmoadg = c0.wkgbmnqykc.iobyxmoadg(view);
        AutofillId autofillIdIobyxmoadg = iobyxmoadgVarIobyxmoadg != null ? iobyxmoadgVarIobyxmoadg.iobyxmoadg() : null;
        if (autofillIdIobyxmoadg != null) {
            this.f14831wkgbmnqykc = autofillIdIobyxmoadg;
        } else {
            w.iobyxmoadg.ppxfxbqfkf("Required value was null.");
            throw new KotlinNothingValueException();
        }
    }

    public final AutofillManager iobyxmoadg() {
        return this.f14830ppxfxbqfkf;
    }

    public final AutofillId ppxfxbqfkf() {
        return this.f14831wkgbmnqykc;
    }

    public final View wkgbmnqykc() {
        return this.f14829iobyxmoadg;
    }

    public final ojitshcjhn zoijcleaow() {
        return this.f14832zoijcleaow;
    }
}
