package androidx.media3.exoplayer.video;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private z2.lqeggnwhkg.eablkybsjg f11544iobyxmoadg;

    iobyxmoadg() {
    }

    private void eablkybsjg(List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (((z2.lqeggnwhkg.wkgbmnqykc) list.get(i13)).f127700iobyxmoadg == 1) {
                this.f11544iobyxmoadg = z2.lqeggnwhkg.eablkybsjg.iobyxmoadg((z2.lqeggnwhkg.wkgbmnqykc) list.get(i13));
            }
        }
    }

    private boolean iobyxmoadg(z2.lqeggnwhkg.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        z2.lqeggnwhkg.eablkybsjg eablkybsjgVar;
        int i13 = wkgbmnqykcVar.f127700iobyxmoadg;
        if (i13 == 2 || i13 == 15) {
            return true;
        }
        if (i13 == 3 && !z13) {
            return false;
        }
        if ((i13 != 6 && i13 != 3) || (eablkybsjgVar = this.f11544iobyxmoadg) == null) {
            return false;
        }
        z2.lqeggnwhkg.zoijcleaow zoijcleaowVarZoijcleaow = z2.lqeggnwhkg.zoijcleaow.zoijcleaow(eablkybsjgVar, wkgbmnqykcVar);
        return (zoijcleaowVarZoijcleaow == null || zoijcleaowVarZoijcleaow.iobyxmoadg()) ? false : true;
    }

    public void ppxfxbqfkf() {
        this.f11544iobyxmoadg = null;
    }

    public int wkgbmnqykc(ByteBuffer byteBuffer, boolean z13) {
        List listEablkybsjg = z2.lqeggnwhkg.eablkybsjg(byteBuffer);
        eablkybsjg(listEablkybsjg);
        int size = listEablkybsjg.size() - 1;
        int i13 = 0;
        while (size >= 0 && iobyxmoadg((z2.lqeggnwhkg.wkgbmnqykc) listEablkybsjg.get(size), z13)) {
            if (((z2.lqeggnwhkg.wkgbmnqykc) listEablkybsjg.get(size)).f127700iobyxmoadg == 6 || ((z2.lqeggnwhkg.wkgbmnqykc) listEablkybsjg.get(size)).f127700iobyxmoadg == 3) {
                i13++;
            }
            size--;
        }
        if (i13 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? ((z2.lqeggnwhkg.wkgbmnqykc) listEablkybsjg.get(size)).f127701zoijcleaow.limit() : byteBuffer.position();
    }

    public void zoijcleaow(ByteBuffer byteBuffer) {
        eablkybsjg(z2.lqeggnwhkg.eablkybsjg(byteBuffer));
    }
}
