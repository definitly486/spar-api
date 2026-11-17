package c20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y10.iobyxmoadg f18578zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18579iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18580zoijcleaow;

        public iobyxmoadg(String phone, String token) {
            zdlpuopuiu.btonecajqb(phone, "phone");
            zdlpuopuiu.btonecajqb(token, "token");
            this.f18579iobyxmoadg = phone;
            this.f18580zoijcleaow = token;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f18579iobyxmoadg, iobyxmoadgVar.f18579iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18580zoijcleaow, iobyxmoadgVar.f18580zoijcleaow);
        }

        public int hashCode() {
            return (this.f18579iobyxmoadg.hashCode() * 31) + this.f18580zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18579iobyxmoadg;
        }

        public String toString() {
            return "Params(phone=" + this.f18579iobyxmoadg + ", token=" + this.f18580zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f18580zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(y10.iobyxmoadg authRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(authRemoteSource, "authRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18578zoijcleaow = authRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f18578zoijcleaow.wkgbmnqykc(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
