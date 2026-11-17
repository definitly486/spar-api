package cf;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[][] f19819iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f19820ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f19821zoijcleaow;

    public zoijcleaow(int i13, int i14) {
        this.f19819iobyxmoadg = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i14, i13);
        this.f19821zoijcleaow = i13;
        this.f19820ppxfxbqfkf = i14;
    }

    public int eablkybsjg() {
        return this.f19821zoijcleaow;
    }

    public void gxszxtbevo(int i13, int i14, int i15) {
        this.f19819iobyxmoadg[i14][i13] = (byte) i15;
    }

    public void iobyxmoadg(byte b13) {
        for (byte[] bArr : this.f19819iobyxmoadg) {
            Arrays.fill(bArr, b13);
        }
    }

    public void lqeggnwhkg(int i13, int i14, boolean z13) {
        this.f19819iobyxmoadg[i14][i13] = z13 ? (byte) 1 : (byte) 0;
    }

    public byte[][] ppxfxbqfkf() {
        return this.f19819iobyxmoadg;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder((this.f19821zoijcleaow * 2 * this.f19820ppxfxbqfkf) + 2);
        for (int i13 = 0; i13 < this.f19820ppxfxbqfkf; i13++) {
            byte[] bArr = this.f19819iobyxmoadg[i13];
            for (int i14 = 0; i14 < this.f19821zoijcleaow; i14++) {
                byte b13 = bArr[i14];
                if (b13 == 0) {
                    sb3.append(" 0");
                } else if (b13 != 1) {
                    sb3.append("  ");
                } else {
                    sb3.append(" 1");
                }
            }
            sb3.append('\n');
        }
        return sb3.toString();
    }

    public int wkgbmnqykc() {
        return this.f19820ppxfxbqfkf;
    }

    public byte zoijcleaow(int i13, int i14) {
        return this.f19819iobyxmoadg[i14][i13];
    }
}
