package ra;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg extends wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    float f82292iobyxmoadg = -1.0f;

    @Override // ra.wkgbmnqykc
    public void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, float f13, float f14, float f15) {
        wflxmlrfwpVar.ojitshcjhn(0.0f, f15 * f14, 180.0f, 180.0f - f13);
        double d13 = f15;
        double d14 = f14;
        wflxmlrfwpVar.wflxmlrfwp((float) (Math.sin(Math.toRadians(f13)) * d13 * d14), (float) (Math.sin(Math.toRadians(90.0f - f13)) * d13 * d14));
    }
}
