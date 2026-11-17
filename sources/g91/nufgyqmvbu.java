package g91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final h91.iobyxmoadg f36713iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final CharSequence f36714ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f36715zoijcleaow;

    public nufgyqmvbu(h91.iobyxmoadg product, String qrCode, CharSequence qrMsgTitle) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        zdlpuopuiu.btonecajqb(qrMsgTitle, "qrMsgTitle");
        this.f36713iobyxmoadg = product;
        this.f36715zoijcleaow = qrCode;
        this.f36714ppxfxbqfkf = qrMsgTitle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f36713iobyxmoadg, nufgyqmvbuVar.f36713iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36715zoijcleaow, nufgyqmvbuVar.f36715zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f36714ppxfxbqfkf, nufgyqmvbuVar.f36714ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f36713iobyxmoadg.hashCode() * 31) + this.f36715zoijcleaow.hashCode()) * 31) + this.f36714ppxfxbqfkf.hashCode();
    }

    public final h91.iobyxmoadg iobyxmoadg() {
        return this.f36713iobyxmoadg;
    }

    public final CharSequence ppxfxbqfkf() {
        return this.f36714ppxfxbqfkf;
    }

    public String toString() {
        return "Model(product=" + this.f36713iobyxmoadg + ", qrCode=" + this.f36715zoijcleaow + ", qrMsgTitle=" + ((Object) this.f36714ppxfxbqfkf) + ")";
    }

    public final String zoijcleaow() {
        return this.f36715zoijcleaow;
    }
}
