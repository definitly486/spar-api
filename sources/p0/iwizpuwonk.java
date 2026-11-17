package p0;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk implements jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f75230iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final v1.wypolnanlu f75231ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gg.gtknphoqwx f75232zoijcleaow = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new iobyxmoadg());

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = iwizpuwonk.this.f75230iobyxmoadg.getContext().getSystemService("input_method");
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public iwizpuwonk(View view) {
        this.f75230iobyxmoadg = view;
        this.f75231ppxfxbqfkf = new v1.wypolnanlu(view);
    }

    private final InputMethodManager nufgyqmvbu() {
        return (InputMethodManager) this.f75232zoijcleaow.getValue();
    }

    @Override // p0.jyumaefscl
    public void eablkybsjg() {
        this.f75231ppxfxbqfkf.zoijcleaow();
    }

    @Override // p0.jyumaefscl
    public void gxszxtbevo() {
        this.f75231ppxfxbqfkf.iobyxmoadg();
    }

    @Override // p0.jyumaefscl
    public void iobyxmoadg(int i13, ExtractedText extractedText) {
        nufgyqmvbu().updateExtractedText(this.f75230iobyxmoadg, i13, extractedText);
    }

    @Override // p0.jyumaefscl
    public boolean isActive() {
        return nufgyqmvbu().isActive(this.f75230iobyxmoadg);
    }

    @Override // p0.jyumaefscl
    public void ppxfxbqfkf() {
        nufgyqmvbu().restartInput(this.f75230iobyxmoadg);
    }

    @Override // p0.jyumaefscl
    public void wkgbmnqykc(CursorAnchorInfo cursorAnchorInfo) {
        nufgyqmvbu().updateCursorAnchorInfo(this.f75230iobyxmoadg, cursorAnchorInfo);
    }

    @Override // p0.jyumaefscl
    public void zoijcleaow(int i13, int i14, int i15, int i16) {
        nufgyqmvbu().updateSelection(this.f75230iobyxmoadg, i13, i14, i15, i16);
    }
}
