package n0;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
final class kegysxyocb implements wypolnanlu {
    private final Typeface ppxfxbqfkf(String str, yadqdtsiqt yadqdtsiqtVar, int i13) {
        lereixgezr.iobyxmoadg iobyxmoadgVar = lereixgezr.f68283zoijcleaow;
        if (lereixgezr.gxszxtbevo(i13, iobyxmoadgVar.zoijcleaow()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yadqdtsiqtVar, yadqdtsiqt.f68367yggfygwlhe.wkgbmnqykc()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), yadqdtsiqtVar.dxjokdxxww(), lereixgezr.gxszxtbevo(i13, iobyxmoadgVar.iobyxmoadg()));
    }

    @Override // n0.wypolnanlu
    public Typeface iobyxmoadg(yadqdtsiqt yadqdtsiqtVar, int i13) {
        return ppxfxbqfkf(null, yadqdtsiqtVar, i13);
    }

    @Override // n0.wypolnanlu
    public Typeface zoijcleaow(ylkuphrtab ylkuphrtabVar, yadqdtsiqt yadqdtsiqtVar, int i13) {
        return ppxfxbqfkf(ylkuphrtabVar.gxszxtbevo(), yadqdtsiqtVar, i13);
    }
}
