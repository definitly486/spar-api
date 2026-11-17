package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.kcexrzcfyt;
import androidx.camera.core.impl.oxmwwwfdhm;
import androidx.camera.core.impl.yggfygwlhe;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu implements yggfygwlhe {

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private androidx.camera.core.impl.btonecajqb f4002ylkuphrtab;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private oxmwwwfdhm f4003iobyxmoadg = oxmwwwfdhm.jhduphickx();

        public static zoijcleaow ppxfxbqfkf(final androidx.camera.core.impl.btonecajqb btonecajqbVar) {
            final zoijcleaow zoijcleaowVar = new zoijcleaow();
            btonecajqbVar.ppxfxbqfkf("camera2.captureRequest.option.", new androidx.camera.core.impl.btonecajqb.zoijcleaow() { // from class: androidx.camera.extensions.internal.dxjokdxxww
                @Override // androidx.camera.core.impl.btonecajqb.zoijcleaow
                public final boolean iobyxmoadg(androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar) {
                    return nufgyqmvbu.zoijcleaow.wkgbmnqykc(this.f3989iobyxmoadg, btonecajqbVar, iobyxmoadgVar);
                }
            });
            return zoijcleaowVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean wkgbmnqykc(zoijcleaow zoijcleaowVar, androidx.camera.core.impl.btonecajqb btonecajqbVar, androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar) {
            zoijcleaowVar.f4003iobyxmoadg.ojitshcjhn(iobyxmoadgVar, btonecajqbVar.nufgyqmvbu(iobyxmoadgVar), btonecajqbVar.iobyxmoadg(iobyxmoadgVar));
            return true;
        }

        public zoijcleaow eablkybsjg(CaptureRequest.Key key, Object obj) {
            this.f4003iobyxmoadg.vdvldrhtss(nufgyqmvbu.crxdokpmqz(key), obj);
            return this;
        }

        public nufgyqmvbu zoijcleaow() {
            return new nufgyqmvbu(kcexrzcfyt.ribwqtqdhb(this.f4003iobyxmoadg));
        }
    }

    static androidx.camera.core.impl.btonecajqb.iobyxmoadg crxdokpmqz(CaptureRequest.Key key) {
        return androidx.camera.core.impl.btonecajqb.iobyxmoadg.zoijcleaow("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    @Override // androidx.camera.core.impl.yggfygwlhe
    public androidx.camera.core.impl.btonecajqb getConfig() {
        return this.f4002ylkuphrtab;
    }

    private nufgyqmvbu(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        this.f4002ylkuphrtab = btonecajqbVar;
    }
}
