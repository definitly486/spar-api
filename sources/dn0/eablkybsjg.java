package dn0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.user.domain.model.TokenInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: dn0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C0584eablkybsjg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0584eablkybsjg f29182iobyxmoadg = new C0584eablkybsjg();

        private C0584eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0584eablkybsjg);
        }

        public int hashCode() {
            return -1776482443;
        }

        public String toString() {
            return "StartSmsRetriever";
        }
    }

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f29183iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1273260655;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29184iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final TokenInfo f29185zoijcleaow;

        public ppxfxbqfkf(String phoneNumber, TokenInfo tokenInfo) {
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            zdlpuopuiu.btonecajqb(tokenInfo, "tokenInfo");
            this.f29184iobyxmoadg = phoneNumber;
            this.f29185zoijcleaow = tokenInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f29184iobyxmoadg, ppxfxbqfkfVar.f29184iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29185zoijcleaow, ppxfxbqfkfVar.f29185zoijcleaow);
        }

        public int hashCode() {
            return (this.f29184iobyxmoadg.hashCode() * 31) + this.f29185zoijcleaow.hashCode();
        }

        public final TokenInfo iobyxmoadg() {
            return this.f29185zoijcleaow;
        }

        public String toString() {
            return "NavigateToRegistrationScreen(phoneNumber=" + this.f29184iobyxmoadg + ", tokenInfo=" + this.f29185zoijcleaow + ")";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f29186iobyxmoadg;

        public wkgbmnqykc(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f29186iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29186iobyxmoadg, ((wkgbmnqykc) obj).f29186iobyxmoadg);
        }

        public int hashCode() {
            return this.f29186iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f29186iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f29186iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f29187iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1273148984;
        }

        public String toString() {
            return "Exit";
        }
    }
}
