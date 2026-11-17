package ua;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends ppxfxbqfkf.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f113049iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Long f113050zoijcleaow;

    eablkybsjg() {
    }

    @Override // ua.ppxfxbqfkf.iobyxmoadg
    public final ppxfxbqfkf iobyxmoadg() {
        String str = this.f113049iobyxmoadg;
        if (str != null) {
            return new lqeggnwhkg(str, this.f113050zoijcleaow, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // ua.ppxfxbqfkf.iobyxmoadg
    public final ppxfxbqfkf.iobyxmoadg ppxfxbqfkf(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f113049iobyxmoadg = str;
        return this;
    }

    @Override // ua.ppxfxbqfkf.iobyxmoadg
    public final ppxfxbqfkf.iobyxmoadg zoijcleaow(long j13) {
        this.f113050zoijcleaow = Long.valueOf(j13);
        return this;
    }
}
