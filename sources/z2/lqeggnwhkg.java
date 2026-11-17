package z2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import y2.cdpycssgdh;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    public static final class eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final boolean f127694eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f127695gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final boolean f127696iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final boolean f127697ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final boolean f127698wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f127699zoijcleaow;

        private eablkybsjg(wkgbmnqykc wkgbmnqykcVar) throws ppxfxbqfkf {
            y2.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar.f127700iobyxmoadg == 1);
            byte[] bArr = new byte[wkgbmnqykcVar.f127701zoijcleaow.remaining()];
            wkgbmnqykcVar.f127701zoijcleaow.asReadOnlyBuffer().get(bArr);
            cdpycssgdh cdpycssgdhVar = new cdpycssgdh(bArr);
            cdpycssgdhVar.oxmwwwfdhm(4);
            boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
            this.f127696iobyxmoadg = zLqeggnwhkg;
            lqeggnwhkg.gxszxtbevo(zLqeggnwhkg);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                zoijcleaow(cdpycssgdhVar);
                boolean zLqeggnwhkg2 = cdpycssgdhVar.lqeggnwhkg();
                this.f127699zoijcleaow = zLqeggnwhkg2;
                if (zLqeggnwhkg2) {
                    cdpycssgdhVar.oxmwwwfdhm(47);
                }
            } else {
                this.f127699zoijcleaow = false;
            }
            boolean zLqeggnwhkg3 = cdpycssgdhVar.lqeggnwhkg();
            int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(5);
            for (int i13 = 0; i13 <= iNufgyqmvbu; i13++) {
                cdpycssgdhVar.oxmwwwfdhm(12);
                if (cdpycssgdhVar.nufgyqmvbu(5) > 7) {
                    cdpycssgdhVar.vdvldrhtss();
                }
                lqeggnwhkg.gxszxtbevo(this.f127699zoijcleaow);
                if (zLqeggnwhkg3 && cdpycssgdhVar.lqeggnwhkg()) {
                    cdpycssgdhVar.oxmwwwfdhm(4);
                }
            }
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(4);
            int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(4);
            cdpycssgdhVar.oxmwwwfdhm(iNufgyqmvbu2 + 1);
            cdpycssgdhVar.oxmwwwfdhm(iNufgyqmvbu3 + 1);
            boolean zLqeggnwhkg4 = cdpycssgdhVar.lqeggnwhkg();
            this.f127697ppxfxbqfkf = zLqeggnwhkg4;
            lqeggnwhkg.gxszxtbevo(zLqeggnwhkg4);
            cdpycssgdhVar.oxmwwwfdhm(3);
            cdpycssgdhVar.oxmwwwfdhm(4);
            boolean zLqeggnwhkg5 = cdpycssgdhVar.lqeggnwhkg();
            if (zLqeggnwhkg5) {
                cdpycssgdhVar.oxmwwwfdhm(2);
            }
            if (cdpycssgdhVar.lqeggnwhkg()) {
                this.f127698wkgbmnqykc = true;
            } else {
                this.f127698wkgbmnqykc = cdpycssgdhVar.lqeggnwhkg();
            }
            if (!this.f127698wkgbmnqykc || cdpycssgdhVar.lqeggnwhkg()) {
                this.f127694eablkybsjg = true;
            } else {
                this.f127694eablkybsjg = cdpycssgdhVar.lqeggnwhkg();
            }
            if (zLqeggnwhkg5) {
                this.f127695gxszxtbevo = cdpycssgdhVar.nufgyqmvbu(3) + 1;
            } else {
                this.f127695gxszxtbevo = 0;
            }
        }

        public static eablkybsjg iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            try {
                return new eablkybsjg(wkgbmnqykcVar);
            } catch (ppxfxbqfkf unused) {
                return null;
            }
        }

        private static void zoijcleaow(cdpycssgdh cdpycssgdhVar) {
            cdpycssgdhVar.oxmwwwfdhm(64);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                lqeggnwhkg.wkgbmnqykc(cdpycssgdhVar);
            }
        }
    }

    private static class ppxfxbqfkf extends Exception {
        private ppxfxbqfkf() {
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f127700iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final ByteBuffer f127701zoijcleaow;

        private wkgbmnqykc(int i13, ByteBuffer byteBuffer) {
            this.f127700iobyxmoadg = i13;
            this.f127701zoijcleaow = byteBuffer;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f127702iobyxmoadg;

        private zoijcleaow(eablkybsjg eablkybsjgVar, wkgbmnqykc wkgbmnqykcVar) throws ppxfxbqfkf {
            int i13 = wkgbmnqykcVar.f127700iobyxmoadg;
            y2.iobyxmoadg.iobyxmoadg(i13 == 6 || i13 == 3);
            byte[] bArr = new byte[Math.min(4, wkgbmnqykcVar.f127701zoijcleaow.remaining())];
            wkgbmnqykcVar.f127701zoijcleaow.asReadOnlyBuffer().get(bArr);
            cdpycssgdh cdpycssgdhVar = new cdpycssgdh(bArr);
            lqeggnwhkg.gxszxtbevo(eablkybsjgVar.f127696iobyxmoadg);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                this.f127702iobyxmoadg = false;
                return;
            }
            int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(2);
            boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
            lqeggnwhkg.gxszxtbevo(eablkybsjgVar.f127699zoijcleaow);
            if (!zLqeggnwhkg) {
                this.f127702iobyxmoadg = true;
                return;
            }
            boolean zLqeggnwhkg2 = (iNufgyqmvbu == 3 || iNufgyqmvbu == 0) ? true : cdpycssgdhVar.lqeggnwhkg();
            cdpycssgdhVar.vdvldrhtss();
            lqeggnwhkg.gxszxtbevo(!eablkybsjgVar.f127698wkgbmnqykc);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                lqeggnwhkg.gxszxtbevo(!eablkybsjgVar.f127694eablkybsjg);
                cdpycssgdhVar.vdvldrhtss();
            }
            lqeggnwhkg.gxszxtbevo(eablkybsjgVar.f127697ppxfxbqfkf);
            if (iNufgyqmvbu != 3) {
                cdpycssgdhVar.vdvldrhtss();
            }
            cdpycssgdhVar.oxmwwwfdhm(eablkybsjgVar.f127695gxszxtbevo);
            if (iNufgyqmvbu != 2 && iNufgyqmvbu != 0 && !zLqeggnwhkg2) {
                cdpycssgdhVar.oxmwwwfdhm(3);
            }
            this.f127702iobyxmoadg = ((iNufgyqmvbu == 3 || iNufgyqmvbu == 0) ? KotlinVersion.MAX_COMPONENT_VALUE : cdpycssgdhVar.nufgyqmvbu(8)) != 0;
        }

        public static zoijcleaow zoijcleaow(eablkybsjg eablkybsjgVar, wkgbmnqykc wkgbmnqykcVar) {
            try {
                return new zoijcleaow(eablkybsjgVar, wkgbmnqykcVar);
            } catch (ppxfxbqfkf unused) {
                return null;
            }
        }

        public boolean iobyxmoadg() {
            return this.f127702iobyxmoadg;
        }
    }

    public static List eablkybsjg(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b13 = byteBufferAsReadOnlyBuffer.get();
            int i13 = (b13 >> 3) & 15;
            if (((b13 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iPpxfxbqfkf = ((b13 >> 1) & 1) != 0 ? ppxfxbqfkf(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iPpxfxbqfkf);
            arrayList.add(new wkgbmnqykc(i13, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iPpxfxbqfkf);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gxszxtbevo(boolean z13) throws ppxfxbqfkf {
        if (z13) {
            throw new ppxfxbqfkf();
        }
    }

    private static int ppxfxbqfkf(ByteBuffer byteBuffer) {
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            byte b13 = byteBuffer.get();
            i13 |= (b13 & 127) << (i14 * 7);
            if ((b13 & 128) == 0) {
                break;
            }
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wkgbmnqykc(cdpycssgdh cdpycssgdhVar) {
        int i13 = 0;
        while (!cdpycssgdhVar.lqeggnwhkg()) {
            i13++;
        }
        if (i13 < 32) {
            cdpycssgdhVar.oxmwwwfdhm(i13);
        }
    }
}
