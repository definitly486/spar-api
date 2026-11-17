package t6;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class xrmfcynszj implements ikoacuggdj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinkedBlockingQueue f109904iobyxmoadg = new LinkedBlockingQueue(UserVerificationMethods.USER_VERIFY_NONE);

    private static final class iobyxmoadg implements kc2.nufgyqmvbu.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f109905iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f109906ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f109907wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final kc2.nufgyqmvbu.zoijcleaow f109908zoijcleaow;

        iobyxmoadg(long j13, kc2.nufgyqmvbu.zoijcleaow zoijcleaowVar, String str, int i13) {
            this.f109905iobyxmoadg = j13;
            this.f109908zoijcleaow = zoijcleaowVar;
            this.f109906ppxfxbqfkf = str;
            this.f109907wkgbmnqykc = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || iobyxmoadg.class != obj.getClass()) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f109905iobyxmoadg == iobyxmoadgVar.f109905iobyxmoadg && this.f109907wkgbmnqykc == iobyxmoadgVar.f109907wkgbmnqykc && this.f109908zoijcleaow == iobyxmoadgVar.f109908zoijcleaow && this.f109906ppxfxbqfkf.equals(iobyxmoadgVar.f109906ppxfxbqfkf);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f109905iobyxmoadg), this.f109908zoijcleaow, this.f109906ppxfxbqfkf, Integer.valueOf(this.f109907wkgbmnqykc));
        }

        @Override // kc2.nufgyqmvbu.iobyxmoadg
        public int iobyxmoadg() {
            return this.f109907wkgbmnqykc;
        }

        public String toString() {
            return "Event{time=" + this.f109905iobyxmoadg + ", priority=" + this.f109908zoijcleaow + ", message='" + this.f109906ppxfxbqfkf + "', code=" + this.f109907wkgbmnqykc + '}';
        }
    }

    private void wkgbmnqykc(kc2.nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        if (this.f109904iobyxmoadg.size() >= 496) {
            this.f109904iobyxmoadg.remove();
        }
        this.f109904iobyxmoadg.add(iobyxmoadgVar);
    }

    @Override // t6.ikoacuggdj
    public void iobyxmoadg() {
        this.f109904iobyxmoadg.clear();
    }

    @Override // t6.ikoacuggdj
    public void ppxfxbqfkf(kc2.nufgyqmvbu.zoijcleaow zoijcleaowVar, String str, int i13) {
        wkgbmnqykc(new iobyxmoadg(System.currentTimeMillis(), zoijcleaowVar, str, i13));
    }

    public String toString() {
        return "Events: " + this.f109904iobyxmoadg;
    }

    @Override // kc2.nufgyqmvbu
    public Collection zoijcleaow() {
        return this.f109904iobyxmoadg;
    }
}
