package n0;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wypolnanlu f68261iobyxmoadg = mbcevpiqjq.iobyxmoadg();

    public ikoacuggdj iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, jpowsppfya jpowsppfyaVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        Typeface typefaceIobyxmoadg;
        wflxmlrfwp wflxmlrfwpVarPpxfxbqfkf = ribwqtqdhbVar.ppxfxbqfkf();
        if (wflxmlrfwpVarPpxfxbqfkf == null || (wflxmlrfwpVarPpxfxbqfkf instanceof btonecajqb)) {
            typefaceIobyxmoadg = this.f68261iobyxmoadg.iobyxmoadg(ribwqtqdhbVar.gxszxtbevo(), ribwqtqdhbVar.wkgbmnqykc());
        } else if (wflxmlrfwpVarPpxfxbqfkf instanceof ylkuphrtab) {
            typefaceIobyxmoadg = this.f68261iobyxmoadg.zoijcleaow((ylkuphrtab) ribwqtqdhbVar.ppxfxbqfkf(), ribwqtqdhbVar.gxszxtbevo(), ribwqtqdhbVar.wkgbmnqykc());
        } else {
            if (!(wflxmlrfwpVarPpxfxbqfkf instanceof pkzmftpjix)) {
                return null;
            }
            sopmlzcsov sopmlzcsovVarGxszxtbevo = ((pkzmftpjix) ribwqtqdhbVar.ppxfxbqfkf()).gxszxtbevo();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(sopmlzcsovVarGxszxtbevo, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceIobyxmoadg = ((s0.gtknphoqwx) sopmlzcsovVarGxszxtbevo).iobyxmoadg(ribwqtqdhbVar.gxszxtbevo(), ribwqtqdhbVar.wkgbmnqykc(), ribwqtqdhbVar.eablkybsjg());
        }
        return new ikoacuggdj.zoijcleaow(typefaceIobyxmoadg, false, 2, null);
    }
}
