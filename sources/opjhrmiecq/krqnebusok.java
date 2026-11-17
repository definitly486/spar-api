package opjhrmiecq;

import android.R;
import android.content.res.Resources;
import android.os.Build;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'iwizpuwonk' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class krqnebusok {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final krqnebusok f73767cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final krqnebusok f73768esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f73769istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final krqnebusok f73770iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final krqnebusok f73771lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final krqnebusok f73772pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final /* synthetic */ krqnebusok[] f73773zynmafqrjb;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f73774jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f73775yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f73776zdlpuopuiu;

    static {
        lrnfpwlwnk.eablkybsjg eablkybsjgVar = lrnfpwlwnk.eablkybsjg.f63949iobyxmoadg;
        f73770iwizpuwonk = new krqnebusok("Cut", 0, eablkybsjgVar.ppxfxbqfkf(), R.string.cut, R.attr.actionModeCutDrawable);
        f73767cqumvgiudr = new krqnebusok("Copy", 1, eablkybsjgVar.zoijcleaow(), R.string.copy, R.attr.actionModeCopyDrawable);
        f73768esjtqupxsv = new krqnebusok("Paste", 2, eablkybsjgVar.wkgbmnqykc(), R.string.paste, R.attr.actionModePasteDrawable);
        f73771lereixgezr = new krqnebusok("SelectAll", 3, eablkybsjgVar.eablkybsjg(), R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        f73772pmvmpeiblj = new krqnebusok("Autofill", 4, eablkybsjgVar.iobyxmoadg(), Build.VERSION.SDK_INT <= 26 ? ikoacuggdj.iyctptxqzt.autofill : R.string.autofill, 0);
        krqnebusok[] krqnebusokVarArrIobyxmoadg = iobyxmoadg();
        f73773zynmafqrjb = krqnebusokVarArrIobyxmoadg;
        f73769istkbnxepw = ng.zoijcleaow.iobyxmoadg(krqnebusokVarArrIobyxmoadg);
    }

    private krqnebusok(String str, int i13, Object obj, int i14, int i15) {
        super(str, i13);
        this.f73776zdlpuopuiu = obj;
        this.f73775yggfygwlhe = i14;
        this.f73774jyumaefscl = i15;
    }

    private static final /* synthetic */ krqnebusok[] iobyxmoadg() {
        return new krqnebusok[]{f73770iwizpuwonk, f73767cqumvgiudr, f73768esjtqupxsv, f73771lereixgezr, f73772pmvmpeiblj};
    }

    public static krqnebusok valueOf(String str) {
        return (krqnebusok) Enum.valueOf(krqnebusok.class, str);
    }

    public static krqnebusok[] values() {
        return (krqnebusok[]) f73773zynmafqrjb.clone();
    }

    public final String dxjokdxxww(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-309609081, i13, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:188)");
        }
        String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(this.f73775yggfygwlhe, draadjrbmkVar, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return strPpxfxbqfkf;
    }

    public final Object lqeggnwhkg() {
        return this.f73776zdlpuopuiu;
    }

    public final String nufgyqmvbu(Resources resources) {
        return resources.getString(this.f73775yggfygwlhe);
    }

    public final int wkgbmnqykc() {
        return this.f73774jyumaefscl;
    }
}
