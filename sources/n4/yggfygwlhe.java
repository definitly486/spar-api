package n4;

import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final byte[] f68707eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final boolean f68708iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final dsvhmnatus.iobyxmoadg f68709ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f68710wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f68711zoijcleaow;

    public yggfygwlhe(boolean z13, String str, int i13, byte[] bArr, int i14, int i15, byte[] bArr2) {
        y2.iobyxmoadg.iobyxmoadg((bArr2 == null) ^ (i13 == 0));
        this.f68708iobyxmoadg = z13;
        this.f68711zoijcleaow = str;
        this.f68710wkgbmnqykc = i13;
        this.f68707eablkybsjg = bArr2;
        this.f68709ppxfxbqfkf = new dsvhmnatus.iobyxmoadg(iobyxmoadg(str), bArr, i14, i15);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int iobyxmoadg(String str) {
        if (str == null) {
            return 1;
        }
        byte b13 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b13 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b13 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b13 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b13 = 3;
                }
                break;
        }
        switch (b13) {
            case 0:
            case 1:
                return 2;
            default:
                y2.kcexrzcfyt.nufgyqmvbu("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
