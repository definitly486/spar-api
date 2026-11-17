package ml;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final am.iobyxmoadg f67388ppxfxbqfkf = am.zoijcleaow.dxjokdxxww(iobyxmoadg.class);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f67389iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private MessageDigest f67390zoijcleaow;

    public iobyxmoadg(String str, String str2) {
        this.f67390zoijcleaow = rl.ppxfxbqfkf.iobyxmoadg(str, str2);
        ppxfxbqfkf();
    }

    private void ppxfxbqfkf() {
        this.f67389iobyxmoadg = rl.iobyxmoadg.iobyxmoadg(this.f67390zoijcleaow.getDigestLength());
        if (wkgbmnqykc()) {
            f67388ppxfxbqfkf.dxjokdxxww("Hash Algorithm: {} with hashlen: {} bits", this.f67390zoijcleaow.getAlgorithm(), Integer.valueOf(this.f67389iobyxmoadg));
        }
    }

    private boolean wkgbmnqykc() {
        return false;
    }

    @Override // ml.ppxfxbqfkf
    public byte[] iobyxmoadg(byte[] bArr, int i13, byte[] bArr2) {
        long jZoijcleaow = zoijcleaow(i13);
        if (wkgbmnqykc()) {
            am.iobyxmoadg iobyxmoadgVar = f67388ppxfxbqfkf;
            iobyxmoadgVar.zdlpuopuiu("reps: {}", String.valueOf(jZoijcleaow));
            iobyxmoadgVar.zdlpuopuiu("otherInfo: {}", rl.iobyxmoadg.rgvfuqvkyq(bArr2));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i14 = 1; i14 <= jZoijcleaow; i14++) {
            byte[] bArrGxszxtbevo = rl.iobyxmoadg.gxszxtbevo(i14);
            if (wkgbmnqykc()) {
                am.iobyxmoadg iobyxmoadgVar2 = f67388ppxfxbqfkf;
                iobyxmoadgVar2.zdlpuopuiu("rep {} hashing ", Integer.valueOf(i14));
                iobyxmoadgVar2.zdlpuopuiu(" counter: {}", rl.iobyxmoadg.rgvfuqvkyq(bArrGxszxtbevo));
                iobyxmoadgVar2.zdlpuopuiu(" z: {}", rl.iobyxmoadg.rgvfuqvkyq(bArr));
                iobyxmoadgVar2.zdlpuopuiu(" otherInfo: {}", rl.iobyxmoadg.rgvfuqvkyq(bArr2));
            }
            this.f67390zoijcleaow.update(bArrGxszxtbevo);
            this.f67390zoijcleaow.update(bArr);
            this.f67390zoijcleaow.update(bArr2);
            byte[] bArrDigest = this.f67390zoijcleaow.digest();
            if (wkgbmnqykc()) {
                f67388ppxfxbqfkf.dxjokdxxww(" k({}): {}", Integer.valueOf(i14), rl.iobyxmoadg.rgvfuqvkyq(bArrDigest));
            }
            byteArrayOutputStream.write(bArrDigest, 0, bArrDigest.length);
        }
        int iPpxfxbqfkf = rl.iobyxmoadg.ppxfxbqfkf(i13);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (wkgbmnqykc()) {
            f67388ppxfxbqfkf.zdlpuopuiu("derived key material: {}", rl.iobyxmoadg.rgvfuqvkyq(byteArray));
        }
        if (byteArray.length != iPpxfxbqfkf) {
            byteArray = rl.iobyxmoadg.ojitshcjhn(byteArray, 0, iPpxfxbqfkf);
            if (wkgbmnqykc()) {
                f67388ppxfxbqfkf.dxjokdxxww("first {} bits of derived key material: {}", Integer.valueOf(i13), rl.iobyxmoadg.rgvfuqvkyq(byteArray));
            }
        }
        if (wkgbmnqykc()) {
            f67388ppxfxbqfkf.zdlpuopuiu("final derived key material: {}", rl.iobyxmoadg.rgvfuqvkyq(byteArray));
        }
        return byteArray;
    }

    long zoijcleaow(int i13) {
        return (int) Math.ceil(i13 / this.f67389iobyxmoadg);
    }
}
