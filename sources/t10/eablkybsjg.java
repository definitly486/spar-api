package t10;

import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109287iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocalDateTime f109288zoijcleaow;

    public eablkybsjg(String token, LocalDateTime expiresAt) {
        zdlpuopuiu.btonecajqb(token, "token");
        zdlpuopuiu.btonecajqb(expiresAt, "expiresAt");
        this.f109287iobyxmoadg = token;
        this.f109288zoijcleaow = expiresAt;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f109287iobyxmoadg, eablkybsjgVar.f109287iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109288zoijcleaow, eablkybsjgVar.f109288zoijcleaow);
    }

    public int hashCode() {
        return (this.f109287iobyxmoadg.hashCode() * 31) + this.f109288zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f109287iobyxmoadg;
    }

    public String toString() {
        return "FetchTokenModel(token=" + this.f109287iobyxmoadg + ", expiresAt=" + this.f109288zoijcleaow + ")";
    }
}
