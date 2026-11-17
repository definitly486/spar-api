package wa1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f119185iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f119186jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f119187yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f119188zdlpuopuiu;

    public ppxfxbqfkf(String itemId, String code, String name, String str) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f119188zdlpuopuiu = itemId;
        this.f119187yggfygwlhe = code;
        this.f119186jyumaefscl = name;
        this.f119185iwizpuwonk = str;
    }

    public final String eablkybsjg() {
        return this.f119185iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f119188zdlpuopuiu, ppxfxbqfkfVar.f119188zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f119187yggfygwlhe, ppxfxbqfkfVar.f119187yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f119186jyumaefscl, ppxfxbqfkfVar.f119186jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f119185iwizpuwonk, ppxfxbqfkfVar.f119185iwizpuwonk);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f119188zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f119188zdlpuopuiu.hashCode() * 31) + this.f119187yggfygwlhe.hashCode()) * 31) + this.f119186jyumaefscl.hashCode()) * 31;
        String str = this.f119185iwizpuwonk;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f119187yggfygwlhe;
    }

    public String toString() {
        return "SponsorUiModel(itemId=" + this.f119188zdlpuopuiu + ", code=" + this.f119187yggfygwlhe + ", name=" + this.f119186jyumaefscl + ", pic=" + this.f119185iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f119186jyumaefscl;
    }
}
