package wo0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120309iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120310zoijcleaow;

    public eablkybsjg(String name, String phone) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.f120309iobyxmoadg = name;
        this.f120310zoijcleaow = phone;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return zdlpuopuiu.eablkybsjg(this.f120309iobyxmoadg, eablkybsjgVar.f120309iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120310zoijcleaow, eablkybsjgVar.f120310zoijcleaow);
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return "CartOrderReceiverUiModel";
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.RECEIVER;
    }

    public int hashCode() {
        return (this.f120309iobyxmoadg.hashCode() * 31) + this.f120310zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f120309iobyxmoadg;
    }

    public String toString() {
        return "CartOrderReceiverUiModel(name=" + this.f120309iobyxmoadg + ", phone=" + this.f120310zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f120310zoijcleaow;
    }
}
