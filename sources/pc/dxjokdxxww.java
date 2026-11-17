package pc;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww implements mc.gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private mc.zoijcleaow f76352ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f76353wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f76351iobyxmoadg = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f76354zoijcleaow = false;

    dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        this.f76353wkgbmnqykc = gxszxtbevoVar;
    }

    private void iobyxmoadg() {
        if (this.f76351iobyxmoadg) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f76351iobyxmoadg = true;
    }

    @Override // mc.gxszxtbevo
    public mc.gxszxtbevo add(String str) {
        iobyxmoadg();
        this.f76353wkgbmnqykc.wkgbmnqykc(this.f76352ppxfxbqfkf, str, this.f76354zoijcleaow);
        return this;
    }

    void zoijcleaow(mc.zoijcleaow zoijcleaowVar, boolean z13) {
        this.f76351iobyxmoadg = false;
        this.f76352ppxfxbqfkf = zoijcleaowVar;
        this.f76354zoijcleaow = z13;
    }

    @Override // mc.gxszxtbevo
    public mc.gxszxtbevo add(boolean z13) {
        iobyxmoadg();
        this.f76353wkgbmnqykc.btonecajqb(this.f76352ppxfxbqfkf, z13, this.f76354zoijcleaow);
        return this;
    }
}
