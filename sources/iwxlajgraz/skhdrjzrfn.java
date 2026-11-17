package iwxlajgraz;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class skhdrjzrfn implements iwxlajgraz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f49928iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final v1.wypolnanlu f49929ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gg.gtknphoqwx f49930zoijcleaow = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: iwxlajgraz.dvvnrvtcbc
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return skhdrjzrfn.nufgyqmvbu(this.f49843zdlpuopuiu);
        }
    });

    public skhdrjzrfn(View view) {
        this.f49928iobyxmoadg = view;
        this.f49929ppxfxbqfkf = new v1.wypolnanlu(view);
    }

    private final InputMethodManager lqeggnwhkg() {
        return (InputMethodManager) this.f49930zoijcleaow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputMethodManager nufgyqmvbu(skhdrjzrfn skhdrjzrfnVar) {
        Object systemService = skhdrjzrfnVar.f49928iobyxmoadg.getContext().getSystemService("input_method");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @Override // iwxlajgraz.iwxlajgraz
    public void eablkybsjg() {
        if (Build.VERSION.SDK_INT >= 34) {
            lqeggnwhkg.f49900iobyxmoadg.iobyxmoadg(lqeggnwhkg(), this.f49928iobyxmoadg);
        }
    }

    @Override // iwxlajgraz.iwxlajgraz
    public void iobyxmoadg(int i13, ExtractedText extractedText) {
        lqeggnwhkg().updateExtractedText(this.f49928iobyxmoadg, i13, extractedText);
    }

    @Override // iwxlajgraz.iwxlajgraz
    public boolean isActive() {
        return lqeggnwhkg().isActive(this.f49928iobyxmoadg);
    }

    @Override // iwxlajgraz.iwxlajgraz
    public void ppxfxbqfkf() {
        lqeggnwhkg().restartInput(this.f49928iobyxmoadg);
    }

    @Override // iwxlajgraz.iwxlajgraz
    public void wkgbmnqykc(CursorAnchorInfo cursorAnchorInfo) {
        lqeggnwhkg().updateCursorAnchorInfo(this.f49928iobyxmoadg, cursorAnchorInfo);
    }

    @Override // iwxlajgraz.iwxlajgraz
    public void zoijcleaow(int i13, int i14, int i15, int i16) {
        lqeggnwhkg().updateSelection(this.f49928iobyxmoadg, i13, i14, i15, i16);
    }
}
