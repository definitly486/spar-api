package v7;

/* JADX INFO: loaded from: classes2.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f116273iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f116274zoijcleaow;

    public void iobyxmoadg(float f13) {
        float f14 = this.f116273iobyxmoadg + f13;
        this.f116273iobyxmoadg = f14;
        int i13 = this.f116274zoijcleaow + 1;
        this.f116274zoijcleaow = i13;
        if (i13 == Integer.MAX_VALUE) {
            this.f116273iobyxmoadg = f14 / 2.0f;
            this.f116274zoijcleaow = i13 / 2;
        }
    }
}
