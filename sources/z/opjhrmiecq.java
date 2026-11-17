package z;

import android.view.View;
import androidx.compose.ui.platform.b0;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.platform.o;
import androidx.compose.ui.platform.w;

/* JADX INFO: loaded from: classes.dex */
public interface opjhrmiecq extends t.dsvhmnatus {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final iobyxmoadg f127131kcexrzcfyt = iobyxmoadg.f127132iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f127132iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static boolean f127133zoijcleaow;

        private iobyxmoadg() {
        }

        public final boolean iobyxmoadg() {
            return f127133zoijcleaow;
        }
    }

    public interface zoijcleaow {
        void draadjrbmk();
    }

    static /* synthetic */ void dsvhmnatus(opjhrmiecq opjhrmiecqVar, pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        opjhrmiecqVar.gxszxtbevo(pkzmftpjixVar, z13, z14);
    }

    static /* synthetic */ void esjtqupxsv(opjhrmiecq opjhrmiecqVar, pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        if ((i13 & 8) != 0) {
            z15 = true;
        }
        opjhrmiecqVar.iozdgvuglv(pkzmftpjixVar, z13, z14, z15);
    }

    static /* synthetic */ void lereixgezr(opjhrmiecq opjhrmiecqVar, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        opjhrmiecqVar.ppxfxbqfkf(z13);
    }

    static /* synthetic */ void ojitshcjhn(opjhrmiecq opjhrmiecqVar, pkzmftpjix pkzmftpjixVar, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        opjhrmiecqVar.cqumvgiudr(pkzmftpjixVar, z13);
    }

    static /* synthetic */ bfopjjpdmp zdlpuopuiu(opjhrmiecq opjhrmiecqVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.iobyxmoadg iobyxmoadgVar, k.ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i13 & 4) != 0) {
            ppxfxbqfkfVar = null;
        }
        return opjhrmiecqVar.pkzmftpjix(rgvfuqvkyqVar, iobyxmoadgVar, ppxfxbqfkfVar);
    }

    void agtfadlqog(long j13);

    void btonecajqb(pkzmftpjix pkzmftpjixVar);

    void cdpycssgdh(float f13);

    void cllcsxoeiz(tg.iobyxmoadg iobyxmoadgVar);

    void cqumvgiudr(pkzmftpjix pkzmftpjixVar, boolean z13);

    void draadjrbmk(pkzmftpjix pkzmftpjixVar, int i13);

    long dxjokdxxww(long j13);

    androidx.compose.ui.platform.dxjokdxxww getAccessibilityManager();

    b.lqeggnwhkg getAutofill();

    b.agtfadlqog getAutofillManager();

    b.ojitshcjhn getAutofillTree();

    androidx.compose.ui.platform.iyctptxqzt getClipboard();

    androidx.compose.ui.platform.weqkydbzbr getClipboardManager();

    lg.btonecajqb getCoroutineContext();

    w0.wkgbmnqykc getDensity();

    d.ppxfxbqfkf getDragAndDropManager();

    f.btonecajqb getFocusOwner();

    n0.wflxmlrfwp.zoijcleaow getFontFamilyResolver();

    n0.draadjrbmk.iobyxmoadg getFontLoader();

    h.auzgnhcxok getGraphicsContext();

    o.iobyxmoadg getHapticFeedBack();

    p.zoijcleaow getInputModeManager();

    w0.zdlpuopuiu getLayoutDirection();

    y.gxszxtbevo getModifierLocalManager();

    oipsdeybqn getOutOfFrameExecutor();

    androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg getPlacementScope();

    t.cqumvgiudr getPointerIconService();

    h0.zoijcleaow getRectManager();

    pkzmftpjix getRoot();

    g0.iwizpuwonk getSemanticsOwner();

    jpowsppfya getSharedDrawScope();

    boolean getShowLayoutBounds();

    weqkydbzbr getSnapshotObserver();

    m getSoftwareKeyboardController();

    p0.ntlheqmsrt getTextInputService();

    o getTextToolbar();

    w getViewConfiguration();

    b0 getWindowInfo();

    void gtknphoqwx(View view);

    void gxszxtbevo(pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14);

    void hcddaimhww();

    void iozdgvuglv(pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14, boolean z15);

    long istkbnxepw(long j13);

    void iwizpuwonk(pkzmftpjix pkzmftpjixVar);

    void jpowsppfya();

    void jyumaefscl(pkzmftpjix pkzmftpjixVar);

    void kcexrzcfyt(pkzmftpjix pkzmftpjixVar, long j13);

    void lmojexxdyd(pkzmftpjix pkzmftpjixVar, int i13);

    bfopjjpdmp pkzmftpjix(tg.rgvfuqvkyq rgvfuqvkyqVar, tg.iobyxmoadg iobyxmoadgVar, k.ppxfxbqfkf ppxfxbqfkfVar);

    void ppxfxbqfkf(boolean z13);

    void rgvfuqvkyq(pkzmftpjix pkzmftpjixVar);

    void setShowLayoutBounds(boolean z13);

    Object wwaezpbzkn(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar);

    void yadqdtsiqt(pkzmftpjix pkzmftpjixVar);

    void yggfygwlhe(pkzmftpjix pkzmftpjixVar);

    void ylkuphrtab(pkzmftpjix pkzmftpjixVar);
}
