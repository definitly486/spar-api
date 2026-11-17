package z4;

import java.util.ArrayList;
import java.util.Collections;
import q4.oxmwwwfdhm;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f127760iobyxmoadg = new yadqdtsiqt();

    private static x2.iobyxmoadg eablkybsjg(yadqdtsiqt yadqdtsiqtVar, int i13) {
        CharSequence charSequenceOxmwwwfdhm = null;
        x2.iobyxmoadg.zoijcleaow zoijcleaowVarRgvfuqvkyq = null;
        while (i13 > 0) {
            y2.iobyxmoadg.zoijcleaow(i13 >= 8, "Incomplete vtt cue box header found.");
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            int i14 = iVdvldrhtss - 8;
            String strWwaezpbzkn = stevsuqkhv.wwaezpbzkn(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo(), i14);
            yadqdtsiqtVar.crxdokpmqz(i14);
            i13 = (i13 - 8) - i14;
            if (iVdvldrhtss2 == 1937011815) {
                zoijcleaowVarRgvfuqvkyq = eablkybsjg.rgvfuqvkyq(strWwaezpbzkn);
            } else if (iVdvldrhtss2 == 1885436268) {
                charSequenceOxmwwwfdhm = eablkybsjg.oxmwwwfdhm(null, strWwaezpbzkn.trim(), Collections.emptyList());
            }
        }
        if (charSequenceOxmwwwfdhm == null) {
            charSequenceOxmwwwfdhm = "";
        }
        return zoijcleaowVarRgvfuqvkyq != null ? zoijcleaowVarRgvfuqvkyq.ojitshcjhn(charSequenceOxmwwwfdhm).iobyxmoadg() : eablkybsjg.wflxmlrfwp(charSequenceOxmwwwfdhm);
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        this.f127760iobyxmoadg.ntlheqmsrt(bArr, i14 + i13);
        this.f127760iobyxmoadg.sopmlzcsov(i13);
        ArrayList arrayList = new ArrayList();
        while (this.f127760iobyxmoadg.iobyxmoadg() > 0) {
            y2.iobyxmoadg.zoijcleaow(this.f127760iobyxmoadg.iobyxmoadg() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iVdvldrhtss = this.f127760iobyxmoadg.vdvldrhtss();
            if (this.f127760iobyxmoadg.vdvldrhtss() == 1987343459) {
                arrayList.add(eablkybsjg(this.f127760iobyxmoadg, iVdvldrhtss - 8));
            } else {
                this.f127760iobyxmoadg.crxdokpmqz(iVdvldrhtss - 8);
            }
        }
        wflxmlrfwpVar.accept(new q4.eablkybsjg(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 2;
    }
}
