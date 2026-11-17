package androidx.camera.core.impl;

import istkbnxepw.czzsidtyhn;
import istkbnxepw.iyctptxqzt;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements czzsidtyhn {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lereixgezr.czzsidtyhn f3839wkgbmnqykc;

    class iobyxmoadg implements lereixgezr.czzsidtyhn {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ long f3841wkgbmnqykc;

        iobyxmoadg(long j13) {
            this.f3841wkgbmnqykc = j13;
        }

        @Override // lereixgezr.czzsidtyhn
        public lereixgezr.czzsidtyhn.ppxfxbqfkf gxszxtbevo(lereixgezr.czzsidtyhn.zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.getStatus() == 1 ? lereixgezr.czzsidtyhn.ppxfxbqfkf.f62260wkgbmnqykc : lereixgezr.czzsidtyhn.ppxfxbqfkf.f62257eablkybsjg;
        }

        @Override // lereixgezr.czzsidtyhn
        public long iobyxmoadg() {
            return this.f3841wkgbmnqykc;
        }
    }

    public static final class zoijcleaow implements czzsidtyhn {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final lereixgezr.czzsidtyhn f3842wkgbmnqykc;

        public zoijcleaow(long j13) {
            this.f3842wkgbmnqykc = new nufgyqmvbu(j13);
        }

        @Override // lereixgezr.czzsidtyhn
        public lereixgezr.czzsidtyhn.ppxfxbqfkf gxszxtbevo(lereixgezr.czzsidtyhn.zoijcleaow zoijcleaowVar) {
            if (this.f3842wkgbmnqykc.gxszxtbevo(zoijcleaowVar).wkgbmnqykc()) {
                return lereixgezr.czzsidtyhn.ppxfxbqfkf.f62257eablkybsjg;
            }
            Throwable thIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            if (thIobyxmoadg instanceof CameraValidator.CameraIdListIncorrectException) {
                sopmlzcsov.ppxfxbqfkf("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) thIobyxmoadg).iobyxmoadg() > 0) {
                    return lereixgezr.czzsidtyhn.ppxfxbqfkf.f62259lqeggnwhkg;
                }
            }
            return lereixgezr.czzsidtyhn.ppxfxbqfkf.f62260wkgbmnqykc;
        }

        @Override // lereixgezr.czzsidtyhn
        public long iobyxmoadg() {
            return this.f3842wkgbmnqykc.iobyxmoadg();
        }

        @Override // istkbnxepw.czzsidtyhn
        public lereixgezr.czzsidtyhn wkgbmnqykc(long j13) {
            return new zoijcleaow(j13);
        }
    }

    public nufgyqmvbu(long j13) {
        this.f3839wkgbmnqykc = new iyctptxqzt(j13, new iobyxmoadg(j13));
    }

    @Override // lereixgezr.czzsidtyhn
    public lereixgezr.czzsidtyhn.ppxfxbqfkf gxszxtbevo(lereixgezr.czzsidtyhn.zoijcleaow zoijcleaowVar) {
        return this.f3839wkgbmnqykc.gxszxtbevo(zoijcleaowVar);
    }

    @Override // lereixgezr.czzsidtyhn
    public long iobyxmoadg() {
        return this.f3839wkgbmnqykc.iobyxmoadg();
    }

    @Override // istkbnxepw.czzsidtyhn
    public lereixgezr.czzsidtyhn wkgbmnqykc(long j13) {
        return new nufgyqmvbu(j13);
    }
}
